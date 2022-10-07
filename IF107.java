import java.util.Scanner;

public class Test4{
	public static void main (String[] args){
        int gard;
        
		
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer:");
        gard = input.nextInt();	
        
        if (gard >=90) {
            
            System.out.println("A");
        }
    
        else if (gard >=90){
            System.out.println("B");    
            
        }
        
		else if (gard >=70){
            System.out.println("C");    
            
        }
		else if (gard >=60){
            System.out.println("D");    
            
        }
		else{
            System.out.println("E");    
            
        }
	}
}
