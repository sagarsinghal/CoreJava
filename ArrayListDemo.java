import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ll = new ArrayList();
		
		ll.add(7);
		ll.add(6);
		ll.add(8);
		ll.add(9);
		ll.add(2);
		Collections.sort(ll);
		System.out.println(ll);
		
		System.out.println(Collections.max(ll));
		System.out.println(ll);
		
	}

}
