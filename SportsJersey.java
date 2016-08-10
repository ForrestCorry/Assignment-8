package com.ssa.assignemnt.day8;

public class SportsJersey extends Clothing {
	
	
	public String team = null;
	public String sport = null;
	public String nameOnBack = null;
	public String teamLogo = null;
	public String primaryColor = null;
	public String secondaryColor = null;
	public String size = null;
	public String fabric = null;
	public String sleeveLength = null;
	public String homeOrAway = null;
	public int numberOnBack = 0;
	
	
	
	
	
	
	public SportsJersey() {
		
	}
	
	public SportsJersey(String team, String sport, String nameOnBack, String teamLogo, String primaryColor,
			String secondaryColor, String size, String fabric, String sleeveLength, String homeOrAway,
			int numberOnBack) {
		super();
		this.team = team;
		this.sport = sport;
		this.nameOnBack = nameOnBack;
		this.teamLogo = teamLogo;
		this.primaryColor = primaryColor;
		this.secondaryColor = secondaryColor;
		this.size = size;
		this.fabric = fabric;
		this.sleeveLength = sleeveLength;
		this.homeOrAway = homeOrAway;
		this.numberOnBack = numberOnBack;
	}


	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getNameOnBack() {
		return nameOnBack;
	}

	public void setNameOnBack(String nameOnBack) {
		this.nameOnBack = nameOnBack;
	}

	public String getTeamLogo() {
		return teamLogo;
	}

	public void setTeamLogo(String teamLogo) {
		this.teamLogo = teamLogo;
	}

	public String getPrimaryColor() {
		return primaryColor;
	}

	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

	public String getSecondaryColor() {
		return secondaryColor;
	}

	public void setSecondaryColor(String secondaryColor) {
		this.secondaryColor = secondaryColor;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public String getSleeveLength() {
		return sleeveLength;
	}

	public void setSleeveLength(String sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getHomeOrAway() {
		return homeOrAway;
	}

	public void setHomeOrAway(String homeOrAway) {
		this.homeOrAway = homeOrAway;
	}

	public int getNumberOnBack() {
		return numberOnBack;
	}

	public void setNumberOnBack(int numberOnBack) {
		this.numberOnBack = numberOnBack;
	}

	@Override
	public void fabricType() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void qualityLevel() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void typeOfClothing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Your Jersey specs are as follows,\n"
				+ "Fabric: " + fabric + "\n"
				+ "Sport: " + sport + "\n"
				+ "Team: " + team + "\n" 
				+ "Team Logo: " + teamLogo + "\n"
				+ "Home Or Away: " + homeOrAway + "\n"
				+ "Sleeve Length: " + sleeveLength + "\n"
				+ "Size: " + size + "\n"
				+ "Primary Color: " + primaryColor + "\n"
				+ "Secondary Color: " + secondaryColor + "\n"
				+ "Writing on back: " + nameOnBack + "\n"
				+ "Number: " + numberOnBack + "\n"
				+ "Thank you!! Your " + team + " Jersey is on it's way!";
	}
	
	
	

}
