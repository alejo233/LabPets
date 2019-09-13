package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;




public class Club implements Comparable<Object>{
 
	private String idClub;
	private String name;
	private String date;
	private String type;
	private ArrayList <Owners> owners;
	
	public Club(String idClub, String name, String date, String type) {
		this.idClub = idClub;
		this.name = name;
		this.date = date;
		this.type = type;
		owners= new ArrayList<Owners>();
	}


	public String getIdClub() {
		return idClub;
	}


	public String getName() {
		return name;
	}


	public String getDate() {
		return date;
	}


	public String getType() {
		return type;
	}
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<Owners> leerArchivo() throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fIS = null;
		ObjectInputStream input = null;
		ArrayList<Owners> owner = null;
		try {

			fIS = new FileInputStream("./data/Jugador.dat");
			input = new ObjectInputStream(fIS);

			owner = (ArrayList<Owners>) input.readObject();

		} catch (FileNotFoundException e) {
			owner=new ArrayList<Owners>();
		  } catch (ClassNotFoundException e) {
	            System.out.println(e.getMessage());
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (fIS != null) {
	                	fIS.close();
	                }
	                if (input != null) {
	                    input.close();
	                }
	            } catch (IOException e) {
	                System.out.println(e.getMessage());
	            }
	        }	
		return owner;
	}
	
	public void serializarClub() throws FileNotFoundException, IOException, ClassNotFoundException{
		FileOutputStream fOS = null;
		ObjectOutputStream output = null;
		ArrayList<Owners> owner= leerArchivo();
		for (int i = 0; i <owner.size(); i++) {
			if(owner.get(i).getName().equalsIgnoreCase(owners.get(i).getName())) {
				owner.remove(i);
			}
		}
		owner.addAll(owners);

		try
		{
			fOS = new FileOutputStream("./data/Jugador.dat");
			output = new ObjectOutputStream(fOS);		
			output.writeObject(owner);
		}catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}finally
		{
			try {
				if (owner != null)
					fOS.close();
				if (output != null)
					output.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
	public int compareTo(Owners o) {
		Owners ow= (Owners)o;
		return name.compareTo(ow.getName());
	}
	
	
	public int compare(Owners a, Owners b) {
		return a.getId().compareTo(b.getId());
	}

	public int compare1(Owners a, Owners b) {
		return a.getLastName().compareTo(b.getLastName());
	}

	public int compare2(Owners a, Owners b) {
		return a.getBirthdate().compareTo(b.getBirthdate());
	}
	
	public int compare3(Owners a, Owners b) {
		return a.getTypePet().compareTo(b.getTypePet());
	}
	
	
	  //Selection Sort
	   public void sortByName(ArrayList<Owners> o) {
			for (int I = 0; I < o.size()-1; I++) {
				Owners minId = o.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < o.size(); J++) {
					Owners currentId = o.get(J);
					if(minId.compareTo(currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Owners tmp = o.get(minPosition);
				o.set(minPosition, o.get(I));
				o.set(I, tmp);
			}
		}
	   
	   //Selection Sort
	   public void sortById(ArrayList<Owners> o) {
			for (int I = 0; I < o.size()-1; I++) {
				Owners minId = o.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < o.size(); J++) {
					Owners currentId = o.get(J);
					if(compare(minId,currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Owners tmp = o.get(minPosition);
				o.set(minPosition, o.get(I));
				o.set(I, tmp);
			}
		}
	   

	   //Selection Sort
	   public void sortByLastName(ArrayList<Owners> o) {
			for (int I = 0; I < o.size()-1; I++) {
				Owners minId = o.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < o.size(); J++) {
					Owners currentId = o.get(J);
					if(compare1(minId,currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Owners tmp = o.get(minPosition);
				o.set(minPosition, o.get(I));
				o.set(I, tmp);
			}
		}
	   
	   //Selection Sort
	   public void sortByBirthdate(ArrayList<Owners> o) {
			for (int I = 0; I < o.size()-1; I++) {
				Owners minId = o.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < o.size(); J++) {
					Owners currentId = o.get(J);
					if(compare2(minId,currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Owners tmp = o.get(minPosition);
				o.set(minPosition, o.get(I));
				o.set(I, tmp);
			}
		}
	   
	   //Selection Sort
	   public void sortByTypePet(ArrayList<Owners> o) {
			for (int I = 0; I < o.size()-1; I++) {
				Owners minId = o.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < o.size(); J++) {
					Owners currentId = o.get(J);
					if(compare3(minId,currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Owners tmp = o.get(minPosition);
				o.set(minPosition, o.get(I));
				o.set(I, tmp);
			}
		}
	   
	   
	   public void addOwner( Owners o) throws Exception  {
			
			if(owners!=null) {
				
				for (int i = 0; i < owners.size();i++) {
					
					if(owners.equals(o.getId())) {
						throw new Exception(" there is already an owner registered with this id");
					}else {
						owners.add(o);
					}
				}
				
			}
		}
}
