package ua.jvdevpro.smlnk;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import ua.jvdevpro.smlnk.listeners.CalcButtonActionListener;
import ua.jvdevpro.smlnk.listeners.CalcChgSkinListeners;
import ua.jvdevpro.smlnk.listeners.CalcTextFieldFocusListener;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Run {

    public static final String INPUT_VALUE = "Input...!?";

    // buttons announcement;
    private JButton btnAdd;
    private JButton btnSubtract;
    private JButton btnMultiply;
    private JButton btnDevide;
    private JButton btnSckin;
    private JButton btnSckinDefault;

    // labeling;
    private JLabel labelVal1;
    private JLabel labelVal2;
    private JLabel result;

    // text fields;
    private CalcJTextField txtVal1;
    private CalcJTextField txtVal2;
    private CalcJTextField txtResult;


    // panels;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    // basic form declaration;
    private JFrame frame;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new AeroLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, e);
        }

        JFrame.setDefaultLookAndFeelDecorated(true);

        Run rn = new Run();

        rn.createLbl();
        rn.createFlds();
        rn.createBtns();
        rn.createPnls();
        rn.createFrm();

    }

    // private methods:
    private void createLbl() {
        labelVal1 = new JLabel("value_1: ");
        labelVal2 = new JLabel("value_2: ");
        result = new JLabel("result = ");
    }

    private void createFlds() {
        txtVal1 = new CalcJTextField(10);
        txtVal2 = new CalcJTextField(10);
        txtResult = new CalcJTextField(20, Color.BLUE);

        addTextFieldListeners();
    }

    private void createBtns() {
        btnSckin = new CalcJButton("grey");
        btnAdd = new CalcJButton("+");
        btnSubtract = new CalcJButton("-");
        btnDevide = new CalcJButton("/");
        btnMultiply = new CalcJButton("x");
        btnSckinDefault = new CalcJButton("blue");
        addButtonListeners();
    }

    private void createPnls() {

        panel1 = new CalcJPanel("p1", 100, 100);
        panel1.setPreferredSize(new Dimension(200, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel2 = new CalcJPanel("p2", 100, 100);
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel3 = new CalcJPanel("p3", 100, 100);
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel1.add(labelVal1);
        panel1.add(txtVal1);
        panel1.add(labelVal2);
        panel1.add(txtVal2);

        panel2.add(btnSckin);

        panel2.add(btnAdd);
        panel2.add(btnSubtract);
        panel2.add(btnMultiply);
        panel2.add(btnDevide);

        // Skins;
        panel2.add(btnSckinDefault);

        panel3.add(result);
        panel3.add(txtResult);

    }

    private void createFrm() {
        frame = new CalcJFrame("Mini~Calc ver.1.0   @th-r :~$m.lnk", 430, 250, new BorderLayout(1, 1));
        frame.setMinimumSize(new Dimension(430, 250)); // minimal size;

        frame.setResizable(false); // disable size frame;

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);

        addCngSkin();

        frame.setVisible(true);

    }

    private void addButtonListeners() {

        CalcButtonActionListener bl = new CalcButtonActionListener(txtVal1, txtVal2, txtResult);

        btnAdd.addActionListener(bl);
        btnSubtract.addActionListener(bl);
        btnMultiply.addActionListener(bl);
        btnDevide.addActionListener(bl);
    }

    private void addTextFieldListeners() {
        txtVal1.addFocusListener(new CalcTextFieldFocusListener(txtVal1));
        txtVal2.addFocusListener(new CalcTextFieldFocusListener(txtVal2));
    }

    private void addCngSkin() {
        btnSckin.addActionListener(new CalcChgSkinListeners(frame, new AluminiumLookAndFeel()));
        btnSckinDefault.addActionListener(new CalcChgSkinListeners(frame, new AeroLookAndFeel()));
    }
}

