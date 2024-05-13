/*
 *=\ To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.guidemanagement.system;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckPackage extends JFrame{
    public static void main(String[] args) {
      new CheckPackage().setVisible(true);
    }

    CheckPackage() {    
      setBounds(300, 100, 900, 600);  
      setVisible(true);
      String[] package1 = new String[]{"package1.jpg","GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Breakfast & Dinner", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only"};
      String[] package2 = new String[]{"package2_1.jpg","SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only"};
      String[] package3 = new String[]{"package3.jpg","BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Breakfast & Dinner", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only"};
      String[] package4 = new String[]{"banaras.jpg","SPIRITUAL TOUR","6 days and 5 Nights", "Mathura,Vrindavan & Varanasi", "Meals Included, Boating Included", "Welcome drinks on Arrival", "Daily Breakfast & Dinner ", "Hotel Stay Included", "Havan Pooja At Varanasi", "BOOK NOW", "Spiritual Special", "Rs 11100 only"};
      String[] package5 = new String[]{"JaipurTour.jpg","Jaipur Heritage","3 days and 2 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome Rabri on Arrival", "Dinner with Churma Dal Bati", "Visit to Haveli in Shekhawati", "English Speaking Guide", "BOOK NOW", "Royal Special", "Rs 7000 only"};
      String[] package6 = new String[]{"Ladakh.jpg","Adventurous Motorbike Tour","6 days and 7 Nights", "Toll Free and Entrance Free Tickets", "Royal Enfield Included", "Welcome drinks on Camp", "Night Camping and BoneFire", "Half Day Hill Climbing", "Dinner At Pangong Lake", "BOOK NOW", "Leh-Ladakh Special", "Rs 30000 only"};
      
      JTabbedPane tabbedPane = new JTabbedPane();
      JPanel p1 = createPackage(package1);
      tabbedPane.addTab("Package 1", null, p1);
      
      JPanel p2 = createPackage(package2);
      tabbedPane.addTab("Package 2", null, p2);
      
      JPanel p3 = createPackage(package3);
      tabbedPane.addTab("Package 3", null, p3);
      
      JPanel p4 = createPackage(package4);
      tabbedPane.addTab("Package 4", null, p4);
      
      JPanel p5 = createPackage(package5);
      tabbedPane.addTab("Package 5", null, p5);
      
      JPanel p6 = createPackage(package6);
      tabbedPane.addTab("Package 6", null, p6);
      

      
      add(tabbedPane, BorderLayout.CENTER);    
   }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
      
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/"+pack[0]));
        Image i3 = i1.getImage().getScaledInstance(550, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(400,0,450,420);
        p1.add(l1);

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblName.setBounds(50, 5, 450, 53);
        p1.add(lblName);

        JLabel l3 = new JLabel(pack[2]);
        l3.setForeground(new Color(255, 165, 0));
        l3.setBounds(35, 70, 200, 14);
        p1.add(l3);

        JLabel lblId = new JLabel(pack[3]);
        lblId.setForeground(new Color(255, 165, 0));
        lblId.setBounds(35, 110, 200, 14);
        p1.add(lblId);

        JLabel l2 = new JLabel(pack[4]);
        l2.setForeground(new Color(255, 165, 0));
        l2.setBounds(35, 150, 200, 14);
        p1.add(l2);

        JLabel lblName_1 = new JLabel(pack[5]);
        lblName_1.setForeground(new Color(255, 165, 0));
        lblName_1.setBounds(35, 190, 200, 14);
        p1.add(lblName_1);

        JLabel lblGender = new JLabel(pack[6]);
        lblGender.setForeground(new Color(255, 165, 0));
        lblGender.setBounds(35, 230, 200, 14);
        p1.add(lblGender);

        JLabel lblCountry = new JLabel(pack[7]);
        lblCountry.setForeground(new Color(255, 165, 0));
        lblCountry.setBounds(35, 270, 200, 14);
        p1.add(lblCountry);

        JLabel lblReserveRoomNumber = new JLabel(pack[8]);
        lblReserveRoomNumber.setForeground(new Color(255, 165, 0));
        lblReserveRoomNumber.setBounds(35, 310, 200, 14);
        p1.add(lblReserveRoomNumber);

        JLabel lblCheckInStatus = new JLabel(pack[9]);
        lblCheckInStatus.setForeground(Color.BLUE);
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblCheckInStatus.setBounds(35, 400, 200, 30);
        p1.add(lblCheckInStatus);

        JLabel lblDeposite = new JLabel(pack[10]);
        lblDeposite.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblDeposite.setBounds(35, 460, 400, 40);
        p1.add(lblDeposite);
        
        JLabel la1 = new JLabel(pack[11]);
        la1.setForeground(Color.RED);
        la1.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        la1.setBounds(600, 460, 400, 40);
        p1.add(la1);
        
        return p1;
    }
}
