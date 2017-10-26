import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.io.Serializable;

class Player implements Serializable {
    private transient Color color;
    private static Grid grid;
    private double red, green, blue, opacity;

    private static final long serialVersionUID = 3L;

    Player(Color color) {
        this.color=color;
        resolveColor();
    }

    void makeColor() {
        color=new Color(red, green, blue, opacity);
    }

    @Override
    public String toString() {
        return red+" "+green+" "+blue+" "+opacity;
    }

    private void resolveColor() {
        red=color.getRed();
        blue=color.getBlue();
        green=color.getGreen();
        opacity=color.getOpacity();
    }

    Color getColor() {
        return color;
    }
}
