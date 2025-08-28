package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {

    JButton next;
    JRadioButton r1,r2,e1,e2;
    JTextField textAadhaar, textPAN;
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    String formno;

    SignUp2(String formno) {

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(300,60,600,40);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setBounds(100,120,100,30);
        l3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Jain", "Buddhist", "Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(Color.WHITE);
        comboBox.setBounds(350,120,320,30);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox);

        JLabel l4 = new JLabel("Category: ");
        l4.setBounds(100,170,120,30);
        l4.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l4);

        String category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setBounds(350,170,320,30);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox2);

        JLabel l5 = new JLabel("Income: ");
        l5.setBounds(100,220,120,30);
        l5.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l5);

        String income[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setBounds(350,220,320,30);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox3);

        JLabel l6 = new JLabel("Education: ");
        l6.setBounds(100,270,120,30);
        l6.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l6);

        String education[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(Color.WHITE);
        comboBox4.setBounds(350,270,320,30);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation: ");
        l7.setBounds(100,320,150,30);
        l7.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l7);

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired","Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(Color.WHITE);
        comboBox5.setBounds(350,320,320,30);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox5);

        JLabel l8 = new JLabel("Aadhaar Number: ");
        l8.setBounds(100,400,200,30);
        l8.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l8);

        textAadhaar = new JTextField();
        textAadhaar.setFont(new Font("Raleway", Font.BOLD, 14));
        textAadhaar.setBounds(350,400,320,30);
        add(textAadhaar);

        JLabel l9 = new JLabel("PAN Number: ");
        l9.setBounds(100,450,150,30);
        l9.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l9);

        textPAN = new JTextField();
        textPAN.setFont(new Font("Raleway", Font.BOLD, 14));
        textPAN.setBounds(350,450,320,30);
        add(textPAN);

        JLabel l10 = new JLabel("Senior Citizen: ");
        l10.setBounds(100,500,200,30);
        l10.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l10);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,500,100,30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,500,100,30);
        add(r2);

        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);

        JLabel l11 = new JLabel("Existing Account: ");
        l11.setBounds(100,550,200,30);
        l11.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l11);

        e1 = new JRadioButton("YES");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,550,100,30);
        add(e1);

        e2 = new JRadioButton("NO");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(450,550,100,30);
        add(e2);

        ButtonGroup buttongroup2 = new ButtonGroup();
        buttongroup2.add(e1);
        buttongroup2.add(e2);

        JLabel l12 = new JLabel("Form No: ");
        l12.setBounds(700,10,120,30);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(760,10,60,30);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        add(l13);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(250,0);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occu = (String) comboBox5.getSelectedItem();

        String aadhaar = textAadhaar.getText();
        String pan = textPAN.getText();
        String senior = null;
        if (r1.isSelected()) {
            senior = "YES";
        } else if (r2.isSelected()) {
            senior = "NO";
        }
        String existacc = null;
        if (e1.isSelected()) {
            existacc = "YES";
        } else if (e2.isSelected()) {
            existacc = "NO";
        }

        try {
            if (textAadhaar.getText().equals("") || textPAN.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields !!");
            } else {
                Conn c1 = new Conn();
                String q = "insert into signuptwo values('"+formno+"', '"+rel+"', '"+cate+"', '"+inc+"', '"+edu+"', '"+occu+"', '"+aadhaar+"', '"+pan+"', '"+senior+"', '"+existacc+"')";
                c1.statement.executeUpdate(q);
                new SignUp3(formno);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp2("");
    }
}
