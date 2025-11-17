package mistakes;
public class InvalidNameFormatException extends Exception
{
	public InvalidNameFormatException(String nature)
	{
		super(nature);
	}
}