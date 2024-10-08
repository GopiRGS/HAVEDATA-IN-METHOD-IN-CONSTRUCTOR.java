import java.util.Scanner;
class student{
	private int id;
	private String name;
	private float mark;
	private double bp;
	private double hra;
	private double da;
	public student(){

	}
	public void havedata(){
			Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter mark....");
			mark = sc.nextFloat();
			System.out.println("\nEnter id..");
			id = sc.nextInt();
			System.out.println("\nEnter name....");
	        name = sc.next();
			System.out.println("\nEnter bp");
			bp= sc.nextDouble();
			System.out.println("\nEnter hra");
			hra= sc.nextDouble();
			System.out.println("\nEnter da");
			da= sc.nextDouble();

		}
		public void display(){
			System.out.println("\nname is : "+name+"  "+"id is : "+id+"  "+"mark is : "+mark);
		}
		public void calculate(){
			System.out.println("net pay is : "+"  "+(bp+hra+da));
		}
	}

public class ex3{
	public static void main(String[] args){
		student s1 = new student();
		s1.havedata();
		s1.display();
		s1.calculate();
	}
}