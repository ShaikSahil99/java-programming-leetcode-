package puu;
class singleton{

	static singleton x;
	private singleton()
	{}
	static singleton getObj()
	{
		if(x==null)
		{
			x=new singleton();
			return x;
		
		}
	}
	class B
	{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			singleton s1=singleton.getObj();
			singleton s2=singleton.getObj();
			singleton s3=singleton.getObj();
		}
	}

}

