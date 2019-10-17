
package applicationform3;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.control.ComboBox;
import javax.swing.*;

public class Applicationform3 extends Applet 
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,p9,p10,p11,p12;
    JButton b1,b2;
    JComboBox Gn,cat;
    JFrame frame;
    public void init() 
    {
        String gender[]={"----Select----","Male","Female","Others"};
        String cast[]={"---Select----","Genral","OBC","SC","ST"};
        Gn=new JComboBox(gender);
        cat=new JComboBox(cast);
        
        l1=new JLabel("Enter Applicant name");
        l2=new JLabel("Enter phone number");
        l3=new JLabel("Enter Father's name");
        l4=new JLabel("Fathers Occupation");
        l5=new JLabel("Father's Phone number");
        l6=new JLabel("Mother's Name");
        l7=new JLabel("Mother's Occupation");
        l8=new JLabel("Mother's Phone number");
        l9=new JLabel("Permenent Address");
        l10=new JLabel("Qualification");
        l11=new JLabel("School name");
        l12=new JLabel("Gender");
        l13=new JLabel("Cast");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();
        t7=new JTextField();
        t8=new JTextField();
        p9=new JTextField();
        p10=new JTextField();
        p11=new JTextField();
        p12=new JTextField();
        b1=new JButton("Save and Submit");
        b2=new JButton("RESET");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(l7);
        add(t7);
        add(l8);
        add(t8);
        add(l9);
        add(p9);
        add(l10);
        add(p10);
        add(l11);
        add(p11);
        add(l12);
        add(Gn);
        add(b1);
        add(l13);
        add(cat);
        
        setLayout(null);
        l1.setBounds(20, 100, 200, 20);
        t1.setBounds(260, 100, 280, 20);
        l2.setBounds(20, 140, 200, 20);
        t2.setBounds(260, 140, 280, 20);
        l3.setBounds(20, 220, 200, 20);
        t3.setBounds(260, 220, 280, 20);
        l4.setBounds(20, 260, 200, 20);
        t4.setBounds(260, 260, 280, 20);
        l5.setBounds(20, 300, 200, 20);
        t5.setBounds(260, 300, 280, 20);
        l6.setBounds(20, 340, 200, 20);
        t6.setBounds(260, 340, 280, 20);
        l7.setBounds(20, 380, 200, 20);
        t7.setBounds(260, 380, 280, 20);
        l8.setBounds(20, 420, 200, 20);
        t8.setBounds(260, 420, 280, 20);
        l9.setBounds(20, 460, 200, 20);
        p9.setBounds(260, 460, 280, 20);
        l10.setBounds(20, 500, 200, 20);
        p10.setBounds(260, 500, 280, 20);
        l11.setBounds(20, 540, 200, 20);
        p11.setBounds(260, 540, 280, 20);
        l12.setBounds(20, 180, 200, 20);
        Gn.setBounds(260, 180, 280, 20);
        l13.setBounds(600, 180, 200, 20);
        cat.setBounds(800,180,200,20);
        b1.setBounds(120, 600, 180, 20);
        b2.setBounds(260, 600, 180, 20);
    
        
    }
    
}
