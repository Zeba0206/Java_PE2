package com.stackroute.pe2;
 class Member
{
    String Name;
    int age;
    double salary;

    public void memberMethod(String s, int a, float f)
    {
        Name = s;
        age = a;
        salary = f;
    }

    public void display() {
        System.out.println("Name:" + Name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);

    }
}

public class  MemberVariable extends Member
{
    public static void main(String args[])
        {
        MemberVariable m=new MemberVariable();
        m.memberMethod("Harry Potter",22,5000);
        m.display();
        }

}



