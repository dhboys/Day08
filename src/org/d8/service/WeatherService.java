package org.d8.service;

import java.util.Arrays;

import org.d8.domain.Weather;

public class WeatherService {

	// 의존성 주입 - 코드를 가지고 있으면 월이 바뀌면 데이터 바꿔야 하므로 나중에 유리하다

//	생성자를 만들어준 이유는 파라미터 제한을 위해서 -> 데이터클래스를 파라미터로 지정 안하면 이 Service가 진행 안되게.
//	BMI에서는 데이터클래스를 안만들어서 그냥 직접 입력하면 돼서 생성자를 안만들었다.

	Weather[] arr;
	
	public WeatherService(Weather[] arr) {
		
		this.arr = arr;
	}

	// 1. 메서드 선언 - 고객의 요구사항

	// 아래 메서드 들에서 Weather = 단위데이터 ex)주문

	// 가장 높은 온도의 날짜
	public Weather getHighestWeather() {
		Weather result = null;
		// 							람다식
		//Arrays.sort(this.arr, (d1,d2) -> d1.max - d2.max > 0 ? -1 : 1);
		Arrays.sort(this.arr, (d1,d2) -> d1.max - d2.max > 0 ? -1 : 1);
		
		result = arr[0];
		
		return result;
	}

	// 일교차가 제일 큰 날
	public Weather getHighestDailyCross() {
		Weather result = null;

		Arrays.sort(this.arr, (d1,d2) -> d1.getDailyCross() - d2.getDailyCross() > 0 ? -1 : 1);
		
		result = arr[0];
		
		return result;
	}

	// 특정한 날짜의 강수량
	public Weather getDateWeather(int date) {
		Weather result = null;

		Arrays.sort(this.arr, (d1,d2) -> d1.date - d2.date);
		
		result = arr[date-1];
		
		return result;
	}

}