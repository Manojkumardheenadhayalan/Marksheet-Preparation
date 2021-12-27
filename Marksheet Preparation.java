import java.util.Scanner;
class Result
{
public static void main(String arg[])
{
 String name, cname,rollno; int i, Gtotal=0,count=0;
String subject[] = { "DM", "IOS", "OOPS","FDS","DAA","Interpersonal 
Skills"}; String subcode[]= { "DM-MA8351","IOS-D8301","OOPSCS8392","FDS-AD8302","DAA-AD8351","IS-HS8381"};
int midmarks[]= new int[6];
int semmarks[]= new int[6];
 Scanner s = new Scanner(System.in);
 System.out.println("\t Enter your Full Name: ");
 name = s.nextLine();
 System.out.println("\t Enter your College Name :");
 cname = s.nextLine();
 System.out.println("\t Enter your Roll Number:");
 rollno = s.nextLine();
 
for(i=0;i<6;i++)
{
 System.out.println("\t Enter Midterm Marks for: "+subject[i]+":");
 midmarks[i] = s.nextInt();
}
System.out.println("\n\t\t\t OK NOW!");
for(i=0;i<6;i++)
{
 System.out.println("\t Enter Final Exam Marks for: 
"+subject[i]+":");
 semmarks[i] = s.nextInt();
}
 System.out.println("\t\t\t\t\tYOUR RESULT\n");
 System.out.println("\t\t College:\t "+cname);
 System.out.print("\n\t\t Name: " +name);
 System.out.println("\t\t College Name: \t" +cname);
 System.out.println("\t\t Roll Number: \t" +rollno);
System.out.println("\n\t\t 
"+"Subcode"+"\tmarks1"+"\tmarks2"+"\tTotal");
for(i=0;i<6;i++)
{
 if(((midmarks[i])+(semmarks[i])) >=40)
 {
 System.out.println("\t\t "+subcode[i]+"\t\t 
"+midmarks[i]+"\t"+semmarks[i]+"\t"+((midmarks[i])+(semmarks[i]))
);
 }
 else
 {
 System.out.println("\t\t "+subcode[i]+"\t\t 
"+midmarks[i]+"\t"+semmarks[i]+"\t"+((midmarks[i])+(semmarks[i]))
+"*");
 count++;
 }
 Gtotal = (Gtotal + ((midmarks[i])+(semmarks[i])));
}
if(count >0)
{
System.out.println("\n\t\t Grand Total:\t"+Gtotal+"\tResult: 
\tFAIL");
}
else
{
System.out.println("\n\t\t Grand Total:\t"+Gtotal+"\tResult:\tPASS");
}
}
}
