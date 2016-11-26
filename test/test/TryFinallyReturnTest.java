package test;

public class TryFinallyReturnTest {

	public static void main(String[] args) {
		Temp temp = new Temp();
		
		change(temp);
		
		System.out.println(temp);
		
	}
	public static Temp change(Temp temp){
		
		try{
			temp.setAge(temp.getAge()+1);
			temp.setName("it'change just 1");
			
			return temp;
		}finally{
			temp.setAge( 88 );
			temp.setName("it's change int 2");
//			return temp;
		}
		
		
	}
}

class Temp{
	
	private int age=1;
	private String name = "man";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Temp [age=" + age + ", name=" + name + "]";
	}
	
	
	
}