import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class BankAccountList {
	public static void main(String[] args) {
	
		SortedSet<SavingAccount> sort=new TreeSet<SavingAccount>();
		SavingAccount s1=new SavingAccount(55000,55,"Urvi");
	
	    SavingAccount s2=new SavingAccount(65000,54,"shweta");

	    SavingAccount s3=new SavingAccount(75000,65,"Drashti");
	   
	    sort.add(s1);
		 sort.add(s2);
		 sort.add(s3);
	    
	   for(SavingAccount s:sort)
	   {
		   System.out.println(s.accountbal+" "+s.accid+" "+s.accountholdername);
	   }
	}

}
