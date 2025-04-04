package flags;

import java.awt.Color;
import java.awt.Graphics;

//Vertical Tricolor Flag (e.g., Romania, France, Italy)
class VerticalTricolorFlag extends Flag {
 VerticalTricolorFlag(int x, int y, int width, int height, Color[] colors) {
     super(x, y, width, height, colors);
 }

 @Override
 public void draw(Graphics g) {
     int stripeWidth = width / colors.length;
     for (int i = 0; i < colors.length; i++) {
         g.setColor(colors[i]);
         g.fillRect(x + stripeWidth * i, y, stripeWidth, height);
     }
     g.setColor(Color.BLACK);
     g.drawRect(x, y, width, height);
 }
}

