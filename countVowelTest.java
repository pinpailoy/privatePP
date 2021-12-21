import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class countVowelTest {

	countVowel test = new countVowel();
	@Before
	public void before() {
		System.out.println("please ");
	}
	@Test
	public void testCountVowel() {
		System.out.println("testCountVowel");
		assertEquals(2, countVowel.countVW( "Good" ));
		assertEquals(0, countVowel.countVW( "gg" ));
		assertEquals(0, countVowel.countVW( "" ));
		assertNotEquals(3, countVowel.countVW( "Tree!" ));
		
	}
	
	@Test
	public void testFindVowel() {
		char[] nn= {'a'};
		char[] n2= {'a','e','i'};
		char[] n3= {'A','A','A'};
		char[] n4= {'A','O','A'};
		System.out.println("testFindVowel");
		assertArrayEquals(nn , countVowel.sentVW( "a" ));
		assertArrayEquals(n2 , countVowel.sentVW( "aei" ));
		assertArrayEquals(n3 , countVowel.sentVW( "AAA" ));
		assertArrayEquals(n4 , countVowel.sentVW( "AOA" ));
	}
	
	

}
