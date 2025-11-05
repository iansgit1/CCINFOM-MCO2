/**
 *  This is where all other frames are called.
 * 
 *  Note:
 *  - add other frames
 *  - 
*/

package view;

import java.awt.*;
import javax.swing.*;


public class MainFrame extends JFrame {
    /* ATTRIBUTES */
    private CardLayout cardLayout;
    private JPanel mainPanel;


    /* OTHER FRAMES */
    private LoginFrame loginFrame;
    private TransactionsMenu transactionsMenu;



    /* CONSTRUCTOR */
    public MainFrame() {
        super("Barangay Resident Evacuation and Shelter Management System");                // app name

        /* UI preferences */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600);

        /* initialize layout */
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        /* initialize frames */
        loginFrame = new LoginFrame();
        transactionsMenu = new TransactionsMenu();
        // ADD : individual transaction frames

        /* add frames to card layout */
        mainPanel.add(loginFrame, "login");
        mainPanel.add(transactionsMenu, "transactions");
        // ADD : other transaction frames

        /* goes to LoginFrame when login button is clicked */
        loginFrame.getLoginButton().addActionListener(e -> showTransactionsMenu());

        /* add mainPanel to Frame */
        add(mainPanel);
        setVisible(true);
    }


    /* LEADS TO OTHER FRAMES */
    private void showTransactionsMenu() {
        cardLayout.show(mainPanel, "transactions");
    }
}