 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCountryCodes {

  private CountryCodes fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new CountryCodes();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }
}

 /* @Test
  public void getMessage() {
    assertNotNull(fixture);
    assertEquals("hello world", fixture.getMessage());
  }

  @Test
  public void getMessage2() { // this test is broken - fix it!
    assertNull(fixture);
    assertEquals("hello world", fixture.getMessage());
  }

  @Test
  public void getYear() { // this test is OK, fix CountryCodes.java to make it pass!
    assertNotNull(fixture);
    assertEquals(2018, fixture.getYear());
  }
}
*/