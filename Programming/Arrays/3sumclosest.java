import java.util.*;
class A
{ 
	public static int threeSumClosest(int[] nums, int target) 
	{
        	Arrays.sort(nums);
        	int closestSum=Integer.MAX_VALUE/2;
        	int i=0;
        	for(i=0;i<nums.length;i++)
        	{
            		if(i>0 && nums[i]==nums[i-1])
            		{
				System.out.println(i+"  ");
               	 		continue;
            		}
        	}
        	int j=i+1;
        	int k=nums.length-1;
		System.out.print(i+"   "+j+"     "+k);

        	while(j<k)
        	{
            		int curSum=nums[i]+nums[j]+nums[k];
			System.out.print(curSum+"   "+target+"     "+closestSum);
            		if(Math.abs(curSum-target)<Math.abs(closestSum-target))
            		{
			
                    		closestSum=curSum;
				
            		}
            		if(curSum==target)
            		{
                		return curSum;
            		}
            		if(curSum>target)
            		{
                		k--;
            		}
            		if(curSum<target)
            		{
                		j++;
            		}
        	}
        	return closestSum;
	}
	public static void main(String[]args)
	{
		int a[]={-1,2,1,-4};
		int target=1;
		System.out.print(threeSumClosest(a,target)); 
	}

}