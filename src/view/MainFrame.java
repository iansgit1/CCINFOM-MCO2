/**
 *  This is where all other frames are called.
 * 
 *  Note:
 *  - think of it as the first card in the deck
 *  - add other frames
 *  - when you go back, you get a new panel
*/

package view;

import java.awt.*;
import javax.swing.*;


public class MainFrame extends JFrame {
    /* ATTRIBUTES */
    private CardLayout cardLayout;
    private JPanel mainPanel;


    /* OTHER FRAMES */
    private LoginFrame loginFrame = new LoginFrame();;
    private TransactionsMenu transactionsMenu = new TransactionsMenu();
    private AssignToShelter assignToShelter = new AssignToShelter();
    private ReleaseFromShelter releaseFromShelter = new ReleaseFromShelter();
    private BorrowEquipment borrowEquipment = new BorrowEquipment();
    private ReturnEquipment returnEquipment = new ReturnEquipment();



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

        /* add frames to card layout */
        mainPanel.add(loginFrame, "login");
        mainPanel.add(transactionsMenu, "transactions");
        mainPanel.add(assignToShelter, "assign to shelter");
        mainPanel.add(releaseFromShelter, "release from shelter");
        mainPanel.add(borrowEquipment, "borrow equipment");
        mainPanel.add(returnEquipment, "return equipment");
        // ADD : other transaction frames

        /* redirections : this might be in controller instead of here */
        loginFrame.getLoginButton().addActionListener(e -> showTransactionsMenu());
        transactionsMenu.getBtnT2().addActionListener(e -> showAssignToShelterPane());
        transactionsMenu.getBtnT3().addActionListener(e -> showReleaseFromShelterPane());
        transactionsMenu.getBtnT4().addActionListener(e -> showBorrowEquipmentPane());
        transactionsMenu.getBtnT5().addActionListener(e -> showReturnEquipmentPane());

        assignToShelter.getBackButton().addActionListener(e -> showTransactionsMenu());
        releaseFromShelter.getBackButton().addActionListener(e -> showTransactionsMenu());
        borrowEquipment.getBackButton().addActionListener(e -> showTransactionsMenu());
        returnEquipment.getBackButton().addActionListener(e -> showTransactionsMenu());

        /* add mainPanel to Frame */
        add(mainPanel);
        setVisible(true);
    }


    /* leads to transactions menu frame */
    private void showTransactionsMenu() {
        cardLayout.show(mainPanel, "transactions");
    }

    /* leads to assign to shelter pane */
    private void showAssignToShelterPane() {
        cardLayout.show(mainPanel, "assign to shelter");
    }

    /* leads to release from shelter pane */
    private void showReleaseFromShelterPane() {
        cardLayout.show(mainPanel, "release from shelter");
    }

    /* leads to borrow equipment pane */
    private void showBorrowEquipmentPane() {
        cardLayout.show(mainPanel, "borrow equipment");
    }

    /* leads to return equipment pane */
    private void showReturnEquipmentPane() {
        cardLayout.show(mainPanel, "return equipment");
    }
}