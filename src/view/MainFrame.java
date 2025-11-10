/**
 *  This is where all other frames are called.
 * 
 *  Note:
 *  - think of it as the first card in the deck
 *  - add other frames
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
    private BorrowEquipment borrowEquipment;



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
        borrowEquipment = new BorrowEquipment();
        // ADD : individual transaction frames

        /* add frames to card layout */
        mainPanel.add(loginFrame, "login");
        mainPanel.add(transactionsMenu, "transactions");
        mainPanel.add(borrowEquipment, "borrow equipment");
        // ADD : other transaction frames

        /* redirections : this might be in controller instead of here */
        loginFrame.getLoginButton().addActionListener(e -> showTransactionsMenu());
        transactionsMenu.getBtnT4().addActionListener(e -> showBorrowEquipmentFrame());
        borrowEquipment.getBackButton().addActionListener(e -> showTransactionsMenu());

        /* add mainPanel to Frame */
        add(mainPanel);
        setVisible(true);
    }


    /* leads to transactions menu frame */
    private void showTransactionsMenu() {
        cardLayout.show(mainPanel, "transactions");
    }

    /* leads to borrow equipment frame */
    private void showBorrowEquipmentFrame() {
        cardLayout.show(mainPanel, "borrow equipment");
    }
}