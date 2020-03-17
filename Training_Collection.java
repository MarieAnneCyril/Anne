package test;

import java.util.Iterator;
import java.util.List;

public class Training_Collection {
	int batchno;
	String projname;
	List<Technology_coll> tch;
	public final int getBatchno() {
		return batchno;
	}
	public final void setBatchno(int batchno) {
		this.batchno = batchno;
	}
	public final String getProjname() {
		return projname;
	}
	public final void setProjname(String projname) {
		this.projname = projname;
	}
	public final List<Technology_coll> getTch() {
		return tch;
	}
	public final void setTch(List<Technology_coll> tch) {
		this.tch = tch;
	}
	public void displayInfo(){
		System.out.println(batchno+" "+projname);
		Iterator<Technology_coll>itr=tch.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	

}
