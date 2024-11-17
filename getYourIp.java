import java.net.*;
public class getYourIp {
    public static void main(String[] args) {
        try{
            InetAddress inetAddress=InetAddress.getLocalHost();
            String localHost=inetAddress.getHostName();
            String ipAddress=inetAddress.getHostAddress();
            System.out.println("Local Host Name is :"+localHost);
            System.out.println("Local Host IP is :"+ipAddress);
        }
        catch(UnknownHostException e){
            System.out.println("Unexpected Error : "+e.getMessage());
        }
    }
}
