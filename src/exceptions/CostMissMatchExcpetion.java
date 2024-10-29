package exceptions;

public class CostMissMatchExcpetion extends RuntimeException{
	
	@Override
	public String toString()
	{
		return getClass()+": cost is not matched with data in database";
	}

}
