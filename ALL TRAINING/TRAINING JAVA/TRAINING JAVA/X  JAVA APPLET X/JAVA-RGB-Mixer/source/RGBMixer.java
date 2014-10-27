//Copyright 2001 by Johannes Wallroth - www.programming.de

import java.applet.*;
import java.awt.*;
import java.net.*;

class Slider
{	
	public boolean over, drag, down;
	private Rectangle r=new Rectangle();
	private Graphics g;	
	public Color color;
	public int x, y, y1, y2, pos, pos_old, height, value;	
	
	public Slider(int x, int y, Color color)
	{		
		height=104;	
		this.x=x;
		this.y=y;				
		pos=y+height/2;
		this.color=color;
		r.x=x-10;
		r.y=pos-5;
		r.width=22;
		r.height=10;
	}
	
	public void reportMouseMove(int x, int y)
	{
		if(r.inside(x,y))
			over=true;
		else
			over=false;		
	}
	
	public void reportMouseDown(int x, int y)
	{
		if(r.inside(x,y))
		{
			down=true;
			y1=y;
			pos_old=pos;
		}	
	}

	public void reportMouseUp(int x, int y)
	{		
		down=false;
	}

	public void reportMouseDrag(int x, int y)
	{
		if(down)
		{
			drag=true;	
			y2=y-y1;

			pos=y2+pos_old;

			if(pos<this.y+2)pos=this.y+2;
			if(pos>this.y+height)pos=this.y+height;
			r.move(r.x,pos-5);
		}
		else
			drag=false;
	}
	
	private void drawSlider()
	{
		//the slot
		g.setColor(Color.darkGray);
		g.drawLine(x,y,x,y+height);
		g.setColor(Color.gray);		
		g.drawLine(x-1,y,x-1,y+height);
		g.setColor(Color.lightGray.brighter());
		g.drawLine(x+1,y,x+1,y+height);

		//draw the scale		
		g.setColor(Color.gray);
		for(int i=y+1; i<y+104; i++)
		{
			if(i%2==0)
			{
				g.drawLine(x-10,i,x-5,i);
				g.drawLine(x+10,i,x+5,i);
			}
		}

		//the slider knob
		g.setColor(Color.lightGray);
		g.fill3DRect(x-10,pos-6,22,12,true);
		g.fill3DRect(x-9,pos-5,20,10,true);		

		g.setColor(color);
		g.fillRect(x-8,pos-1,18,2);
		
		//the value
		value=255-(((pos-y-2)/2)*5);
		String valuestring=""+value;

		//measure the size of the string to center it
		Font font=new Font("Helvetica", Font.PLAIN, 12);
        FontMetrics fm = g.getFontMetrics(font);
        int stringWidth=fm.stringWidth(valuestring);        
        
        g.setFont(font);
		g.setColor(Color.black);
		g.drawString(valuestring, x-stringWidth/2, y-10);		
	}
	
	public void paint(Graphics gr) 
	{			
		g=gr;
		drawSlider();
    }		

	public int getVal()
	{
		return value;
	}
}

public class RGBMixer extends Applet 
{			
        Image Buffer;
        Graphics gBuffer;
		URL url;			
		int h=35;
		Slider sl1=new Slider(180,h,Color.red);
		Slider sl2=new Slider(210,h,Color.green);
		Slider sl3=new Slider(240,h,Color.blue);
		//the hotlink
		Rectangle r=new Rectangle(165,150,87,10);	
		boolean overLink;
	
        public void update(Graphics g)
		{
            paint(g);
        }

        public void init() 
		{			
            Buffer=createImage(size().width,size().height);
            gBuffer=Buffer.getGraphics();   				

			try{url=new URL("http://www.programming.de/");}
			catch(MalformedURLException mal){}
        }

		public void drawStuff() {	
			
			gBuffer.setColor(Color.lightGray);
            gBuffer.fillRect(0,0,size().width,size().height);

			gBuffer.draw3DRect(0,0,size().width-1,size().height-1,true);
            gBuffer.draw3DRect(4,4,size().width-9,size().height-9,false);
			gBuffer.draw3DRect(5,5,size().width-11,size().height-11,true);

			gBuffer.draw3DRect(18,38,133,98,false);

			sl1.paint(gBuffer);
			sl2.paint(gBuffer);
			sl3.paint(gBuffer);			

			Color mixColor=
				new Color(sl1.getVal(),sl2.getVal(),sl3.getVal());

			gBuffer.setColor(mixColor);
            gBuffer.fillRect(20,40,130,95);

			String red,green,blue;

			red=sl1.getVal()<20?"0"+Integer.toHexString(sl1.getVal()):Integer.toHexString(sl1.getVal());
			green=sl2.getVal()<20?"0"+Integer.toHexString(sl2.getVal()):Integer.toHexString(sl2.getVal());
			blue=sl3.getVal()<20?"0"+Integer.toHexString(sl3.getVal()):Integer.toHexString(sl3.getVal());
			
			String hex="color=\"#"+red+green+blue+"\"";

			Font font=new Font("Helvetica", Font.PLAIN, 12);
			gBuffer.setFont(font);
			gBuffer.setColor(Color.black);
			gBuffer.drawString(hex,45,25);	

			Font smallFont=new Font("Helvetica", Font.PLAIN, 9);			
			gBuffer.setFont(smallFont);
			gBuffer.setColor(Color.gray);
			gBuffer.drawString("©2001 by Johannes Wallroth",20,157);	
			gBuffer.setColor(Color.blue);
			gBuffer.drawString("www.programming.de",165,157);	
			gBuffer.drawLine(165,158,251,158);				
		}

		public boolean mouseMove(Event evt,int x,int y)
		{			
			sl1.reportMouseMove(x, y);
			sl2.reportMouseMove(x, y);
			sl3.reportMouseMove(x, y);

			if(r.inside(x,y))
				overLink=true;
			else
				overLink=false;		

			Component ParentComponent = getParent();
			while ( ParentComponent != null && 
			!(ParentComponent instanceof Frame)) 		      
			ParentComponent = ParentComponent.getParent();		
			Frame BrowserFrame = (Frame) ParentComponent;
			
			if(overLink)
				BrowserFrame.setCursor(Frame.HAND_CURSOR);	
			else
				BrowserFrame.setCursor(Frame.DEFAULT_CURSOR);	

			repaint();		
			return true;
		}

		public boolean mouseDrag(Event evt,int x,int y)
		{
			sl1.reportMouseDrag(x, y);
			sl2.reportMouseDrag(x, y);
			sl3.reportMouseDrag(x, y);
			repaint();
			return true;
		}		

		public boolean mouseDown(Event evt,int x,int y)
		{
			sl1.reportMouseDown(x, y);
			sl2.reportMouseDown(x, y);
			sl3.reportMouseDown(x, y);			

			if(overLink)
				getAppletContext().showDocument(url,"_blank");			

			repaint();
			return true;
		}

		public boolean mouseUp(Event evt,int x,int y)
		{
			sl1.reportMouseUp(x, y);			
			sl2.reportMouseUp(x, y);			
			sl3.reportMouseUp(x, y);			
			repaint();
			return true;
		}
		
        public void paint(Graphics g) 
		{
				drawStuff();
				g.drawImage (Buffer,0,0, this);	                               
        }
} 
