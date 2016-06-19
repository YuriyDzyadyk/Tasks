package com.epam.lab4;

import java.util.ArrayList;
import java.util.List;

public class LongestPlateau {

	public void calculation(int[] array) {
		List<Integer> plato = new ArrayList<Integer>();
		List<Integer> platoMax = new ArrayList<Integer>();
		int platoStart = array[0];
		int platoEndNumber = 0;
		for (int i = 1; i + 1 < array.length; i++) {
			if (array[i] > platoStart) {
				if (array[i] == array[i + 1]) {
					plato.add(array[i]);

				} else {
					if (plato.size() > platoMax.size()) {
						//так як однин зїдається підчас порівняння
						plato.add(array[i]);
						if(array[i+1]<array[i]){
						platoEndNumber=i;
						platoMax.removeAll(platoMax);
						platoMax.addAll(plato);
						}
						}
					plato.removeAll(plato);
					platoStart = array[i];
					// System.out.println(paletStart+" "+(i)+" if=");
				}
			} else {
				platoStart = array[i];
				// System.out.println(paletStart+" "+(i)+" if<");
			}
		}
		for (Integer integer : platoMax) {
				System.out.println(integer);
			}
		System.out.println("Lenght og longest Plateau is " + platoMax.size()+", and it is located between "+(platoEndNumber-(platoMax.size()-1)) +" and "+platoEndNumber);
		

	}
}
// int[] plato = new int[array.length];
// int counter=0;
// int max=0;
// int j = 0;
// int platoStart = array[0];
// int paletEnd = 0;
// for (int i = 1; i + 1 < array.length; i++) {
// if (array[i] > platoStart) {
// // System.out.println(array[i]+">"+paletStart);
// if (array[i] == array[i + 1]) {
// counter++;
// //не вистачає ще однієї цифри
// plato[j]=array[i];
// max = counter;
// System.out.println(plato[j]+" "+counter);
// j++;
// paletEnd=array[i + 1];//}
// } else {
// platoStart = array[i];
// counter=0;
// // System.out.println(paletStart+" "+(i)+" if=");
// //System.out.println(array[i]);
// }
// } else {
// platoStart = array[i];
// // System.out.println(paletStart+" "+(i)+" if<");
// }
// }
//
// if (counter > max) {
// max = counter;
// }
// System.out.println(paletEnd+"e");
// }
// }
