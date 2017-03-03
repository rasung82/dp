package com.lecture.dp.template;

public class Warrior extends Character {

	@Override
	protected void prepareWeapon() {
		System.out.println("검을 닦습니다.");

	}

	@Override
	protected void prepareArmor() {
		System.out.println("갑옷을 입습니다.");
	}

}
