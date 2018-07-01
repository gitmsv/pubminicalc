package ua.jvdevpro.smlnk;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.*;

public class CalcJPanel extends JPanel {

    public CalcJPanel(String name, int width, int height) {
        super.setSize(width, height);
        super.setName(name);
        super.setBorder(BorderFactory.createEtchedBorder());
    }

    public CalcJPanel(String name, int width, int height, Component comp) {
        this(name, width, height);
        super.add(comp);
    }

    public CalcJPanel(String name, int width, int height, LayoutManager layout) {
        this(name, width, height);
        super.setLayout(layout);
    }

    public CalcJPanel(String name, int width, int height, LayoutManager layout, Component comp) {
        this(name, width, height);
        super.setLayout(layout);
        super.add(comp);
    }

}
