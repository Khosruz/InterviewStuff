package com.NewComparable;


import java.util.Arrays;
import com.Way_Of_Sorting.Countries;


public class FIFA extends Countries{
 

	public FIFA(Integer rank, String coutryName, String continentName, String countryLanguage) {
		super(rank, coutryName, continentName, countryLanguage);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Countries[] countriesList = new Countries[12];
		countriesList[0]= new Countries(5, "PAKISTAN", "ASIA", "URDO");
		countriesList[1]= new Countries(2, "GERMAN", "EUROP", "GERMAN");
		countriesList[2]= new Countries(4, "BRAZIL", "AMERICA", "PURTOGIES");
		countriesList[3]= new Countries(1, "USA", "AMERICA", "ENGLISH");
		countriesList[4]= new Countries(6, "INDIA", "ASIA", "HINDI");
		countriesList[5]= new Countries(3, "AUSTRELIA", "AUSTRELIA", "ENGLISH");
		countriesList[6]= new Countries(7, "CHINA", "ASIA", "CHINEES");
		countriesList[7]= new Countries(12, "JAPAN", "ASIA", "JAPANEES");

		
		Arrays.sort(countriesList);
	    System.out.println("Countries were participae in FIFA 2018: "+Arrays.toString(countriesList));
		   
	}


}
