import java.rmi.*;
import java.net.*;
public class AddServer
{
	public static void main(String[] args) {
		try{
			AddRemImpl localobj = new AddRemImpl();
			Naming.rebind("rmi:///AddRem",localobj);

		}
		catch(RemoteException re)
		{
			re.printStackTrace();
		}
		catch(MalformedURLException mfe)
		{
			mfe.printStackTrace();
		}	
	}
}