
import java.util.Scanner;

/**
 *
 * @author Agroody
 */
public class Diskscheduling 
{    
    public static Scanner input = new Scanner(System.in);
    
    
    public static void main(String[] args) 
    {
        int array [] = { 176, 79, 34, 60, 92, 11, 41, 114 }; 
        int head = 50; 
        String direction = "right"; 
        
        int Choice = -1;
        
        System.out.println("Enter Which algorithm do you want");
        System.out.println("1- LOOK");
        System.out.println("2- CLOOK");
        System.out.println("3- SSTF");
        System.out.println("4- CSCAN");
        System.out.println("5- Exit");
        
        
        while(Choice != 5)
        {
            Choice = input.nextInt();
            switch (Choice) {
                case 1:
                    LOOK x = new LOOK(array , head, direction);
                    break;
                case 2:
                    CLOOK x1 =  new CLOOK(array, head);
                    break;
                case 3:
                    SSTF x2 = new SSTF(array, head);
                    break;
                case 4:
                    CSCAN x3 = new CSCAN(array, head);
                    break;
                default:
                    break;
            }
        }
    }
}
