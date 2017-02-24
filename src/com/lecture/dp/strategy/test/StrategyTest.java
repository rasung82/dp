package com.lecture.dp.strategy.test;

import com.lecture.dp.strategy.GameCharacter;
import com.lecture.dp.strategy.Knife;
import com.lecture.dp.strategy.Sword;

public class StrategyTest {

	
	
	/* 
	 * 1. Interface란 무엇인가 ? 
	 *  - 두 객체를 연결해주는 정점 
	 *  - 기능에 대한 선언과 구현을 분리  
	 *  - 기능을 사용하는 통로
	 * 
	 * 2. Delegate란 무엇인가 ?
	 *   - 어떤 기능을 구현할 때 그 책임을 다른 객체에게 떠 넘기는 것(위임)
	 * 
	 * 3. Strategy Pattern
	 *   - 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근점에서 서로 교환가능하도록 하는 패턴 
	 *   
	 */
	public static void main(String[] args) {
		
		GameCharacter character = new GameCharacter();
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();		
	}
	
}
