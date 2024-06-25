class Emp {
    String ename;
    int eid;
    static String company;

    void display() {
        System.out.println("Emp Name : " + ename + " Emp ID : " + eid + " Company : " + company);
    }
}

public class staticPrac {
    public static void main(String[] args) {
        Emp emp1 = new Emp();
        Emp emp2 = new Emp();
        Emp.company = "ConceptServe";
        emp1.ename = "Karan";
        emp1.eid = 101;
        emp2.ename = "Rahul";
        emp2.eid = 102;
        Emp.company = "New company";
        emp1.display();
        emp2.display();
    }
}