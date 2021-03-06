
import java.util.Scanner;

class node { 
	
	int distance = 0; 
	
	boolean access = false; 
} 

public class SSTF { 
	
	public static void calculateDifference(int queue[],int head, node diff[])						
	{ 
		for (int i = 0; i < diff.length; i++) 
		diff[i].distance = Math.abs(queue[i] - head); 
	}

	public static int findMin(node diff[]) 
	{ 
		int index = -1, minimum = Integer.MAX_VALUE; 

		for (int i = 0; i < diff.length; i++) { 
			if (!diff[i].access && minimum > diff[i].distance) { 
				
				minimum = diff[i].distance; 
				index = i; 
			} 
		} 
		return index; 
	} 

	public SSTF(int request[],int head)  											
	{ 
		if (request.length == 0) 
			return; 
		node diff[] = new node[request.length]; 
		for (int i = 0; i < diff.length; i++) 
		
			diff[i] = new node(); 
		int seek_count = 0; 
		int[] seek_sequence = new int[request.length + 1]; 
		
		for (int i = 0; i < request.length; i++) { 
			
			seek_sequence[i] = head; 
			calculateDifference(request, head, diff); 
			
			int index = findMin(diff); 
			
			diff[index].access= true; 
			seek_count += diff[index].distance; 
			head = request[index]; 
		} 
		seek_sequence[seek_sequence.length - 1] = head; 
		
		System.out.println("Total number of seek operations = "+ seek_count); 
													
													
		System.out.println("Seek Sequence is"); 
		
		for (int i = 0; i < seek_sequence.length; i++) 
			System.out.println(seek_sequence[i]); 
	} 

} 