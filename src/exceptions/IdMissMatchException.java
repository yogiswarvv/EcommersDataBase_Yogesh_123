package exceptions;

public class IdMissMatchException extends RuntimeException{
	
	@Override
	public String toString()
	{
		return getClass()+": You entered is not matched with data availbale in data base";
	}

}
