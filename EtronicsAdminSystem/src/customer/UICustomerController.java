/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import customer.gui.allProductGUI;
import customer.gui.loginGUI;
import customer.gui.mainpageGUI;
import customer.gui.myCartGUI;
import customer.gui.purchaseGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class UICustomerController {
    
    private static mainpageGUI mainPage;
    private static loginGUI loginPage;
    private static myCartGUI cartPage;
    private static purchaseGUI purchasePage;
    private static allProductGUI productPage;
    private UICustomerModel model;
    
    public UICustomerController(mainpageGUI mainPage, loginGUI loginPage, myCartGUI cartPage,
            purchaseGUI purchasePage, allProductGUI productPage, UICustomerModel model) {
        
        this.mainPage = mainPage;
        this.loginPage = loginPage;
        this.cartPage = cartPage;
        this.purchasePage = purchasePage;
        this.productPage = productPage;
        this.model = model;
        
        
    }
    
    public void updateProductView() throws SQLException {
//        mainPage
        mainPage.setProducts(model.getProducts("Television"), 1);
        mainPage.setProducts(model.getProducts("Oven"), 0);
        //Get userId for getCarts(userID)
        cartPage.setCart(model.getCart(1));
        productPage.setProducts(model.getProducts());
        
    }
    
    public void updateSearchView() throws SQLException {
        mainPage.setProducts(model.searchProduct(mainPage.getSearchText()),0);
        cartPage.setProducts(model.searchProduct(cartPage.getSearchText()));
        productPage.setProducts(model.searchProduct(productPage.getSearchText()));
    }
    
    public void addListeners() {
        mainPage.setSearchListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    updateSearchView();
                } catch (SQLException ex) {
                    Logger.getLogger(UICustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        cartPage.setSearchListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try {
                    updateSearchView();
                } catch (SQLException ex) {
                    Logger.getLogger(UICustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        productPage.setSearchListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try {
                    updateSearchView();
                } catch (SQLException ex) {
                    Logger.getLogger(UICustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        purchasePage.setPurchaseListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try {
                    model.createTransaction();
                } catch (SQLException ex) {
                    Logger.getLogger(UICustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
    
    public int callLogin()
    {
        int id = 0;
        loginPage = new loginGUI();
        mainPage.setVisible(false);
        loginPage.setVisible(true);
        //id = loginPage.getid();
        return id;
    }
    
    
}
