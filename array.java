
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,27,12,60,76};
		int a=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=arr.length - 1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < arr[i-1]) {
				a=arr[i];
			} 
			
		}	System.out.println("gretest is"+a);
	}

}
