package exceptions;

public class ProductMissMatchException extends RuntimeException{
	
	@Override
	public String toString()
	{
		return getClass()+": You entered product name is not availble in data base";
	}

}
