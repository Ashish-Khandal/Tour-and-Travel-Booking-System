/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.guidemanagement.system;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCustomers extends JFrame {

    Connection conn = null;
    private JPanel contentPane;
    private JTable table;
    private JLabel lblAvailability;
    private JLabel lblCleanStatus;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblRoomNumber;
    private JLabel lblId;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewCustomers frame = new ViewCustomers();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ViewCustomers() throws SQLException {
        //conn = Javaconnect.getDBConnection();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250, 40, 900, 680);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i3 = i1.getImage().getScaledInstance(626, 201, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 450, 626, 201);
        add(l1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(626, 201, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(615, 450, 626, 201);
        add(l2);

        table = new JTable();
        table.setBounds(10, 40, 900, 350);
        table.setForeground(Color.red);
        contentPane.add(table);

        try {
            Conn c = new Conn();
            String displayCustomersql = "select * from customer";
            var rs = c.s.executeQuery(displayCustomersql);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnNewButton.setBounds(390, 400, 120, 30);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        contentPane.add(btnNewButton);

        lblAvailability = new JLabel("Username");
        lblAvailability.setBounds(10, 15, 69, 14);
        contentPane.add(lblAvailability);

        lblCleanStatus = new JLabel("Id Type");
        lblCleanStatus.setBounds(110, 15, 76, 14);
        contentPane.add(lblCleanStatus);

        lblNewLabel = new JLabel("Number");
        lblNewLabel.setBounds(220, 15, 46, 14);
        contentPane.add(lblNewLabel);

        lblNewLabel_1 = new JLabel("Name");
        lblNewLabel_1.setBounds(320, 15, 76, 14);
        contentPane.add(lblNewLabel_1);

        lblId = new JLabel("Gender");
        lblId.setBounds(420, 15, 90, 14);
        contentPane.add(lblId);

        JLabel l3 = new JLabel("Country");
        l3.setBounds(520, 15, 90, 14);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Address");
        l4.setBounds(620, 15, 90, 14);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Phone");
        l5.setBounds(720, 15, 90, 14);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Email");
        l6.setBounds(820, 15, 90, 14);
        contentPane.add(l6);

        getContentPane().setBackground(Color.WHITE);
    }

}

//
//
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package travel.guidemanagement.system;
//
//import java.awt.BorderLayout;
//import java.awt.*;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
////import net.proteanit.sql.DbUtils;
//import javax.swing.JTable;
//import java.sql.*;
//import javax.swing.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class ViewCustomers extends JFrame implements ActionListener {
//
//    Connection conn = null;
//    private JPanel contentPane;
//    private JTable table;
//    private JLabel lblAvailability;
//    private JLabel lblCleanStatus;
//    private JLabel lblNewLabel;
//    private JLabel lblNewLabel_1;
//    private JLabel lblRoomNumber;
//    private JLabel lblId;
//
//    /**
//     * Launch the application.
//     */
////        throws SQLException
//    public ViewCustomers(String username) throws SQLException {
////		conn = Javaconnect.getDBConnection(); 
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setBounds(250, 40, 900,  680);
//        contentPane = new JPanel();
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        setContentPane(contentPane);
//        contentPane.setLayout(null);
//
//        lblAvailability = new JLabel("Username");
//        lblAvailability.setBounds(10, 15, 69, 14);
//        contentPane.add(lblAvailability);
//
//        lblCleanStatus = new JLabel("Id Type");
//        lblCleanStatus.setBounds(110, 15, 76, 14);
//        contentPane.add(lblCleanStatus);
//
//        lblNewLabel = new JLabel("Number");
//        lblNewLabel.setBounds(220, 15, 46, 14);
//        contentPane.add(lblNewLabel);
//
//        lblNewLabel_1 = new JLabel("Name");
//        lblNewLabel_1.setBounds(320, 15, 76, 14);
//        contentPane.add(lblNewLabel_1);
//
//        lblId = new JLabel("Gender");
//        lblId.setBounds(420, 15, 90, 14);
//        contentPane.add(lblId);
//
//        JLabel l3 = new JLabel("Country");
//        l3.setBounds(520, 15, 90, 14);
//        contentPane.add(l3);
//
//        JLabel l4 = new JLabel("Address");
//        l4.setBounds(620, 15, 90, 14);
//        contentPane.add(l4);
//
//        JLabel l5 = new JLabel("Phone");
//        l5.setBounds(720, 15, 90, 14);
//        contentPane.add(l5);
//
//        JLabel l6 = new JLabel("Email");
//        l6.setBounds(820, 15, 90, 14);
//        contentPane.add(l6);
//
//        getContentPane().setBackground(Color.WHITE);
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
//        Image i3 = i1.getImage().getScaledInstance(626, 201, Image.SCALE_DEFAULT);
//        ImageIcon i2 = new ImageIcon(i3);
//        JLabel l1 = new JLabel(i2);
//        l1.setBounds(0, 450, 626, 201);
//        add(l1);
//
//        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
//        Image i5 = i4.getImage().getScaledInstance(626, 201, Image.SCALE_DEFAULT);
//        ImageIcon i6 = new ImageIcon(i5);
//        JLabel l2 = new JLabel(i6);
//        l2.setBounds(615, 450, 626, 201);
//        add(l2);
//
//        table = new JTable();
//        table.setBounds(0, 40, 900, 350);
//        contentPane.add(table);
//
//        try {
//            Conn c = new Conn();
//            String displayCustomersql = "select * from customer ";
//            ResultSet rs = c.s.executeQuery(displayCustomersql);
//            while (rs.next()) {
//                lblAvailability.setText(rs.getString("username"));
//                lblCleanStatus.setText(rs.getString("Id Type"));
//                lblNewLabel.setText(rs.getString("number"));
//                lblNewLabel_1.setText(rs.getString("name"));
//                lblId.setText(rs.getString("Gender"));
//                l3.setText(rs.getString("Country"));
//                l4.setText(rs.getString("Address"));
//                l5.setText(rs.getString("Phone"));
//                l6.setText(rs.getString("Email"));
//            }
//        } catch (Exception e1) {
//            e1.printStackTrace();
//        }
//
//        JButton btnNewButton = new JButton("Back");
//        btnNewButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                setVisible(false);
//            }
//        });
//        btnNewButton.setBounds(390, 400, 120, 30);
//        btnNewButton.setBackground(Color.BLACK);
//        btnNewButton.setForeground(Color.WHITE);
//        contentPane.add(btnNewButton);
//
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        setVisible(false);
//    }
//
//    public static void main(String[] args) {
////        new ViewCustomers("ashish");
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ViewCustomers frame = new ViewCustomers("ashish");
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//    }
//
//}
