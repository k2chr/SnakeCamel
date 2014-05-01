package snakecamel;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelase���e�X�g����() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "SnakeToCamel";
		String actual = scu.snakeToCamelcase("snake_to_camel");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnakease���e�X�g����() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Camel_To_Snake";
		String actual = scu.camelToSnakecase("CamelToSnake");
		assertThat(actual,is(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void capital�ŕ��������͂���Ȃ������Ƃ�IllegalArgumentException�𑗏o����() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		scu.capitalize("");
	}
	@Test(expected = IllegalArgumentException.class)
	public void uncapital�ŕ��������͂���Ȃ������Ƃ�IllegalArgumentException�𑗏o����() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		scu.uncapitalize("");
	}
	
	
}
