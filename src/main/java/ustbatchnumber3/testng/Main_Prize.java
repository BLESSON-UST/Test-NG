package ustbatchnumber3.testng;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main_Prize {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the city");
		String c=sc.next();
		System.out.println("Enter the square feet");
		int sqr=sc.nextInt();
		int pwm=1;
		int pwom=1;
		Prize c1 = new Prize("tvm", 1600,800);
		Prize c2 = new Prize("chni",1800,1000);
		Prize c3 = new Prize("mmbi",2500,1200);
		Prize c4 = new Prize("cohn",1800,1200);
		Prize c5 = new Prize("hyd",2000,900);
		List<Prize> details= Arrays.asList(c1,c2,c3,c4,c5);
		List<Prize> result=details.stream().filter(a->(a.getCity().equals(c))).toList();
		System.out.println(result);
		for(Prize i:result)
		{
			System.out.println("prize with m "+ i.getP_w_m1()*sqr);
			System.out.println("prize without m "+ i.getP_wo_m1()*sqr);
		}
		
		
	}

	
}
