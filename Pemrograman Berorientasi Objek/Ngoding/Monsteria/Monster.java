public class Monster extends Entity implements Behavior {
    private int count = 1;

    public Monster(String name, int health, int attack, int defence) {
        super.setName(name);
        super.setHealth(health);
        super.setAttack(attack);
        super.setDefence(defence);
    }

    int attack(int defenceLawan) {
        System.out.println("The monster " + this.getName() + " attacks " + this.getName() + " with a normal attack");
        count++;
        int atk = super.getAttack() - defenceLawan;
        return atk;
    }

    @Override
    public int specialSkill() {
        System.out.println("The monster use special skill");
        count++;
        return super.getHealth() + super.getHealth() / 2;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean dead() {
        return super.getHealth() <= 0;
    }

    @Override
    void showEntity() {
        System.out.println("Monster: " + this.getName() + " | " + "Health: " + this.getHealth() + " | " + "Attack: "
                + this.getAttack() + " | " + "Defence: " + this.getDefence());
    }
}
