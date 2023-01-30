/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import java.util.ArrayList;
import DeliveryPackage.Customer;
import DeliveryPackage.Package;
import DeliveryPackage.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author ankitapatil
 */
public class Create extends javax.swing.JPanel {

    /**
     * Creates new form Create
     */
    private Package dpack;
    public Product product;
     private Boolean validate = false;
    public Create() {
        initComponents();
        
        
    }
        Create(Package deliverypac) {
        initComponents();
        
        this.dpack = deliverypac;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pacID = new javax.swing.JLabel();
        weight = new javax.swing.JLabel();
        CustName = new javax.swing.JLabel();
        custID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        productID = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        savebut = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pacID.setText("Package ID :");
        add(pacID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        weight.setText("Weight :");
        add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        CustName.setText("Customer Name :");
        add(CustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        custID.setText("Customer Id :");
        add(custID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Product Information ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        productID.setText("Product ID :");
        add(productID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        productName.setText("Product Name :");
        add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        Price.setText("Product Price :");
        add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        create.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 110, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 110, -1));

        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 120, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 120, -1));

        savebut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        savebut.setText("Save");
        savebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebutActionPerformed(evt);
            }
        });
        add(savebut, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, 30));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 170, 30));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 170, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Order Details ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        
     String productID = jTextField5.getText();
     String productPrice = jTextField7.getText();
     String Name = jTextField6.getText();
    
        Product product = this.dpack.createProduct(Integer.valueOf(productID), Name, Double.valueOf(productPrice));
       
         JOptionPane.showMessageDialog(null, "Added Product");

    }//GEN-LAST:event_createActionPerformed
        
                
                
                
                
       
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void savebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebutActionPerformed
        // TODO add your handling code here:
         String name = jTextField3.getText();
        String CustomerId = jTextField4.getText();
        String weight = jTextField2.getText();
        String packageId = jTextField1.getText();
        
        this.dpack.setPackageId(Integer.valueOf(packageId));
        this.dpack.setWeight(Float.valueOf(weight));
        
     
        Customer customer = this.dpack.getCustomer();
        customer.setcustomerId(Integer.valueOf(CustomerId));
        customer.setName(name);
        
        if(validate) {
            JOptionPane.showMessageDialog(null, "Enter all the details");
        } else {
            JOptionPane.showMessageDialog(null, "Saved!");
        }
        
       
    }//GEN-LAST:event_savebutActionPerformed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
    System.out.println(jTextField3.getText() + "-- Customer Name");
    String name = jTextField3.getText();
     if(name.isEmpty()) {
     this.validate = true;
        } else {
            this.validate = false;
        }
                          
       
    }//GEN-LAST:event_jTextField3FocusLost


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustName;
    private javax.swing.JLabel Price;
    private javax.swing.JButton create;
    private javax.swing.JLabel custID;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel pacID;
    private javax.swing.JLabel productID;
    private javax.swing.JLabel productName;
    private javax.swing.JButton savebut;
    private javax.swing.JLabel weight;
    // End of variables declaration//GEN-END:variables
}