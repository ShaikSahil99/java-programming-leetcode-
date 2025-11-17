package mistakes;
public class InvalidLoginException extends Exception
{
	public InvalidLoginException(String nature)
	{
		super(nature);
	}
}