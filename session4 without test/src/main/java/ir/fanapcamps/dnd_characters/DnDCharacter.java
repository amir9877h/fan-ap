package ir.fanapcamps.dnd_characters;

import java.util.*;

class DnDCharacter {
    private final int strength, dexterity, constitution, intelligence, wisdom, charisma, hitpoints;

    public DnDCharacter() {
        this.strength = this.genAbility();
        this.dexterity = this.genAbility();
        this.constitution = this.genAbility();
        this.intelligence = this.genAbility();
        this.wisdom = this.genAbility();
        this.charisma = this.genAbility();
        this.hitpoints = this.modifier(this.constitution) + 10;
    }

    public int ability(List<Integer> scores) {
        return scores.stream().mapToInt(i -> i).sum() - Collections.min(scores);
    }

    public List<Integer> rollDice() {
        Random rand = new Random();
        List<Integer> rolls = new ArrayList();

        for (int i = 0; i < 4; i++)
            rolls.add(1 + rand.nextInt(6));

        return rolls;
    }

    private int genAbility() {
        return this.ability(this.rollDice());
    }

    public int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    public int getStrength() {
        return this.strength;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public int getConstitution() {
        return this.constitution;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public int getCharisma() {
        return this.charisma;
    }

    public int getHitpoints() {
        return this.hitpoints;
    }
}
