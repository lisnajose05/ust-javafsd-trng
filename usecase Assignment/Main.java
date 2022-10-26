package thread.ust;
import java.util.Scanner;



class User
{
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    private String username;
    private String password;
    public User(int id,String username,String password)
    {
        
    }
}
class UserBO
{
    public String[] getUsers()
    {
        String[] Users= {"Louis","Messie","Steve","Kallis","Wipro"};
        return (Users);



}
    
    
    public String encryptPassword(String password)
    	{
    		String bar="";
    		for (char c : password.toCharArray()) {
    		bar += Character.toString((char)(c+1));
    		}
    		return(bar);
    	}


    boolean validate(String username,String password)
    	{
    		String []a=getUsers();



    		for(int i=0;i<a.length;i++)
    			{

    			if(username.compareTo(a[i])==0)
    				{
    				return true;
    				}
    			}
    			return false;
    			}
			}



public class Main {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    UserBO u1=new UserBO();

System.out.println("enter username");
String user=sc.next();
System.out.println("enter password");
String password=sc.next();
User u=new User(1,user, password);
u1.encryptPassword(password);



if(u1.validate(user, password)==true)
{
    System.out.println("login sucessful");
}else
    System.out.println("login unsucessful");
}



}
