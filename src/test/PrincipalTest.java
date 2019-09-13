package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import exceptions.ClubAlreadyRegisteredException;
import model.*;

class PrincipalTest {
	
	private Principal principalTest;
	
	
	public void stage() { 
		principalTest = new Principal();		
	}
	//test of sort by bubble sort
	@Test
	public void sortName() throws Exception  {
		stage();
		Club c1 = new Club("A092","Club1","12/10/65","Dog");
		Club c2 = new Club("A034","Club2","12/10/65","Cat");
		Club c3 = new Club("A032","Club3","12/10/65","Frog");
		Club c4 = new Club("A011","Club4","12/10/65","Bird");
		ArrayList<Club> expected = new ArrayList<Club>();
		expected.add(0,c1);
		expected.add(1,c2);
		expected.add(2,c3);
		expected.add(3,c4);
		principalTest.addClub(c1);
		principalTest.addClub(c2);
		principalTest.addClub(c3);
		principalTest.addClub(c4);
		principalTest.sortName(expected);
		assertEquals(expected, principalTest.getClub());
    }
	
//test of sort by insertion sort
	@Test
	public void sortDate() throws Exception  {
		stage();
		Club c1 = new Club("A092","Club1","12/10/65","Dog");
		Club c2 = new Club("A034","Club2","12/10/65","Cat");
		Club c3 = new Club("A032","Club3","12/10/65","Frog");
		Club c4 = new Club("A011","Club4","12/10/65","Bird");
		ArrayList<Club> expected = new ArrayList<Club>();
		expected.add(0,c1);
		expected.add(1,c2);
		expected.add(2,c3);
		expected.add(3,c4);
		principalTest.addClub(c1);
		principalTest.addClub(c2);
		principalTest.addClub(c3);
		principalTest.addClub(c4);
		principalTest.sortDate(expected);
		assertEquals(expected, principalTest.getClub());
    }
	
//test of sort by selection sort
	@Test
	public void sortByTypePet() throws Exception  {
		stage();
		Club c1 = new Club("A092","Club1","12/10/65","Dog");
		Club c2 = new Club("A034","Club2","12/10/65","Cat");
		Club c3 = new Club("A032","Club3","12/10/65","Frog");
		Club c4 = new Club("A011","Club4","12/10/65","Bird");
		ArrayList<Club> expected = new ArrayList<Club>();
		expected.add(0,c1);
		expected.add(1,c2);
		expected.add(2,c3);
		expected.add(3,c4);
		principalTest.addClub(c1);
		principalTest.addClub(c2);
		principalTest.addClub(c3);
		principalTest.addClub(c4);
		principalTest.sortByTypePet(expected);
		assertEquals(expected, principalTest.getClub());
    }	
	
	@Test
	public void sortById() throws Exception  {
		stage();
		Club c1 = new Club("A092","Club1","12/10/65","Dog");
		Club c2 = new Club("A034","Club2","12/10/65","Cat");
		Club c3 = new Club("A032","Club3","12/10/65","Frog");
		Club c4 = new Club("A011","Club4","12/10/65","Bird");
		ArrayList<Club> expected = new ArrayList<Club>();
		expected.add(0,c1);
		expected.add(1,c2);
		expected.add(2,c3);
		expected.add(3,c4);
		principalTest.addClub(c1);
		principalTest.addClub(c2);
		principalTest.addClub(c3);
		principalTest.addClub(c4);
		principalTest.sortById(expected);
		assertEquals(expected, principalTest.getClub());
    }	
	
	@Test
	public void addClub() throws ClubAlreadyRegisteredException   {
		stage();
		Club expected = new Club("A092","Club1","12/10/65","Dog");
		principalTest.addClub(expected);
		assertEquals(expected, principalTest.getClub().get(0));
	}
}
