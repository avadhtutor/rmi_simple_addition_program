import java.rmi.*;
public interface AddRem extends Remote
{
	public int addnum(int a, int b) throws RemoteException;
	
}