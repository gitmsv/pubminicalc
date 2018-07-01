package ua.jvdevpro.smlnk.listeners;

import ua.jvdevpro.smlnk.CalcJTextField;
import ua.jvdevpro.smlnk.operations.CalcOperations;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {

    private CalcJTextField txtVal1;
    private CalcJTextField txtVal2;
    private CalcJTextField txtResult;

    public CalcButtonActionListener (CalcJTextField txtVal1, CalcJTextField txtVal2, CalcJTextField txtResult) {
        this.txtVal1 = txtVal1;
        this.txtVal2 = txtVal2;
        this.txtResult = txtResult;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(e.getSource() instanceof JButton)) {
            return;
        }

        JButton btn = (JButton) e.getSource();

        final double a = Double.parseDouble(txtVal1.getText());
        final double b = Double.parseDouble(txtVal2.getText());

        if (btn.getActionCommand().equals("+")) {
            txtResult.setText(String.valueOf(CalcOperations.add(a, b)));
        } else if (btn.getActionCommand().equals("/")) {
            txtResult.setText(String.valueOf(CalcOperations.divide(a, b)));
        } else if (btn.getActionCommand().equals("-")) {
            txtResult.setText(String.valueOf(CalcOperations.subtract(a, b)));
        } else if (btn.getActionCommand().equals("x")) {
            txtResult.setText(String.valueOf(CalcOperations.multiply(a, b)));
        }
    }
}
