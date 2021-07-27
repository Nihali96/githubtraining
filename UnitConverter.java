package project;

public class UnitConverter {
	
   
 
    private double meters, result;
 
    String str1;
 
    public UnitConverter(String S) 
    {
        str1 = S;
    }
 
    
    public double ConvertToMeters(double value) {
    	
    	
        if (str1.equals("mm")) 
        {
            meters = (value / 1000);
        } 
        else if (str1.equals("cm")) 
        {
            meters = (value/ 100);
        } 
        else if (str1.equals("m"))
        {
            meters = (value / 1);
        } 
        else 
        {
        	meters =(value/0.001);
        }
        
        return meters;
    }
 
  
    public double ConvertToRequiredUnit(double meters) 
    {
        
        if (str1.equals("mm")) 
        {
            result = 1000  * meters;
        } 
        else if (str1.equals("cm")) 
        {
            result = 100 * meters;
        }
        else if (str1.equals("m"))
        {
            result = 1 * meters;
        } 
        else
        {
        	result = 0.001* meters;
        }
       
        return result;
    }

}
