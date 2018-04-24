package base.bobvic.domain;

public interface User {
	
	public Long getId(); 

	public void setId(Long id);

	public String getUserName();

	public void setUserName(String userName);

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();
	
	public void setLastName(String lastName);
	
	public String getPassword();
	
	public void setPassword(String password);
	
	public String getEmailId();

	public void setEmailId(String emailId);

	public Character getActiveFlag();

	public void setActiveFlag(Character activeFlag);
}
