package main.java.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "The server says, Hey!!";
    }
    public static void main(String args[]){
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Hello Service", service);
        }catch(RemoteException remoteException){
            remoteException.printStackTrace();
        }catch (MalformedURLException malformedURLException){
            malformedURLException.printStackTrace();
        }
    }
}
