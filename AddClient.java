import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;
public class AddClient
{
	public static void main(String args[]){
		String host="localhost";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Parameter");
		int a =sc.nextInt();
		System.out.println("Enter 2nd Parameter");
		int b = sc.nextInt();
		try{
			AddRem remobj =(AddRem)Naming.lookup("rmi://"+host+"/AddRem");
			System.out.println(remobj.addnum(a,b));
		}
		catch(RemoteException re)
		{
			re.printStackTrace();
		}
		catch(NotBoundException nbe){
			nbe.printStackTrace();
		}
		catch(MalformedURLException mfe)
		{
			mfe.printStackTrace();
		}
	}
}