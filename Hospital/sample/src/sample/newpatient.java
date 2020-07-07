package sample;
import java.util.*;
public class newpatient {
	
	public void getdetails(int totalpatient,String[] name,String[] age,String[] sex,String[] phno,String[] address,String[] pid) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name[totalpatient] = sc.nextLine();
		System.out.println("Enter your age");
		age[totalpatient] = sc.nextLine();
		System.out.println("Enter your sex");
		sex[totalpatient] = sc.nextLine();
		System.out.println("Enter your phno");
		phno[totalpatient] = sc.nextLine();
		System.out.println("Enter your address");
		address[totalpatient] = sc.nextLine();
		System.out.println("Enter your pid");
		pid[totalpatient] = sc.nextLine();
	}
	
}
