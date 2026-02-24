package Session11MiniProject;

public class Warrior extends GameCharacter implements ISkill {

    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public int attack(GameCharacter target) {
        return target.takeDamage(attackPower);
    }

    @Override
    public int takeDamage(int amount) {
        int realDamage = amount - armor;
        if (realDamage < 0) {
            realDamage = 0;
        }
        return super.takeDamage(realDamage);
    }

    @Override
    public int useUltimate(GameCharacter target) {
        int damage = attackPower * 2;
        int actualDamage = target.takeDamage(damage);

        int selfDamage = (int)(hp * 0.1);
        hp -= selfDamage;

        return actualDamage;
    }

    public int getArmor() {
        return armor;
    }
}