package br.com.lael.promiseproject.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by caioaraujo on 09/11/19.
 * www.c410.com.br | caiofaar@gmail.com
 */
public class PersonFrame extends JFrame {

    public PersonFrame() throws HeadlessException {
        setBounds(0,0, 600, 400);
        setTitle("Primeira Janela");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerrar o processo no S.O.
        setLocationRelativeTo(null);
        setResizable(false);
        addComponents();
        resetForm();
    }

    private void addComponents() {
        
    }

    private void resetForm() {
    }
}
