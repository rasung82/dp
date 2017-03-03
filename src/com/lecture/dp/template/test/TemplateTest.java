package com.lecture.dp.template.test;

import com.lecture.dp.template.Archer;
import com.lecture.dp.template.Character;
import com.lecture.dp.template.Warrior;
import com.lecture.dp.template.Wizard;

/**
 * TemplateMethod 패턴이란 ?
 * a 
 *
 *
 * {@link} http://jdm.kr/blog/116
 */
public class TemplateTest {
	
	public static void main(String[] args) {
		
		Character warrior = new Warrior();
		warrior.readyToBattle();
		
		Character archer = new Archer();
		archer.readyToBattle();
		
		Character wizard = new Wizard();
		wizard.readyToBattle();
		
	}	

}
