package MYframe;
import javax.swing.*;




import java.awt.*;
import java.awt.event.*;









class Myframe extends JFrame implements ActionListener{
	Container c;
	JLabel label1,label2,label3,label4,label5;
	JTextField user;
	JPasswordField pass;
	JTextField ad;
    JTextArea screen;
	
	JRadioButton male,female;
	JComboBox day,month,year;
	JCheckBox terms;
	JButton submit;
	JLabel msg;
	
	
	
	
	JButton btn;
	
	Myframe(){
		
		JLabel background;
		setSize(1200,700);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img=new ImageIcon("Background.251-2514687_4k-city-wallpaper.jpg");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,1200,700);
		add(background);
		
		setTitle("REGISTRATION FORM");
		setSize(400,300);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		label1=new JLabel("Username");
		label2=new JLabel("Mobile number");
		label3=new JLabel("Gender");
		label3.setBounds(20,150,100,20);
		label1.setBounds(10,50,100,20);
		label2.setBounds(10,100,100,20);
	
		c.add(label1);
		c.add(label2);
		c.add(label3);
		male=new JRadioButton("Male");
		female=new JRadioButton("Female");
		male.setBounds(130,150,80,20);
		female.setBounds(220,150,80,20);
		c.add(male);
		c.add(female);
		
		user=new JTextField();
		user.setBounds(120,50,120,20);
		c.add(user);
		pass=new JPasswordField();
		pass.setBounds(120,100,120,20);	
		c.add(pass);
		ButtonGroup gen=new ButtonGroup();
		gen.add(male);
		gen.add(female);
		label4=new JLabel("DOB");
		label4.setBounds(20,200,100,20);
		c.add(label4);
		String  days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String months[]= {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		String  years[]= {"1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
		
		day=new JComboBox(days);
		month=new JComboBox(months);
		year=new JComboBox(years);
		day.setBounds(130,200,50,20);
		month.setBounds(190,200,50,20);
		year.setBounds(250,200,60,20);
		c.add(day);
		c.add(month);
		c.add(year);
		label5=new JLabel("Address");
		label5.setBounds(20,250,100,20);
		c.add(label5);
		ad=new JTextField();
		ad.setBounds(130,240,300,50);
		c.add(ad);
		terms=new JCheckBox("Please accept terms and conditions");
		terms.setBounds(50,300,250,20);
		c.add(terms);
		submit=new JButton("Submit");
		submit.setBounds(150,350,80,20);
		c.add(submit);
		submit.addActionListener(this);
		screen=new JTextArea();
		screen.setBounds(500,50,300,300);
		c.add(screen);
		setVisible(true);
		msg=new JLabel();
		msg.setBounds(20,400,250,20);
		c.add(msg);
		c.setBackground(Color.lightGray);
		
	}
	public void actionPerformed(ActionEvent e)
	{
	   if (terms.isSelected())
	   {
		   msg.setText("Registration Successful");
		   String Username=user.getText();
		   String Mobilenumber =pass.getText();
		   String gender="male";
		   if(female.isSelected())
		   {
			   gender="female";
		   }
		   String dob=day.getSelectedItem()+""+month.getSelectedItem()+""+year.getSelectedItem();
		   String address=ad.getText();
		   screen.setText("Name :"+Username+"\n"+"Mobile number :"+Mobilenumber+"\n"+"Gender :"+gender+"\n"+"Dob :"+dob+"\n"+"Address :"+ad);
		   
		   
	   }
	   else
	   {
		   msg.setText("Accpet terms and conditions to submit");
		   screen.setText("");
	   }
	}
	
}

public final class LoginForm {

	public static void main(String[] args) {
		Myframe frame=new Myframe();
		
	
	}
}
