package org.d8.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.d8.domain.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WeatherServiceTests {

	WeatherService service;

	@BeforeEach
	void setUp() throws Exception {

		Weather[] arr = new Weather[31];

		arr[0] = new Weather(1, 38, 23, 0);
		arr[1] = new Weather(2, 37, 25, 0);
		arr[2] = new Weather(3, 37, 26, 0);
		arr[3] = new Weather(4, 35, 26, 0);
		arr[4] = new Weather(5, 35, 26, 0);
		arr[5] = new Weather(6, 35, 26, 0);
		arr[6] = new Weather(7, 35, 24, 0);
		arr[7] = new Weather(8, 33, 23, 48);
		arr[8] = new Weather(9, 32, 24, 0);
		arr[9] = new Weather(10, 34, 24, 0);
		arr[10] = new Weather(11, 35, 21, 0);
		arr[11] = new Weather(12, 34, 23, 2);
		arr[12] = new Weather(13, 34, 24, 27);
		arr[13] = new Weather(14, 34, 24, 0);
		arr[14] = new Weather(15, 36, 24, 0);
		arr[15] = new Weather(16, 32, 20, 0);
		arr[16] = new Weather(17, 30, 17, 0);
		arr[17] = new Weather(18, 30, 17, 0);
		arr[18] = new Weather(19, 35, 15, 0);
		arr[19] = new Weather(20, 30, 19, 0);
		arr[20] = new Weather(21, 30, 21, 12);
		arr[21] = new Weather(22, 33, 19, 0);
		arr[22] = new Weather(23, 27, 23, 2);
		arr[23] = new Weather(24, 24, 21, 23);
		arr[24] = new Weather(25, 29, 21, 1);
		arr[25] = new Weather(26, 30, 17, 0);
		arr[26] = new Weather(27, 31, 20, 0);
		arr[27] = new Weather(28, 30, 22, 27);
		arr[28] = new Weather(29, 23, 20, 384);
		arr[29] = new Weather(30, 30, 22, 1);
		arr[30] = new Weather(31, 29, 19, 1);

		service = new WeatherService(arr);
	}

	@Test
	void test1() {

		Weather weather = service.getHighestWeather();

		service.getHighestWeather();

		System.out.println(weather);
	}

	@Test
	void test2() {

		Weather weather = service.getHighestDailyCross();
		
		service.getHighestWeather();
		
		System.out.println(weather);
	}
	@Test
	void test3() {

		Weather weather = service.getDateWeather(3);
		
		service.getDateWeather(3);

		System.out.println(weather);
	}
}