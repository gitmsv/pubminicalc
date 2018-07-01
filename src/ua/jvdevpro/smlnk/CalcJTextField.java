package ua.jvdevpro.smlnk;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class CalcJTextField extends JTextField {

    public CalcJTextField (String text, int columns) {
        this(columns);
        super.setText(text);
    }

    public CalcJTextField(int columns) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 20);
        super.setFont(font);
        super.setForeground(Color.BLACK);
    }

    public CalcJTextField(int columns, Color textColor) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 20);
        super.setFont(font);
        super.setForeground(textColor);
    }
}
