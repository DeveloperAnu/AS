/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linga
 */
public class Student extends Teacher
{
    
public static void main(String args[])
{
    int marks=98;
    
    Student s=new Student();
    
    s.setId(12121);

s.setName("Nikitha");
s.setGender('f');

System.out.println(s.getId());
System.out.println(s.getName());

System.out.println(s.getGender());


System.out.println(marks);


}


}
