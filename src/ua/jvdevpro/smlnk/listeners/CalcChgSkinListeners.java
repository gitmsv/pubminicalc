package ua.jvdevpro.smlnk.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalcChgSkinListeners implements ActionListener {

    private LookAndFeel laf;
    private JFrame frame;

    public CalcChgSkinListeners(JFrame frame, LookAndFeel laf) {
        this.frame = frame;
        this.laf = laf;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CalcChgSkinListeners.class.getName()).log(Level.SEVERE, null, ex);
        }

        SwingUtilities.updateComponentTreeUI(frame);

    }
}

