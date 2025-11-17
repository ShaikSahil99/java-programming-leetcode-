package sample;

class singleton {
	static singleton x;
	private singleton()
	{
		
	}
	static singleton getObj() {
		if(x==null)
		{
			x=new singleton();
			return x;
		}
	}
	class B
	{
	   public static void main(String[] args) {
		   singleton obj=singleton.getObj();
		   singleton obj1=singleton.getObj();
		   singleton obj2=singleton.getObj();
	   }
	}
}
