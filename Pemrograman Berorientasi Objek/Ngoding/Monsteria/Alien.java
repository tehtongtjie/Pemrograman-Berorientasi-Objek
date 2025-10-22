class Alien extends Entity implements Behavior {
    private int count = 1;

    public Alien(String name, int health, int attack, int defence) {
        super.setName(name);
        super.setHealth(health);
        super.setAttack(attack);
        super.setDefence(defence);
    }

    int attack(int defenceLawan) {
        System.out.println("The alien " + this.getName() + " attacks " + this.getName() + " with a normal attack");
        count++;
        int atk = super.getAttack() - defenceLawan;
        return atk;
    }

    @Override
    public int specialSkill() {
        System.out.println("The alien " + this.getName() + " attacks " + this.getName() + " with a special attack");
        count++;
        return super.getAttack() * 2;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean dead() {
        return super.getHealth() <= 0;
    }

    @Override
    void showEntity() {
        System.out.println("Alien: " + this.getName() + " | " + "Health: " + this.getHealth() + " | " + "Attack: "
                + this.getAttack() + " | " + "Defence: " + this.getDefence());
    }
}
