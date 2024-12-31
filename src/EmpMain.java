public class EmpMain {
        public static void main(String[] args) {
        Employee emp=new Employee();
        emp.eid=12;
        emp.ename="praveen";
        emp.job="GET";
        emp.sal=30000;
        emp.display();
        System.out.println();
        System.out.println("for second object");
        Employee emp2=new Employee();
        emp2.eid=21;
        emp2.ename="k";
        emp2.job="IT";
        emp2.sal=43333;
        emp2.display();
            }
}
