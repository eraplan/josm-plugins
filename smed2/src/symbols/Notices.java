/* Copyright 2012 Malcolm Herring
 *
 * This is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * For a copy of the GNU General Public License, see <http://www.gnu.org/licenses/>.
 */

package symbols;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.geom.*;
import java.util.EnumMap;

import s57.S57val.*;
import symbols.Symbols.*;

public class Notices {
	private static final Symbol Bollard = new Symbol();
	static {
		Bollard.add(new Instr(Prim.FILL, Color.black));
		Path2D.Double p = new Path2D.Double(); p.moveTo(20,21); p.lineTo(20,16.5); p.lineTo(11.6,16.5); p.quadTo(9.1,9.6,8.3,2.0); p.lineTo(-8.0,-0.3); p.quadTo(-8.6,9.0,-11.3,16.5);
		p.lineTo(-23.5,16.5); p.lineTo(-23.5,21.0); p.closePath(); p.moveTo(23.8,3.0); p.lineTo(-10.7,-1.8); p.curveTo(-13.1,-2.2,-12.8,-6.0,-10.2,-5.8); p.lineTo(23.8,-1.1);
		p.closePath(); p.moveTo(8.4,-4.3); p.curveTo(9.0,-9.3,9.0,-11.4,11.2,-13.0); p.curveTo(12.8,-15.0,12.8,-16.7,11.0,-18.6); p.curveTo(4.0,-22.2,-4.0,-22.2,-11.0,-18.6);
		p.curveTo(-12.8,-16.7,-12.8,-15.0,-11.2,-13.0); p.curveTo(-9.0,-11.3,-8.7,-9.5,-8.4,-6.5); p.closePath();
		Bollard.add(new Instr(Prim.PGON, p));
	}
	private static final Symbol Crossing = new Symbol();
	private static final Symbol CrossingL = new Symbol();
	private static final Symbol CrossingR = new Symbol();
	private static final Symbol Junction = new Symbol();
	private static final Symbol JunctionL = new Symbol();
	private static final Symbol JunctionR = new Symbol();
	private static final Symbol Motor = new Symbol();
	static {
		Motor.add(new Instr(Prim.FILL, Color.black));
		Path2D.Double p = new Path2D.Double(); p.moveTo(-5.0,4.3); p.curveTo(-3.7,5.5,-1.8,5.7,-0.2,4.9); p.curveTo(1.3,8.7,4.6,10.9,8.4,10.9); p.curveTo(14.0,10.9,17.5,6.3,17.5,2.0);
		p.curveTo(17.5,-0.7,16.1,-3.2,14.5,-3.2); p.curveTo(12.5,-3.2,11.7,0.8,2.5,1.1); p.curveTo(2.5,-1.2,1.6,-2.2,0.6,-3.0); p.curveTo(3.2,-5.6,4.0,-12.6,-1.0,-16.1);
		p.curveTo(-5.3,-19.2,-11.6,-18.3,-13.7,-13.7); p.curveTo(-14.3,-12.2,-14.0,-11.2,-12.5,-10.6); p.curveTo(-8.6,-9.6,-5.3,-6.0,-4.0,-3.4); p.curveTo(-5.4,-2.6,-6.2,-2.0,-6.2,0.2);
		p.curveTo(-12.8,-1.0,-17.5,3.7,-17.5,9.3); p.curveTo(-17.5,14.7,-12.6,18.8,-8.0,17.6); p.curveTo(-7.0,17.2,-6.6,16.2,-7.2,14.6); p.curveTo(-7.7,12.4,-7.0,7.7,-5.0,4.3); p.closePath();
		Motor.add(new Instr(Prim.PGON, p));
	}
	private static final Symbol Proceed = new Symbol();
	private static final Symbol Rowboat = new Symbol();
	private static final Symbol Sailboard = new Symbol();
	private static final Symbol Sailboat = new Symbol();
	private static final Symbol Slipway = new Symbol();
	private static final Symbol Speedboat = new Symbol();
	private static final Symbol Sport = new Symbol();
	static {
		Sport.add(new Instr(Prim.TEXT, new Caption("SPORT", new Font("Arial", Font.BOLD, 15), Color.black, new Delta(Handle.BC, AffineTransform.getTranslateInstance(0, 0)))));
	}
	private static final Symbol Turn = new Symbol();
	static {
		Turn.add(new Instr(Prim.STRK, new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
		Turn.add(new Instr(Prim.FILL, Color.black));
		Turn.add(new Instr(Prim.EARC, new Arc2D.Double(-9.0,-9.0,18.0,18.0,270.0,230.0,Arc2D.OPEN)));
		Turn.add(new Instr(Prim.EARC, new Arc2D.Double(-20.0,-20.0,40.0,40.0,315.0,-280.0,Arc2D.OPEN)));
		Path2D.Double p = new Path2D.Double(); p.moveTo(21.8,-7.0); p.lineTo(18.8,-18.2); p.lineTo(10.5,-10.0); p.closePath();
		p.moveTo(-12.9,0.7); p.lineTo(-1.7,-2.3); p.lineTo(-9.9,-10.5); p.closePath();
		Turn.add(new Instr(Prim.PGON, p));
	}
	private static final Symbol VHF = new Symbol();
	static {
		VHF.add(new Instr(Prim.TEXT, new Caption("VHF", new Font("Arial", Font.BOLD, 20), Color.black, new Delta(Handle.BC, AffineTransform.getTranslateInstance(0, 0)))));
	}
	private static final Symbol Waterbike = new Symbol();
	private static final Symbol Waterski = new Symbol();
	private static final Symbol NoticeA = new Symbol();
	static {
		NoticeA.add(new Instr(Prim.FILL, new Color(0xe80000)));
		NoticeA.add(new Instr(Prim.RSHP, new RoundRectangle2D.Double(-30,-30,60,60,4,4)));
		NoticeA.add(new Instr(Prim.FILL, Color.white));
		NoticeA.add(new Instr(Prim.RSHP, new Rectangle2D.Double(-21,-21,42,42)));
		NoticeA.add(new Instr(Prim.STRK, new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER)));
		NoticeA.add(new Instr(Prim.FILL, new Color(0xe80000)));
		NoticeA.add(new Instr(Prim.LINE, new Line2D.Double(-25,-25,25,25)));
		NoticeA.add(new Instr(Prim.STRK, new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
		NoticeA.add(new Instr(Prim.FILL, Color.black));
		NoticeA.add(new Instr(Prim.RRCT, new RoundRectangle2D.Double(-30,-30,60,60,4,4)));
	}
	private static final Symbol NoticeB = new Symbol();
	static {
		NoticeB.add(new Instr(Prim.FILL, new Color(0xe80000)));
		NoticeB.add(new Instr(Prim.RSHP, new RoundRectangle2D.Double(-30,-30,60,60,4,4)));
		NoticeB.add(new Instr(Prim.FILL, Color.white));
		NoticeB.add(new Instr(Prim.RSHP, new Rectangle2D.Double(-21,-21,42,42)));
		NoticeB.add(new Instr(Prim.STRK, new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
		NoticeB.add(new Instr(Prim.FILL, Color.black));
		NoticeB.add(new Instr(Prim.RRCT, new RoundRectangle2D.Double(-30,-30,60,60,4,4)));
	}
	private static final Symbol NoticeE = new Symbol();
	static {
		NoticeE.add(new Instr(Prim.FILL, new Color(0x0000a0)));
		NoticeE.add(new Instr(Prim.RSHP, new RoundRectangle2D.Double(-30,-30,60,60,4,4)));
		NoticeE.add(new Instr(Prim.STRK, new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
		NoticeE.add(new Instr(Prim.FILL, Color.black));
		NoticeE.add(new Instr(Prim.RRCT, new RoundRectangle2D.Double(-30,-30,60,60,4,4)));
	}

	public static final Symbol Notice = new Symbol();
	public static final Symbol NoticeA1 = new Symbol();
	static {
		NoticeA1.add(new Instr(Prim.FILL, new Color(0xe80000)));
		NoticeA1.add(new Instr(Prim.RSHP, new RoundRectangle2D.Double(-30,-30,60,60,4,4)));
		NoticeA1.add(new Instr(Prim.STRK, new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
		NoticeA1.add(new Instr(Prim.FILL, Color.white));
		NoticeA1.add(new Instr(Prim.RSHP, new Rectangle2D.Double(-30,-10,60,20)));
		NoticeA1.add(new Instr(Prim.FILL, Color.black));
		NoticeA1.add(new Instr(Prim.RRCT, new RoundRectangle2D.Double(-30,-30,60,60,4,4)));
	}
	public static final Symbol NoticeA1a = new Symbol();
	static {
		NoticeA1a.add(new Instr(Prim.FILL, new Color(0xe80000)));
		NoticeA1a.add(new Instr(Prim.RSHP, new Ellipse2D.Double(-30,-30,60,60)));
		NoticeA1a.add(new Instr(Prim.STRK, new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
		NoticeA1a.add(new Instr(Prim.FILL, Color.white));
		NoticeA1a.add(new Instr(Prim.RSHP, new Rectangle2D.Double(-29,-10,58,20)));
		NoticeA1a.add(new Instr(Prim.FILL, Color.black));
		NoticeA1a.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-30,-30,60,60)));
	}
	public static final Symbol NoticeA2 = new Symbol();
	static {
		NoticeA2.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA2.add(new Instr(Prim.FILL, Color.black));
		Path2D.Double p = new Path2D.Double(); p.moveTo(-10,23); p.lineTo(-10,0); p.lineTo(-6,0); p.lineTo(-12.5,-8); p.lineTo(-19,0); p.lineTo(-15,0); p.lineTo(-15,23);
		p.closePath(); p.moveTo(10,8); p.lineTo(10,-15); p.lineTo(6,-15); p.lineTo(12.5,-23); p.lineTo(19,-15); p.lineTo(15,-15); p.lineTo(15,8); p.closePath();
		NoticeA2.add(new Instr(Prim.PGON, p));
	}
	public static final Symbol NoticeA3 = new Symbol();
	static {
		NoticeA3.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA2, 1.0, 0, 0, null, null)));
		Path2D.Double p = new Path2D.Double(); p.moveTo(-10,12); p.lineTo(-6,12); p.lineTo(-12.5,4); p.lineTo(-19,12);
		p.closePath(); p.moveTo(10,-3); p.lineTo(6,-3); p.lineTo(12.5,-11); p.lineTo(19,-3); p.closePath();
		NoticeA3.add(new Instr(Prim.PGON, p));
	}
	public static final Symbol NoticeA4 = new Symbol();
	static {
		NoticeA4.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA4.add(new Instr(Prim.FILL, Color.black));
		Path2D.Double p = new Path2D.Double(); p.moveTo(-10,-15); p.lineTo(-10,8); p.lineTo(-6,8); p.lineTo(-12.5,16); p.lineTo(-19,8); p.lineTo(-15,8); p.lineTo(-15,-15);
		p.closePath(); p.moveTo(10,15); p.lineTo(10,-8); p.lineTo(6,-8); p.lineTo(12.5,-16); p.lineTo(19,-8); p.lineTo(15,-8); p.lineTo(15,15); p.closePath();
		NoticeA4.add(new Instr(Prim.PGON, p));
	}
	public static final Symbol NoticeA4_1 = new Symbol();
	static {
		NoticeA4_1.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA4, 1.0, 0, 0, null, null)));
		Path2D.Double p = new Path2D.Double(); p.moveTo(-10,-4); p.lineTo(-6,-4); p.lineTo(-12.5,4); p.lineTo(-19,-4);
		p.closePath(); p.moveTo(10,5); p.lineTo(6,5); p.lineTo(12.5,-3); p.lineTo(19,5); p.closePath();
		NoticeA4_1.add(new Instr(Prim.PGON, p));
	}
	public static final Symbol NoticeA5 = new Symbol();
	static {
		NoticeA5.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA5.add(new Instr(Prim.FILL, Color.black));
		Path2D.Double p = new Path2D.Double(); p.setWindingRule(GeneralPath.WIND_EVEN_ODD); p.moveTo(-5.3,14.6); p.lineTo(-5.3,4.0); p.lineTo(0.0,4.0); p.curveTo(4.2,4.0,7.4,3.5,9.4,0.0);
		p.curveTo(11.4,-2.8,11.4,-7.2,9.4,-10.5); p.curveTo(7.4,-13.6,4.2,-14.0,0.0,-14.0); p.lineTo(-11.0,-14.0); p.lineTo(-11.0,14.6); p.closePath();
		p.moveTo(-5.3,-1.0); p.lineTo(0.0,-1.0); p.curveTo(6.5,-1.0,6.5,-9.0,0.0,-9.0); p.lineTo(-5.3,-9.0); p.closePath();
		NoticeA5.add(new Instr(Prim.PGON, p));
	}
	public static final Symbol NoticeA5_1 = new Symbol();
	static {
		NoticeA5_1.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA6 = new Symbol();
	static {
		NoticeA6.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA6.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Harbours.Anchor, 0.4, 0, 0, new Delta(Handle.CC, AffineTransform.getRotateInstance(Math.toRadians(180.0))), null)));
	}
	public static final Symbol NoticeA7 = new Symbol();
	static {
		NoticeA7.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA7.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Bollard, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA8 = new Symbol();
	static {
		NoticeA8.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA8.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Turn, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA9 = new Symbol();
	static {
		NoticeA9.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA9.add(new Instr(Prim.STRK, new BasicStroke(7, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
		NoticeA9.add(new Instr(Prim.FILL, Color.black));
		Path2D.Double p = new Path2D.Double(); p.moveTo(-23,10); p.curveTo(-11,10,-12,4,0,4); p.curveTo(12,4,11,10,23,10);
		p.moveTo(-23,-3); p.curveTo(-11,-3,-12,-9,0,-9); p.curveTo(12,-9,11,-3,23,-3);
		NoticeA9.add(new Instr(Prim.PLIN, p));
	}
	public static final Symbol NoticeA10a = new Symbol();
	static {
		NoticeA10a.add(new Instr(Prim.BBOX, new Rectangle(-30,-30,60,60)));
		NoticeA10a.add(new Instr(Prim.FILL, Color.white));
		Path2D.Double p = new Path2D.Double(); p.moveTo(0,-30); p.lineTo(30,0); p.lineTo(0,30); p.closePath();
		NoticeA10a.add(new Instr(Prim.PGON, p));
		NoticeA10a.add(new Instr(Prim.FILL, new Color(0xe80000)));
		p = new Path2D.Double(); p.moveTo(0,-30); p.lineTo(-30,0); p.lineTo(0,30); p.closePath();
		NoticeA10a.add(new Instr(Prim.PGON, p));
		NoticeA10a.add(new Instr(Prim.STRK, new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
		NoticeA10a.add(new Instr(Prim.FILL, Color.black));
		p = new Path2D.Double(); p.moveTo(0,-30); p.lineTo(-30,0); p.lineTo(0,30); p.lineTo(30,0); p.closePath();
		NoticeA10a.add(new Instr(Prim.PLIN, p));
	}
	public static final Symbol NoticeA10b = new Symbol();
	static {
		NoticeA10b.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA10a, 1.0, 0, 0, new Delta(Handle.CC, AffineTransform.getRotateInstance(Math.toRadians(180.0))), null)));
	}
	public static final Symbol NoticeA12= new Symbol();
	static {
		NoticeA12.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA12.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Motor, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA13= new Symbol();
	static {
		NoticeA13.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA13.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Sport, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA14= new Symbol();
	static {
		NoticeA14.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA14.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Waterski, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA15= new Symbol();
	static {
		NoticeA15.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA15.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Sailboat, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA16= new Symbol();
	static {
		NoticeA16.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA16.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Rowboat, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA17= new Symbol();
	static {
		NoticeA17.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA17.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Sailboard, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA18= new Symbol();
	static {
		NoticeA18.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA18.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Speedboat, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA19= new Symbol();
	static {
		NoticeA19.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA19.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Slipway, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeA20= new Symbol();
	static {
		NoticeA20.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeA, 1.0, 0, 0, null, null)));
		NoticeA20.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.Waterbike, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeB1a = new Symbol();
	public static final Symbol NoticeB1b = new Symbol();
	public static final Symbol NoticeB2a = new Symbol();
	public static final Symbol NoticeB2b = new Symbol();
	public static final Symbol NoticeB3a = new Symbol();
	public static final Symbol NoticeB3b = new Symbol();
	public static final Symbol NoticeB4a = new Symbol();
	public static final Symbol NoticeB4b = new Symbol();
	public static final Symbol NoticeB5 = new Symbol();
	public static final Symbol NoticeB6 = new Symbol();
	public static final Symbol NoticeB7 = new Symbol();
	public static final Symbol NoticeB8 = new Symbol();
	public static final Symbol NoticeB9a = new Symbol();
	public static final Symbol NoticeB9b = new Symbol();
	public static final Symbol NoticeB11 = new Symbol();
	static {
		NoticeB11.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.NoticeB, 1.0, 0, 0, null, null)));
		NoticeB11.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Notices.VHF, 1.0, 0, 0, null, null)));
	}
	public static final Symbol NoticeC1 = new Symbol();
	public static final Symbol NoticeC2 = new Symbol();
	public static final Symbol NoticeC3 = new Symbol();
	public static final Symbol NoticeC4 = new Symbol();
	public static final Symbol NoticeC5a = new Symbol();
	public static final Symbol NoticeC5b = new Symbol();
	public static final Symbol NoticeD1a = new Symbol();
	public static final Symbol NoticeD1b = new Symbol();
	public static final Symbol NoticeD2a = new Symbol();
	public static final Symbol NoticeD2b = new Symbol();
	public static final Symbol NoticeD3a = new Symbol();
	public static final Symbol NoticeD3b = new Symbol();
	public static final Symbol NoticeE1 = new Symbol();
	public static final Symbol NoticeE2 = new Symbol();
	public static final Symbol NoticeE3 = new Symbol();
	public static final Symbol NoticeE4a = new Symbol();
	public static final Symbol NoticeE4b = new Symbol();
	public static final Symbol NoticeE5 = new Symbol();
	public static final Symbol NoticeE5_1 = new Symbol();
	public static final Symbol NoticeE5_2 = new Symbol();
	public static final Symbol NoticeE5_3 = new Symbol();
	public static final Symbol NoticeE5_4 = new Symbol();
	public static final Symbol NoticeE5_5 = new Symbol();
	public static final Symbol NoticeE5_6 = new Symbol();
	public static final Symbol NoticeE5_7 = new Symbol();
	public static final Symbol NoticeE5_8 = new Symbol();
	public static final Symbol NoticeE5_9 = new Symbol();
	public static final Symbol NoticeE5_10 = new Symbol();
	public static final Symbol NoticeE5_11 = new Symbol();
	public static final Symbol NoticeE5_12 = new Symbol();
	public static final Symbol NoticeE5_13 = new Symbol();
	public static final Symbol NoticeE5_14 = new Symbol();
	public static final Symbol NoticeE5_15 = new Symbol();
	public static final Symbol NoticeE6 = new Symbol();
	public static final Symbol NoticeE7 = new Symbol();
	public static final Symbol NoticeE7_1 = new Symbol();
	public static final Symbol NoticeE8 = new Symbol();
	public static final Symbol NoticeE9a = new Symbol();
	public static final Symbol NoticeE9b = new Symbol();
	public static final Symbol NoticeE9c = new Symbol();
	public static final Symbol NoticeE9d = new Symbol();
	public static final Symbol NoticeE9e = new Symbol();
	public static final Symbol NoticeE9f = new Symbol();
	public static final Symbol NoticeE9g = new Symbol();
	public static final Symbol NoticeE9h = new Symbol();
	public static final Symbol NoticeE9i = new Symbol();
	public static final Symbol NoticeE10a = new Symbol();
	public static final Symbol NoticeE10b = new Symbol();
	public static final Symbol NoticeE10c = new Symbol();
	public static final Symbol NoticeE10d = new Symbol();
	public static final Symbol NoticeE10e = new Symbol();
	public static final Symbol NoticeE10f = new Symbol();
	public static final Symbol NoticeE11 = new Symbol();
	public static final Symbol NoticeE13 = new Symbol();
	public static final Symbol NoticeE14 = new Symbol();
	public static final Symbol NoticeE15 = new Symbol();
	public static final Symbol NoticeE16 = new Symbol();
	public static final Symbol NoticeE17 = new Symbol();
	public static final Symbol NoticeE18 = new Symbol();
	public static final Symbol NoticeE19 = new Symbol();
	public static final Symbol NoticeE20 = new Symbol();
	public static final Symbol NoticeE21 = new Symbol();
	public static final Symbol NoticeE22 = new Symbol();
	public static final Symbol NoticeE23 = new Symbol();
	public static final Symbol NoticeE24 = new Symbol();

	public static final EnumMap<CatNMK, Symbol> NmkCevni = new EnumMap<CatNMK, Symbol>(CatNMK.class);
	static {
		NmkCevni.put(CatNMK.NMK_UNKN, Notice); NmkCevni.put(CatNMK.NMK_NENT, NoticeA1); NmkCevni.put(CatNMK.NMK_CLSA, NoticeA1a); NmkCevni.put(CatNMK.NMK_NOVK, NoticeA2);
		NmkCevni.put(CatNMK.NMK_NCOV, NoticeA3); NmkCevni.put(CatNMK.NMK_NPAS, NoticeA4); NmkCevni.put(CatNMK.NMK_NBRT, NoticeA5); NmkCevni.put(CatNMK.NMK_NBLL, NoticeA5_1);
		NmkCevni.put(CatNMK.NMK_NANK, NoticeA6); NmkCevni.put(CatNMK.NMK_NMOR, NoticeA7); NmkCevni.put(CatNMK.NMK_NTRN, NoticeA8); NmkCevni.put(CatNMK.NMK_NWSH, NoticeA9);
		NmkCevni.put(CatNMK.NMK_NPSL, NoticeA10a); NmkCevni.put(CatNMK.NMK_NPSR, NoticeA10b); NmkCevni.put(CatNMK.NMK_NMTC, NoticeA12); NmkCevni.put(CatNMK.NMK_NSPC, NoticeA13);
		NmkCevni.put(CatNMK.NMK_NWSK, NoticeA14); NmkCevni.put(CatNMK.NMK_NSLC, NoticeA15); NmkCevni.put(CatNMK.NMK_NUPC, NoticeA16); NmkCevni.put(CatNMK.NMK_NSLB, NoticeA17);
		NmkCevni.put(CatNMK.NMK_NWBK, NoticeA20); NmkCevni.put(CatNMK.NMK_NHSC, NoticeA18); NmkCevni.put(CatNMK.NMK_NLBG, NoticeA19);
		NmkCevni.put(CatNMK.NMK_MVTL, NoticeB1a); NmkCevni.put(CatNMK.NMK_MVTR, NoticeB1b); NmkCevni.put(CatNMK.NMK_MVTP, NoticeB2a); NmkCevni.put(CatNMK.NMK_MVTS, NoticeB2b);
		NmkCevni.put(CatNMK.NMK_KPTP, NoticeB3a); NmkCevni.put(CatNMK.NMK_KPTS, NoticeB3b); NmkCevni.put(CatNMK.NMK_CSTP, NoticeB4a); NmkCevni.put(CatNMK.NMK_CSTS, NoticeB4b);
		NmkCevni.put(CatNMK.NMK_STOP, NoticeB5); NmkCevni.put(CatNMK.NMK_SPDL, NoticeB6); NmkCevni.put(CatNMK.NMK_SHRN, NoticeB7); NmkCevni.put(CatNMK.NMK_KPLO, NoticeB8);
		NmkCevni.put(CatNMK.NMK_GWJN, NoticeB9a); NmkCevni.put(CatNMK.NMK_GWCS, NoticeB9b); NmkCevni.put(CatNMK.NMK_MKRC, NoticeB11);
		NmkCevni.put(CatNMK.NMK_LMDP, NoticeC1); NmkCevni.put(CatNMK.NMK_LMHR, NoticeC2);	NmkCevni.put(CatNMK.NMK_LMWD, NoticeC3); NmkCevni.put(CatNMK.NMK_NAVR, NoticeC4);
		NmkCevni.put(CatNMK.NMK_CHDL, NoticeC5a); NmkCevni.put(CatNMK.NMK_CHDR, NoticeC5b);
		NmkCevni.put(CatNMK.NMK_CHTW, NoticeD1a); NmkCevni.put(CatNMK.NMK_CHOW, NoticeD1b); NmkCevni.put(CatNMK.NMK_OPTR, NoticeD2a); NmkCevni.put(CatNMK.NMK_OPTL, NoticeD2b);
		NmkCevni.put(CatNMK.NMK_PRTL, NoticeD3a); NmkCevni.put(CatNMK.NMK_PRTR, NoticeD3b);
		NmkCevni.put(CatNMK.NMK_ENTP, NoticeE1); NmkCevni.put(CatNMK.NMK_OVHC, NoticeE2);	NmkCevni.put(CatNMK.NMK_WEIR, NoticeE3); NmkCevni.put(CatNMK.NMK_FERN, NoticeE4a);
		NmkCevni.put(CatNMK.NMK_FERI, NoticeE4b); NmkCevni.put(CatNMK.NMK_BRTP, NoticeE5);	NmkCevni.put(CatNMK.NMK_BTLL, NoticeE5_1); NmkCevni.put(CatNMK.NMK_BTLS, NoticeE5_2);
		NmkCevni.put(CatNMK.NMK_BTRL, NoticeE5_3); NmkCevni.put(CatNMK.NMK_BTUP, NoticeE5_4);	NmkCevni.put(CatNMK.NMK_BTP1, NoticeE5_5); NmkCevni.put(CatNMK.NMK_BTP2, NoticeE5_6);
		NmkCevni.put(CatNMK.NMK_BTP3, NoticeE5_7); NmkCevni.put(CatNMK.NMK_BTUN, NoticeE5_8);	NmkCevni.put(CatNMK.NMK_BTN1, NoticeE5_9); NmkCevni.put(CatNMK.NMK_BTN2, NoticeE5_10);
		NmkCevni.put(CatNMK.NMK_BTN3, NoticeE5_11); NmkCevni.put(CatNMK.NMK_BTUM, NoticeE5_12);	NmkCevni.put(CatNMK.NMK_BTU1, NoticeE5_13); NmkCevni.put(CatNMK.NMK_BTU2, NoticeE5_14);
		NmkCevni.put(CatNMK.NMK_BTU3, NoticeE5_15); NmkCevni.put(CatNMK.NMK_ANKP, NoticeE6);	NmkCevni.put(CatNMK.NMK_MORP, NoticeE7); NmkCevni.put(CatNMK.NMK_VLBT, NoticeE7_1);
		NmkCevni.put(CatNMK.NMK_TRNA, NoticeE8); NmkCevni.put(CatNMK.NMK_SWWC, NoticeE9a);	NmkCevni.put(CatNMK.NMK_SWWR, NoticeE9b); NmkCevni.put(CatNMK.NMK_SWWL, NoticeE9c);
		NmkCevni.put(CatNMK.NMK_WRSA, NoticeE9d); NmkCevni.put(CatNMK.NMK_WLSA, NoticeE9e);	NmkCevni.put(CatNMK.NMK_WRSL, NoticeE9f); NmkCevni.put(CatNMK.NMK_WLSR, NoticeE9g);
		NmkCevni.put(CatNMK.NMK_WRAL, NoticeE9h); NmkCevni.put(CatNMK.NMK_WLAR, NoticeE9i);	NmkCevni.put(CatNMK.NMK_MWWC, NoticeE10a); NmkCevni.put(CatNMK.NMK_MWWJ, NoticeE10b);
		NmkCevni.put(CatNMK.NMK_MWAR, NoticeE10c); NmkCevni.put(CatNMK.NMK_MWAL, NoticeE10d);	NmkCevni.put(CatNMK.NMK_WARL, NoticeE10e); NmkCevni.put(CatNMK.NMK_WALR, NoticeE10f);
		NmkCevni.put(CatNMK.NMK_PEND, NoticeE11); NmkCevni.put(CatNMK.NMK_DWTR, NoticeE13);	NmkCevni.put(CatNMK.NMK_TELE, NoticeE14); NmkCevni.put(CatNMK.NMK_MTCP, NoticeE15);
		NmkCevni.put(CatNMK.NMK_SPCP, NoticeE16); NmkCevni.put(CatNMK.NMK_WSKP, NoticeE17);	NmkCevni.put(CatNMK.NMK_SLCP, NoticeE18); NmkCevni.put(CatNMK.NMK_UPCP, NoticeE19);
		NmkCevni.put(CatNMK.NMK_SLBP, NoticeE20); NmkCevni.put(CatNMK.NMK_RADI, NoticeE23);	NmkCevni.put(CatNMK.NMK_WTBP, NoticeE24); NmkCevni.put(CatNMK.NMK_HSCP, NoticeE21);
		NmkCevni.put(CatNMK.NMK_LBGP, NoticeE22);
  };

	public static final EnumMap<CatNMK, Symbol> NmkBniwr = new EnumMap<CatNMK, Symbol>(CatNMK.class);
	static {
		NmkBniwr.put(CatNMK.NMK_NANK, Notice); NmkBniwr.put(CatNMK.NMK_LMHR, Notice); NmkBniwr.put(CatNMK.NMK_OPTR, Notice); NmkBniwr.put(CatNMK.NMK_OPTL, Notice);
		NmkBniwr.put(CatNMK.NMK_WRAL, Notice); NmkBniwr.put(CatNMK.NMK_WLAR, Notice); NmkBniwr.put(CatNMK.NMK_KTPM, Notice); NmkBniwr.put(CatNMK.NMK_KTSM, Notice);
		NmkBniwr.put(CatNMK.NMK_KTMR, Notice); NmkBniwr.put(CatNMK.NMK_CRTP, Notice); NmkBniwr.put(CatNMK.NMK_CRTS, Notice); NmkBniwr.put(CatNMK.NMK_TRBM, Notice);
		NmkBniwr.put(CatNMK.NMK_RSPD, Notice);
	}

	public static final EnumMap<CatNMK, Symbol> NmkPpwbc = new EnumMap<CatNMK, Symbol>(CatNMK.class);
	static {
		NmkPpwbc.put(CatNMK.NMK_WRAL, Notice); NmkPpwbc.put(CatNMK.NMK_WLAR, Notice); NmkPpwbc.put(CatNMK.NMK_KTPM, Notice); NmkPpwbc.put(CatNMK.NMK_KTSM, Notice);
		NmkPpwbc.put(CatNMK.NMK_KTMR, Notice); NmkPpwbc.put(CatNMK.NMK_CRTP, Notice); NmkPpwbc.put(CatNMK.NMK_CRTS, Notice);
	}
	
	public static Symbol getNotice(CatNMK cat, MarSYS sys) {
		Symbol symbol = null;
		switch (sys) {
		case SYS_CEVN:
			symbol = NmkCevni.get(cat);
			break;
		case SYS_BNWR:
			symbol = NmkBniwr.get(cat);
			break;
		case SYS_PPWB:
			symbol = NmkPpwbc.get(cat);
			break;
		}
		return symbol;
	}
}
