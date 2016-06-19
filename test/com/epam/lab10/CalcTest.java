package com.epam.lab10;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd() {
		Calc calc = new Calc(); 
		assertEquals(7, calc.add(2, 5));
	}

	@Test
	public void testMult() {
		Calc calc = new Calc(); 
		assertEquals(10, calc.mult(2, 5));
	}

	
	@Test
	public void testDev() throws NoSuchMethodException,
    InvocationTargetException, IllegalAccessException{
		Calc calc = new Calc(); 
	
		Method method = Calc.class.getDeclaredMethod("dev", int.class,int.class);
        method.setAccessible(true);
 //       method.invoke(calc, 10,5); --запускає в дію приватний метод
        System.out.println(method.invoke(calc, 10,5));
		assertEquals(2, method.invoke(calc, 10,5));
		
		}

	@Test
	public void testAddToList() {
		
		Calc calc = new Calc(); 
		List list = new ArrayList();
		calc.addToList(list, 5);
		int expected = 1;
		int actual = list.size();
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCreate() {
		
		Calc calc = new Calc(); 
		List<Integer> list = calc.createList();

		assertNotNull(list);
		
	}
	
}