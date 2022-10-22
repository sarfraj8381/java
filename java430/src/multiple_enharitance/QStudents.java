package multiple_enharitance;

public class QStudents extends Person implements Courses {
         int qid;
         QStudents(String name,int age,int qid)
         {
        	 super(name,age);
        	 this.qid=qid;
        	 
         }
         public void coursesToComplete()
         {
        	 System.out.println("QSpider student wants to complete");
        	 System.out.println("manual testing "+"java "+ "html "+ "projects "+ "selenium");
        	 
         }
        public void printID()
        {
        	System.out.println("ID is "+qid);
        }
	}
	


