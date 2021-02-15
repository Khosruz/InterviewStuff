package com.Way_Of_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Process1 {



	
	public static void main(String[] args) {
		String [] sorting1 = {"USA", "CHINA", "BANGLADESH", "INDIA", "PAKISTAN", "NAPAL"};
		Arrays.sort(sorting1);
		String strSort = Arrays.deepToString(sorting1);
		System.out.println("String sorting: "+strSort);
		
		int[] sorting2 = {9,5,2,3,5,4,8,7,5,6,4,2};
		Arrays.sort(sorting2);
		String intSort = Arrays.toString(sorting2);
		System.out.println("Integer sorting : "+intSort);

		List<String> country = new ArrayList<>();
		country.add("Bangladesh");
		country.add("Russia");
		country.add("China");
		country.add("India");
		country.add("Bangladesh");
		country.add("Azarbizan");
		country.add("Afganistan");
		country.add("Pakistan");
		Collections.sort(country);
		country.forEach(System.out::println);
		
		
		Countries[ ] countriesList = new Countries[12];
		//List<Countries> countriesList = new ArrayList<Countries>();
		countriesList[0]= new Countries(5, "PAKISTAN", "ASIA", "URDO");
		countriesList[1]= new Countries(2, "GERMAN", "EUROP", "GERMAN");
		countriesList[2]= new Countries(4, "BRAZIL", "AMERICA", "PURTOGIES");
		countriesList[3]= new Countries(1, "USA", "AMERICA", "ENGLISH");
		countriesList[4]= new Countries(6, "INDIA", "ASIA", "HINDI");
		countriesList[5]= new Countries(3, "AUSTRELIA", "AUSTRELIA", "ENGLISH");
		countriesList[6]= new Countries(7, "CHINA", "ASIA", "CHINEES");
		countriesList[7]= new Countries(12, "JAPAN", "ASIA", "JAPANEES");
		countriesList[8]= new Countries(11, "ARGENTINA", "AMERICA", "PURTOGIES");
		countriesList[9]= new Countries(8, "MAXICO", "AMERICA", "SPANISH");
		countriesList[10]= new Countries(10, "FRANCE", "EUROP", "FRANCH");
		countriesList[11]= new Countries(9, "ENGLAND", "EUROP", "ENGLISH");
		
		Arrays.sort(countriesList);
		System.out.println("Countries were participae in FIFA 2018: "+Arrays.toString(countriesList));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	

	 

	
}
