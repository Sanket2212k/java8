package CaseStudy_OCT13;
import java.util.*;
public class PkgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trip_travel ta=new Trip_travel();
   try {
	for(VarshaPackage p:ta.generatePackageCost()) {
		System.out.println(p.package_id+" | "+p.source_place+"-"+p.destination_place+"|"+p.no_of_days+" days|Rs."+p.package_cost);
	}
	
	System.out.println("\n-------Ordering By No. of Days-------");
	for(VarshaPackage p:ta.findPackagesWithMinimumNumberOfDays()){
		System.out.println(p.package_id+" | "+p.source_place+"-"+p.destination_place+"|"+p.no_of_days+" days|Rs."+p.package_cost);
	}
}
catch(Exception ex) {
	System.out.println(ex.getMessage());
}
	}

}
