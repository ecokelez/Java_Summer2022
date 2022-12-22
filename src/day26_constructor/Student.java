package day26_constructor;

public class Student {
    String name;
    int age;
    String phone;

    Student(){

    }

    Student(String name,int age,String phone){
        this.phone=phone;
        this.name=name;

    }

    public static void main(String[] args) {
        Student s1=new Student();

        Student s2= new Student("John",25,"0029-99987");

        System.out.println(s2.name + " ," + s2.age+ ", "+ s2.phone);
    }

}
