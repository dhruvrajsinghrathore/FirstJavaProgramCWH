package com.company;

class employee{
    int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n){
        name=n;
    }


}
public class oops {
    public static void main(String args[]){

        //Question 1
        employee obj = new employee();
        obj.setName("Dhruvraj Singh");
        obj.salary = 800000;
        System.out.println(obj.getName()+"'s Salary is: "+obj.getSalary());


    }
}
