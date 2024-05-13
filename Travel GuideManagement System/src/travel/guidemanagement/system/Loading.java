/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.guidemanagement.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
        String username;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading("").setVisible(true);
	}

	public void setUploading() {
            setVisible(false);
            th.start();
	}

	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                        new Dashboard(username).setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Loading(String username) {
            this.username = username;
            th = new Thread((Runnable) this);

            setBounds(400, 200, 600, 400);
            contentPane = new JPanel();
            contentPane.setBackground(new Color(51,204, 255));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lbllibraryManagement = new JLabel("Travel and Toursim Application");
            lbllibraryManagement.setForeground(new Color(72, 209, 204));
            lbllibraryManagement.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
            lbllibraryManagement.setBounds(50, 46, 700, 35);
            contentPane.add(lbllibraryManagement);
	
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
            progressBar.setStringPainted(true);
            progressBar.setBounds(130, 135, 300, 25);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("Please Wait....");
            lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
            lblNewLabel_2.setForeground(new Color(160, 82, 45));
            lblNewLabel_2.setBounds(220, 165, 150, 20);
            contentPane.add(lblNewLabel_2);
            
            
            JLabel lblNewLabel_3 = new JLabel("Let's Create Something Cool");
            lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
            lblNewLabel_3.setForeground(new Color(0, 0, 0));
            lblNewLabel_3.setBounds(180, 250, 700, 35);
            contentPane.add(lblNewLabel_3);
            
            JLabel lblNewLabel_4 = new JLabel("Ashish Kumar Sharma.");
            lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
            lblNewLabel_4.setForeground(new Color(0, 0, 0));
            lblNewLabel_4.setBounds(240, 290, 500, 29);
            contentPane.add(lblNewLabel_4);
            
            JLabel lblNewLabel_5 = new JLabel("Lokesh Sharma.");
            lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
            lblNewLabel_5.setForeground(new Color(0, 0, 0));
            lblNewLabel_5.setBounds(30, 320, 500, 29);
            contentPane.add(lblNewLabel_5);
            
            JLabel lblNewLabel_6 = new JLabel("Mahesh Gupta.");
            lblNewLabel_6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
            lblNewLabel_6.setForeground(new Color(0, 0, 0));
            lblNewLabel_6.setBounds(500, 320, 500, 29);
            contentPane.add(lblNewLabel_6);
            
            JLabel lblNewLabel_7 = new JLabel("USERNAME: "+ username);
            lblNewLabel_7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
            lblNewLabel_7.setForeground(new Color(0, 0, 255));
            lblNewLabel_7.setBounds(10, 360, 500, 29);
            contentPane.add(lblNewLabel_7);

            JPanel panel = new JPanel();
            panel.setBackground(Color.WHITE);
            panel.setBounds(10, 10, 580, 380);
            contentPane.add(panel);
              
            setUndecorated(true);
            setUploading();
	}
}