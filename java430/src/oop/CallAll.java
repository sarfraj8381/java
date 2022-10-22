package oop;

public class CallAll {

	public static void main(String[] args) {
		Trainner t1=new Trainner();
		t1.name="laila";
		t1.empid=412;
		t1.nobatch=01;
		t1.desi="java trainner";
		t1.showTrainner();
		t1.showStaff();
		
		
		Hr h1=new Hr();
		h1.name="vinod";
		h1.empid=413;
		h1.desi="manual";
		h1.dept="QSPIDER";
		h1.showHr();
		
		Tboy b1=new Tboy();
		b1.name="laal";
		b1.empid=414;
		b1.desi="tracker";
		b1.showTboy();
	}

}
