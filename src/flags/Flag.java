package flags;

import java.awt.*;
import java.awt.event.*;

// Base Flag Class
abstract class Flag {
    protected int x, y, width, height;
    protected Color[] colors;

    Flag(int x, int y, int width, int height, Color[] colors) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colors = colors;
    }

    // Abstract draw method
    public abstract void draw(Graphics g);
}





