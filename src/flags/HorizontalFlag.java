package flags;

import java.awt.Color;
import java.awt.Graphics;

//Horizontal Tricolor Flag (e.g., Germany, Netherlands, Bulgaria)
class HorizontalFlag extends Flag {
 HorizontalFlag(int x, int y, int width, int height, Color[] colors) {
     super(x, y, width, height, colors);
 }

 @Override
 public void draw(Graphics g) {
     int stripeHeight = height / colors.length;
     for (int i = 0; i < colors.length; i++) {
         g.setColor(colors[i]);
         g.fillRect(x, y + stripeHeight * i, width, stripeHeight);
     }
     g.setColor(Color.BLACK);
     g.drawRect(x, y, width, height);
 }
}
