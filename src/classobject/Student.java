package classobject;

public class Student {
    int sid;
    String sname;
    String grade;

    void printStudentData(){
        System.out.println("sid="+sid+" "+"sname="+sname+" "+"grade="+grade);

    }

    public static void main(String[] args) {
        Student stu=new Student();
        stu.sid=32;
        stu.sname="praveen";
        stu.grade="A";
        stu.printStudentData();
    }
}
