package mistakes;
public class CourseNotFoundException extends Exception
{
	public CourseNotFoundException(String nature)
	{
		super(nature);
	}
}