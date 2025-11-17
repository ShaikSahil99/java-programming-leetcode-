package mistakes;
public class InvalidGmailFormatException extends Exception
{
	public InvalidGmailFormatException(String nature)
	{
		super(nature);
	}
}