class singleton {
	static singleton x;
	private singleton()
	{
		
	}
	static singleton getObj() {
		if(x==null)
		{
			System.out.println(0);
			x=new singleton();
			return x;
		}
		else
		{
			return x;
		}
	}
}
class B
{
	   public static void main(String[] args) {
		   singleton obj=singleton.getObj();
		   singleton obj1=singleton.getObj();
		   singleton obj2=singleton.getObj();
			System.out.println(singleton.x);
	   }
}

