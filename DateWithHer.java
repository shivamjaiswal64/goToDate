/*
 * @shivamjaiswal64
 * Formula: [ k+ floor(2.6*m - 0.2) - 2*C + Y + floor(Y/4) + floor(C/4) ]%mod 7
*/

import java.util.Scanner;
class DateWithHer{
	private static int calcDay(int k,int m, int Y, int C){
		return (int)(k +(2.6*m - 0.2) - 2*C + Y + Y/4 + C/4)%7;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MM DD YYYY");
		int month = sc.nextInt();
		int noDay = sc.nextInt();
		int year = sc.nextInt();
		// Let year = 2020
		int k = noDay;
		int Y = year%100;
		int C = year/100; // century
		int m=month;
		if(month>2) m -= 2;
		else{
			m += 10;
			Y--;
		}
		String day="";
		switch(calcDay(k,m,Y,C)){
			case 1: day = "MON"; break;
			case 2: day = "TUE"; break;
			case 3: day = "WED"; break;
			case 4: day = "THU"; break;
			case 5: day = "FRI"; break;
			case 6: day = "SAT"; break;
			case 0: day = "SUN"; 
		}
		System.out.println("The day is "+day);
	}
}