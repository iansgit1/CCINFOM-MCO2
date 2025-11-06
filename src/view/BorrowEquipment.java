/**
 *  Notes:
 *  - unfinished
 *  - use JTable, JScrollPane, JComboBox (dropdown list)
*/

package view;

import javax.swing.*;

import model.Equipment;

import java.awt.*;;

public class BorrowEquipment extends JPanel {
    /* ATTRIBUTES */
    private Equipment equipment[];

    /* UI COMPONENTS */
    private JLabel titleLabel = new JLabel();
    private JTable equipmentTable = new JTable();
    private JLabel equipmentLabel = new JLabel();
    private JLabel quantityLabel = new JLabel();
    private JLabel availabilityLabel = new JLabel();
    private JButton backButton = new JButton();
    private JButton borrowButton = new JButton();


    public static final String equipmentlbl = "Equipment Name";
    public static final String quantitylbl = "Quantity";
    public static final String availabilitylbl = "Availability";


    public BorrowEquipment() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        

        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titleLabel.setText("Borrow Equipment");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.BLACK);
        titlePanel.add(titleLabel);

        JPanel centerPanel = new JPanel();
        centerPanel.add(titlePanel);
        
        add(centerPanel, BorderLayout.CENTER);
    }
}
