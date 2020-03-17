package app;

import java.io.FileNotFoundException;

import javax.swing.UIManager;

public class App {
    public static void main(String[] args) {
        /**
         * Seleciona a aparência do JFrame
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        /**
         * Inicia os JFrames
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameMain().setVisible(true);
                } catch (FileNotFoundException e) {
                    System.out.println("Arquivo não encontrado");
                } catch (NumberFormatException e) {
                    System.out.println("Formato de número inválido");
                }
            }
        });
        // endregion

    }
}