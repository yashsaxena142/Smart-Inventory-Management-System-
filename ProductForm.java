package com.inventory.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductForm extends JFrame {
    private JTextField nameField;
    private JTextField skuField;
    private JTextField categoryField;
    private JTextField priceField;
    private JTextField stockLevelField;
    private JButton saveButton;

    public ProductForm() {
        setTitle("Add Product");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        nameField = new JTextField();
        skuField = new JTextField();
        categoryField = new JTextField();
        priceField = new JTextField();
        stockLevelField = new JTextField();
        saveButton = new JButton("Save");

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("SKU:"));
        add(skuField);
        add(new JLabel("Category:"));
        add(categoryField);
        add(new JLabel("Price:"));
        add(priceField);
        add(new JLabel("Stock Level:"));
        add(stockLevelField);
        add(saveButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveProduct();
            }
        });
    }

    private void saveProduct() {
        String name = nameField.getText();
        String sku = skuField.getText();
        String category = categoryField.getText();
        double price = Double.parseDouble(priceField.getText());
        int stockLevel = Integer.parseInt(stockLevelField.getText());

        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO products (name, sku, category, price, stock_level) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, sku);
            ps.setString(3, category);
            ps.setDouble(4, price);
            ps.setInt(5, stockLevel);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product saved successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ProductForm().setVisible(true);
    }
}
