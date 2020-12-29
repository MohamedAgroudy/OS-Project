 

import java.util.*;

class GFG{
	
  
static int disk_size = 200;

public static void LOOK(int arr[], int head,int direction,int size ) 
{ 
	int seek_count = 0; 
	int distance, cur_track; 
	
	Vector<Integer> left = new Vector<>(); 
	Vector<Integer> right = new Vector<>(); 
	Vector<Integer> seek_sequence = new Vector<>(); 

	for(int i = 0; i < size; i++) 
	{ 
		if (arr[i] < head) 
			left.add(arr[i]); 
		if (arr[i] > head) 
			right.add(arr[i]); 
	} 

	Collections.sort(left); 
	Collections.sort(right); 
	
	int run = 2; 
	while (run-- > 0)
	{ 
            // 1 ya3ny left
		if (direction == 1) 
		{ 
			for(int i = left.size() - 1;i >= 0; i--) 
					
			{ 
				cur_track = left.get(i); 
				seek_sequence.add(cur_track); 

				distance = Math.abs(cur_track - head); 
				
				seek_count += distance; 

				
				head = cur_track; 
			} 
			
			
			direction = 0; 
		} 
		else if (direction == 0)
		{ 
			for(int i = 0; i < right.size(); i++)
			{
				cur_track = right.get(i); 
				
				seek_sequence.add(cur_track); 

				distance = Math.abs(cur_track - head); 

				seek_count += distance; 

				head = cur_track; 
			} 
			
			direction = 1; 
		} 
	} 
	
	System.out.println("Total number of seek " +
					"operations = " + seek_count);

	System.out.println("Seek Sequence is"); 

	for(int i = 0; i < seek_sequence.size(); i++)
	{
		System.out.println(seek_sequence.get(i));
	} 
} 


public static void main(String[] args) throws Exception 
{
	
	
	

	
                    System.out.println("enter the numbers of disks");
            int size;
          Scanner input= new Scanner(System.in); 
            size = input.nextInt();
	int[] disks= new int[size];
            System.out.println("enter the disks");
                for(int i=0;i<disks.length;i++){
                    disks[i]=input.nextInt();
                }
                int head;
                System.out.println("enter the head or the start");
                head=input.nextInt();
                System.out.println("for right enter"+" 0"+" for left enter 1");
                int direction=input.nextInt();
     
		LOOK(disks, head, direction,size); 
}
}