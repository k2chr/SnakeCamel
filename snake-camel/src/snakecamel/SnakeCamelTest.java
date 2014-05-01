package snakecamel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelaseをテストする() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeToCamel";
		String actual = scu.snakeToCamelcase("snake_to_camel");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakeaseをテストする() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Camel_To_Snake";
		String actual = scu.camelToSnakecase("CamelToSnake");
		assertThat(actual,is(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void capitalで文字が入力されなかったときIllegalArgumentExceptionを送出する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		scu.capitalize("");
	}
	@Test(expected = IllegalArgumentException.class)
	public void uncapitalで文字が入力されなかったときIllegalArgumentExceptionを送出する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		scu.uncapitalize("");
	}
	
	
}
