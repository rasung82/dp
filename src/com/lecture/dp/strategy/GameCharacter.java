package com.lecture.dp.strategy;

public class GameCharacter {
	
	/** 접근점 */
	private Weapon weapon;

	
	/** 교환 가능 */
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	
	public void attack(){
		if(this.weapon == null){
			System.out.println("Attack by default");
		}else{
			this.weapon.attack(); /** 기능 위임 */
		}
	}
	
}
