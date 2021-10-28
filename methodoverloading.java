package task;

class animal{
	public void dog(int a) {
		System.out.println(a);
	}
	public void dog(int a,int b) {
		System.out.println(a+b);	
	}
}


public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal obj=new animal();
		obj.dog(5,7);
		

	}

}
