package Eleicao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eleicao {
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JButton btnVotar;
    private JButton btnApurar;
    public JPanel panel;
    private JLabel lblCandidato1;
    private JLabel lblCandidato2;

    int candidato1;
    int candidato2;
    public Eleicao() {


        btnVotar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (rb1.isSelected()) {
                    candidato1++;
                }
                if (rb2.isSelected()){
                    candidato2++;
                }
            }
        });
    };

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
};

