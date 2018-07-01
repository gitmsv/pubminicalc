package ua.jvdevpro.smlnk;

import javax.swing.JFrame;
import java.awt.LayoutManager;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.Component;


public class CalcJFrame extends JFrame {

    public CalcJFrame(String title, int width, int height) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setIconImage(new ImageIcon("calc.png").getImage());
    }

    public CalcJFrame(String title, int width, int height, Component comp) {
        this(title, width, height);
        super.getContentPane().add(comp);

    }

    public CalcJFrame(String title, int width, int height, LayoutManager layout) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(layout);
        super.setIconImage(new ImageIcon("calc.png").getImage());
    }

}
