package com.tiy;

import org.junit.Before;
import org.junit.Test;



import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by josh on 3/22/17.
 */
public class WarnUp2Test {
	private WarmUp2 warmUp2;
	@Before
	public void before(){
		warmUp2 = new WarmUp2();
	}


//Remove the Yak
	@Test
	public void testForYak1() throws Exception{
		String x = warmUp2.stringYak("Bakyakattack");
		assertThat(x, equalTo("Bakattack"));
	}
	@Test
	public void testForYak2() throws Exception{
		String x = warmUp2.stringYak("workarkya");
		assertThat(x, equalTo("workarkya"));
	}
	@Test
	public void testForYak3() throws Exception{
		String x = warmUp2.stringYak("yaksack");
		assertThat(x, equalTo("sack"));
	}
	@Test
	public void testForYak4() throws Exception{
		String x = warmUp2.stringYak("lacktackyak");
		assertThat(x, equalTo("lacktack"));
	}
	@Test
	public void testFor5() throws Exception{
		String x = warmUp2.stringYak("yakpak");
		assertThat(x, equalTo("pak"));
	}
	@Test
	public void testForYak6() throws Exception{
		String x = warmUp2.stringYak("xxxyakyyyakzzz");
		assertThat(x, equalTo("xxxyyzzz"));
	}

	@Test
	public void testForYak7() throws Exception{
		String x = warmUp2.stringYak("HiyakHi");
		assertThat(x, equalTo("HiHi"));
	}
	@Test
	public void testForYak8() throws Exception{
		String x = warmUp2.stringYak("");
		assertThat(x, equalTo(""));
	}
	@Test
	public void testForYak9() throws Exception{
		String x = warmUp2.stringYak("baklack");
		assertThat(x, equalTo("baklack"));
	}@Test
	public void testForYak10() throws Exception{
		String x = warmUp2.stringYak("yakxxxyak");
		assertThat(x, equalTo("xxx"));
	}


	//StringTimes
	@Test
	public void testStringTimes1() throws Exception{
		String x = warmUp2.stringTimes("Hi",1);
		assertThat(x, equalTo("Hi"));
	}
	@Test
	public void testStringTimes2() throws Exception{
		String x = warmUp2.stringTimes("Hi",2);
		assertThat(x, equalTo("HiHi"));
	}
	@Test
	public void testStringTimes3() throws Exception{
		String x = warmUp2.stringTimes("Hi",3);
		assertThat(x, equalTo("HiHiHi"));
	}
	@Test
	public void testStringTimes4() throws Exception{
		String x = warmUp2.stringTimes("x",4);
		assertThat(x, equalTo("xxxx"));
	}

	@Test
	public void testStringTimes5() throws Exception{
		String x = warmUp2.stringTimes("Hi",5);
		assertThat(x, equalTo("HiHiHiHiHi"));
	}

	@Test
	public void testStringTimes6() throws Exception{
		String x = warmUp2.stringTimes("code",3);
		assertThat(x, equalTo("codecodecode"));
	}

	@Test
	public void testStringTimes7() throws Exception{
		String x = warmUp2.stringTimes("code",2);
		assertThat(x, equalTo("codecode"));
	}


	//StringBits
	@Test
	public void testStringBits1() throws Exception{
		String x = warmUp2.stringBits("Hello");
		assertThat(x, equalTo("Hlo"));
	}
	@Test
	public void testStringBits2() throws Exception{
		String x = warmUp2.stringBits("Hi");
		assertThat(x, equalTo("H"));
	}
	@Test
	public void testStringBits3() throws Exception{
		String x = warmUp2.stringBits("Heeololeo");
		assertThat(x, equalTo("Hello"));
	}
	@Test
	public void testStringBits4() throws Exception{
		String x = warmUp2.stringBits("");
		assertThat(x, equalTo(""));
	}
	@Test
	public void testStringBits5() throws Exception{
		String x = warmUp2.stringBits("Greetings");
		assertThat(x, equalTo("Getns"));
	}
	@Test
	public void testStringBits6() throws Exception{
		String x = warmUp2.stringBits("Chocoate");
		assertThat(x, equalTo("Coot"));
	}
	@Test
	public void testStringBits7() throws Exception{
		String x = warmUp2.stringBits("pi");
		assertThat(x, equalTo("p"));
	}
	@Test
	public void testStringBits8() throws Exception{
		String x = warmUp2.stringBits("Hello Kitten");
		assertThat(x, equalTo("HloKte"));
	}
	@Test
	public void testStringBits9() throws Exception{
		String x = warmUp2.stringBits("hxaxpxpxy");
		assertThat(x, equalTo("happy"));
	}

	//stringSplosion
	@Test
	public void testSringSplosion1() throws Exception{
		String x = warmUp2.stringSplosion("Code");
		assertThat(x, equalTo("CCoCodCode"));
	}

	@Test
	public void testSringSplosion2() throws Exception{
		String x = warmUp2.stringSplosion("abc");
		assertThat(x, equalTo("aababc"));
	}

	@Test
	public void testSringSplosion3() throws Exception{
		String x = warmUp2.stringSplosion("ab");
		assertThat(x, equalTo("aab"));
	}

	@Test
	public void testSringSplosion4() throws Exception{
		String x = warmUp2.stringSplosion("x");
		assertThat(x, equalTo("x"));
	}

	@Test
	public void testSringSplosion5() throws Exception{
		String x = warmUp2.stringSplosion("fade");
		assertThat(x, equalTo("ffafadfade"));
	}

	@Test
	public void testSringSplosion6() throws Exception{
		String x = warmUp2.stringSplosion("There");
		assertThat(x, equalTo("TThTheTherThere"));
	}

	@Test
	public void testSringSplosion7() throws Exception{
		String x = warmUp2.stringSplosion("Kitten");
		assertThat(x, equalTo("KKiKitKittKitteKitten"));
	}

	@Test
	public void testSringSplosion8() throws Exception{
		String x = warmUp2.stringSplosion("Bye");
		assertThat(x, equalTo("BByBye"));
	}

	@Test
	public void testSringSplosion9() throws Exception{
		String x = warmUp2.stringSplosion("Good");
		assertThat(x, equalTo("GGoGooGood"));
	}

	@Test
	public void testSringSplosion10() throws Exception{
		String x = warmUp2.stringSplosion("Bad");
		assertThat(x, equalTo("BBaBad"));
	}

	@Test
	public void testSringSplosion11() throws Exception{
		String x = warmUp2.stringSplosion("");
		assertThat(x, equalTo(""));
	}



}
