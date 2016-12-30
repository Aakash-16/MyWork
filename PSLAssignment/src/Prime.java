
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int val [] = findPrime(20, 100);
       for (int i : val) {
		System.out.println(i);
	}
	}
	
	static int[] findPrime(int l,int u){
		int arr[] = new int[(u-l)+1];
		int y =0;
		if (l%2==0){
			l+=1;  // odd value ho gayi 
		}
		 int flag ;
		for(int x=l; x<=u ;x=x+2)
		{   flag =0;
			for(int z=3;z<=x;z+=2){
			   if(x%z==0)
			   { flag = 1;
				 break;
			   }
			   
			   
			}
			if (flag ==0){
			 arr[y]=x;
			 System.out.println(" in out"+x);
			   y++;
			}
		}
		
		int temp [] = new int [y];
		for(int i =0 ;i<y;i++){
			temp[i] = arr[i];
			
		}
		
		return arr;
	}
	
	

}
