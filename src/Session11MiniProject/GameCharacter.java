package Session11MiniProject;

public abstract class GameCharacter {

    protected String name;
    protected int hp;
    protected int attackPower;
    protected static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public abstract int attack(GameCharacter target);

    public int takeDamage(int amount) {
        int oldHP = hp;
        hp -= amount;
        if (hp < 0) {
            hp = 0;
        }
        return oldHP - hp;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public static int getCount() {
        return count;
    }
}