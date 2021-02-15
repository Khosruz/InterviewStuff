package com.Way_Of_Sorting;

import java.util.Comparator;

import com.Comparable.PersonDetails;

public class Countries implements Comparator<Countries>{
private Integer rank;
private String countryName;
private String continentName;
private String countryLanguage;


public Countries(Integer rank,String coutryName,String continentName,String countryLanguage){
	this.rank=rank;
	this.countryName=coutryName;
	this.continentName=continentName;
	this.countryLanguage=countryLanguage;
}

public Integer getRank() {
	return rank;
}
public String getCountryName() {
	return countryName;
}
public String getContinentName() {
	return continentName;
}
public String ggetCountryLanguage() {
	return countryLanguage;
}

public String getCountryLanguage() {
	return countryLanguage;
}


public String toString() {
	return "COUNTRIES [ RANKING : " + rank+ ", NAME : "+
countryName+ ", CONTINAENT : "+continentName+ " LANGUAGE : "+ countryLanguage+" ]";
}


@Override
public int compare(Countries c1, Countries c2) {
	// TODO Auto-generated method stub
	return c1.getCountryName().compareTo(c2.getCountryName());
}






}
