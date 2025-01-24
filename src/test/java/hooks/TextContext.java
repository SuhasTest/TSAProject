package hooks;

public class TextContext 
{
	String email;
	String password;
	
	public void SetEmail(String email)
	{
		this.email=email;
		
	}
	
	public String GetEmail()
	{
		return email;
	}
	
	public void SetPassword(String password)
	{
		this.password=password;
	}
	
	public String GetPassword()
	{
		return password;
	}

}
