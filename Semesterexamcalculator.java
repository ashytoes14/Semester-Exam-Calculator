import javax.swing.JOptionPane;


public class Semesterexamcalculator {
	public static void main(String[] args){
    	
		double pff = .45;
		
		double firstquartergradedo;
		double secondquartergradedo;
		
		int firstquartergrade;
    	int secondquartergrade;
    	
    	String firstquartergrade1;
    	String secondquartergrade1;
    	
    	double firstquartergradetimespointfortyfive;
    	double secondquartergradetimespointfortyfive;
    	
    	double gradewomidterm;
    	//int gradewomidterm1;
       	double needtogetaforsem;
       	//int needtogetaforsem1;
       	
       	
       	firstquartergrade1 = JOptionPane.showInputDialog("What was your first quarter grade?");
       	secondquartergrade1 = JOptionPane.showInputDialog("What was your second quarter grade?");
       	
       	firstquartergrade = Integer.parseInt(firstquartergrade1);
       	secondquartergrade = Integer.parseInt(secondquartergrade1);
       	
       	firstquartergradedo = (double)(firstquartergrade);
       	secondquartergradedo = (double)(secondquartergrade);
       	
       	firstquartergradetimespointfortyfive = firstquartergradedo * pff;
       	secondquartergradetimespointfortyfive = secondquartergradedo * pff;
       	
       	gradewomidterm = firstquartergradetimespointfortyfive + secondquartergradetimespointfortyfive;
       	
       	System.out.println(gradewomidterm);
       	
       	
       	//gradewomidterm *=10;
       	//gradewomidterm1 = (int)(gradewomidterm);
       	//System.out.println(gradewomidterm);
       	if(90-gradewomidterm <=10){
       		needtogetaforsem =  90 - gradewomidterm;
         	System.out.println(needtogetaforsem);
         	needtogetaforsem *=10;
         	System.out.println(needtogetaforsem);
         	//needtogetaforsem1 = (int)(needtogetaforsem);
         	needtogetaforsem = round(needtogetaforsem,0);
       		JOptionPane.showMessageDialog(null, "You need "+needtogetaforsem+" or above on your semester exam to get a '90' for your semester average.");
       	}else{
       		JOptionPane.showMessageDialog(null, "Sorry, you are hopeless if you want to make a 90.");       		
       	}
    }
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
}
