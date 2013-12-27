package main.java.srm145;

import org.junit.Assert;
import org.junit.Test;

public class ImageDitheringTest {
	@Test
	public void testExample0() {
		String dithered = "BW";
		String[] screen = {"AAAAAAAA",
		 "ABWBWBWA",
		 "AWBWBWBA",
		 "ABWBWBWA",
		 "AWBWBWBA",
		 "AAAAAAAA"};
		
		int expected = 24;
		ImageDithering imageDithering = new ImageDithering();
		int actual = imageDithering.count(dithered, screen);
		
		Assert.assertEquals("Count does not match", expected, actual);
	}
	
	@Test
	public void testExample1() {
		String dithered = "BW";
		String[] screen = {"BBBBBBBB",
				 "BBWBWBWB",
				 "BWBWBWBB",
				 "BBWBWBWB",
				 "BWBWBWBB",
				 "BBBBBBBB"};
		
		int expected = 48;
		ImageDithering imageDithering = new ImageDithering();
		int actual = imageDithering.count(dithered, screen);
		
		Assert.assertEquals("Count does not match", expected, actual);
	}
	
	@Test
	public void testExample2() {
		String dithered = "ACEGIKMOQSUWY";
		String[] screen = {"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
				 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX"};
		
		int expected = 150;
		ImageDithering imageDithering = new ImageDithering();
		int actual = imageDithering.count(dithered, screen);
		
		Assert.assertEquals("Count does not match", expected, actual);
	}
	
	@Test
	public void testExample3() {
		String dithered = "CA";
		String[] screen = {"BBBBBBB",
				 "BBBBBBB",
		 "BBBBBBB"};
		
		int expected = 0;
		ImageDithering imageDithering = new ImageDithering();
		int actual = imageDithering.count(dithered, screen);
		
		Assert.assertEquals("Count does not match", expected, actual);
	}
	
	@Test
	public void testExample4() {
		String dithered = "DCBA";
		
		String[] screen = {"ACBD"};
		
		int expected = 4;
		ImageDithering imageDithering = new ImageDithering();
		int actual = imageDithering.count(dithered, screen);
		
		Assert.assertEquals("Count does not match", expected, actual);
	}
}
