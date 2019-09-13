package model;

import java.util.ArrayList;

public class Owners implements Comparable<Pets> {

	private String id;
	private String name;
	private String lastName;
	private String birthdate;
	private String typePet;
	ArrayList <Pets> pets;
	
	
	public Owners(String id, String name, String lastName, String birthdate, String typePet) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.typePet = typePet;
		pets=new ArrayList <Pets>();
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getLastName() {
		return lastName;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public String getTypePet() {
		return typePet;
	}


	public int compareTo(Owners owners) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addPets (Pets a) throws Exception {
		if(pets !=null ) {
			for (int i = 0; i < pets.size(); i++) {
				if(pets.get(i).getName().equals(a.getName())) {
					
				
					throw new Exception ("there is already a pet registered with this name");
				}	else {
						pets.add(a);
					}
				}
				
			}
		}


	@Override
	public int compareTo(Pets o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int compareId(Pets a, Pets b) {
		return a.getId().compareTo(b.getId());
	}
	
	public int compareName(Pets a, Pets b) {
		return a.getName().compareTo(b.getName());
	}
	
	public int compareBirthdate(Pets a, Pets b) {
		return a.getBirthdate().compareTo(b.getBirthdate());
	}
	
	public int compareGender(Pets a, Pets b) {
		return a.getGender().compareTo(b.getGender());
	}
	
	public int compareTypePet(Pets a, Pets b) {
		return a.getTypePet().compareTo(b.getTypePet());
	}
	
	   //Selection Sort
	   public void sortById(ArrayList<Pets> p) {
			for (int I = 0; I < p.size()-1; I++) {
				Pets minId = p.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < p.size(); J++) {
					Pets currentId = p.get(J);
					if(compareId(minId,currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Pets tmp = p.get(minPosition);
				p.set(minPosition, p.get(I));
				p.set(I, tmp);
			}
		}
	   
	 //Selection Sort
	   public void sortByName(ArrayList<Pets> p) {
			for (int I = 0; I < p.size()-1; I++) {
				Pets minId = p.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < p.size(); J++) {
					Pets currentId = p.get(J);
					if(compareName(minId,currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Pets tmp = p.get(minPosition);
				p.set(minPosition, p.get(I));
				p.set(I, tmp);
			}
		}
	   
		 //Selection Sort
	   public void sortBirthdate(ArrayList<Pets> p) {
			for (int I = 0; I < p.size()-1; I++) {
				Pets minId = p.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < p.size(); J++) {
					Pets currentId = p.get(J);
					if(compareBirthdate(minId,currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Pets tmp = p.get(minPosition);
				p.set(minPosition, p.get(I));
				p.set(I, tmp);
			}
		}
	   
		 //Selection Sort
	   public void sortByGender(ArrayList<Pets> p) {
			for (int I = 0; I < p.size()-1; I++) {
				Pets minId = p.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < p.size(); J++) {
					Pets currentId = p.get(J);
					if(compareGender(minId,currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Pets tmp = p.get(minPosition);
				p.set(minPosition, p.get(I));
				p.set(I, tmp);
			}
		}
	   
		 //Selection Sort
	   public void sortByTypePet(ArrayList<Pets> p) {
			for (int I = 0; I < p.size()-1; I++) {
				Pets minId = p.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < p.size(); J++) {
					Pets currentId = p.get(J);
					if(compareTypePet(minId,currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Pets tmp = p.get(minPosition);
				p.set(minPosition, p.get(I));
				p.set(I, tmp);
			}
		}
	   
	  
}
	   
