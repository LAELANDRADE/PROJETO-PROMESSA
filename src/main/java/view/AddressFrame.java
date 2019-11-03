package view;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AddressFrame extends JFrame {

    public AddressFrame() throws HeadlessException {
        //        setBounds(0,0, 600, 600);
        setTitle("Primeira Janela");
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        addComponent();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // encerrar o processo no S.O.
    }

    private void addComponent() {
        JPanel principal = new JPanel();
        principal.setLayout(null);

        setContentPane(principal);

        addLabel(principal);
        addInputAndButton(principal);

    }

    private void addLabel(JPanel principal) {
        label = new JLabel("Nome");
        label.setBounds(10,0,200,20);
        principal.add(label);
    }

    private void addInputAndButton(JPanel principal) {
        //Criar o input
        input = new JTextField();
        input.setBounds(10, 20, 200, 20);
        input.setColumns(50);

        // Criar o Botão
        button = new JButton("OK");
        button.setBounds(10, 50, 200, 20);
        // e -> lambda
        button.addActionListener(e -> {
            String typedText = input.getText();
            if (typedText.isEmpty()) {
                label.setText("Nome está vazio!");
                label.setForeground(Color.RED);
                showAlert();
            } else {
                label.setText(typedText);
                label.setForeground(Color.black);
            }
        });
        /*
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setText("Botão foi clicado!");
            }
        });
        */

        // Criar um Panel com titulo
        JPanel panelWithTitle = new JPanel();
        panelWithTitle.setBounds(10, 30, 500, 90);
        panelWithTitle.setBorder(javax.swing.BorderFactory.createTitledBorder("Informar nome"));
        panelWithTitle.setLayout(null);

        // Adciono na tela o input e o botão
        panelWithTitle.add(input);
        panelWithTitle.add(button);

        panelWithTitle.setVisible(false);
        // Adiciono na tela o painel com titulo
        principal.add(panelWithTitle);

        JButton showPanel = new JButton("Mostrar campos");
        showPanel.setBounds(500, 0, 200, 20);
        showPanel.addActionListener(e -> panelWithTitle.setVisible(!panelWithTitle.isVisible()));
        principal.add(showPanel);
    }

    private void showAlert() {
        JOptionPane.showMessageDialog(this, "Nome está vazio", "Alerta!", JOptionPane.WARNING_MESSAGE);
    }

    private JLabel label;
    private JButton button;
    private JTextField input;

    public static void main(String[] args) {
        AddressFrame janela = new AddressFrame();
        janela.setTitle("Outro titulo");
    }
}
