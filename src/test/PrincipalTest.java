package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.Club;
import model.Principal;

class PrincipalTest {
	
	private Principal principalTest;
	
	
	public void stage() {
	 ArrayList<Club>club = null;
	 
		principalTest = new Principal(club);		
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
