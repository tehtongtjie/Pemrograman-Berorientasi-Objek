public abstract class Entity {
    private String name;
    private int health;
    private int attack;
    private int defence;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setHealth(int health) {
        this.health = health;
    }

    int getHealth() {
        return health;
    }

    void setAttack(int attack) {
        this.attack = attack;
    }

    int getAttack() {
        return attack;
    }

    void setDefence(int defence) {
        this.defence = defence;
    }

    int getDefence() {
        return defence;
    }

    abstract void showEntity();
}
