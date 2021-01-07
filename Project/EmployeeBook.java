/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.BorderLayout;
import java.util.Date;
import java.util.Scanner;

public class EmployeeBook {

    int Employeeid;
    String name;
    String department;
    String designation;
    String date;
    String dob;
    String MartialSts;
    String DateofMarraige;

    public void Employee_Details_input() {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----Please Enter Your Details-------");
        System.out.print("Employeeid:");
        Employeeid = sc.nextInt();
        System.out.print("Employee Name:");
        name = sc.next();
        System.out.println("Department:");
        department = sc.next();
        System.out.println("Designation");
        designation = sc.next();
        System.out.println("Date of Joining:");
        date = sc.next();
        System.out.println("Date Of Birth");
        dob = sc.next();
        System.out.println("Martial Status:");
        MartialSts = sc.next();
        System.out.println("Date of Marriage");
        DateofMarraige = sc.next();
    }

    public void Employee_Output() {
        System.out.println("The Below are Your Deatials");
        System.out.println("Employee Name: " + Employeeid +"\n"+ "Employee Name: "+name+"\n"+"Department: "+department+"\n"+"Designation: "+designation+"\n"+"Date of Joining: "+date+"\n"+"Date Of Birth: "+dob+"\n"+"Martial Status: "+MartialSts+"\n"+"Date of Marriage:"+DateofMarraige);
    }

    public static void main(String[] args) {
        EmployeeBook s = new EmployeeBook();
        s.Employee_Details_input();
        s.Employee_Output();
    }

}
