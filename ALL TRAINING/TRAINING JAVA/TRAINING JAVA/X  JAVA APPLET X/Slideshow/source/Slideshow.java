//Slideshow applet © 2000 by Johannes Wallroth - www.programming.de
///////////////////////////////////////////////////////////////////
import java.applet.*;
import java.awt.*;

public class Slideshow extends Applet implements Runnable
{
  Thread runner;  
  boolean left,right,click,auto;  
  boolean but0,but1,but2,but3,but4,but5,but6,but7,but8;  
  boolean b0,b1,b2,b3,b4,b5,b6,b7,b8;
  boolean waitMessage = true;
  int number=1;
  static final int MAX=8;
  Image Picture[]=new Image[MAX];
  Image Buffer;
  Graphics gBuffer;		
  Font a = new Font("Helvetica", Font.BOLD,25);
  Font b = new Font("Dialog", Font.PLAIN,10);  
  
  Rectangle r0=new Rectangle(230,55,90,20);
  Rectangle r1=new Rectangle(230,140,20,30);
  Rectangle r2=new Rectangle(253,140,20,30);
  Rectangle r3=new Rectangle(276,140,20,30);
  Rectangle r4=new Rectangle(299,140,20,30);
  Rectangle r5=new Rectangle(230,173,20,30);
  Rectangle r6=new Rectangle(253,173,20,30);
  Rectangle r7=new Rectangle(276,173,20,30);
  Rectangle r8=new Rectangle(299,173,20,30);
  
  void loadGraphics()
  {
		MediaTracker t=new MediaTracker(this);

		for(int i=0;i<MAX;i++)
		{
			Picture[i]=getImage(getCodeBase(),"slides/pic"+(i+1)+".jpg");
			t.addImage(Picture[i],0);			

			try{t.waitForAll(0);}
			catch(InterruptedException e){}			

			waitMessage=false;
		}		
  }

  public void init() 
  {			

		Buffer=createImage(size().width,size().height);
        gBuffer=Buffer.getGraphics(); 					
  } 

  public void start()
	{
		if (runner == null) 
		{
			runner = new Thread (this);
			runner.start();
		}
   }

   public void stop()
	{
		if (runner != null) 
		{
         	runner.stop();
           	runner = null;
     	}
   }

	public void run()
	{
		while(true) 
		{
			try {runner.sleep(1000);}
            	catch (Exception e) { }	
			
			if(auto)
			{
				if(number<MAX)
				number++;
				else number=1;
			}
			
			repaint();	                        
		}	
	}
  
  public void update(Graphics g)
  {
    paint(g);
  }  

  public void drawArrow(int w,int h,int x,int y,boolean left,boolean over,boolean click) 
  {	
	  if(click&&over)
		  gBuffer.setColor(Color.yellow);
	  else if(over)
		  gBuffer.setColor(Color.orange);
	  else
		  gBuffer.setColor(Color.red);

	  if(left)
	  {
			int al[] = {x,x+w,x+w};
			int bl[] = {y+h/2,y,y+h};
			gBuffer.fillPolygon(al, bl, 3);
	  }
	  else
	  {
			int ar[] = {x,x,x+w};
			int br[] = {y,y+h,y+h/2};
			gBuffer.fillPolygon(ar, br, 3);
	  }	  
  }
  
