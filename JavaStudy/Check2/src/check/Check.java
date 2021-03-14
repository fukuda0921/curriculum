package check;


import Constants.Constants;
public class Check{
	
	private static final String lastName = "Fukuda";
    private static final String firstName = "Mitsuhiro";

    public static void main(String[] args) {
    	System.out.println("printNameメソッド"+""+"→"+printName(firstName,lastName));
    	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
    	pet.introduce();
    	RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
    	robotPet.introduce();
	}
    
    private static final String printName(String firstName,String lastName){
    	return lastName + firstName;	
    }
}