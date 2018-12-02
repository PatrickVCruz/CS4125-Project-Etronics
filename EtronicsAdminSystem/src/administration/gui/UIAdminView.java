/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administration.gui;

import administration.UIAdminModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Brian Heaphy - 14160846
 */

public class UIAdminView extends JFrame {
    
    //Model
    private UIAdminModel model;
    // Components
    private JPanel mainContent;
    // Basic View
    private JLabel heading;
    private JButton productManButton;
    private JButton userManButton;
    private JButton storeManButton;
    private JButton promoManButton;
    private JButton adManButton;
    // Add Products
    private JLabel addProdTitleLabel;
    private JLabel prodNameLabel;
    private JLabel prodPriceLabel;
    private JLabel prodDescLabel;
    private JLabel categoryLabel;
    private JTextField prodNameField;
    private JTextField prodPriceField;
    private JTextField prodDescField;
    private JComboBox categoryComboBox;
    private JButton prodAddButton;
    // Delete Products
    private JLabel delProdTitleLabel;
    private JLabel delProdIDLabel;
    private JTextField prodIDField;
    private JButton prodDelButton;
    // Change Product
    private JLabel changeProdTitleLabel;
    private JLabel changeProdIDLabel;
    private JLabel changeProdNameLabel;
    private JLabel changeProdPriceLabel;
    private JLabel changeCategoryLabel;
    private JTextField changeProdIDField;
    private JTextField changeProdNameField;
    private JTextField changeProdPriceField;
    private JComboBox changeCategoryComboBox;
    private JButton changeProdAddButton;
    // Add Category
    private JLabel findProdTitleLabel;
    private JLabel findProdIDLabel;
    private JLabel idLabel;
    private JComboBox idComboBox;
    private JButton findProdButton;
    private JTextField findProdIDField;
    // Promotions
    // AddPromotion
    private JLabel discount;
    private JTextField discountNum;
    private JLabel prod;
    private JTextField productID;
    private JLabel promo;
    private JTextField promoName;    
    private JLabel date;
    private JTextField endDate;
    private JButton addPromButton;
    private JPanel addPromPanel;    
    
