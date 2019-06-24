package com.codingdojo.zookeeper;

public class Bat {
	 public void fly(){
	        this.setEnergy(this.getEnergy()-50);
	        System.out.println("The bat is hungry! Watch out!");
	    }

	    public void eatHumans(){
	        this.setEnergy(this.getEnergy()+25);
	        System.out.println("The bat ate a human! AH!");
	    }

	    public void attackTown(){
	        this.setEnergy(this.getEnergy()-100);
	        System.out.println("Oh no! The Bat has gone crazy and destroyed a city!");
	    }

	}
}
