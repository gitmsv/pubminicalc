package ua.jvdevpro.smlnk.listeners;

import ua.jvdevpro.smlnk.CalcJTextField;
import ua.jvdevpro.smlnk.Run;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CalcTextFieldFocusListener implements FocusListener {

    private CalcJTextField field;

    public CalcTextFieldFocusListener(CalcJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals(Run.INPUT_VALUE)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(Run.INPUT_VALUE);
            field.setForeground(Color.RED);
        }

    }
}
