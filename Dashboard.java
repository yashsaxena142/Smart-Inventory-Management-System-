package com.inventory.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame {
    private JButton productButton;
    private JButton supplierButton;
    private JButton salesButton;
    private JButton logoutButton;

    public Dashboard() {
        setTitle("Dashboard");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        productButton = new JButton("Manage Products");
        supplierButton = new JButton("Manage Suppliers");
        salesButton = new JButton("Manage Sales");
        logoutButton = new JButton("Logout");

        add(productButton);
        add(supplierButton);
        add(salesButton);
        add(logoutButton);

        productButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ProductForm().setVisible(true);
            }
        });

        supplierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SupplierForm().setVisible(true);
            }
        });

        salesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SalesForm().setVisible(true);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginForm().setVisible(true);
                dispose();
            }
        });
    }
}
