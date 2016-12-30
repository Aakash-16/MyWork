package copm.psl.comparable;

public class Emp implements Comparable<Emp> {

private int eid ;
private String e_name;
private String e_cmpy;
	
	
	public Emp() {
	super();
}


	public Emp(int eid, String e_name, String e_cmpy) {
	super();
	this.eid = eid;
	this.e_name = e_name;
	this.e_cmpy = e_cmpy;
}

	@Override
	public int compareTo(Emp a) {
		int i =0;
     if (this.eid==a.eid )
     {
    	 i=this.e_name.compareTo(a.e_name);
    			 if (i==0){
    				 i=this.e_cmpy.compareTo(a.e_cmpy);
    			 }
     }
     else if (this.eid<a.eid)
     {
    	 i=-1;
     }
     else
    	 i=1;
     
		return i;
		
		
		
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getE_name() {
		return e_name;
	}


	public void setE_name(String e_name) {
		this.e_name = e_name;
	}


	public String getE_cmpy() {
		return e_cmpy;
	}


	public void setE_cmpy(String e_cmpy) {
		this.e_cmpy = e_cmpy;
	}

}
