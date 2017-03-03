package com.lecture.dp.template;

public abstract class Character {

	
	public void readyToBattle(){
		startBodyTraning();
	
		prepareWeapon();
		
		prepareArmor();
		
		if(isUsingPerpareOther()){
			prepareOther();
		}
	}
	
	
	protected final void startBodyTraning(){
		System.out.println("체력을 단련합니다.");
	}
	
	
	protected abstract void prepareWeapon();
	
	
	protected abstract void prepareArmor();
	
	
	protected boolean isUsingPerpareOther(){
		return false;
	}
	
	
	protected void prepareOther(){};
	
}
