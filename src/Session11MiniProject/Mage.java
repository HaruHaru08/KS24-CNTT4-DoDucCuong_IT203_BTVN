package Session11MiniProject;

public class Mage extends GameCharacter implements ISkill {

    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public int attack(GameCharacter target) {
        if (mana >= 5) {
            mana -= 5;
            return target.takeDamage(attackPower);
        } else {
            return target.takeDamage(attackPower / 2);
        }
    }

    @Override
    public int useUltimate(GameCharacter target) {
        if (mana >= 50) {
            mana -= 50;
            return target.takeDamage(attackPower * 3);
        }
        return 0;
    }

    public int getMana() {
        return mana;
    }
}