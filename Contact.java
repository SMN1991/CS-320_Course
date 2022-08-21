
public class Contact {

	// variables
	private String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	private static final String INITIAL_STRING = "INITIAL";
	private static final String INITIAL_INT = "0123456789";
	
	//constructor
	Contact(){
		this.contactID = INITIAL_INT;
		this.firstName = INITIAL_STRING;
		this.lastName = INITIAL_STRING;
		this.number = INITIAL_INT;
		this.address = INITIAL_STRING;
		
	}
	
	//overload constructors
	Contact(String contactID){
		setContactID(contactID);
		this.firstName = INITIAL_STRING;
		this.lastName = INITIAL_STRING;
		this.number = INITIAL_INT;
		this.address = INITIAL_STRING;
	}
	
	Contact(String contactID, String firstName){
		setContactID(contactID);
		setFirstName(firstName);
		this.lastName = INITIAL_STRING;
		this.number = INITIAL_INT;
		this.address = INITIAL_STRING;
	}
	
	Contact(String contactID, String firstName, String lastName){
		setContactID(contactID);  
		setFirstName(firstName);
		setLastName(lastName);
		this.number = INITIAL_INT;
		this.address = INITIAL_STRING;
	}
	Contact(String contactID, String firstName, String lastName, String number){
		setContactID(contactID);
		setFirstName(firstName);
		setLastName(lastName);
		setNumber(number);
		this.address = INITIAL_STRING;	
	}
	Contact(String contactID, String firstName, String lastName, String number, String address){
		setContactID(contactID);
		setFirstName(firstName);
		setLastName(lastName);
		setNumber(number);
		setAddress(address);
	}	
	//getters
	protected final String getContactID() {
		return contactID;
	}
	
	protected final String getFirstName() {
		return firstName;
	}
	
	protected final String getLastName() {
		return lastName;
	}
	
	protected final String getNumber() {
		return number;
	}
	
	protected final String getAddress() {
		return address;
	}
		
	//setters with exceptions
	protected void setFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException("First name must not be empty.");
		}
		else if (firstName.length()>10) {
			throw new IllegalArgumentException("First name must nhave less than 10 characters.");
		}
		else {
			this.firstName = firstName;
		}
	}
	
	
	protected void setLastName(String lastName) {
		if(lastName == null) {
			throw new IllegalArgumentException("Field cannot be empty.");
		}
		else if(lastName.length()>10) {
			throw new IllegalArgumentException("Name must be less than 10 characters.");
		}
		else {
			this.lastName = lastName;
		}
		
		
	}
	protected void setNumber(String number) {
		String regexTest = "[0-9]+";
		if(number == null){
			throw new IllegalArgumentException("Number cannot be empty.");
		}
		else if(!(number.length()==10)) {
			throw new IllegalArgumentException("Number must have a length of 10 digits.");
		}
		else if(!(number.matches(regexTest))) {
			throw new IllegalArgumentException("Only numbers are allowed for phone numbers.");
		}
		else{
			this.number = number;
		}
	}
	
	public void setAddress(String address) {
		if(address == null){
			throw new IllegalArgumentException("Address field be filled out.");
		}
		else if(address.length()>30) {
			throw new IllegalArgumentException("Address max length is 30 characters.");
		}
		else {
			this.address = address;
		}
	}
	public void setContactID(String contactID) {
		if(contactID == null) {
			throw new IllegalArgumentException("ContactID cannot be empty.");
		}
		else if (contactID.length()>10) {
			throw new IllegalArgumentException("ContactID must be shorter than 10 digits.");
		}
		
		else{
			this.contactID = contactID;
		}
	}
}
