
public class Contact {

	String firstName;
	String lastName;
	String number;
	
	public Contact() {
	}
	public Contact(String firstName, String lastName, String number) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
