package littlewu.classroom.practice;



public class Dog implements IWeightable{
	private String name;
	private double weight;
	
	public Dog() {
		super();
	}

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void getWeightMethod() {
		System.out.println("體重計秤得 " + this.getName() + "重量是" + this.getWeight() + "公斤");
	}
	
	
}
