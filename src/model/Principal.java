package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal implements Comparator<Object>{
 private ArrayList<Club>club;

	public Principal(ArrayList<Club> club) {
		this.club = club;
	}
	
	
	public ArrayList<Club> getClub() {
		return club;
	}


	public void setClub(ArrayList<Club> club) {
		this.club = club;
	}


	@Override
	public int compare(Object a, Object b) {
		// TODO Auto-generated method stub
		Club c1=(Club)a;
		Club c2=(Club)b;
		return c1.getName().compareTo(c2.getName());
	}
	 
	public int compare1(Club a, Club b) {
		return a.getDate().compareTo(b.getDate());
	}
	
	public int compare2(Club a, Club b) {
		return a.getIdClub().compareTo(b.getIdClub());
	} 
	
	public int compare3(Club a, Club b) {
		return a.getType().compareTo(b.getType());
	}

  //bubble sort
	public void sortName(ArrayList<Club> c) {
		Club tmp;
		for (int i = 0; i < c.size()-1; i++) {
			for (int j = 0; j < c.size()-i-1; j++){				
				if(compare(c.get(j),c.get(j+1))==1) {
					 tmp=c.get(j);
					 c.set(j,c.get(j+1));
					 c.set(j+1, tmp);
					
				}
			}
		}
	}
	
	//insertion sort
		public  void sortDate(ArrayList<Club> c){
		    for (int p = 1; p < c.size(); p++){ 
		              Club aux = c.get(p); 
		             int  j = p ;
		              while (j>0 && compare1(c.get(j-1),aux)==1) { 		                                                    
		            	  c.set(j, c.get(j-1));   
		                   j--;                  
		              }
		              c.set(j,aux);
		    }
		}
		
   //Selection Sort
	   public void sortById(ArrayList<Club> c) {
			for (int I = 0; I < c.size()-1; I++) {
				Club minId = c.get(I);
				int minPosition = I;
				
				for (int J = I+1; J < c.size(); J++) {
					Club currentId = c.get(J);
					if(compare2(minId,currentId)==1) {
						minId = currentId;
						minPosition = J;
					}
				}
				
				Club tmp = c.get(minPosition);
				c.set(minPosition, c.get(I));
				c.set(I, tmp);
			}
		}
	   
	
		
	   //Selection Sort
		   public void sortByTypePet(ArrayList<Club> c) {
				for (int I = 0; I < c.size()-1; I++) {
					Club minId = c.get(I);
					int minPosition = I;
					
					for (int J = I+1; J < c.size(); J++) {
						Club currentId = c.get(J);
						if(compare3(minId,currentId)==1) {
							minId = currentId;
							minPosition = J;
						}
					}
					
					Club tmp = c.get(minPosition);
					c.set(minPosition, c.get(I));
					c.set(I, tmp);
				}
			}
		   
		   
      public  void crearArchivo(ArrayList<Club> c) {
         FileWriter fw = null;
		   try {
					
		    fw = new FileWriter(""); 
					
			  BufferedWriter bfw = new BufferedWriter(fw);
			  for (Club clubes : club) {
						
			   bfw.write(clubes.getIdClub() + "," + clubes.getName()+ "," + clubes.getDate()
					+ "," +clubes.getType() + ","  + "\n");
					}
				
			      bfw.close();
			      System.out.println("The file was created successfully. ");
		 
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (fw != null) {
						try {
							fw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
      }
      
      


	   
	
}
