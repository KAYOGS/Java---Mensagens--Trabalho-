import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class componentes extends JFrame {

    private String ipfind;

    public componentes() {

        // Componentes do frame da tela
        setTitle("Mensagem Java " + "ipfind");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // Componentes de usabilidade
        JLabel destinatarioLabel = new JLabel("IP do Destinatario");
        JTextField destinatario = new JTextField();
        JLabel mensagemLabel = new JLabel("Escreva uma Mensagem");
        JTextField mensagem = new JTextField();
        JButton enviar = new JButton("Enviar");
        JPanel mensagemPanel = new JPanel();

        // Formata os componentes de usabilidade
        destinatarioLabel.setBounds(10, 495, 100, 20);
        destinatario.setBounds(10, 515, 140, 20);
        mensagemLabel.setBounds(160, 495, 140, 20);
        mensagem.setBounds(160, 515, 530, 20);
        enviar.setBounds(700, 515, 75, 20);
        mensagemPanel.setLayout(null);
        mensagemPanel.setBounds(10, 10, 765, 480);
        mensagemPanel.setBackground(Color.GRAY);

        // Adiciona os componentes na tela
        add(destinatarioLabel);
        add(destinatario);
        add(mensagemLabel);
        add(mensagem);
        add(enviar);
        add(mensagemPanel);

        setVisible(true);
    }
}
