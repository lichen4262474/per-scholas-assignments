package polymorphismandinheritance;

public class FireMonster extends Monster {

	FireMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return "Attack with fire!";

	}

}
