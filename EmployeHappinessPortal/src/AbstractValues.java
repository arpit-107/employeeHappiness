import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;



public class AbstractValues {

	public static Map<String,Integer> map = new HashMap<>();
	
	 public static String getSelectedButton(ButtonGroup rating)
	    {  
	        for (Enumeration<AbstractButton> buttons = rating.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();
	            if (button.isSelected()) {
	                    return button.getText();
	            }
	        }
	        return null;
	    }
	 
	 public static void addMapValues() {
	
		 map.put("Strongly Disagree", 0);
		 map.put("Disagree", 1);
		 map.put("Neutral", 2);
		 map.put("Agree", 3);
		 map.put("Strongly Agree", 4);
	 }
}
