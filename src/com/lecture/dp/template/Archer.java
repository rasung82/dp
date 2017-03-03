package com.lecture.dp.template;

public class Archer extends Character {

	
	@Override
	protected void prepareWeapon() {
		System.out.println("활을 손질합니다.");
	}

	
	@Override
	protected void prepareArmor() {
	}

	
	@Override
	protected boolean isUsingPerpareOther() {
		return true;
	}

	
	@Override
	protected void prepareOther() {
		System.out.println("화살을 준비합니다.");
	}
	
}
