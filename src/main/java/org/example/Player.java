package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;


    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        this.healthPercentage = (healthPercentage > 100) ? 100 : (healthPercentage < 0) ? 0 : healthPercentage;
    }


    public int getHealthPercentage() {
        return healthPercentage;
    }


    public int healthRemaining() {
        return healthPercentage;
    }


    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage < 0) {
            healthPercentage = 0;
        }
        if (healthPercentage == 0) {
            System.out.println(String.format("%s player has been knocked out of game", name)); // Cleaner format
        }
    }

    // Method to restore health. If health exceeds 100, it's set to 100.
    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }
}