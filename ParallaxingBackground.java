package digitalDivider;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ParallaxingBackground extends GraphicsProgram
{

	private double speed;
	public GImage t;
	
	public ParallaxingBackground(String path, double x, double y, double s, GUI gui)
	{
		t = new GImage("digitalDivider/content/"+path+".png");
		gui.add(t,x,y);
		
		speed = s;
	}
	
	public void tick()
	{
		if (t.getX()>=800) t.move(-1600+(t.getX()-800),0);
		t.move(speed, 0);
	}
}
