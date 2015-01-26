package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int t=0, i=0, l=0, j=0, temp=0;
		String s;
		char stc[], ps[];
		Scanner sc = new Scanner(System.in);
		
		t = sc.nextInt();
		
		for(i=0; i<t; i++){
			s = sc.next();
			l = s.length();
			stc = new char[l];
			ps = new char[l];
			stc = s.toCharArray();
			
			for(j=0; j<l; j+=2){
				ps[temp] = stc[j];
				temp ++;
			}
			for(j=1; j<l; j+=2){
				ps[temp] = stc[j];
				temp ++;
			}
			System.out.println(ps);
			temp = 0;
		}
	}

}
