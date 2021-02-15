package com.NewComparable;

public class Countries implements Comparable<Countries>{
private Integer rank;
private String countryName;
private String continentName;
private String countryLanguage;


Countries(Integer rank,String coutryName,String continentName,String countryLanguage){
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
public int compareTo(Countries co) {
	// TODO Auto-generated method stub
	return this.getCountryLanguage().compareTo(co.getCountryLanguage());
}







}
