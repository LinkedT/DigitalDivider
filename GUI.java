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
	GImage trailBot;
	GImage trailMid;
	GImage trailTop;
	GImage trailBot2;
	GImage trailMid2;
	GImage trailTop2;


	private List<GImage> trailBG = new ArrayList<GImage>();

	public void run() {
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		BG = new GImage("digitalDivider/content/BG.jpg");
		trailBot = new GImage("digitalDivider/content/TrailBot.png");
		trailMid = new GImage("digitalDivider/content/TrailMid.png");
		trailTop = new GImage("digitalDivider/content/TrailTop.png");
		trailBot2 = new GImage("digitalDivider/content/TrailBot.png");
		trailMid2 = new GImage("digitalDivider/content/TrailMid.png");
		trailTop2 = new GImage("digitalDivider/content/TrailTop.png");
		
		add(BG,0,0);
		add(trailBot,0,174);
		add(trailBot2,-800,174);
		add(trailMid,0,142);
		add(trailMid2,-800,142);
		add(trailTop,0,121);
		add(trailTop2,-800,121);
		trailBG.add(trailTop);
		trailBG.add(trailMid);
		trailBG.add(trailBot);
		trailBG.add(trailTop2);
		trailBG.add(trailMid2);
		trailBG.add(trailBot2);
		new SwingTimer(1000 / 24, this).start();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		tick();
	}

	private void tick() 
	{
		//trailTop.move(1, 0);
		for (GImage trail : trailBG) 
		{
			trail.move(1, 0);
		}

	}
}
