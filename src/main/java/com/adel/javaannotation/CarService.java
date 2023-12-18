package com.adel.javaannotation;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class CarService {

	public void processCar(final Object ob){
		Class<?> clazz = ob.getClass();

		Arrays.stream(clazz.getDeclaredFields())
						.filter(f->f.isAnnotationPresent(AnnoField.class))
						.peek(System.out::println);

		Arrays.stream(clazz.getDeclaredMethods())
						.filter(f ->f.isAnnotationPresent(AnnoMethod.class))
						.forEach(method -> {
							method.setAccessible(true); //execute private methods
							try {
								method.invoke(ob);
							} catch (IllegalAccessException | InvocationTargetException e) {
								e.printStackTrace();
							}
						});
	}

}
