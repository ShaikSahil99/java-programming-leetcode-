package mistakes;
public class InvalidMobileNumberException extends Exception
{
	public InvalidMobileNumberException(String nature)
	{
		super(nature);
	}
}