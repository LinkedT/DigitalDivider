package digitalDivider;

import acm.graphics.GImage;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import acm.program.GraphicsProgram;
import acm.util.SwingTimer;

public class GUI extends GraphicsProgram implements Iterable 
{

	protected static final int SCREEN_WIDTH = 800;
	protected static final int SCREEN_HEIGHT = 480;
	Random random = new Random();	
	GImage BG;

	private List<ParallaxingBackground> trailBG = new ArrayList<ParallaxingBackground>();

	public void run() 
	{
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		BG = new GImage("digitalDivider/content/BG.jpg");

		//GImage t = new GImage("digitalDivider/content/TrailTop.png");
		add(BG,0,0);
		//add(t,0,142);
		ParallaxingBackground trailBot = new ParallaxingBackground("TrailBot",0,174,1, this);
		ParallaxingBackground trailBot2 = new ParallaxingBackground("TrailBot",-800,174,1, this);
		ParallaxingBackground trailMid = new ParallaxingBackground("TrailMid",0,142,2, this);
		ParallaxingBackground trailMid2 = new ParallaxingBackground("TrailMid",-800,142,2, this);
		ParallaxingBackground trailTop = new ParallaxingBackground("TrailTop",0,121,3, this);
		ParallaxingBackground trailTop2 = new ParallaxingBackground("TrailTop",-800,121,3, this);
		
		trailBG.add(trailBot);
		trailBG.add(trailBot2);
		trailBG.add(trailMid);
		trailBG.add(trailMid2);
		trailBG.add(trailTop);
		trailBG.add(trailTop2);

		new SwingTimer(1000 / 24, this).start();
	}
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		tick();
	}

	private void tick() 
	{
		for (ParallaxingBackground trail : trailBG) 
		{
			trail.tick();
		}

	}
	
	public void removeObjects()
	{
		this.removeAll();
	}
}
