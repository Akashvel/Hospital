package sample;
import java.util.*;

class getinitialdetails{
	public void neworold(int totalpatient,String[] name,String[] age,String[] sex,String[] phno,String[] address,String[] pid,String[][][] condetails,int[][] visit,int[] clen) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Old Patient");
		System.out.println("2.New Patient");
		System.out.println("3.All Patient");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice)
		{
		case 1:
			System.out.println("You Choosen Old Patient");
			System.out.println("Enter Patient ID");
			String piid = sc.nextLine();
			oldpatient op = new oldpatient();
			op.foundornot(totalpatient,name,age,sex,phno,address,pid,condetails,visit,piid,clen);
			break;
		case 2:
			System.out.println("You Choosen New Patient");
			newpatient np = new newpatient();
			np.getdetails(totalpatient,name,age,sex,phno,address,pid);
			totalpatient+=1;
			System.out.println("You Successfully Registred");
			getinitialdetails gid = new getinitialdetails();
			gid.neworold(totalpatient,name,age,sex,phno,address,pid,condetails,visit,clen);
			break;
		case 3:
			System.out.println("Name\tAge\tSex\tPhnum\t\tAddress\t\tpid");
			System.out.println();
			for(int i=0;i<totalpatient;i++)
			{
				System.out.println(name[i]+"\t"+age[i]+"\t"+sex[i]+"\t"+phno[i]+"\t\t"+address[i]+"\t\t"+pid[i]);
			}
			getinitialdetails gid1 = new getinitialdetails();
			gid1.neworold(totalpatient,name,age,sex,phno,address,pid,condetails,visit,clen);
			break;
		default:
			System.out.println(totalpatient);
			break;
			
		}

	}
}

public class mainclass {
	
	public static void main(String args[]) {
		
		int totalpatient=0;
		String[] name = new String[101];
		String[] age = new String[101];
		String[] sex = new String[101];
		String[] phno = new String[101];
		String[] address = new String[101];
		String[] pid = new String[101];
		String[][][] condetails = new String[101][101][101];
		int[][] visit = new int[101][101];
		int[] clen = new int[101];
		for(int i=0;i<101;i++)
		{
			clen[i]=0;
		}
		System.out.println("\t\tAkash Clinic");
		getinitialdetails gid = new getinitialdetails();
		gid.neworold(totalpatient,name,age,sex,phno,address,pid,condetails,visit,clen);
		
	}

}
