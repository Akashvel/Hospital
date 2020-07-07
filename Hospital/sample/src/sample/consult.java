package sample;
import java.util.*;
public class consult extends mainclass{
	
	public void pconsult(int totalpatient,String[] name,String[] age,String[] sex,String[] phno,String[] address,String[] pid,String[][][] condetails,int[][] visit,int index,int[] clen) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date");
		condetails[index][clen[index]][0]=sc.nextLine();
		System.out.println("What Happening");
		condetails[index][clen[index]][1]=sc.nextLine();
		System.out.println("Tablets To be followed");
		condetails[index][clen[index]][2]=sc.nextLine();
		System.out.println("Consult after");
		condetails[index][clen[index]][3]=sc.nextLine();
		clen[index]++;
	
		System.out.println("Get Well Soon");
		getinitialdetails gid = new getinitialdetails();
		gid.neworold(totalpatient,name,age,sex,phno,address,pid,condetails,visit,clen);
			
	}

}
