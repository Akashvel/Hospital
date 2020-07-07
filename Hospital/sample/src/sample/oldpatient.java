package sample;
import java.util.*;
public class oldpatient {
	
	public void foundornot(int totalpatient,String[] name,String[] age,String[] sex,String[] phno,String[] address,String[] pid,String[][][] condetails,int[][] visit,String piid,int[] clen) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<totalpatient;i++)
		{
			if(pid[i].equals(piid)) {
				System.out.println("Patient Found");
				int index = i;
				System.out.println("1:Consult");
				System.out.println("2:Report");
				int ch  = sc.nextInt();
				sc.nextLine();
				switch(ch)
				{
				case 1:
					consult cs = new consult();
					cs.pconsult(totalpatient,name,age,sex,phno,address,pid,condetails,visit,index,clen);
					break;
				case 2:
					for (int j=0;j<clen[index];j++)
					{
						System.out.println(condetails[index][j][0]);
						System.out.println(condetails[index][j][1]);
						System.out.println(condetails[index][j][2]);
						System.out.println(condetails[index][j][3]);
					}
					getinitialdetails gid = new getinitialdetails();
					gid.neworold(totalpatient,name,age,sex,phno,address,pid,condetails,visit,clen);
					break;
				}
			}
		}
	}
}
