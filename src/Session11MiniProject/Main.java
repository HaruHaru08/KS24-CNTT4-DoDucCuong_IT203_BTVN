package Session11MiniProject;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== ARENA OF HEROES ===");

        Warrior yasuo = new Warrior("Yasuo", 500, 50, 20);
        Mage veigar = new Mage("Veigar", 300, 40, 200);

        GameCharacter goblin = new GameCharacter("Goblin", 100, 10) {
            @Override
            public int attack(GameCharacter target) {
                return target.takeDamage(10);
            }
        };

        System.out.println("Đã khởi tạo " + GameCharacter.getCount() + " nhân vật tham gia đấu trường.\n");

        // 1
        System.out.println("1. [Chiến binh] Yasuo tấn công Goblin!");
        int damage1 = yasuo.attack(goblin);
        System.out.println("   -> Goblin mất " + damage1 + " máu. HP còn: " + goblin.getHP() + ".\n");

        // 2
        System.out.println("2. [Pháp sư] Veigar dùng chiêu cuối lên Yasuo!");
        int damage2 = veigar.useUltimate(yasuo);
        System.out.println("   -> Veigar tốn 50 mana. Yasuo mất " + damage2 + " máu.\n");

        // 3
        System.out.println("3. [Quái vật] Goblin (Anonymous Class) tấn công!");
        int damage3 = goblin.attack(veigar);
        System.out.println("   -> Goblin cắn trộm Veigar... Gây " + damage3 + " sát thương.\n");

        System.out.println("=== THÔNG SỐ SAU LƯỢT ĐẤU ===");

        System.out.println("Tên: Yasuo | HP: " + yasuo.getHP() + " | Giáp: " + yasuo.getArmor());
        System.out.println("Tên: Veigar | HP: " + veigar.getHP() + " | Mana: " + veigar.getMana());
        System.out.println("Tên: Goblin | HP: " + goblin.getHP());
    }
}