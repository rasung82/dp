package com.lecture.dp.factory;

public class ItemCreator {
	
	public Item create(String className){
		Object obj = null;

		try {
			Class<?> cls = Class.forName(className);
			obj = cls.newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (InstantiationException | IllegalAccessException e){
			System.out.println(e);
		}
		
		return (Item)obj;
	}

}