    public UIAdminView(UIAdminModel model){
        
        this.model = model;
        // Basic View
        heading = new JLabel("Etronics Admin System", JLabel.CENTER);
        productManButton = new JButton("Product Management");
        userManButton = new JButton("User Management");
        storeManButton = new JButton("Store Management");
        promoManButton = new JButton("Promotional Management");
        adManButton = new JButton("Advertising Management");

        // Add Products
        addProdTitleLabel = new JLabel("Add Product");
        prodNameLabel = new JLabel("Name: ");
        prodPriceLabel = new JLabel("Price: ");
        categoryLabel = new JLabel("Category: ");
        prodDescLabel = new JLabel("Description:");
        prodNameField = new JTextField();
        prodPriceField = new JTextField();
        prodDescField = new JTextField();
        categoryComboBox = new JComboBox();
        prodAddButton = new JButton("Add Product");
        // Delete Products
        delProdTitleLabel = new JLabel("Delete Product");
        delProdIDLabel = new JLabel("Product ID: ");
        prodIDField = new JTextField();
        prodDelButton = new JButton("Delete Product");
        // Change Product
        changeProdTitleLabel = new JLabel("Change Product");
        changeProdIDLabel = new JLabel("Product ID: ");
        changeProdNameLabel = new JLabel("New Name: ");
        changeProdPriceLabel = new JLabel("New Price: ");
        changeCategoryLabel = new JLabel("New Category: ");
        changeProdIDField = new JTextField();
        changeProdNameField = new JTextField();
        changeProdPriceField = new JTextField();
        changeCategoryComboBox = new JComboBox();
        changeProdAddButton = new JButton("Change Product");
        // Find product ID
        findProdTitleLabel = new JLabel("Find Product ID");
        findProdIDLabel = new JLabel("Product Name: ");
        idLabel = new JLabel("ID List: ");
        idComboBox = new JComboBox();
        findProdButton = new JButton("Find ID");
        findProdIDField = new JTextField();
    
        mainContent = new JPanel();
        mainContent.setLayout(new BorderLayout());
        heading.setFont(new Font("",Font.PLAIN, 40));
        mainContent.add(heading, BorderLayout.NORTH);
        
        JPanel mainButtonPanel = new JPanel();
        mainButtonPanel.setLayout(new GridLayout(0,1));
        mainButtonPanel.setBorder(new EmptyBorder(10, 0, 0, 10));
        mainButtonPanel.add(productManButton);
        mainButtonPanel.add(userManButton);
        mainButtonPanel.add(storeManButton);
        mainButtonPanel.add(promoManButton);
        mainButtonPanel.add(adManButton);
        
        //promotion GUI//////////////////////////////
        JLabel[] emptyLabels = new JLabel[7];
        JLabel[] centreBoxLabels = new JLabel[7];
        for(int i=0; i< emptyLabels.length; i++){
            emptyLabels[i] = new JLabel();
            centreBoxLabels[i] = new JLabel();
        }
        discount = new JLabel("Discount:");
        JPanel disNumPanel = new JPanel();
        disNumPanel.setLayout(new GridLayout(3,1));
        discountNum = new JTextField("", 100);
        disNumPanel.add(centreBoxLabels[4]);
        disNumPanel.add(discountNum);
        discountNum.setSize(100, 20);
        prod = new JLabel("Product ID:");
        JPanel prodPanel = new JPanel();
        prodPanel.setLayout(new GridLayout(3,1));
        productID = new JTextField("", 100);
        prodPanel.add(centreBoxLabels[3]);
        prodPanel.add(productID);
        productID.setSize(100, 20);
        promo = new JLabel("Promotion:");
        JPanel promoPanel = new JPanel();
        promoPanel.setLayout(new GridLayout(3,1));
        promoName = new JTextField("", 100);
        promoPanel.add(centreBoxLabels[2]);
        promoPanel.add(promoName);
        promoName.setSize(100, 20);
        date = new JLabel("Promotion End Date:");
        JPanel datePanel = new JPanel();
        datePanel.setLayout(new GridLayout(3,1));
        endDate = new JTextField("", 100);
        datePanel.add(centreBoxLabels[1]);
        datePanel.add(endDate);
        endDate.setSize(100, 20);
        JPanel buttPanel = new JPanel();
        buttPanel.setLayout(new GridLayout(3,1));        
        addPromButton = new JButton("Add Promotion");
        buttPanel.add(emptyLabels[0]);
        buttPanel.add(addPromButton);
        addPromPanel = new JPanel();
        addPromPanel.setLayout(new GridLayout(4,2));
        
        addPromPanel.add(emptyLabels[0]);
        addPromPanel.add(discount);
        addPromPanel.add(disNumPanel);
        addPromPanel.add(emptyLabels[1]);
        addPromPanel.add(emptyLabels[2]);
        addPromPanel.add(prod);   
        addPromPanel.add(prodPanel);
        addPromPanel.add(emptyLabels[3]);
        addPromPanel.add(emptyLabels[4]);
        addPromPanel.add(promo);
        addPromPanel.add(promoPanel);
        addPromPanel.add(emptyLabels[5]);
        addPromPanel.add(emptyLabels[6]);
        addPromPanel.add(date);
        addPromPanel.add(datePanel);
        addPromPanel.add(buttPanel);
        
        //////////////////////////////////////////////
        
        JPanel variablePanel = setupProductGUI();
        
        mainContent.add(mainButtonPanel, BorderLayout.WEST);
        mainContent.add(variablePanel, BorderLayout.CENTER);

        this.setContentPane(mainContent);
        this.setSize(900,600);
        this.setResizable(false);
        this.setTitle("Etronics Admin System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public JPanel setupProductGUI(){
        
        JPanel variablePanel = new JPanel();
        //variablePanel.setLayout(new BoxLayout(variablePanel, BoxLayout.Y_AXIS));
        variablePanel.setLayout(new GridLayout(2,2));
        variablePanel.setBorder(new EmptyBorder(10, 0, 0, 10));
        
        // Add Product Panel
        JPanel addProdPanel = new JPanel();
        addProdPanel.setLayout(new BoxLayout(addProdPanel, BoxLayout.Y_AXIS));
        addProdPanel.setBorder(new EmptyBorder(20, 0, 0, 20));
        
        JPanel addProdTitlePanel = new JPanel(new GridLayout(0,1));
        addProdTitlePanel.add(addProdTitleLabel);
        
        JPanel addProdLabelPanel = new JPanel();
        addProdLabelPanel.setLayout(new GridLayout(4, 1));
        addProdLabelPanel.add(prodNameLabel);
        addProdLabelPanel.add(prodPriceLabel);
        addProdLabelPanel.add(categoryLabel);
        addProdLabelPanel.add(prodDescLabel);
        
        JPanel addProdToolPanel = new JPanel();
        addProdToolPanel.setLayout(new GridLayout(4, 1));
        addProdToolPanel.add(prodNameField);
        addProdToolPanel.add(prodPriceField);
        addProdToolPanel.add(categoryComboBox);
        addProdToolPanel.add(prodDescField);
        
        addProdPanel.add(addProdTitlePanel);
        
        JPanel yetAnotherPanel = new JPanel();
        yetAnotherPanel.setLayout(new BoxLayout(yetAnotherPanel, BoxLayout.X_AXIS));
        yetAnotherPanel.add(addProdLabelPanel);
        yetAnotherPanel.add(addProdToolPanel);
        
        addProdPanel.add(yetAnotherPanel);
        
        JPanel addProdButtonPanel = new JPanel(new FlowLayout());
        addProdButtonPanel.add(prodAddButton);
        addProdPanel.add(addProdButtonPanel);
        
        //////// Delete Product Panel////////////////////
        JPanel delProdPanel = new JPanel();
        delProdPanel.setLayout(new BoxLayout(delProdPanel, BoxLayout.Y_AXIS));
        delProdPanel.setBorder(new EmptyBorder(20, 0, 0, 20));
        
        JPanel delProdTitlePanel = new JPanel(new GridLayout(0,1));
        delProdTitlePanel.add(delProdTitleLabel);
        
        JPanel delProdLabelPanel = new JPanel();
        delProdLabelPanel.setLayout(new GridLayout(6, 1));
        delProdLabelPanel.add(delProdIDLabel);
        
        JPanel delProdToolPanel = new JPanel();
        delProdToolPanel.setLayout(new GridLayout(6, 1));
        delProdToolPanel.add(prodIDField);
        
        delProdPanel.add(delProdTitlePanel);
        
        JPanel yetAnotherPanel2 = new JPanel();
        yetAnotherPanel2.setLayout(new BoxLayout(yetAnotherPanel2, BoxLayout.X_AXIS));
        yetAnotherPanel2.add(delProdLabelPanel);
        yetAnotherPanel2.add(delProdToolPanel);
        
        delProdPanel.add(yetAnotherPanel2);
        
        JPanel delProdButtonPanel = new JPanel(new FlowLayout());
        delProdButtonPanel.add(prodDelButton);
        delProdPanel.add(delProdButtonPanel);
        /////////////////////////////////////////////////////
        
        
        ////////// Change Product Panel//////////////////////
        JPanel changeProdPanel = new JPanel();
        changeProdPanel.setLayout(new BoxLayout(changeProdPanel, BoxLayout.Y_AXIS));
        changeProdPanel.setBorder(new EmptyBorder(20, 0, 0, 20));
        
        JPanel changeProdTitlePanel = new JPanel(new GridLayout(0,1));
        changeProdTitlePanel.add(changeProdTitleLabel);
        
        JPanel changeProdLabelPanel = new JPanel();
        changeProdLabelPanel.setLayout(new GridLayout(4, 1));
        changeProdLabelPanel.add(changeProdIDLabel);
        changeProdLabelPanel.add(changeProdNameLabel);
        changeProdLabelPanel.add(changeProdPriceLabel);
        changeProdLabelPanel.add(changeCategoryLabel);
        
        JPanel changeProdToolPanel = new JPanel();
        changeProdToolPanel.setLayout(new GridLayout(4, 1));
        changeProdToolPanel.add(changeProdIDField);
        changeProdToolPanel.add(changeProdNameField);
        changeProdToolPanel.add(changeProdPriceField);
        changeProdToolPanel.add(changeCategoryComboBox);
        
        changeProdPanel.add(changeProdTitlePanel);
        
        JPanel yetAnotherPanel3 = new JPanel();
        yetAnotherPanel3.setLayout(new BoxLayout(yetAnotherPanel3, BoxLayout.X_AXIS));
        yetAnotherPanel3.add(changeProdLabelPanel);
        yetAnotherPanel3.add(changeProdToolPanel);
        
        changeProdPanel.add(yetAnotherPanel3);
        
        JPanel changeProdButtonPanel = new JPanel(new FlowLayout());
        changeProdButtonPanel.add(changeProdAddButton);
        changeProdPanel.add(changeProdButtonPanel);
        //////////////////////////////////////////////////////////
        
        
        ////////////// New Category //////////////////////////////
        JPanel chProdPanel = new JPanel();
        chProdPanel.setLayout(new BoxLayout(chProdPanel, BoxLayout.Y_AXIS));
        chProdPanel.setBorder(new EmptyBorder(20, 0, 0, 20));
        
        JPanel chProdTitlePanel = new JPanel(new GridLayout(0,1));
        chProdTitlePanel.add(findProdTitleLabel);
        
        JPanel chProdLabelPanel = new JPanel();
        chProdLabelPanel.setLayout(new GridLayout(4, 1));
        chProdLabelPanel.add(findProdIDLabel);
        chProdLabelPanel.add(idLabel);
        
        JPanel chProdToolPanel = new JPanel();
        chProdToolPanel.setLayout(new GridLayout(4, 1));
        chProdToolPanel.add(findProdIDField);
        chProdToolPanel.add(idComboBox);
        
        chProdPanel.add(chProdTitlePanel);
        
        JPanel yetAnotherPanel4 = new JPanel();
        yetAnotherPanel4.setLayout(new BoxLayout(yetAnotherPanel4, BoxLayout.X_AXIS));
        yetAnotherPanel4.add(chProdLabelPanel);
        yetAnotherPanel4.add(chProdToolPanel);
        
        chProdPanel.add(yetAnotherPanel4);
        
        JPanel chProdButtonPanel = new JPanel(new FlowLayout());
        chProdButtonPanel.add(findProdButton);
        chProdPanel.add(chProdButtonPanel);
        ////////////////////////////////////////////////////////////
        
        
        
        variablePanel.add(addProdPanel);
        variablePanel.add(delProdPanel);
        variablePanel.add(changeProdPanel);
        variablePanel.add(chProdPanel);
        
        return variablePanel;
    }
    
    
    
    ////////////Product attribute methods////////////////////////////
    public String getAddProductName(){
        return prodNameField.getText();
    }
    
    public String getAddProductPrice(){
        return prodPriceField.getText();
    }
    
    public String getAddProductDesc(){
        return prodDescField.getText();
    }
    
    public String getFindIDText(){
        return findProdIDField.getText();
    }
    
    public String getAddProductCat(){
        return String.valueOf(categoryComboBox.getSelectedItem());
    }
    
    public void addUserManListener(ActionListener al){
        userManButton.addActionListener(al);
    }
    
    public void addNewProductListener(ActionListener al){
        prodAddButton.addActionListener(al);
    }
    
    public void addFindProductListener(ActionListener al){
        findProdButton.addActionListener(al);
    }
    
    public void addPromoManListener(ActionListener al){
        promoManButton.addActionListener(al);
    }
    
    public void setPromoMenuVisible(){
        JPanel contentPane = (JPanel) this.getContentPane();

        contentPane.removeAll();
        contentPane.add(addPromPanel);
        contentPane.revalidate(); 
        contentPane.repaint();
    }
    //////////////////////////////////////////////////////////
    
    
    //////////////Promotion attribute methods///////////////////////
    public void addNewPromotionListener(ActionListener al){
        addPromButton.addActionListener(al);
    }
    
    public String getAddPromotionDiscountNum()
    {
        return discountNum.getText();
    }
    
    public String getAddPromotionProductID()
    {
        return productID.getText();
    }
    
    public String getAddPromotionEndDate()
    {
        return endDate.toString();
    }
    
    public String getAddPromotionPromoName(){
        return promoName.toString();
    }
    
    public void resetAllTextBoxes(){
        discountNum.setText("");
        productID.setText("");
        endDate.setText("");
        promoName.setText("");
    }
    ///////////////////////////////////////////
    
    
    
    public void showErrorMessage(String m){
        JOptionPane.showMessageDialog(null, m, "Error", 1);
    }
    
    public void showInfoMessage(String m){
        JOptionPane.showMessageDialog(null, m, "Info", 2);
    }
    
    public void setCats(ArrayList<String> cats){
        categoryComboBox.setModel(new DefaultComboBoxModel(cats.toArray()));
        changeCategoryComboBox.setModel(new DefaultComboBoxModel(cats.toArray()));
    }
    
    public void setFindIDResults(ArrayList<String> r){
        idComboBox.setModel(new DefaultComboBoxModel(r.toArray()));
    }
    
    public boolean validateInput(String text, int length)
    {
        String pattern = "[0-9]";
        if(length != 0) pattern = pattern+"{"+length+"}";
        else pattern = pattern+"{0,}";
        if(!(text.matches(pattern)))
        {
            return false;
        }else
        {
            return true;
        }
    }
    
    public boolean validateDate(String date)
    {
        Date dateToValidate = new Date(date);
        Date today = new Date();
        String datePatternSlash = "[0-9]{2}/[0-9]{2}/[0-9]{2,4}";
        String datePatternDash = "[0-9]{2}-[0-9]{2}-[0-9]{2,4}";
        if(dateToValidate == null)
        {
            return false;
        }else if(dateToValidate.toString().matches(datePatternSlash) || dateToValidate.toString().matches(datePatternDash))//check if date is correct format
        {
            JOptionPane.showMessageDialog(null,"Error: Incorrect format used! Please use one of these formats, dd-mm-yyyy, dd/mm/yy");
            return false;
        }else if(dateToValidate.before(today) || dateToValidate.equals(today))//check if date is same as today or before
        {
            JOptionPane.showMessageDialog(null,"Error: Incorrect date used! Please use a date in future");
            return false;
        }else
        {
            return true;
        }    
         
    }

}
