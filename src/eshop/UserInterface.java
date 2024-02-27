
package eshop;

import com.mysql.jdbc.PreparedStatement;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class UserInterface extends javax.swing.JFrame {

    public UserInterface() {
        initComponents();
        GetCat();
        updateTotalPriceLabel();
       Products_Tbl.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    public void valueChanged(ListSelectionEvent event) {
        if (!event.getValueIsAdjusting()) {
            int selectedRow = Products_Tbl.getSelectedRow();
            if (selectedRow != -1) {
                selectedItemId = (int) Products_Tbl.getValueAt(selectedRow, 0);
                DisplayImage(selectedItemId); // Display the image for the selected item
            } else {
                selectedItemId = -1;
                ClearImage(); 
            }
        }
    }
});
       PolymorphismImpl poly = new PolymorphismImpl();
       poly.Welcome();
       
    }
  

    private int selectedItemId=-1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CatComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Products_Tbl = new javax.swing.JTable();
        picture_Lbl = new javax.swing.JLabel();
        AddToCartBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Cart_Tbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Confirm_Btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TotalPriceLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        CatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CLICK ON THE PRODUCT TO SEE PICTURE OF THE PRODUCT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("NOTE:");

        Products_Tbl.setBackground(new java.awt.Color(255, 204, 0));
        Products_Tbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Products_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "CATEGORY", "QUANTITY", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(Products_Tbl);

        picture_Lbl.setText("jLabel3");

        AddToCartBtn.setBackground(new java.awt.Color(255, 204, 0));
        AddToCartBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddToCartBtn.setText("ADD TO CART");
        AddToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartBtnActionPerformed(evt);
            }
        });

        Cart_Tbl.setBackground(new java.awt.Color(255, 204, 0));
        Cart_Tbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cart_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "CATEGORY", "QUANTITY", "PRICE"
            }
        ));
        jScrollPane2.setViewportView(Cart_Tbl);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 153));
        jLabel4.setText("PRODUCT PICTURE:");
        jLabel4.setOpaque(true);

        Confirm_Btn.setBackground(new java.awt.Color(255, 0, 0));
        Confirm_Btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Confirm_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Confirm_Btn.setText("CONFIRM ORDER");
        Confirm_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_BtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("TOTAL:");

        TotalPriceLbl.setBackground(new java.awt.Color(0, 51, 255));
        TotalPriceLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TotalPriceLbl.setForeground(new java.awt.Color(255, 255, 255));
        TotalPriceLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalPriceLbl.setText("jLabel6");
        TotalPriceLbl.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 153));
        jLabel6.setText("YOUR CART:");
        jLabel6.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("CHOOSE CATEGORY :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51)
                        .addComponent(picture_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(TotalPriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(AddToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Confirm_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(169, 169, 169))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addComponent(CatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(AddToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(picture_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TotalPriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Confirm_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void DisplayImage(int itemId) {
    java.sql.PreparedStatement sta;
        ResultSet rsa;
        String query = "SELECT product_picture FROM product_tbl WHERE product_id=?";
    try {
       
        sta = My_CNX.getConnection().prepareStatement(query);
        sta.setInt(1, itemId);
        rsa = sta.executeQuery();
        if (rsa.next()) {
            byte[] image = rsa.getBytes("product_picture");
            ImageIcon format = new ImageIcon(image);
            // Scale the image to fit within the label's size
            Image scaledImage = format.getImage().getScaledInstance(picture_Lbl.getWidth(), picture_Lbl.getHeight(), Image.SCALE_SMOOTH);
            format = new ImageIcon(scaledImage);
            picture_Lbl.setIcon(format);
        } else {
            ClearImage(); // Clear the image if no image is found for the item
        }
        sta.close();
        rsa.close();
    } catch (SQLException ex) {
        Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    private void ClearImage() {
        jLabel1.setIcon(null);
    }
private ImageIcon format= null;
    private void CatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatComboBoxActionPerformed
         GetProduct();
    }//GEN-LAST:event_CatComboBoxActionPerformed
 private void GetProduct(){
      DefaultTableModel model = (DefaultTableModel) Products_Tbl.getModel();
        model.setRowCount(0);
         String category = CatComboBox.getSelectedItem().toString();
         
         
try{
java.sql.PreparedStatement ps;
ResultSet rs;
String selectQuery1 = "SELECT * FROM product_tbl WHERE product_category = ? ";
ps= My_CNX.getConnection().prepareStatement(selectQuery1);
            ps.setString(1, category);
            rs = ps.executeQuery();

            while (rs.next()) {
                int productId = rs.getInt("product_id");
                String productName = rs.getString("product_name");
                String productCategory = rs.getString("product_category");
                int productQty = rs.getInt("product_qty");
                int productPrice = rs.getInt("product_price");

                Object[] rowData = {productId, productName, productCategory, productQty, productPrice};
                model.addRow(rowData);
            }

            rs.close();
            ps.close();  } catch (SQLException e) {
            e.printStackTrace();
        }   

 }
    private void GetCat(){
    
java.sql.PreparedStatement ps;
ResultSet rs;
String selectQuery = "SELECT * FROM `category_tbl` ";

try {
    ps = My_CNX.getConnection().prepareStatement(selectQuery);
    rs = ps.executeQuery();

   while (rs.next()) {
        String categoryName = rs.getString("CatName");
        CatComboBox.addItem(categoryName);
    }
    
    if (CatComboBox.getItemCount() > 0) {
       
    } else {
        
        JOptionPane.showMessageDialog(this, "No Categories Found");
    }
} catch (SQLException ex) {
    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
}
} 
    private int getAvailableQuantity(int selectedRowIndex) {
    int productId = (int) Products_Tbl.getValueAt(selectedRowIndex, 0);
java.sql.PreparedStatement ps;
    // Assuming you have a database connection established
    try {
        // Execute a query to fetch the available quantity for the selected product
        String query = "SELECT product_qty FROM product_tbl WHERE product_id = ?";
          ps = My_CNX.getConnection().prepareStatement(query);
        ps.setInt(1, productId);
        ResultSet resultSet = ps.executeQuery();

        if (resultSet.next()) {
            int availableQuantity = resultSet.getInt("product_qty");
            return availableQuantity;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return 0; // Return 0 if the available quantity couldn't be fetched or an error occurred
}
    private void AddToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartBtnActionPerformed
    int selectedRowIndex = Products_Tbl.getSelectedRow();
    if (selectedRowIndex == -1) {
        // No row selected, show an error message
        JOptionPane.showMessageDialog(this, "Please select a product to add to the cart.");
        return;
    }

    // Get the available quantity from the database
    int availableQuantity = getAvailableQuantity(selectedRowIndex);

    // Prompt the user to enter the quantity
    String quantityString = JOptionPane.showInputDialog(this, "Enter the quantity you want:", "Add to Cart", JOptionPane.QUESTION_MESSAGE);
    if (quantityString == null) {
        // User canceled the input, do nothing
        return;
    }

    int quantity;
    try {
        quantity = Integer.parseInt(quantityString);
        if (quantity <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid quantity.", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
            return; // Do not add the item to the cart
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a positive integer.");
        return; // Do not add the item to the cart
    }

    if (quantity > availableQuantity) {
        JOptionPane.showMessageDialog(this, "Not enough quantity available.", "Insufficient Quantity", JOptionPane.ERROR_MESSAGE);
        return; // Do not add the item to the cart
    }
    // Get the product details from the selected row
    int productId = (int) Products_Tbl.getValueAt(selectedRowIndex, 0);
    String productName = Products_Tbl.getValueAt(selectedRowIndex, 1).toString();
    String productCategory = Products_Tbl.getValueAt(selectedRowIndex, 2).toString();
    int productPrice = (int) Products_Tbl.getValueAt(selectedRowIndex, 4);

    // Calculate the total price
    int totalPrice = quantity * productPrice;

    // Add the product to the Cart_Tbl
    DefaultTableModel cartModel = (DefaultTableModel) Cart_Tbl.getModel();
    Object[] rowData = {productId, productName, productCategory, quantity, totalPrice};
    cartModel.insertRow(0, rowData);

    // Update the total price label
    updateTotalPriceLabel();

    // Update the quantity in the product_tbl and refresh the Products_Tbl
    updateProductQuantity(productId, quantity);
    GetProduct(); 
    }//GEN-LAST:event_AddToCartBtnActionPerformed

    private void Confirm_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_BtnActionPerformed
          int userId = Login_Form.loggedInUserId;
   String desktopDir = System.getProperty("user.home") + File.separator + "Desktop";
String filename = desktopDir + File.separator + "Orders" + userId + "_order.txt";

    try {
        // Check if Cart_Tbl is null or empty
        if (Cart_Tbl != null && Cart_Tbl.getRowCount() > 0 && Cart_Tbl.getColumnCount() > 0) {
            // Create a new FileWriter to write to the text file
            FileWriter fileWriter = new FileWriter(filename);

            // Write the table headers to the file
            for (int i = 0; i < Cart_Tbl.getColumnCount(); i++) {
                fileWriter.write(Cart_Tbl.getColumnName(i) + "\t");
            }
            fileWriter.write(System.lineSeparator());

            // Write each row of the Cart_Tbl to the file
            for (int i = 0; i < Cart_Tbl.getRowCount(); i++) {
                for (int j = 0; j < Cart_Tbl.getColumnCount(); j++) {
                    Object value = Cart_Tbl.getValueAt(i, j);
                    if (value != null) {
                        fileWriter.write(value.toString() + "\t");
                    }
                }
                fileWriter.write(System.lineSeparator());
            }

            // Close the FileWriter
            fileWriter.close();

            // Show a confirmation message to the user
            JOptionPane.showMessageDialog(this, "Your order has been confirmed and received.");
        } else {
            // Show an error message if the table is null or empty
            JOptionPane.showMessageDialog(this, "No items in the cart to confirm.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (IOException e) {
        // Handle any IO exception that occurs during file writing
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred while saving the order.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_Confirm_BtnActionPerformed
private void updateTotalPriceLabel() {
    int rowCount = Cart_Tbl.getRowCount();
    int total = 0;
    for (int i = 0; i < rowCount; i++) {
        Integer price = (Integer) Cart_Tbl.getValueAt(i, 4);
        total += Optional.ofNullable(price).orElse(0);
    }
    TotalPriceLbl.setText(String.valueOf(total));
}
private void updateProductQuantity(int productId, int quantity) {
    try {
        java.sql.PreparedStatement ps = My_CNX.getConnection().prepareStatement("UPDATE product_tbl SET product_qty = product_qty - ? WHERE product_id = ?");
        ps.setInt(1, quantity);
        ps.setInt(2, productId);
        ps.executeUpdate();
        ps.close();
    } catch (SQLException ex) {
        Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCartBtn;
    private javax.swing.JTable Cart_Tbl;
    private javax.swing.JComboBox<String> CatComboBox;
    private javax.swing.JButton Confirm_Btn;
    private javax.swing.JTable Products_Tbl;
    private javax.swing.JLabel TotalPriceLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel picture_Lbl;
    // End of variables declaration//GEN-END:variables
}
