package Collections;

import java.util.ArrayList;
class Employee{
    int eid;
    String ename;
    Employee(int eid,String ename){
        this.eid=eid;
        this.ename=ename;
    }
}
class Student{
    int sid;
    String sname;
    Student(int sid,String sname){
        this.sid=sid;
        this.sname=sname;
    }
}
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Employee e1 = new Employee(111,"ratan");
        Student s1 = new Student(222,"Sam");
        al.add(10);
        al.add('a');
        al.add(e1);
        al.add(s1);
        System.out.println(al.toString());
        for(Object o:al){
            if(o instanceof Integer)
                System.out.println(o.toString());
            if(o instanceof Character)
                System.out.println(o.toString());
            if(o instanceof Employee){
                Employee e = (Employee) o;
                System.out.println(e.eid+"---"+e.ename);
            }
            if(o instanceof Student){
                Student s = (Student) o;
                System.out.println(s.sid+"---"+s.sname);
            }
        }
    }
}
