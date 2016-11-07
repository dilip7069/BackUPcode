package spring.model;

import java.util.List;

import javax.persistence.CascadeType;
//importing the packages.
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;





@Entity
@Table(name = "contact")
public class User {
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name="USERNAME")
    private String username;
	
	@NotEmpty(message = "Please enter your password.")
    @Size(min = 6, max = 15, message = "Your password must between 6 and 15 characters")
	@Column(name="PASSWORD")
    private String password;
	
	@NotEmpty
	@Email
	@Column(name = "EMAIL")
    private String email;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Address.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName="id") 
	private List address;
	
	public void setAddress(List adrs){
		this.address = adrs;
	}
 
	public List getAddress(){
		return address;
	}
    
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    

}
