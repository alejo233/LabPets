package exceptions;

public class ClubAlreadyRegisteredException  extends Exception{

	
	public ClubAlreadyRegisteredException() {
		super("There is already a Club registered with this name");
	}
}