  public void drawPanel()
  {	  

	  gBuffer.setColor(Color.black);
      gBuffer.fillRect(0,0,size().width,size().height);	      
	  
	  drawArrow(40,40,230,87,true,left,click);	  
	  drawArrow(40,40,280,87,false,right,click);		  

	  gBuffer.setColor(Color.lightGray);

	  gBuffer.fill3DRect(230,140,20,30,!but1);
	  gBuffer.fill3DRect(253,140,20,30,!but2);
	  gBuffer.fill3DRect(276,140,20,30,!but3);
	  gBuffer.fill3DRect(299,140,20,30,!but4);

	  gBuffer.fill3DRect(230,173,20,30,!but5);
	  gBuffer.fill3DRect(253,173,20,30,!but6);
	  gBuffer.fill3DRect(276,173,20,30,!but7);
	  gBuffer.fill3DRect(299,173,20,30,!but8);

	  gBuffer.setFont(b);

	  gBuffer.setColor(b1?Color.red:Color.black);
	  gBuffer.drawString("1",236,160);
	  gBuffer.setColor(b2?Color.red:Color.black);
	  gBuffer.drawString("2",259,160);
	  gBuffer.setColor(b3?Color.red:Color.black);
	  gBuffer.drawString("3",282,160);
	  gBuffer.setColor(b4?Color.red:Color.black);
	  gBuffer.drawString("4",305,160);
	  gBuffer.setColor(b5?Color.red:Color.black);
	  gBuffer.drawString("5",236,193);
	  gBuffer.setColor(b6?Color.red:Color.black);
	  gBuffer.drawString("6",259,193);
	  gBuffer.setColor(b7?Color.red:Color.black);
	  gBuffer.drawString("7",282,193);
	  gBuffer.setColor(b8?Color.red:Color.black);
	  gBuffer.drawString("8",305,193);	  	  
	  
	  gBuffer.setColor(auto?Color.orange:Color.lightGray);
	  gBuffer.fill3DRect(230,55,90,20,!but0);	  
	  
	  gBuffer.setColor(b0?Color.red:Color.black);
	  String s=auto?"OFF":"ON";
	  gBuffer.drawString("AUTO "+s,248,69);	 	  
	  
	  gBuffer.drawImage(Picture[number-1],10,10,this);

	  gBuffer.setColor(Color.blue);
	  gBuffer.setFont(a);
	  gBuffer.drawString("pic"+number+".jpg",225,35);	  
  }
 
  public boolean mouseDown(Event evt,int x,int y)
  {	  
	  if(r0.inside(x,y))	{but0=true; auto^=true;}
	  if(r1.inside(x,y))	{but1=true;	auto=false; number=1;}
	  if(r2.inside(x,y))	{but2=true;	auto=false; number=2;}
	  if(r3.inside(x,y))	{but3=true;	auto=false; number=3;}
	  if(r4.inside(x,y))	{but4=true;	auto=false; number=4;}
	  if(r5.inside(x,y))	{but5=true;	auto=false; number=5;}
	  if(r6.inside(x,y))	{but6=true;	auto=false; number=6;}
	  if(r7.inside(x,y))	{but7=true;	auto=false; number=7;}
	  if(r8.inside(x,y))	{but8=true;	auto=false; number=8;}

	  if(left)
	  {
		  auto=false;

			if(number>1)			
				number--;
			
			else number=8;
				
	  }

	  if(right)
	  {
		  auto=false;

			if(number<MAX)			
				number++;
			
			else number=1;
	  }	
	  
	  click=true;		
	  repaint();

	  return true;
  }

  public boolean mouseUp(Event evt,int x,int y)
  {	    
		but0=but1=but2=but3=but4=but5=but6=but7=but8=click=false;		
		
	    repaint();
		
		return true;
	}

  public boolean mouseMove(Event evt,int x,int y)
  {			
		Rectangle rl=new Rectangle(230,87,40,40);
		Rectangle rr=new Rectangle(280,87,40,40);

		if(rl.inside(x,y)) left=true;  else left=false;

		if(rr.inside(x,y)) right=true; else right=false;

		if(r0.inside(x,y))	b0=true; else b0=false;
		if(r1.inside(x,y))	b1=true; else b1=false;
		if(r2.inside(x,y))	b2=true; else b2=false;
		if(r3.inside(x,y))	b3=true; else b3=false;
		if(r4.inside(x,y))	b4=true; else b4=false;
		if(r5.inside(x,y))	b5=true; else b5=false;
		if(r6.inside(x,y))	b6=true; else b6=false;
		if(r7.inside(x,y))	b7=true; else b7=false;
		if(r8.inside(x,y))	b8=true; else b8=false;
			 
		repaint();
		return true;
	}

  public void paint(Graphics g)
  {   
	  if(waitMessage)
	  {
		  g.setColor(Color.blue);		
		  g.drawString("Loading images, please wait...",20,20);

		  loadGraphics();
	  }
	  else
	  {
		  drawPanel();	  
		  g.drawImage (Buffer,0,0, this);
	  }
  }

}
