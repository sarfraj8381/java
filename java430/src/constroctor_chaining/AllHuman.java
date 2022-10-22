package constroctor_chaining;

public class AllHuman {

	public static void main(String[] args) {
	Human h = new Human(27,"sonu");
    Emply e = new Emply(27,"sonu","A01","Engg");
    Student s = new Student(27,"sonu","sec_A","science");
   /* h.age=27;
    h.name="sonu";
    e.age=26;
    e.name="sarfraj";
    e.empid="A01";
    e.designation="Engg";
    s.age=25;
    s.name="musu";
    s.sid="sec_A";*/
    //s.stream="science";
    h.showHuman();
    System.out.println("+++++++++++++++++++++++++++");
    e.showEmply();
    System.out.println("+++++++++++++++++++++++++++");
    s.showStudend();
    
    
	}

}
