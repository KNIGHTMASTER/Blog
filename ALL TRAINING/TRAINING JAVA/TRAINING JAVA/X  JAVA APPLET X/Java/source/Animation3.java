import java.applet.*;
import java.awt.*;

public class Animation3 extends Applet implements Runnable {
        int X, Y=0,XX,YY,ZZ;
		float   bright = 1 ;
		int    ibright = 1;
		boolean richtung;
        Thread Animation;
        private Image Buffer;
        private Graphics gBuffer;

        public void start() {
                if (Animation == null) {
                        Animation = new Thread (this);
                        Animation.start();
                }
        }
        public void stop() {
                if (Animation != null) {
                        Animation.stop();
                        Animation = null;
                }
        }

        public void run() {
			
                while (true) {
					for (X=0; X < 150 ;X ++) {
                       try {
                               Animation.sleep (30);
                        } catch (Exception e) { }

						if (richtung==true)
						{ 
						 if(ibright > 996) 
							 richtung =  false ;
							 ibright+=3;	
													
						}
						else
						{ 
						 if(ibright < 11) 	richtung =  true ;
						 ibright-=3;	
													
						}
						 bright=(float)ibright / 1100;

                        repaint();
					
				}   }
        }

        public void update(Graphics g) {
               paint(g);
        }

        public void init() {
                Buffer=createImage(size().width,size().height);
                gBuffer=Buffer.getGraphics();
                gBuffer.setColor(Color.black);
                gBuffer.fillRect(0,0,size().width,size().height);
				richtung=true;
        }

		public void male() {
			XX=X/2;
			YY=X;
			ZZ=-X/2;
			

			gBuffer.setColor(Color.blue);
			gBuffer.fillRect(0,0,size().width,size().height);

			gBuffer.setFont(new Font("Helvetica",Font.ITALIC,7));
			gBuffer.setColor(Color.orange);
				
				for (int hoch=0; hoch < 150; hoch+=25) {
					for (int spalten=0; spalten < 600; spalten+=75) {
					
					gBuffer.drawString ("JAVA",ZZ+spalten,hoch);
						
					}
						
			}				

		    gBuffer.setColor(Color.yellow);
				for (int lang=0; lang < 30; lang ++) {
                gBuffer.fillRect (XX, Y, 1, 150);
				gBuffer.fillRect (XX-300, Y, 1, 150);
				XX += 15;
				}

			gBuffer.setFont(new Font("Helvetica",Font.BOLD,90));
				gBuffer.setColor(Color.black);
				gBuffer.drawString ("JAVA!",22,112);

			gBuffer.setFont(new Font("Helvetica",Font.BOLD,90));			
			gBuffer.setColor(Color.getHSBColor((float)bright,(float)1,(float)1));			
				gBuffer.drawString ("JAVA!",20,110);
				

			gBuffer.setColor(Color.red);
				for (int quer=0; quer < 20; quer++) {
                gBuffer.fillRect (0, YY, 300, 1);
				gBuffer.fillRect (0, YY-300, 300, 1);
				YY += 15;
				}

			gBuffer.setColor(Color.black);
			gBuffer.drawRect(0,0,size().width-1,size().height-1);

				
		}
		
        public void paint(Graphics g) {

				g.drawImage (Buffer,0,0, this);
				male();
                
                
        }
} 
