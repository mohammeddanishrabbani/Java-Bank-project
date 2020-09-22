import java.io.*;
class ssdassda
{
   static int sacno[]={123456,123455,123458,324436,224353,111111,222222,333333,444444,555555};
   static int cacno[]={123443,34535353,4566644,6423455,7575685,56756346,44365333,346346436,43546663,56457677};
  static  int facno[]={3424242,5252636,53632563,53425563,252634634,53636663,645757568,64564747,547577474,63336345};
   static int racno[]={1442353,53456346,5346574,53463634,53463666,63464645,35353463,34645645,644745757,53634645};
   static String name[]={"danish","farhan","afnan","musthaqim","Abid Ali Khan","salma khanam","Heena","Safeena","Sabeena","Sakeena"};
    static int phno[]={3432866,1234456667,123356656,455677677,80281167,99988637,90652233,111111,22222,33333};
   static String gender[]={"male","male","male","male","male","female","female","female","female","female"};
   static String add[]={"Bangalore","1Bangalore","shimoga","1shimoga","2Bangalore","2shimoga","3shimoga","4shmoga","5shimoga","5shimoga"};
   static int adno[]={1111111,22222222,333333,444444,55555,6666666,77777,88888,999999,00000};
   static String email[]={"mohammeddanishrabbani@gmail.com","farhar@gmail.com","afnan@gmail.com","ms@gmail.com","alikhan91@gmail.com","salmakhanamssda@gmail.com","henna@gmail.com","safeena@gmail.com","sabeena@gmail.com","sakeena@gmail.com"};
   static int age[]={15,13,16,10,55,41,19,2,2,2};
   static int atmno[]={23456789,34556678,3435545,34555623,23563323,666666667,0,0,0,0};
   static int atmpin[]={7732,3333,5555,1111,4444,8888,0,0,0,0};
   static int sbal[]={23000,444553,34645647,463747,65745,64464,4576,76666,57467,6568566};
   static int cbal[]={23000,444553,34645647,463747,65745,64464,4576,76666,57467,6568566};
   static int fbal[]={23000,444553,34645647,463747,65745,64464,4576,76666,57467,6568566};
   static int rbal[]={23000,444553,34645647,463747,65745,64464,4576,76666,57467,6568566};
  static  int atmbal=10000000;
   static int atno=433555644;
  static  int acno1=99999999;
  static  String adminpassword="ssdassda";
    static int a,b=0,c=name.length-1,d,e,f,g,h,z;
    static int[] newa=new int[cacno.length+1];
    static int[] newb=new int[sacno.length+1];
     static int[] newc=new int[racno.length+1];
      static int[] newd=new int[racno.length+1];
       static int[] newe=new int[racno.length+1];
    static String[] newf=new String[atmno.length+1];
               static  int[] newg=new int[atmno.length+1];
               static  String[] newh=new String[atmno.length+1];
                static String[] newi=new String[atmno.length+1];
                static int[] newj=new int[atmno.length+1];
                static String[] newk=new String[atmno.length+1];
                static int[] newl=new int[atmno.length+1];
                

   static void line()
    {
        System.out.println("_____________________________________________________________________________________________________");
    }

  static void space()
    {
        System.out.println();
        System.out.println();
    }

   static void bigspace()
    {
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println();
        }
    }

   static void timedelay()
    {System.out.println("PLEASE WAIT,WE ARE PROCESSING YOUR REQUEST");
        int i;
        for(i=0;i<33333333;i++)
        {
        }
    }

   
    
   static void atm()throws IOException
    { int atmn;
        int i,j=0;
         InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);
        System.out.println("ENTER YOUR ATM CARD NUMBER");
        atmn=Integer.parseInt(ma.readLine());
        timedelay();
        
        for(i=0;i<atmno.length;i++)
        {
            if(atmno[i]==atmn)
            {
                b=i;
                
                
            }
        }
        if(j>4)
        {
            end();
        
        }
        if(b==0)
        {
             
                System.out.println("IT IS A INVALID ATM CARD NUMBER,ENTER THE CORRECT ATM NUMBER");
                
                j++;
            atm();
        }
        
    
}


static void pin()throws IOException
{
    int i,j=0;
     InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);
        if(atmpin[b]==0)
        {
            System.out.println("YOUR A NEW COSTUMBER OR YOUR ACCOUNT HAS BEEN BLOCKED");
            timedelay();
            end();
        }
        if(atmpin[b]!=0)
        {
    System.out.println("ENTER THE ATM PIN");
    c=Integer.parseInt(ma.readLine());
    
    if(c==atmpin[b])
    {
        d=1;
        
    }
    if(c!=atmpin[b])
    {
        System.out.println("IT IS A IN VALID PIN,PLEASE ENTER THE CORRECT PIN");
        pin();
        j++;
    }
    if(j>4)
    {
        end();
    }

}
}

static void swithdraw()throws IOException
{
     InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);
        int i;
        System.out.println("ENTER THE AMOUNT");
        int amt=Integer.parseInt(ma.readLine());
        
        if(amt<sbal[b])
        {
            sbal[b]=sbal[b]-amt;
            atmbal=atmbal-amt;
            e=1;
            
            
        }
        
        if(amt>sbal[b])
        {
            System.out.println("BALANCE INSUFFICIENT");
            swithdraw();
        }
    }

