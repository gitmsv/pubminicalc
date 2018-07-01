package ua.jvdevpro.smlnk;

import javax.swing.JButton;

public class CalcJButton extends JButton {

    public CalcJButton(String title){
        super.setText(title);
    }

    public CalcJButton(String title, int width, int height){
        this(title);
        super.setSize(width, height);
    }


}
