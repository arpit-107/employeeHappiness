import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;

public class SurveyPageFive extends JFrame implements ActionListener{
    
    JButton submit;     //global variables
    Container cp;
    JFrame f;
    JRadioButton stronglyAgree;
    JRadioButton agree;
    JRadioButton neutral;
    JRadioButton disagree;
    JRadioButton stronglyDisagree;
    ButtonGroup rating;
        
    public SurveyPageFive(){
        
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

        ImageIcon icon= new ImageIcon("icon.png");
        this.setIconImage(icon.getImage());

        JLabel heading= new JLabel();
        heading.setText("Happy Mood Matters");
        heading.setFont(new Font("Arial", Font.BOLD, 36));
        heading.setBounds(80,0,440,45);
        this.cp.add(heading);

       
        JLabel lage= new JLabel();
        lage.setText("I feel connected with my coworkers");
        lage.setFont(new Font("Calibri", Font.PLAIN, 18));
        lage.setBounds(50,100,700,28);
        this.cp.add(lage);



        stronglyAgree=new JRadioButton("Strongly Agree");
        agree=new JRadioButton("Agree");
        neutral=new JRadioButton("Neutral");
        disagree=new JRadioButton("Disagree");
        stronglyDisagree=new JRadioButton("Strongly Disagree");

        stronglyAgree.setBounds(50, 150, 150, 28);
        agree.setBounds(50, 180, 150, 28);
        neutral.setBounds(50, 210, 150, 28);
        disagree.setBounds(50, 240, 150, 28);
        stronglyDisagree.setBounds(50, 270, 150, 28);
        //stronglyDisagree.setSelected(true);

        this.add(stronglyAgree);
        this.add(agree);
        this.add(neutral);
        this.add(disagree);
        this.add(stronglyDisagree);

        rating= new ButtonGroup();  //A buttongroup ensures only one of the 5 radio buttons are selected at a time
        rating.add(stronglyAgree);
        rating.add(agree);
        rating.add(neutral);
        rating.add(disagree);
        rating.add(stronglyDisagree);

        submit = new JButton("Generate Report");
        submit.setFont(new Font("Calibri", Font.PLAIN, 18));
        submit.setBounds(205, 310, 200, 28);
        submit.addActionListener(this);
        this.cp.add(submit);

        
        this.setVisible(true);
    }

    //@Override
    public void actionPerformed(ActionEvent e){
        
    	  if(rating.getSelection()==null)          
          	JOptionPane.showMessageDialog(f, "Please choose a response");
        
        if(e.getSource()==submit){
        	String buttonValue = AbstractValues.getSelectedButton(rating);
        	int value = AbstractValues.map.get(buttonValue);
        	HappinessValue.add(value);
        	
        	double finalResult = (HappinessValue.getTotal()/20.0)*100;
        	finalResult = Math.round(finalResult);
        	int res = (int)finalResult;
        	JOptionPane.showMessageDialog(f, "Your happiness score is " + res + "%");  
        	
        	
        }

        
    }
}