static void cwithdraw()throws IOException
{
     InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);
        int i;
        System.out.println("ENTER THE AMOUNT");
        int amt=Integer.parseInt(ma.readLine());
        
        if(amt<cbal[b])
        {
            cbal[b]=cbal[b]-amt;
            atmbal=atmbal-amt;
            e=1;

            
        }
        
        if(amt>sbal[b])
        {
            System.out.println("BALANCE INSUFFICIENT");
            cwithdraw();
        }
    }

    
    static void sdeposit()throws IOException
    {
         InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);
        
        System.out.println("ENTER THE AMOUNT");
       int amt=Integer.parseInt(ma.readLine());
       timedelay();
       sbal[b]=sbal[b]+amt;
       atmbal=atmbal+amt;
       timedelay();
       end();
    }
    static void cdeposit()throws IOException
    {
         InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);
        
        System.out.println("ENTER THE AMOUNT");
       int amt=Integer.parseInt(ma.readLine());
       timedelay();
      cbal[b]=cbal[b]+amt;
       atmbal=atmbal+amt;
       timedelay();
       end();
    }
       
    static void changedetails()throws IOException
    {
        int i,j,k;
        
        System.out.println("NAME"+name[b]);
        System.out.println("PHONE NUMBER"+phno[b]);    
        System.out.println("AGE"+age[b]);
        System.out.println("GENDER"+gender[b]);
        System.out.println("ADHAAR NUMBER"+adno[b]);
        System.out.println("EMAIL ID"+email[b]);
        System.out.println("ATM PIN"+atmpin[b]);
        System.out.println("ADDRESS"+add[b]);
        
        space();
        
        
        InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);

        for(i=0;i<8;i++)
        {
         System.out.println("PRESS 1 TO CHANGE NAME");
        System.out.println("PRESS 2 TO CHANGE PHONE NUMBER");
        System.out.println("PRESS 3 TO CHANGE AGE");
        System.out.println("PRESS 4 TO CHANGE GENDER");
        System.out.println("PRESS 5 TO CHANGE ADHAAR NUMBER");
        System.out.println("PRESS 6 TO CHANGE EMAIL ID");
        System.out.println("PRESS 7 TO CHANGE ATM PIN");
        System.out.println("PRESS 8 TO CHANGE ADDRESS");
           
        System.out.println("ENTER YOUR CHOICE");
        j=Integer.parseInt(ma.readLine());
        
        
        switch(j)
        {
            case 1:
            System.out.println("ENTER THE NAME");
            name[b]=ma.readLine();
            timedelay();
            System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {continue;}
        if(k==2)
        {
            end();
        }
        break;
        case 2:
        System.out.println("ENTER THE PHONE NUMBER");
        phno[b]=Integer.parseInt(ma.readLine());
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        
        case 3:
        System.out.println("ENTER THE PHONE NUMBER");
        phno[b]=Integer.parseInt(ma.readLine());
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();;
        }
        break;
    
        case 4:
        System.out.println("ENTER YOUR AGE");
        age[b]=Integer.parseInt(ma.readLine());
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        
        case 5:
        System.out.println("ENTER YOUR GENDER");
        gender[b]=ma.readLine();
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        
        case 6:
        System.out.println("ENTER YOUR EMAIL ID");
        email[b]=ma.readLine();
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        case 7:
        System.out.println("ENTER YOUR NEW ATM PIN");
        atmpin[b]=Integer.parseInt(ma.readLine());
        
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        case 8:
        System.out.println("ENTER THE NEW ADDRESS");
        add[b]=ma.readLine();
        timedelay();
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        default:
        System.out.println("YOU ENTERED A WRONG CHOICE");
        changedetails();
        break;
      
        
        
    }
    timedelay();
    
}
}

    
      
    
   static void onlyacno()throws IOException
    { 
        int ac,i,j=0,ac1,k;
         InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);
        
        System.out.println("ENTER YOUR ACCOUNT NUMBER");
        ac=Integer.parseInt(ma.readLine());
        System.out.println("PRESS 1 IF YOU HAVE CURRENT ACCOUNT");
        System.out.println("PRESS 2 IF YOU HAVE SAVINGS ACCOUNT");
        System.out.println("PRESS 3 IF YOU HAVE RECURRING DEPOSIT ACCOUNT");
        ac1=Integer.parseInt(ma.readLine());
        
        switch(ac1)
        {
        
        case 1:
        for(i=0;i<cacno.length;i++)
        {
            if(ac==cacno[i])
            {
                b=i;
                k=1;
                
            }
        }
            if(b==0)
            {
               System.out.println("YOU ENTERED INVALID AC NUMBER");
               onlyacno();  
            }
        
        
    
    break;
    case 2:
    for(i=0;i<sacno.length;i++)
        {
            if(ac==sacno[i])
            {
                b=i;
                k=1;
                
            }
        }
             if(b==0)
            {
               System.out.println("YOU ENTERED INVALID AC NUMBER");
               onlyacno();  
            }
        
    break;
    
    case 3:
     for(i=0;i<racno.length;i++)
        {
            if(ac==racno[i])
            {
                b=i;
                k=1;
                
            }
        }
            if(b==0)
            {
               System.out.println("YOU ENTERED INVALID AC NUMBER");
               onlyacno();  
            }
        
    
    break;
    default:
    onlyacno();
}
    
}
            
   static void onlccahangedetails()throws IOException
    {
        int i,j,k;
        
        System.out.println("NAME"+name[b]);
        System.out.println("PHONE NUMBER"+phno[b]);    
        System.out.println("AGE"+age[b]);
        System.out.println("GENDER"+gender[b]);
        System.out.println("ADHAAR NUMBER"+adno[b]);
        System.out.println("EMAIL ID"+email[b]);
        System.out.println("ADDRESS"+add[b]);
      
        space();
        
        
        InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);

     
         System.out.println("PRESS 1 TO CHANGE NAME");
        System.out.println("PRESS 2 TO CHANGE PHONE NUMBER");
        System.out.println("PRESS 3 TO CHANGE AGE");
        System.out.println("PRESS 4 TO CHANGE GENDER");
        System.out.println("PRESS 5 TO CHANGE ADHAAR NUMBER");
        System.out.println("PRESS 6 TO CHANGE EMAIL ID");
        
        System.out.println("PRESS 7 TO CHANGE ADDRESS");
           
            System.out.println("ENTER YOUR CHOICE");
        j=Integer.parseInt(ma.readLine());
        
        
        switch(j)
        {
            case 1:
            System.out.println("ENTER THE NAME");
            name[b]=ma.readLine();
            timedelay();
            System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        case 2:
        System.out.println("ENTER THE PHONE NUMBER");
        phno[b]=Integer.parseInt(ma.readLine());
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        
        case 5:
        System.out.println("ENTER THE ADHAAR NUMBER");
        phno[b]=Integer.parseInt(ma.readLine());
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
    
        case 3:
        System.out.println("ENTER YOUR AGE");
        age[b]=Integer.parseInt(ma.readLine());
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        
        case 4:
        System.out.println("ENTER YOUR GENDER");
        gender[b]=ma.readLine();
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        
        case 6:
        System.out.println("ENTER YOUR EMAIL ID");
        email[b]=ma.readLine();
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        
        case 7:
        System.out.println("ENTER THE NEW ADDRESS");
        add[b]=ma.readLine();
        timedelay();
        System.out.println("YOUR ACCOUNT DETAILS HAVE BEEN CHANGED");
            System.out.println("PRESS 1 IF YOU  WANT TO CHANGE SOMETHING ELSE");
            System.out.println("PRESS 2 IF YOU DONT WANT TO CHANGE ANYTHING");
            k=Integer.parseInt(ma.readLine());
            
            if(k==1)
            {}
        if(k==2)
        {
            end();
        }
        break;
        default:
        System.out.println("YOU ENTERED A WRONG CHOICE");
        onlccahangedetails();
        break;
    }
    timedelay();
}
    
       
    
    
    static void wantatm()throws IOException
     {
         InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);
         int ch;
         String i;
         System.out.println("PRESS 1 IF YOU WANT A VISA CARD");
         System.out.println("PRESS 2 IF YOU WANT A MASTER CARD");
         System.out.println("PRESS 3 IF YOU WANT A MASTRO CARD");
         System.out.println("ENTER YOUR CHOICE");
         ch=Integer.parseInt(ma.readLine());
         System.out.println("Thank you");
         timedelay();
         System.out.println("DO YOU WANT TO PRINT YOUR ATM CARD NOW");
         System.out.println("YES FOR YES");
         System.out.println("NO FOR NO");
         i=ma.readLine().toUpperCase();
         if(i.equalsIgnoreCase("YES"))
         {
             timedelay();
             System.out.println("__________________________________");
             System.out.println("|                                |");
             System.out.println("|                                | ");
             System.out.println("|  "+atno+"                      | ");  
             System.out.println("| "+name[b]+"                   | ");
             System.out.println("|////////////////////////////////|");
             System.out.println("|////////////////////////////////|");
             System.out.println("__________________________________");
             System.out.println("PLEASE COLLECT YOUR ATM PIN IN YOUR BANK");
            System.out.println("PLEASE SHOW THE BANK YOUR ID PROOF TO COLLECT ATM PIN");
            }
            
            else if(i.equalsIgnoreCase("NO"))
            {
                timedelay();
                System.out.println("THE ATM CARD WILL BE SENT TO YOUR REGISTERED ADDRESS");
                System.out.println("PLEASE COLLECT YOUR ATM PIN IN YOUR BANK");
            System.out.println("PLEASE SHOW THE BANK YOUR ID PROOF TO COLLECT ATM PIN");
            }
            else
            {
            System.out.println("YOU ENTER WRONG CHOICE");
            wantatm();
        }
            end();
        }
        
      static void createaccount()throws IOException
        {InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);
       double ac3,ac4,ac5;
        
        int acc,ac2,i,j,n=0,ac6=0,k,l,q,w,a1,a2,a3,a4,a5,a6,a7;
        
        System.out.println("PRESS 1 TO CREATE A CURRENT ACCOUNT");
        System.out.println("PRESS 2 TO CREATE A SAVING ACCOUNT");
        System.out.println("PRESS 3 TO CREATE A FIX DEPOSIT ACCOUNT");
        System.out.println("PRESS 4 TO CREATE A RECURRING ACCOUNT");
        acc=Integer.parseInt(ma.readLine());
        
        if(acc==1)
        {
           
            timedelay();
           
            

                System.out.println("In economics, a country's current account is one");
                System.out.println("of the two components of its balance of payments, the other being the");
                System.out.println("capital account (sometimes called the financial account). The current account");
                System.out.println("consists of the balance of trade, net primary income or factor income"); 
                System.out.println("(earnings on foreign investments minus payments made to foreign investors)");
               System.out.println(" and net cash transfers, that have taken place over a given period of time."); 
                System.out.println("The current account balance is one of two major measures of a country's"); 
                System.out.println("foreign trade (the other being the net capital outflow). A current account");
                System.out.println("surplus indicates that the value of a country's net foreign assets"); 
                System.out.println("(i.e. assets less liabilities) grew over the period in question, and a current");
                System.out.println("account deficit indicates that it shrank. Both government and private payments");
                System.out.println("are included in the calculation. It is called the current account because goods");
               System.out.println("and services are generally consumed in the current period");
               System.out.println("PRESS 1 TO SEE INTEREST RATES");
            System.out.println("PRESS 2 TO CREATE A ACCOUNT");
            
            ac2=Integer.parseInt(ma.readLine());
            
            if(ac2==1)
            {
                
                System.out.println("THE INTEREST RATE IS 2%");
                
                
               
                    System.out.println("ENTER THE AMOUNT");
                    ac3=Double.parseDouble(ma.readLine());
                    ac4=(ac3*.5*2.0)/100.0;
                    ac5=(ac3*2.0)/100.0;
                    System.out.println("YOU WILL RECEIVE"+ac4+"as interest AFTER 6 MONTHS");
                    System.out.println("YOU WILL RECEIVE"+ac5+"as interest AFTER 1 YEARS");
                    System.out.println("PRESS 1 TO CREATE ACCOUNT");
                    System.out.println("PRESS 2 TO GO TO MAIN MENU"); 
                    ac6=Integer.parseInt(ma.readLine());
                    if(ac6==1)
                    createaccount();
                    if(ac6==2)
                    end();
                    
                }
            
                    
            if(ac2==2)
            {   
                b=c;
                 i=b;
                 
                 
                 
                for(j=0;j<cacno.length;j++)
                newa[j]=cacno[j];
                
                newa[newa.length-1]=acno1;
                cacno=newa;
                
                acno1++;
                
                for(k=0;k<sacno.length;k++)
                newb[k]=sacno[k];
                
                newb[newb.length-1]=0;
                sacno=newb;
                
                
                for(l=0;l<racno.length;l++)
                newc[l]=racno[l];
                
                newc[newc.length-1]=0;
                racno=newc;
                
                
                for(q=0;q<facno.length;q++)
                newd[q]=sacno[q];
                
                newd[newd.length-1]=0;
                facno=newd;
               
                
                for(w=0;w<atmno.length;w++)
                newe[w]=atmno[w];
                
                newe[newe.length-1]=0;
                atmno=newe;
                
                
                for(a1=0;a1<name.length;a1++)
                {
                  newf[a1]=name[a1];
                 newg[a1]=phno[a1];
                  newh[a1]=gender[a1];
                   newi[a1]=add[a1];
                   newj[a1]=adno[a1];
                   newk[a1]=email[a1];
                   newl[a1]=age[a1];
                }
                System.out.println("ENTER THE NAME");
                newf[newf.length-1]=ma.readLine();
                System.out.println("ENTER THE PHONE NUMBER");
                newg[newg.length-1]=Integer.parseInt(ma.readLine());
                System.out.println("ENTER THE GENDER");
                newh[newh.length-1]=ma.readLine();
                System.out.println("ENTER THE ADDRESS");
                newi[newi.length-1]=ma.readLine();
                System.out.println("ENTER YOUR ADHAAR NUMBER");
                newj[newj.length-1]=Integer.parseInt(ma.readLine());
                System.out.println("ENTER THE EMAIL");
                newk[newk.length-1]=ma.readLine();
                System.out.println("ENTER THE AGE");
                newl[newl.length-1]=Integer.parseInt(ma.readLine());
                timedelay();
                name=newf;
                phno=newg;
                gender=newh;
                add=newi;
                adno=newj;
                email=newk;
                age=newl;
                c++;
                b=c;
                System.out.println("THANK YOU");
                System.out.println("1324235");
                System.out.println("PLEASE NOTE THE NUMBER");
                System.out.println("SHOW THIS NUMBER IN THE BANK AND GET YOUR PASS-BOOK");
                System.out.println("THANK YOU");
                System.out.println("PRESS 1 IF YOU WANT TO CREATE ATM CARD");
                System.out.println("PRESS 2 IF NO");
                ac6=Integer.parseInt(ma.readLine());
                if(ac6==1)
                wantatm();
                if(ac6==2)
                end();
                
                }
            }
            
        
        
        if(acc==2)
        {
            timedelay();
            System.out.println("Saving accounts (UK: savings accounts)");
            System.out.println("are accounts maintained by retail financial institutions ");
            System.out.println("that pay interest but cannot be used directly as money in");
            System.out.println("the narrow sense of a medium of exchange (for example, by");
            System.out.println("writing a cheque). These accounts let customers set aside");
           System.out.println(" a portion of their liquid assets while earning a monetary"); 
           System.out.println(" return. For the bank, money in a savings account may not be");
            System.out.println("callable immediately and, in some jurisdictions, does not"); 
            System.out.println("incur a reserve requirement. Cash in the bank's vaults may");
            System.out.println("thus be used, for example, to fund interest-paying loans.");

System.out.println("The other major types of deposit account are the transactional account");
 System.out.println("usually known as a checking (US) or current (UK) account), money");
 System.out.println("market account and time deposit.");
            
            System.out.println("PRESS 1 TO SEE INTEREST RATES");
            System.out.println("PRESS 2 TO CREATE A ACCOUNT");
            
            ac2=Integer.parseInt(ma.readLine());
            
            if(ac2==1)
            {
                
                System.out.println("THE INTEREST RATE IS 2%");
                
                
               
                    System.out.println("ENTER THE AMOUNT");
                    ac3=Double.parseDouble(ma.readLine());
                    ac4=(ac3*.5*2.0)/100.0;
                    ac5=(ac3*2.0)/100.0;
                    System.out.println("YOU WILL RECEIVE"+ac4+"as interest AFTER 6 MONTHS");
                    System.out.println("YOU WILL RECEIVE"+ac5+"as interest AFTER 1 YEARS");
                     System.out.println("PRESS 1 TO CREATE ACCOUNT");
                    System.out.println("PRESS 2 TO GO TO MAIN MENU");
                    ac6=Integer.parseInt(ma.readLine());
                    if(ac6==1)
                    createaccount();
                    if(ac6==2)
                    end();
                    
                }
            
                    
            if(ac2==2)
            {
                
                b=c;
                i=b;
                 
                 
                for(j=0;j<cacno.length;j++)
                newa[j]=cacno[j];
                
                newa[newa.length-1]=0;
                cacno=cacno;
                
                acno1++;
                
                for(k=0;k<sacno.length;k++)
                newb[k]=sacno[k];
                
                newb[newb.length-1]=acno1;
                sacno=newb;
                
               
                for(l=0;l<racno.length;l++)
                newc[l]=racno[l];
                
                newc[newc.length-1]=0;
                racno=newc;
                
                
                for(q=0;q<facno.length;q++)
                newd[q]=sacno[q];
                
                newd[newd.length-1]=0;
                facno=newd;
               
                
                for(w=0;w<atmno.length;w++)
                newe[w]=atmno[w];
                
                newe[newe.length-1]=0;
                atmno=newe;
                
                
                
                for(a1=0;a1<name.length;a1++)
                {
                    newf[a1]=name[a1];
                 newg[a1]=phno[a1];
                  newh[a1]=gender[a1];
                   newi[a1]=add[a1];
                   newj[a1]=adno[a1];
                   newk[a1]=email[a1];
                   newl[a1]=age[a1];
                }
                System.out.println("ENTER THE NAME");
                newf[newf.length-1]=ma.readLine();
                System.out.println("ENTER THE PHONE NUMBER");
                newg[newg.length-1]=Integer.parseInt(ma.readLine());
                System.out.println("ENTER THE GENDER");
                newh[newh.length-1]=ma.readLine();
                System.out.println("ENTER THE ADDRESS");
                newi[newi.length-1]=ma.readLine();
                System.out.println("ENTER YOUR ADHAAR NUMBER");
                newj[newj.length-1]=Integer.parseInt(ma.readLine());
                System.out.println("ENTER THE EMAIL");
                newk[newk.length-1]=ma.readLine();
                System.out.println("ENTER THE AGE");
                newl[newl.length-1]=Integer.parseInt(ma.readLine());
                timedelay();
                name=newf;
                phno=newg;
                gender=newh;
                add=newi;
                adno=newj;
                email=newk;
                age=newl;
                c++;
                b=c;
                System.out.println("THANK YOU");
                System.out.println("1324235");
                System.out.println("PLEASE NOTE THE NUMBER");
                System.out.println("SHOW THIS NUMBER IN THE BANK AND GET YOUR PASS-BOOK");
                System.out.println("THANK YOU");
                System.out.println("PRESS 1 IF YOU WANT TO CREATE ATM CARD");
                System.out.println("PRESS 2 IF NO");
                ac6=Integer.parseInt(ma.readLine());
                if(ac6==1)
                wantatm();
                if(ac6==2)
                end();
                
                }
            }
            
            if(acc==3)
            {
                timedelay();
                System.out.println("Recurring Deposit is a special");
                System.out.println("kind of Term Deposit offered by banks in India which ");
                System.out.println("help people with regular incomes to deposit a fixed");
                System.out.println("amount every month into their Recurring Deposit account");
                System.out.println("and earn interest at the rate applicable to Fixed ");
                System.out.println("Deposits.[1] It is similar to making FDs of a certain ");
                System.out.println("amount in monthly installments, for example ? 1000 every");
               System.out.println(" month. This deposit matures on a specific date in the ");
                System.out.println("future along with all the deposits made every month."); 
                System.out.println("Thus, Recurring Deposit schemes allow customers with an");
                System.out.println("opportunity to build up their savings through regular ");
                System.out.println("monthly deposits of fixed sum over a fixed period of time. Minimum Period of RD is 6 months and maximum is 10 years.");

System.out.println("The Recurring Deposit can be funded by [Standing order (banking)");
System.out.println("|Standing instructions] which are the instructions by the customer");
System.out.println(" to the bank to withdraw a certain sum of money from his Savings/ ");
System.out.println(" Current account and credit to the Recurring Deposit account.");

System.out.println("When the RD account is opened, the maturity value is indicated to ");
System.out.println("the customer assuming that the monthly installments will be paid"); 
System.out.println("regularly on due dates. If any installment is delayed, the interest");
System.out.println(" payable in the account will be reduced and will not be sufficient ");
System.out.println(" to reach the maturity value. Therefore, the difference in interest");
 System.out.println("will be deducted from the maturity value as a penalty. The rate of ");
 System.out.println("penalty will be fixed upfront. Interest is compounded on quarterly ");
 System.out.println("basis in recurring deposits.");

System.out.println("One can avail loans against the collateral of Recurring deposit up to");
System.out.println(" 80 to 90% of the deposit value.");

System.out.println("Rate of Interest offered is similar to that in Fixed Deposits. Earlier");
System.out.println(" it seemed to be one of the best method to save the amount yield after");
 System.out.println("years of deposit. But effective from June 1, 2015 TDS is applicable"); 
System.out.println(" on RDs.[2]");
     
System.out.println("PRESS 1 TO SEE INTEREST RATES");
            System.out.println("PRESS 2 TO CREATE A ACCOUNT");
            
            ac2=Integer.parseInt(ma.readLine());
            
            if(ac2==1)
            {
                    System.out.println("ENTER THE AMOUNT");
                    ac3=Double.parseDouble(ma.readLine());
                    
                    System.out.println("IF YOU CREATE A ACCOUNT FOR 6 MONTHS TH 12 MONTHS. THE INTEREST WILL BE "+(ac3*n*((n+1)/2)*10.0/100)+" "+"THE MATURITY VALUE WILL BE"+((ac3*n)+(ac3*n*((n+1)/2)*10.0/100)));
                    System.out.println("IF YOU CREATE A ACCOUNT FOR 12 MONTHS TH 18 MONTHS. THE INTEREST WILL BE "+(ac3*n*((n+1)/2)*20.0/100)+" "+"THE MATURITY VALUE WILL BE"+((ac3*n)+(ac3*n*((n+1)/2)*20.0/100)));
                     System.out.println("IF YOU CREATE A ACCOUNT FOR 18 MONTHS TH 24 MONTHS. THE INTEREST WILL BE "+(ac3*n*((n+1)/2)*30.0/100)+" "+"THE MATURITY VALUE WILL BE"+((ac3*n)+(ac3*n*((n+1)/2)*30.0/100)));
                System.out.println("IF YOU CREATE A ACCOUNT FOR MORE THAN 24 MONTHS THE INTEREST WILL BE "+(ac3*n*((n+1)/2)*40.0/100)+" "+"THE MATURITY VALUE WILL BE"+((ac3*n)+(ac3*n*((n+1)/2)*40.0/100)));
         
                    
                    System.out.println("PRESS 1 TO CREATE ACCOUNT");
                    System.out.println("PRESS 2 TO GO TO MAIN MENU");
                     
                    ac6=Integer.parseInt(ma.readLine());
                    if(ac6==1)
                    createaccount();
                    if(ac6==2)
                    end();
                    
                    
                }
            
                    
            if(ac2==2)
            {
               
                b=c;
                i=b;
                 
                 
                for(j=0;j<cacno.length;j++)
                newa[j]=cacno[j];
                
                newa[newa.length-1]=0;
                cacno=newa;
                
                acno1++;
                
                for(k=0;k<sacno.length;k++)
                newb[k]=sacno[k];
                
                newb[newb.length-1]=0;
                sacno=newb;
                
                
                for(l=0;l<racno.length;l++)
                newc[l]=racno[l];
                
                newc[newc.length-1]=acno1;
                racno=newc;
                
                
                for(q=0;q<facno.length;q++)
                newd[q]=sacno[q];
                
                newd[newd.length-1]=0;
                facno=newd;
               
                
                for(w=0;w<atmno.length;w++)
                newe[w]=atmno[w];
                
                newe[newe.length-1]=0;
                atmno=newe;
                
                 
                for(a1=0;a1<name.length;a1++)
                {
                    newf[a1]=name[a1];
                 newg[a1]=phno[a1];
                  newh[a1]=gender[a1];
                   newi[a1]=add[a1];
                   newj[a1]=adno[a1];
                   newk[a1]=email[a1];
                   newl[a1]=age[a1];
                }
                System.out.println("ENTER THE NAME");
                newf[newf.length-1]=ma.readLine();
                System.out.println("ENTER THE PHONE NUMBER");
                newg[newg.length-1]=Integer.parseInt(ma.readLine());
                System.out.println("ENTER THE GENDER");
                newh[newh.length-1]=ma.readLine();
                System.out.println("ENTER THE ADDRESS");
                newi[newi.length-1]=ma.readLine();
                System.out.println("ENTER YOUR ADHAAR NUMBER");
                newj[newj.length-1]=Integer.parseInt(ma.readLine());
                System.out.println("ENTER THE EMAIL");
                newk[newk.length-1]=ma.readLine();
                System.out.println("ENTER THE AGE");
                newl[newl.length-1]=Integer.parseInt(ma.readLine());
                timedelay();
                name=newf;
                phno=newg;
                gender=newh;
                add=newi;
                adno=newj;
                email=newk;
                age=newl;
                c++;
                b=c;
                System.out.println("THANK YOU");
                System.out.println("1324235");
                System.out.println("PLEASE NOTE THE NUMBER");
                System.out.println("SHOW THIS NUMBER IN THE BANK AND GET YOUR PASS-BOOK");
                System.out.println("THANK YOU");
                System.out.println("PRESS 1 IF YOU WANT TO CREATE ATM CARD");
                System.out.println("PRESS 2 IF NO");
                ac6=Integer.parseInt(ma.readLine());
                if(ac6==1)
                wantatm();
                if(ac6==2)
                end();
                
                }
            }
            
            if(acc==4)
            {
                timedelay();
            System.out.println("A fixed deposit (FD) is a financial"); 
            System.out.println("instrument provided by banks which provides investors with a");
           System.out.println(" higher rate of interest than a regular savings account, until the given");
           System.out.println(" maturity date. It may or may not require the creation of a separate account. I");
           System.out.println(" t is known as a term deposit or time deposit in Canada, Australia, New Zealand, and the US,");
           System.out.println(" and as a bond in the United Kingdom and India. They are considered to be very safe investments."); 
            System.out.println("Term deposits in India and Pakistan is used to denote a larger class of investments with varying levels");
           System.out.println(" of liquidity. The defining criteria for a fixed deposit is that the money cannot be withdrawn from the FD ");
           System.out.println(" as compared to a recurring deposit or a demand deposit before maturity. Some banks may offer additional");
           System.out.println(" services to FD holders such as loans against FD certificates at competitive interest rates. It's important ");
           System.out.println(" to note that banks may offer lesser interest rates under uncertain economic conditions. The interest rate ");
           System.out.println(" varies between 4 and 11 percent.[1] The tenure of an FD can vary from 7, 15 or 45 days to 1.5 years and can");
           System.out.println(" be as high as 10 years.[2] These investments are safer than Post Office Schemes as they are covered by the");
           System.out.println(" Deposit Insurance and Credit Guarantee Corporation (DICGC). However, DICGC guarantees amount up to ? 1,00,000");
           System.out.println(" (about ) per depositor per bank.[3] They also offer income tax and wealth tax benefits.");
            System.out.println("PRESS 1 TO SEE INTEREST RATES");
           System.out.println("PRESS 2 TO CREATE A ACCOUNT");
            
            ac2=Integer.parseInt(ma.readLine());
            
            if(ac2==1)
            {
                    System.out.println("ENTER THE AMOUNT");
                    ac3=Double.parseDouble(ma.readLine());
                    
                    System.out.println("IF YOU CREATE A ACCOUNT FOR 6 MONTHS TH 12 MONTHS. THE INTEREST WILL BE "+(ac3*n*((n+1)/2)*10.0/100)+" "+"THE MATURITY VALUE WILL BE"+((ac3+(ac3*n*((n+1)/2)*10.0/100))));
                    System.out.println("IF YOU CREATE A ACCOUNT FOR 12 MONTHS TH 18 MONTHS. THE INTEREST WILL BE "+(ac3*n*((n+1)/2)*20.0/100)+" "+"THE MATURITY VALUE WILL BE"+((ac3+(ac3*n*((n+1)/2)*20.0/100))));
                     System.out.println("IF YOU CREATE A ACCOUNT FOR 18 MONTHS TH 24 MONTHS. THE INTEREST WILL BE "+(ac3*n*((n+1)/2)*30.0/100)+" "+"THE MATURITY VALUE WILL BE"+((ac3+(ac3*n*((n+1)/2)*30.0/100))));
                System.out.println("IF YOU CREATE A ACCOUNT FOR MORE THAN 24 MONTHS THE INTEREST WILL BE "+(ac3*n*((n+1)/2)*40.0/100)+" "+"THE MATURITY VALUE WILL BE"+((ac3+(ac3*n*((n+1)/2)*40.0/100))));
         
                    
                     System.out.println("PRESS 1 TO CREATE ACCOUNT");
                    System.out.println("PRESS 2 TO GO TO MAIN MENU");
                     
                    ac6=Integer.parseInt(ma.readLine());
                    if(ac6==1)
                    createaccount();
                    if(ac6==2)
                    end();
                    
                    
                }
            
                    
            if(ac2==2)
            {
                 
                b=c;
                i=b;
                 
                for(j=0;j<cacno.length;j++)
                newa[j]=cacno[j];
                
                newa[newa.length-1]=0;
                cacno=newa;
                
                acno1++;
                
                for(k=0;k<sacno.length;k++)
                newb[k]=sacno[k];
                
                newb[newb.length-1]=0;
                sacno=newb;
                
                
                for(l=0;l<racno.length;l++)
                newc[l]=racno[l];
                
                newc[newc.length-1]=0;
                racno=newc;
                
                
                for(q=0;q<facno.length;q++)
                newd[q]=sacno[q];
                
                newd[newd.length-1]=acno1;
                facno=newd;
               
               
                for(w=0;w<atmno.length;w++)
                newe[w]=atmno[w];
                
                newe[newe.length-1]=0;
                atmno=newe;
                
                
                for(a1=0;a1<name.length;a1++)
                {
                    newf[a1]=name[a1];
                 newg[a1]=phno[a1];
                  newh[a1]=gender[a1];
                   newi[a1]=add[a1];
                   newj[a1]=adno[a1];
                   newk[a1]=email[a1];
                   newl[a1]=age[a1];
                }
                System.out.println("ENTER THE NAME");
                newf[newf.length-1]=ma.readLine();
                System.out.println("ENTER THE PHONE NUMBER");
                newg[newg.length-1]=Integer.parseInt(ma.readLine());
                System.out.println("ENTER THE GENDER");
                newh[newh.length-1]=ma.readLine();
                System.out.println("ENTER THE ADDRESS");
                newi[newi.length-1]=ma.readLine();
                System.out.println("ENTER YOUR ADHAAR NUMBER");
                newj[newj.length-1]=Integer.parseInt(ma.readLine());
                System.out.println("ENTER THE EMAIL");
                newk[newk.length-1]=ma.readLine();
                System.out.println("ENTER THE AGE");
                newl[newl.length-1]=Integer.parseInt(ma.readLine());
                timedelay();
                name=newf;
                phno=newg;
                gender=newh;
                add=newi;
                adno=newj;
                email=newk;
                age=newl;
                c++;
                b=c;
                System.out.println("THANK YOU");
                System.out.println("1324235");
                System.out.println("PLEASE NOTE THE NUMBER");
                System.out.println("SHOW THIS NUMBER IN THE BANK AND GET YOUR PASS-BOOK");
                System.out.println("THANK YOU");
                System.out.println("PRESS 1 IF YOU WANT TO CREATE ATM CARD");
                System.out.println("PRESS 2 IF NO");
                ac6=Integer.parseInt(ma.readLine());
                if(ac6==1)
                wantatm();
                if(ac6==2)
                end();
                
                }
            }
        }
    
        
        static void admin()throws IOException
        
        { 
            int s;
            int i,amt,j,k,x,y,index,q,l,m,n;
            String w,s1;
            InputStreamReader ni=new InputStreamReader(System.in);
            BufferedReader ma=new BufferedReader(ni);
            System.out.println("ENTER THE ADMIN PASSWORD");
            s1=ma.readLine();
            
            if(s1.equals(adminpassword))
            {
                System.out.println("PRESS 1 IF YOU WANT DEPOSIT MONEY");
                System.out.println("PRESS 2 IF YOU WANT TO SEE THE DETAILS OF THE CUSTOMER");
                i=Integer.parseInt(ma.readLine());
                
                switch(i)
                {
                    case 1:
                    System.out.println("ENTER THE AMOUNT");
                    amt=Integer.parseInt(ma.readLine());
                    atmbal=atmbal+amt;
                    timedelay();
                    System.out.println("MONEY HAS BEEN SUCCESSFULLY DEPOSITED");
                    System.out.println("ACKNOWLEGEMENT");
                    System.out.println("THE AMOUNT"+amt+" "+"HAS BEEN SUCCESSFULLY DEPOSITED");
                    System.out.println("THE AMT BALANCE IS "+atmbal);
                    timedelay();
                    end();
                    break;
                    
                    case 2:
                    System.out.println("Type 1 to see Saving bank accounts in order");
                    System.out.println("Type 2 to see current bank accounts in order");
                    System.out.println("Type 3 to see recurring deposit bank accounts in order");
                    System.out.println("Type 4 to see fixed bank accounts in order");
                    System.out.println("Type 5 to see names in order");
                    System.out.println("Type 6 to see age in order");
                    System.out.println("Type 7 to see ATM NUMBER in order");
                    s=Integer.parseInt(ma.readLine());
                    if(s==1)
                    {
                    System.out.println("ENTER TO 1 TO SEE IN ASCENDING ORDER");
                    System.out.println("ENTER TO 2 TO SEE IN DESCENDING ORDER");
                    k=Integer.parseInt(ma.readLine());
                    if(k==1)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(sacno[y]<sacno[index])
                                {
                                    index=y;
                                    q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                     q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                    w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                    
                                }
                            }
                        }        
                                    System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                               
                            if(k==2)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(sacno[y]>sacno[index])
                                {
                                    index=y;
                                    q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                     q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                   System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                            else
                            end();
                        }
                                            
                 
             
         
         
         
         if(s==2)
         {
                    System.out.println("ENTER TO 1 TO SEE IN ASCENDING ORDER");
                    System.out.println("ENTER TO 2 TO SEE IN DESCENDING ORDER");
                    k=Integer.parseInt(ma.readLine());
                    if(k==1)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(cacno[y]<cacno[index])
                                {
                                    index=y;
                                    q=cacno[index];
                                    sacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                     q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                   System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                               
                            if(k==2)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(cacno[y]>cacno[index])
                                {
                                    index=y;
                                    q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                     q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                   System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                            else
                            end();
                        }
                    
                        
                        
                         if(s==3)
             {
                         
                    System.out.println("ENTER TO 1 TO SEE IN ASCENDING ORDER");
                    System.out.println("ENTER TO 2 TO SEE IN DESCENDING ORDER");
                    k=Integer.parseInt(ma.readLine());
                    if(k==1)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(racno[y]<racno[index])
                                {
                                    index=y;
                                    q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                     q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                    System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                               
                            if(k==2)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(racno[y]>racno[index])
                                {
                                    index=y;
                                    q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                     q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                   System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                            else
                            end();
                        }
                        
                        
                        
                        
           if(s==4)
                         {
                    System.out.println("ENTER TO 1 TO SEE IN ASCENDING ORDER");
                    System.out.println("ENTER TO 2 TO SEE IN DESCENDING ORDER");
                    k=Integer.parseInt(ma.readLine());
                    if(k==1)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(facno[y]<facno[index])
                                {
                                    index=y;
                                    q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                     q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                   System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                               
                            if(k==2)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(facno[y]>facno[index])
                                {
                                    index=y;
                                    q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                     q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                    System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                            else
                            end();
                        }
                        
                        
                        
                        
           if(s==5)
           {
                    System.out.println("ENTER TO 1 TO SEE IN ASCENDING ORDER");
                    System.out.println("ENTER TO 2 TO SEE IN DESCENDING ORDER");
                    k=Integer.parseInt(ma.readLine());
                    if(k==1)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(name[y].compareTo(name[index])<1)
                                {
                                    index=y;
                                    
                                    w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                    q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                            
                                     q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                    System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                               
                            if(k==2)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(name[y].compareTo(name[index])>1)
                                {
                                    index=y;
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                    q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                    
                                    
                                     q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                    System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                            else
                            end();
                        }
                        
                    
                    
         
        if(s==6)
                    {
                    System.out.println("ENTER TO 1 TO SEE IN ASCENDING ORDER");
                    System.out.println("ENTER TO 2 TO SEE IN DESCENDING ORDER");
                    k=Integer.parseInt(ma.readLine());
                    if(k==1)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(age[y]<age[index])
                                {
                                    index=y;
                                    q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                     
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                    System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                               
                            if(k==2)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(age[y]>age[index])
                                {
                                    index=y;
                                    q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                    q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                   
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                   System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                            else
                            end();
                        }
                        
                        
                         if(s==7)
                    {
                    System.out.println("ENTER TO 1 TO SEE IN ASCENDING ORDER");
                    System.out.println("ENTER TO 2 TO SEE IN DESCENDING ORDER");
                    k=Integer.parseInt(ma.readLine());
                    if(k==1)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(age[y]<atmno[index])
                                {
                                    index=y;
                                    q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                    
                                     
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                   System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                               
                            if(k==2)
                    {
                        for(x=0;x<c+1;x++)
                        {
                            index=x;
                            for(y=index;y<c+1;y++)
                            {
                                if(atmno[y]>atmno[index])
                                {
                                    index=y;
                                    q=age[index];
                                    age[index]=age[x];
                                    age[x]=q;
                                    
                                    q=sacno[index];
                                    sacno[index]=sacno[x];
                                    sacno[x]=q;
                                    
                                     q=cacno[index];
                                    cacno[index]=cacno[x];
                                    cacno[x]=q;
                                    
                                     q=racno[index];
                                    racno[index]=racno[x];
                                    racno[x]=q;
                                    
                                     q=facno[index];
                                    facno[index]=facno[x];
                                    facno[x]=q;
                                    
                                     w=name[index];
                                    name[index]=name[x];
                                    name[x]=w;
                                   
                                     q=atmno[index];
                                    atmno[index]=atmno[x];
                                    atmno[x]=q;
                                    
                                     w=gender[index];
                                    gender[index]=gender[x];
                                    gender[x]=w;
                                    
                                    q=adno[index];
                                    adno[index]=adno[x];
                                    adno[x]=q;
                                    
                                    q=phno[index];
                                    phno[index]=phno[x];
                                    phno[x]=q;
                                    
                                    w=email[index];
                                    email[index]=email[x];
                                    email[x]=w;
                                }
                            }
                        }        
                                   System.out.println("NAME               SB AC         CA AC       RD AC       FD AC     AGE     GENDER     AD NUMBER     EMAIL     PH.NO        ATM NUMBER");
                                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);
                                }
                                 
                                System.out.println("PRESS 1 TO change the details");
                                System.out.println("PRESS 2 to end");
                                
                                m=Integer.parseInt(ma.readLine());
                                
                                if(m==1)
                                {
                                    System.out.println("PRESS THE NUMBER OF THE ACCOUNT");
                                    n=Integer.parseInt(ma.readLine());
                                    b=n;
                                    changedetails();
                                }
                                
                                if(m==2)
                                {
                                    end();
                                }
                            }
                            else
                            end();
                        }
                        
                        else
                        end();
                        break;
                        
                        
                         
                        
                    default:
                    end();
                }
            }
            else
            end();
        }
        
        static void  accheck()throws IOException
        {
            InputStreamReader ni=new InputStreamReader(System.in);
        BufferedReader ma=new BufferedReader(ni);
            int ac,i,j=0;
            System.out.println("ENTER THE AC NUMBER");
            ac=Integer.parseInt(ma.readLine());
            
            for(i=0;i<sacno.length;i++)
            {
                if(ac==sacno[i])
                {
                    b=i;
                }
            }
            
            for(i=0;i<sacno.length;i++)
            {
                if(ac==cacno[i])
                {
                    b=i;
                }
            }
            
            for(i=0;i<sacno.length;i++)
            {
                if(ac==racno[i])
                {
                    b=i;
                }
            }
            
            for(i=0;i<sacno.length;i++)
            {
                if(ac==facno[i])
                {
                    b=i;
                }
            }
            
            if(b==0)
            {
                System.out.println("YOU ENTER THE WRONG AC NO");
                
                j++;
                accheck();
            }
            if(j==4)
            {
                end();
            }
        }
            
            
            
        
        static void  start()throws IOException
        { 
            int l;
            InputStreamReader ni=new InputStreamReader(System.in);
             BufferedReader ma=new BufferedReader(ni);
             
             System.out.println("PRESS 1 IF UR A CUSTOMER");
             System.out.println("PRESS 2 IF UR A ADMIN");
             f=Integer.parseInt(ma.readLine());
             
             if(f==1)
             {
                 System.out.println("ENTER 1 IF YOU HAVE ATM CARD");
                 System.out.println("ENTER 2 IF YOU HAVE ONLY A ACCOUNT");
                 System.out.println("ENTER 3 IF YOU DO NOT HAVE A ACCOUNT");
                 g=Integer.parseInt(ma.readLine());
                 
                 if(g==1)
                 {
                     atm();
                     pin();
                     System.out.println("PRESS 1 FOR CURRENT ACCOUNT");
                     System.out.println("PRESS 2 FOR SAVINGS ACCOUNT");
                     h=Integer.parseInt(ma.readLine());
                     
                     if(h==1)
                     {
                         System.out.println("PRESS 1 TO WITHDRAW");
                         System.out.println("PRESS 2 TO DEPOSIT");
                         System.out.println("PRESS 3 TO CHANGE DETAILS");
                         z=Integer.parseInt(ma.readLine());
                         
                         if(z==1)
                         {
                             cwithdraw();
                             
                            }
                            if(z==2)
                            {
                                cdeposit();
                            }
                            if(z==3)
                            {
                                changedetails();
                            }
                            else
                            start();
                        }
                 
                 if(h==2)
                     {
                         System.out.println("PRESS 1 TO WITHDRAW");
                         System.out.println("PRESS 2 TO DEPOSIT");
                         System.out.println("PRESS 3 TO CHANGE DETAILS");
                         z=Integer.parseInt(ma.readLine());
                         
                         if(z==1)
                         {
                             swithdraw();
                             
                            }
                            if(z==2)
                            {
                                sdeposit();
                            }
                            if(z==3)
                            {
                                changedetails();
                            }
                            else
                            start();
                        }
                        else
                        start();
                    }
                    
                    if(g==2)
                    {
                        
                        System.out.println("PRESS 1 TO CHANGE DETAILS");
                        System.out.println("PRESS 2 TO MAKE A ATM CARD");
                        z=Integer.parseInt(ma.readLine());
                        
                        if(z==1)
                        {
                            accheck();
                            onlccahangedetails();
                        }
                        if(z==2)
                        { 
                            accheck();
                            wantatm();
                        }
                        else
                        start();
                    }
                    
                    if(g==3)
                    {
                        System.out.println("PRESS 1 TO CREATE ACCOUNT");
                        System.out.println("PRESS ANY OTHER KEY TO TERMINATE");
                        z=Integer.parseInt(ma.readLine());
                        
                        if(z==1)
                        {
                            createaccount();
                        }
                        else
                        start();
                    }
                    else
                    start();
                }
                
                if(f==2)
                {
                    admin();
                }
                
                if(f==3)
                {
                    System.out.println(name[name.length-1]);
                    for(l=0;l<c+1;l++)
                                    {
                                    System.out.println(l+""+name[l]+"   "+sacno[l]+"    "+cacno[l]+"     "+racno[l]+"    "+facno[l]+"    "+age[l]+"    "+gender[l]+"    "+adno[l]+"     "+phno+"   "+atmno[l]);;
                                }
                                end();
            }
        }
            static void end()throws IOException
            {
                start();
            }
            
            public static void main(String args[])throws IOException
            {
                start();
            }
        }
            
          
            
            
                        
             
            
         
         
        
    
             
        
        
