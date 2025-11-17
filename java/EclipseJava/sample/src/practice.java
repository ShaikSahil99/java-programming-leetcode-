import java.util.*;
class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner me=new Scanner(System.in);
		Map<Integer,String> hm=new HashMap<>();
		hm.put(1, "hiii");
		hm.put(2, "huuu");
		hm.put(3, "hooo");
		for(Map.Entry<Integer, String> x : hm.entrySet())
		{
			System.out.println(x.getKey()+"   "+x.getValue());
		}
		Set<Integer> s=hm.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		Set s1=hm.entrySet();
		Iterator itr1=s1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next()+" ");
		}
		
		
	}

}
