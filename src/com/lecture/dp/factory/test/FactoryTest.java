package com.lecture.dp.factory.test;

import com.lecture.dp.factory.HpItem;
import com.lecture.dp.factory.Item;
import com.lecture.dp.factory.ItemCreator;
import com.lecture.dp.factory.MpItem;

/**
 * FactoryMethod 패턴이란 ?
 * <br> 객체를 만들어내는 부분을 서브클래스(Sub-Class)에 위임하는 패턴. 즉, new 키워드를 호출하는 부분을 서브 클래스에 위임하는 것이다.
 * <br> 결국 팩토리 메서드 패턴은 객체를 만들어내는 공장을 만들어 내는 패턴이다. 
 * 
 * <p> FactoryMethod vs AbstractFactoryMethod
 *  
 * {@link} http://jdm.kr/blog/180
 * 
 */
public class FactoryTest {
	
	public static void main(String[] args) {
		ItemCreator creator = new ItemCreator();
		Item item = creator.create(HpItem.class.getCanonicalName());
		item.use();
		
		item = creator.create(MpItem.class.getCanonicalName());
		item.use();
	}

}
