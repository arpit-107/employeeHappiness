import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;

public class SurveyMainPage extends JFrame implements ActionListener{
    
    JButton proceed;     //global variables
    Container cp;
    JFrame f;
        
    public SurveyMainPage(){
    	
    	init();
            }
    
    public void init() {
    	this.setTitle("Happy Form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800, 500);
        cp= getContentPane();
        this.setLayout(null);
        this.cp.setBackground(new java.awt.Color(0xFAD5A5));

      //  ImageIcon icon= new ImageIcon("icon.png");
       // this.setIconImage(icon.getImage());

        JLabel heading= new JLabel();
        heading.setText("Happy Mood Matters");
        heading.setFont(new Font("Arial", Font.BOLD, 36));
        heading.setBounds(120,30,440,70);
        this.cp.add(heading);


        JLabel happyText= new JLabel();
        happyText.setText("Your happiness matters. Please answer some questions");
        happyText.setFont(new Font("Calibri", Font.PLAIN, 24));
        happyText.setBounds(20,-100,900,500);
        this.cp.add(happyText);

        proceed= new JButton("Proceed");
        proceed.setFont(new Font("Calibri", Font.PLAIN, 18));
        proceed.setBounds(270, 250, 200, 50);
        proceed.setBackground(new java.awt.Color(0xADD8E6));
        //proceed.setForeground(new java.awt.Color(0xADD8E6));
       // proceed.setBackground(Color.blue);
        proceed.setOpaque(true);
        
        proceed.addActionListener(this);
        proceed.setText("Proceed");
        this.cp.add(proceed);

       
        this.setVisible(true);

    }

    //@Override
    public void actionPerformed(ActionEvent e){
                f= new JFrame();

        if(e.getSource()==proceed)
        {
        	  AbstractValues.addMapValues();
              startSurvey();    
        }

       
    }
    
    public void startSurvey() {
    	
    	//SurveyPageOne one = SurveyPages.pageOne;
    	SurveyPageOne pageOne = new SurveyPageOne();
    }
}
