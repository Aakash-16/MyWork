import java.util.Scanner;


public class Avalibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner kb = new Scanner(System.in);
     int n = kb.nextInt();
     int arr [] = new int [n];
     for(int i =0;i<n;i++)
     {
    	 arr[i]= kb.nextInt();
     }
		
     
     System.out.println(" Enter the number ");
     int num = kb.nextInt();
    
	int val = findPosition(num, arr);	
		
	System.out.println(val);	
	
	System.out.println("-----------------------------------");
	System.out.println("All positions in array");
	int vall [] = findPositionComplete(num, arr);
	if (vall==null){
		return;
	}
		for (int i : vall) {
			System.out.println(i);
		}
		
	}
	
	static int findPosition (int num, int [] nos){
		
		for(int i =0;i<nos.length;i++){
			if(num==nos[i]){
				return (i+1);
			}
		}
		 return -1;
	}

	
	
	

	static int [] findPositionComplete (int num, int [] nos){
		int arr [] = new int [nos.length];
		int y =0;
		for(int i =0;i<nos.length;i++){
			if(num==nos[i]){
				arr[y]=i+1;
				y++;
			}
		}
		if (y==0)
		{
			return null;
		}
		else
		{
			int a[] = new int [y];
			for(int i =0;i<y;i++){
				a[i]= arr[i];

			}

			return a;
		}
	}
	
}
