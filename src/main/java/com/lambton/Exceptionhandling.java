package com.lambton;

import java.time.Period;
import java.util.Arrays;
import com.lambton.*;

public class Exceptionhandling {
    public static void main(String[] args) {
        System.out.println("Start");
        int d=10;
        int n=20;
        int a[] = new int[]{1,2,3};
        String s =null;
        Person p = new Person();
        SalaryException se =new SalaryException();

        try{
            int fraction =n/d;
            System.out.println("Fraction" + fraction);
            System.out.println("Array Value"+ a[3]);
            p.setName(null);
            p.setSalary(500);
            //se.getMessage();

        }
        catch (ArithmeticException e)
        {
            System.out.println("Error Occured"+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound Occured"+e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Error"+e.getMessage());
        } catch (SalaryException e) {
            System.out.println("error less salary"+e.getMessage());
        } finally {
            System.out.println("I am in finally");
        }
        System.out.println("End");


    }
}
