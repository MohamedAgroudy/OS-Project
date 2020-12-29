
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
        String direction = ""; 
        
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
            switch (Choice) 
            {
                case 1:
                    System.out.println("Enter The Direction");
                    direction = input.next();
                    
                    LOOK x = new LOOK(array , head, direction);
                    direction = "";
                    break;
                case 2:
                    System.out.println("Enter The Direction");
                    direction = input.next();
                    
                    CLOOK x1 =  new CLOOK(array, head,direction);
                    break;
                case 3:
                    System.out.println("enter the numbers of disks");
                    int length;
                    Scanner input= new Scanner(System.in); 
                    length = input.nextInt();
                    int[] disks= new int[length];
                    System.out.println("enter the disks");
                    for(int i=0;i<disks.length;i++)
                    {
                        disks[i]=input.nextInt();
                    }
                    int head2;
                    System.out.println("enter the head or the start");
                
                    head2=input.nextInt();
                    SSTF x2 = new SSTF(array, head2);
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
