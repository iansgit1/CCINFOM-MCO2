/**
 *  This is contains the error message that pops up when a transaction is unsuccessful.
 */

package view;

import javax.swing.*;
import java.awt.*;

public class ErrorMessage extends JPanel {
    /* UI components */
    private JLabel errorMessage = new JLabel();
    private JLabel message = new JLabel();
    private JButton backButton = new JButton();
    private JButton retryButton = new JButton();

    public ErrorMessage() {
        /* panel settings */
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        
        /* message panel */
        JPanel messagePanel = new JPanel();
        messagePanel.setLayout(new BoxLayout(messagePanel, BoxLayout.Y_AXIS));
        errorMessage.setText("Transaction Failed!");
        errorMessage.setFont(new Font("Arial", Font.BOLD, 24));
        errorMessage.setForeground(Color.BLACK);
        message.setText("Check if fields entered are accurate and in the right format.");
        message.setForeground(Color.BLACK);
        messagePanel.add(errorMessage);
        messagePanel.add(message);

        /* buttons panel */
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcButtons = new GridBagConstraints();
        gbcButtons.insets = new Insets(10, 200, 10, 200);
        gbcButtons.gridx = 0;
        gbcButtons.gridy = 0;
        gbcButtons.anchor = GridBagConstraints.CENTER;

        backButton = new JButton("Back to Transactions");
        retryButton = new JButton("Retry Transaction");

        buttonPanel.add(backButton, gbcButtons);
        gbcButtons.gridx = 1;
        buttonPanel.add(retryButton, gbcButtons);
        gbcButtons.gridx = 2;
        
        /* combine */
        add(messagePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public JButton getBackButton() {
        return backButton; 
    }

    public JButton getRetryButton() {
        return retryButton; 
    }
}