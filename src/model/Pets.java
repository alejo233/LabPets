package model;

public class Pets {

	public static String FEMALE = "Female";
	public static String MALE = "Male";
	private String id;
	private String name;
	private String birthdate;
	private String gender;
	private String typePet;
	
	
	public Pets(String id, String name, String birthdate, String gender, String typePet) {
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.typePet = typePet;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public String getGender() {
		return gender;
	}


	public String getTypePet() {
		return typePet;
	}
	
	
	
	
}
