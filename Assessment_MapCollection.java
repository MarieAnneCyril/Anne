package test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Assessment_MapCollection {
	String sid;
	String sname;
	Map<String,String>test_details;
	
	
	


	public final String getSid() {
		return sid;
	}





	public final void setSid(String sid) {
		this.sid = sid;
	}





	public final String getSname() {
		return sname;
	}





	public final void setSname(String sname) {
		this.sname = sname;
	}





	public final Map<String, String> getTest_details() {
		return test_details;
	}





	public final void setTest_details(Map<String, String> test_details) {
		this.test_details = test_details;
	}





	void display(){
		System.out.println("Sid"+sid);
		System.out.println("Sname" +sname);
		Set<Entry<String,String>> set=test_details.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		while(itr.hasNext()){
			Entry<String,String> entry=itr.next();
			System.out.println("Test_List" +entry.getKey()+"Attended??:" +entry.getValue());
		}
		
		
	}
	
}
