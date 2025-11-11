/**
 *  This is contains the success message that pops up when a transaction is successful.
 */

package view;

import javax.swing.*;
import java.awt.*;

public class SuccessMessage extends JPanel {
    /* UI components */
    private JLabel title = new JLabel("");
    private JLabel successMessage = new JLabel();
    private JButton backButton = new JButton();

    public SuccessMessage() {
        /* panel settings */
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        
        /* message panel */
        JPanel messagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        successMessage.setText("Transaction Successful!");
        successMessage.setFont(new Font("Arial", Font.BOLD, 24));
        successMessage.setForeground(Color.BLACK);
        messagePanel.add(successMessage);

        backButton.setText("Back to Transactions");
        
        add(title, BorderLayout.NORTH);
        add(messagePanel, BorderLayout.CENTER);
        add(backButton, BorderLayout.SOUTH);
    }

    public JButton getBackButton() {
        return backButton; 
    }
}