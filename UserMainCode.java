package firstproject;

import java.util.ArrayList;

public class UserMainCode {
		public static boolean checkTripplets(ArrayList arr) {
			boolean tripple=false;
			int a[]= {0};
			for(int i=0; i<arr.size();i++) {
				a=(int[])arr.get(i);
			}
			for(int i=0; i<a.length;i++) {
				if(a[i]==a[i+1] && a[i+1]==a[i+2]) {
					tripple = true;
				}
			}
			return tripple;
		}
}
