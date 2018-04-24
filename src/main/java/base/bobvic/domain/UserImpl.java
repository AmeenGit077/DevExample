package base.bobvic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "pav_user")	
public class UserImpl implements User{

	@Id
    @GeneratedValue(generator = "UserId")
    @GenericGenerator(
        name="UserId",
        strategy="base.bobvic.domain.IdOverrideTableGenerator",
        parameters = {
            @Parameter(name="segment_value", value="UserImpl"),
            @Parameter(name="entity_name", value="base.bobvic.domain.UserImpl")
        }
    )
	 @Column(name = "PAV_USER_ID")
    protected Long id;
	
	@Column(name = "USER_NAME")
	protected String userName;
    
    @Column(name = "FIRST_NAME")
	protected String firstName;
    
    @Column(name = "LAST_NAME")
	protected String lastName;
    
    @Column(name = "PASSWORD")
	protected String password;
    
    @Column(name = "EMAIL_ID")
	protected String emailId;
    
    @Column(name = "ACTIVE_FLAG")
	protected Character activeFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Character getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Character activeFlag) {
		this.activeFlag = activeFlag;
	}
}
