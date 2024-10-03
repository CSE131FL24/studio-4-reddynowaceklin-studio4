package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		boolean toggle = true;
		double[] xt = {0.4,0.5,0.45};
		double [] yt = {0.6,0.6,0.05};
		double[] x = {0.1,0.12,0.35};
		double [] y = {0.85,0.9,0.75};
		double [] x2 = {0.9,0.88,0.65};
		double[] xt2 = {0.5,0.6,0.55};
		double[] xn = {0.1,0.12,0.35};
		double [] yn = {0.85,0.9,0.88};
		double [] ynt = {0.6,0.6,0.55};
		double [] xn2 = {0.9,0.88,0.65};
		while(true) {
			if(toggle==true) {
				StdDraw.setPenColor(Color.BLUE);
				StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
				StdDraw.setPenColor(Color.RED);
				StdDraw.filledEllipse(0.5, 0.3, 0.5, 0.3);
				StdDraw.setPenColor(Color.GREEN);
				StdDraw.filledEllipse(0.8, 0.7, 0.1, 0.1);
				StdDraw.filledEllipse(0.2, 0.7, 0.1, 0.1);
				StdDraw.setPenColor(Color.YELLOW);
				StdDraw.filledEllipse(0.8, 0.7, 0.01, 0.01);
				StdDraw.filledEllipse(0.2, 0.7, 0.01, 0.01);
				StdDraw.setPenColor(255, 0, 255);
				StdDraw.filledPolygon(x,y);
				StdDraw.filledPolygon(x2,y);
				StdDraw.setPenColor(Color.WHITE);
				StdDraw.filledPolygon(xt,yt);
				StdDraw.filledPolygon(xt2,yt);
			} else {
				StdDraw.setPenColor(Color.BLUE);
				StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
				StdDraw.setPenColor(Color.RED);
				StdDraw.filledEllipse(0.5, 0.3, 0.5, 0.3);
				StdDraw.setPenColor(Color.GREEN);
				StdDraw.filledEllipse(0.8, 0.7, 0.1, 0.1);
				StdDraw.filledEllipse(0.2, 0.7, 0.1, 0.1);
				StdDraw.setPenColor(Color.YELLOW);
				StdDraw.filledEllipse(0.8, 0.7, 0.01, 0.01);
				StdDraw.filledEllipse(0.2, 0.7, 0.01, 0.01);
				StdDraw.setPenColor(Color.WHITE);
				StdDraw.filledPolygon(xt,ynt);
				StdDraw.filledPolygon(xt2,ynt);
				StdDraw.setPenColor(255, 0, 255);
				StdDraw.filledPolygon(xn,yn);
				StdDraw.filledPolygon(xn2,yn);
			}
			if(StdDraw.isMousePressed()) {
				toggle = !toggle;
				StdDraw.clear();
			}
			StdDraw.pause(1000);
		}
	}
}