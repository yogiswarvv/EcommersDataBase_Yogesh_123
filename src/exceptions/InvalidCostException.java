package exceptions;

public class InvalidCostException extends RuntimeException{

	@Override
	public String toString()
	{
		return getClass()+": Cost range must be in between 200 to 500";
	}
}
