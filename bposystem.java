
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOMATHI
 */
//global static int empid=0,projectid=0;

public class bposystem {

    String bponame,address,email,state,contact_no;
    int noofemp;
    Scanner sc= new Scanner(System.in);
    public void addbpodetails()
    {
        System.out.println("Enter the BPO Name");
        bponame=sc.nextLine();
        System.out.println("Enter the address");
        address=sc.nextLine();
        System.out.println("Enter your statename");
        state=sc.nextLine();
        System.out.println("Enter your Contact No");
        contact_no=sc.nextLine();
        System.out.println("Enter your Number of Employees");
        noofemp=sc.nextInt();   
    }
    public void update()
    {
        int choice;
        System.out.println("Which details you want to update");
        System.out.println("1. Name of Organization 2. Address 3. State 4. Contact No ");
        System.out.println("Press the Menu Number to update");
        choice= sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("ENTER YOUR NEW NAME OF ORGANIZATION");
                bponame=sc.nextLine();
                break;
            case 2:
                System.out.println("ENTER YOUR NEW ADDRESS");
                address=sc.nextLine();
                break;
            case 3:
                System.out.println("ENTER THE NEW STATE");
                state=sc.nextLine();
                break;
            case 4:
                System.out.println("ENTER YOUR NEW CONTACT NUMBER");
                contact_no=sc.nextLine();
                break;
            default:
                System.out.println("All changes get updated ");
                break;
        }
    }
    
    
}

class employeedetails
{
     Scanner sc= new Scanner(System.in);
String empname, empadd,empphoneno,dept,shift;
int salary;
public static int empid=0,projectid=0;
public void addemployeedetails()
{
    empid+=1;
    System.out.println("Enter employeename");
    empname=sc.nextLine();
    System.out.println("Enter employee address");
    empadd=sc.nextLine();
    System.out.println("Enter your employee Phone Number");
    empphoneno=sc.nextLine();
    System.out.println("Ente the department");
    dept=sc.nextLine();
    System.out.println("Enter the shift");
    shift=sc.nextLine();
    System.out.println("Enter the salary");
    salary=sc.nextInt();
    System.out.println("Enter your project id");
    projectid=projectid+1;
}
public void salcal()
{
   salary=salary+100*projectid;
   System.out.println("The salary of employee is"+salary);
}

}
class project
{
    Scanner sc= new Scanner(System.in);
    String projectname,projectdes,projectduration,status,startdate,shipdate;
    public static int projectid=0; 
    int amount, clientid;
    public void addproject()
    {
        System.out.println("Enter your Project Name");
        projectname=sc.nextLine();
       projectid+=1;
        System.out.println("Enter your Project Description");
        projectdes=sc.nextLine();
         System.out.println("Enter your Project Duration");
         projectduration=sc.nextLine();
         System.out.println("Enter your Project Startdate. Enter in this format DD/MM/YY");
         startdate=sc.nextLine();
         System.out.println("Enter your Project Shipdate. Enter in this format DD/MM/YY");
         shipdate=sc.nextLine();
         System.out.println("Enter the amount");
         amount=sc.nextInt();
         System.out.println("Enter the client id");
         clientid=sc.nextInt();
         //System.out.println("Enter the status");
         //status=sc.nextLine();
             
    }
}
class client
{
    Scanner sc= new Scanner(System.in);
    String clientname, address, state, pincode,contactno,mailid;
    public static int clientid=0;
    public void addclient()
    {
        System.out.println("Enter the client name");
        clientname=sc.nextLine();
        //System.out.println("Enter the client id");
        clientid+=1;
        System.out.println("Enter the client address");
        address=sc.nextLine();
        System.out.println("Enter the client State");
        state=sc.nextLine();
        System.out.println("Enter the client pincode");
        pincode=sc.nextLine();
        System.out.println("Enter the client contactno");
        contactno=sc.nextLine();
        System.out.println("Enter the client mailid");
        mailid=sc.nextLine();
        
        
    }
}
class process {
    Scanner sc=new Scanner(System.in);
    
public void queries(String projectna, String projectdes, String projectdur)
{
    System.out.println("****Queries Panel****");
    System.out.println("What is the Project Name?");
    System.out.println("Project Name is: "+projectna);
    System.out.println("What is the Project Name?");
    System.out.println("Project Description is: "+projectdes);
    System.out.println("What is the Project Duration?");
    System.out.println("Project Duration is: "+projectdur);
}

    public void conversation()
    {
        System.out.println("Speak with the client...");
        Timer timer=new Timer();
        timer.schedule(new TimerTask(){
        @Override
        public void run()
        {
       System.out.println("Conversation going on...");
        }
        },4500);
        

    }
    public void shipment(String ship)
    {
        String reason;
        int ch,ch1;
        System.out.println("Shipment date"+ship);
        System.out.println("IF PROJECT HAS BEEN COMPLETED PRESS 1 OR ELSE PRESS 0");
        ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Project has been successfully completed");
            System.out.println("Press 1 to export the project to client");
            ch1=sc.nextInt();
            if(ch1==1)
            {
                System.out.println("Project has been successfully exported.");
                System.out.println("Payment will be done within 12 hours to your account");
            }
            else
            {
                
            }
        }
        else
        {
            System.out.println("Project has been delayed");
            System.out.println("Enter the reason for delay");
            reason=sc.nextLine();
            System.out.println("Penalty will be imposed for each day of delay. 1 day Rs.1000 will be deduced from the amount ");
        }
    }
    public void calpayment(int amt)
    {
        int daysdelay,payment,bonus=100;
        System.out.println("Enter the total delay in time");
        daysdelay=sc.nextInt();
        System.out.println("amount is "+amt);
        if(daysdelay==0)
        {
            payment=amt*bonus;
        }
        else
        {
            payment=amt-daysdelay*1000;
        }
        System.out.println("Final amount payed"+payment);
    }
}
class start extends project
{
public static void main(String args[])
{
    
bposystem bpo=new bposystem();
employeedetails emp=new employeedetails();
project prj =new project();
client clt=new client();
process pr=new process();
bpo.addbpodetails();
emp.addemployeedetails();
emp.salcal();

prj.addproject();
int am= prj.amount;
String ship=prj.shipdate;
String prjn=prj.projectname;
String prjnd=prj.projectdes;
String prjdur=prj.projectduration;
clt.addclient();
pr.queries(prjn, prjnd, prjdur);
pr.conversation();
pr.shipment(ship);
pr.calpayment(am);


}
}