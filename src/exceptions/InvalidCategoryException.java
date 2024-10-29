package exceptions;

public class InvalidCategoryException extends RuntimeException{
	
	@Override
	public String toString()
	{
		return getClass()+": Category must be Electronics or Clothing or Food";
	}

}
