package org.d8.domain;

public class Weather {

	// 데이터클래스

	// 날짜
	public int date;
	// 최고,최저온도
	public double max;
	public double min;
	// 강수량
	public int rainAmount;

	// 생성자 함수 -> new 메모리 공간에 구조 만들고 채운다
	public Weather(int date, double max, double min) {

		this(date, max, min, 0); // this의 두번째 용도 => 다른 생성자 함수를 소환할 때 -> this( parameter ) 사용

	}

	public Weather(int date, double max, double min, int rainAmount) {
		this.date = date;
		this.max = max;
		this.min = min;
		this.rainAmount = rainAmount;
	}

	public int getDailyCross() {
		return (int) (this.max - this.min);
	}

	@Override
	public String toString() {
		return "Weather [date=" + date + ", max=" + max + ", min=" + min + ", rainAmount=" + rainAmount + "]";
	}

}