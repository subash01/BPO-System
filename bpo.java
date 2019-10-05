
import java.util.Calendar;
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
public class bpo {
    int id=0;
   public void login(String username, String password)
    {
       String user="administrator";
       String pass="admin@123";
       if(user.equals(username)&&pass.equals(password))
       {
           System.out.println("You are Successfully logged in\n");
           attendcalls();
           
       }
       else
       {
           System.out.println("Wrong username/ password. Try again and maximum attempt linit is 3. ");
       }
    }
   public void attendcalls()
   {
       String ans,name,job,email;
       int timeOfDay;
       String mobilenumber;
       System.out.println("The Client is on the Line");
       System.out.println("Tye Yes to attend calls");
       Scanner sc= new Scanner(System.in);
       ans=sc.nextLine();
       if(ans.equals("Yes"))
       {
           Calendar c = Calendar.getInstance();
           timeOfDay = c.get(Calendar.HOUR_OF_DAY);
     if(timeOfDay >= 0 && timeOfDay < 12)
     {

        System.out.println("Good Morning sir/Madam");
     }
     else if(timeOfDay >= 12 && timeOfDay < 16)
     {
         System.out.println("Good Afternoon sir/Madam");
     }
     else if(timeOfDay >= 16 && timeOfDay < 21)
     {
        System.out.println("Good Evening sir/Madam");
     }
     
     else if(timeOfDay >= 21 && timeOfDay < 24)
     {
       System.out.println("Good Night sir/Madam");  
     }
     id=id+1;
     System.out.println("Your id is"+id);
        System.out.println("Getting Client Details");
        System.out.println("May I know,Your Name");
        name=sc.nextLine();
        System.out.println("Job Looking For");
        job=sc.nextLine();
        System.out.println("May I know Your Email-id");
        email=sc.nextLine();
        System.out.println("May, I know your phone number");
        mobilenumber=sc.nextLine();
        searchjobs();
        
        
       }
       else
       {
           System.out.println("The BPO Agent is Busy and try after sometime ");
       }
       
   }
   public void searchjobs()
   {
       System.out.println("Welcome to the Open Job Portal");
       System.out.println("The available Jobs right now are");
       System.out.println("1. Programmer");
       System.out.println("2. System Analyst");
       System.out.println("3. Technical Content Writer");
       System.out.println("4. Decision Scientist");
       System.out.println("5. System Engineer");
       System.out.println("6. DataEntry Operations");
       negotiate();
   }
   public void negotiate()
   {
       int succ;
       System.out.println("Negotiate with the user with the job that has been listed over call");
       System.out.println("If negotiation is success the print 1 else print 0");
       Scanner sc = new Scanner(System.in);
       succ=sc.nextInt();
       if(succ==1)
       {
           Importdetails();
       }
       else
       {
           System.out.println("Thank you for spending time with us and If any suitable Job is matched then we will notify you sir/madam.");
       }
   }
   public void Importdetails()
   {
       System.out.println("Exporting details of the client to the Job matched Orgaization");
       Timer timer=new Timer();
        timer.schedule(new TimerTask(){
        @Override
        public void run()
        {
       System.out.println("Exporting...");
        }
        },4500);
        timer.schedule(new TimerTask(){
        @Override
        public void run()
        {
       System.out.println("Exporting...");
        }
        },45000);
        timer.schedule(new TimerTask(){
        @Override
        public void run()
        {
       //System.out.println("Importing...");
       System.out.println("Exported Successfully");
       System.out.println("Proceeding to payment gateway");
       payment();
        }
        },4500);
       
       
       
   }
   public void payment()
   {
       System.out.println("Check your Mail Inbox, for the link to complete your payment");
       System.out.println("We wish you will get a good career for the job that you had requested");
       System.out.println("Thanking You, Have a Good day. Rate our services in the feedback form");
   }
    public static void main(String args[])
    {
        String usr,pwd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your username");
        usr=sc.nextLine();
        System.out.println("Enter your password");
        pwd=sc.nextLine();
        
        bpo b= new bpo();
        b.login(usr,pwd);
        
    }
    
    
}
