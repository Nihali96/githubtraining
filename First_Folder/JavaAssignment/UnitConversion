package project;
import java.util.Scanner;

public class ConversionCalculator {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		 
        System.out.println("Enter a unit from which you want to convert:");
        String s1 = Sc.nextLine();
        UnitConverter obj1 = new UnitConverter(s1);

        System.out.println("Enter a unit to which you want to convert: ");
        String s2 = Sc.nextLine();
        UnitConverter obj2 = new UnitConverter(s2);

        System.out.println("Value:");
        double value = Sc.nextDouble();
       
        double meters = obj1.ConvertToMeters(value);
       
        double result = obj2.ConvertToRequiredUnit(meters);

        System.out.println(value + " " + s1 + " = " + result + " " + s2);

	}

}
