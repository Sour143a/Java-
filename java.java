
public class java {

	public static void delete (int a[], int key) {
		int i = 0 ; 
		int n = a.length ;
		for( ; i<n ; i++) {
			if(a[i]==key) {
				break ; 
			}
	      for(int j = i ; j<n-1 ; j++) {
	    	  a[j]=a[j+1];
	      }
	}
	}
		
		public static int maxof(int a[]) {
			int max= 0 ; 
			int n = a.length ; 
			for(int i=0 ; i<n ; i++) {
				if(a[i]>max) {
					max =i ;
				}
			}
			return max ;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] ar = {1,3,5,6,7} ; 
	      int key = 6 ; 
       delete(ar[],key);
        for(int e : ar) {
     	   System.out.println(e);
        }
	   int index =   maxof(ar[]);
       System.out.println(index);
	}
	
	    
		

	

}
