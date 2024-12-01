package calculadoragraficaip.views;

import javax.swing.*;
import java.awt.*;

/**
 * Clase de la vista para la calculadora de IPv4.
 */
public class CalcView extends JFrame {

    private JTextField ipField;
    private JTextField maskField;
    private JButton calculateButton;
    private JTextArea resultsArea;

    public CalcView() {
        setTitle("Calculadora IPv4");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(240, 240, 240));

        // Panel de entrada
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        inputPanel.setBackground(new Color(250, 250, 250));

        JLabel ipLabel = new JLabel("Dirección IP:");
        ipLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        ipField = new JTextField();
        ipField.setFont(new Font("Arial", Font.PLAIN, 14));
        inputPanel.add(ipLabel);
        inputPanel.add(ipField);

        JLabel maskLabel = new JLabel("Máscara (CIDR):");
        maskLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        maskField = new JTextField();
        maskField.setFont(new Font("Arial", Font.PLAIN, 14));
        inputPanel.add(maskLabel);
        inputPanel.add(maskField);

        calculateButton = new JButton("Calcular");
        calculateButton.setFont(new Font("Arial", Font.BOLD, 14));
        calculateButton.setBackground(new Color(60, 130, 250));
        calculateButton.setForeground(Color.WHITE);
        calculateButton.setFocusPainted(false);
        inputPanel.add(new JLabel());  // Espacio vacío para alineación
        inputPanel.add(calculateButton);

        // Área de resultados
        resultsArea = new JTextArea();
        resultsArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        resultsArea.setEditable(false);
        resultsArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(resultsArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Resultados"));

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    public JTextField getIPField() {
        return ipField;
    }

    public JTextField getMaskField() {
        return maskField;
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }

    public JTextArea getResultsArea() {
        return resultsArea;
    }
}
