package exception;


public class UserRegistration {
	
	public void registerProfile(String username, int age, String country) throws InvalidCountryException,InvalidAgeException{
		
		if(!country.equalsIgnoreCase("India")) {
			
			throw new InvalidCountryException("Cannot register user: "+username+ ".User outside India");
			
		}
		
		if (age <18) {
			
			throw new InvalidAgeException("Cannot register user: "+ username +". User below 18 years of age");
		}
		
		System.out.println("User: "+username+" registered successfully");
		
	}
	
	public static void main(String args[]) {
		
		UserRegistration registration = new UserRegistration();
		
        try {
            registration.registerProfile("John", 20, "USA");
        } catch (InvalidCountryException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            registration.registerProfile("Amar", 17, "India");
        } catch (InvalidCountryException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            registration.registerProfile("Raghu", 25, "India");
        } catch (InvalidCountryException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
	}


