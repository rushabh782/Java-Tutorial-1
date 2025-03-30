package corejava;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		int num1 = 16;
		int num2 = 3;
		
//		//Arithmetic Operator(+,-,*/,%)
//		System.out.println(num1 + num2);
//		System.out.println(num1 - num2);
//		System.out.println(num1 * num2);
//		System.out.println(num1 / num2);
//		System.out.println(num1 % num2);
//		
//		//Comparison Operator(== ,<,<=,>, >=,!=)
//		//returns boolean value
//		System.out.println(num1 == num2);
//		System.out.println(num1 < num2);
//		System.out.println(num1 <= num2);
//		System.out.println(num1 > num2);
//		System.out.println(num1 >= num2);
//		System.out.println(num1 != num2);
//		
//		//Logical Operator( and - &&, or - ||, not - !)
//		System.out.println(num1 > num2  && num1 < num2);
//		System.out.println(num1 > num2  || num1 < num2);
//		System.out.println(!(num1 > num2  && num1 < num2));
//		
//		//Assignment operator: (=, +=, -=, *=, /=,%=, ++, --)
//		System.out.println(num1 += 10);
//		System.out.println(num1 -= 10);
//		System.out.println(num1 *= 3);
//		System.out.println(num1 /= 5);
//		System.out.println(num1 %= 2);
//		System.out.println(++num1);
//		System.out.println(num1++);
//		System.out.println(--num1);
//		System.out.println(num1--);
//		System.out.println(num1);
		
		//bitwise operator(and: &, or: |, not: ~, XOR : ^, left-shift: <<, right shift: >>)
		System.out.println(num1 & num2);//2
		System.out.println(num1 | num2);//3
		System.out.println(~num1);//-3
		System.out.println(num1^num2);//1
		System.out.println(num1<<3);//16
		System.out.println(num1 >> 3);
		
	}

}
