package BasicAssignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//153 => 1*1*1 5*5*5 3*3*3 = 1+125+27 = 153
		//370 => 3*3*3 7*7*7 0 = 27+343+0 = 370
		int n = 9474;
		int temp = n;
		int r, sum = 0;
		
		int num=n;
		int count=0;
		while(num>0) {
			num=num/10;
			System.out.println("num:"+num);
			count++;
		}
		
		while(n>0) {
			r = n%10; //reminder
			System.out.println("r:"+r);
			n = n/10;// last number
			System.out.println("n:"+n);
			//sum=sum+(r*r*r*r);
			sum = (int)(sum + Math.pow(r, count));
			System.out.println("sum:"+sum);
		}
		
		if(sum==temp) {
			System.out.println("It is an armstrong number");
		}else {
			System.out.println("Not an armstrong number");
		}
	}

}
