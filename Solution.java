import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums,int target)
  {
        int i=0;
        int j=1;
        int index=nums.length;
	System.out.println("index"+index);
        int[] val=new int[2];
       for(i=0;i<index;i++)
	{
	for(j=i+1;j<index;j++)
		{
               		 if(target==nums[i]+nums[j])
              		  {
                   			 val[0]=i;
                  			  val[1]=j;
             		System.out.println(i+","+j);
               		}
		}
	}
     return val;
    }
    public static void main(String arg[]) 
    { 
       int[] num=new int[5];
        int target;
        //int len;
        Solution s=new Solution();
        Scanner input = new Scanner(System.in);
       // System.out.println("enter the length of array");
      //  len=input.nextInt();
        System.out.println("enter the array");
        for(int i=0; i<5; i++){
           num[i]=input.nextInt();
        }
        System.out.println("enter target");
        target=input.nextInt();
        int[] a=s.twoSum(num,target);
        System.out.println(Arrays.toString(a));
    }
}