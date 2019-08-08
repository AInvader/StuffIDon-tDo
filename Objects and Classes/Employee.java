import java.util.*;
import java.io.*;
class Employee
{
    
    int pan; String name; double taxincome, tax;    
    void input()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter PAN : ");
        pan=sc.nextInt();
        System.out.print("Enter Name : ");
        name =br.readLine();
        System.out.print("Enter Taxable Income : ");
        taxincome=sc.nextDouble();
    }
    void cal()
    {        
        if (taxincome<100000.0)
            tax=0.0;
        else if(taxincome>100000.0 && taxincome<150000.0)
            tax=(10.0/100.0)*(taxincome-100000.0);
        else if(taxincome>150000.0 && taxincome<250000.0)
            tax=5000.0+((20.0/100.0)*(taxincome-150000.0));
        else
            tax=(25000.0+(30.0/100.0)*(taxincome-250000.0));
    }
    void display()
    {
        System.out.println("Pan Number" +"\t"+"Name"+"\t"+"Tax Income"+"\t"+"Tax");
        System.out.println(pan+"\t"+name+"\t"+taxincome+"\t"+tax);
    }   
    void main()throws IOException
    {
        Employee ob= new Employee();
        ob.input();
        ob.cal();
		ob.display();
	}
}