package exceptions;

public class InvalidNameException extends RuntimeException{
	
	@Override
	public String toString()
	{
		return getClass()+": Name first letter should be capital letter";
	}
	
	

}
