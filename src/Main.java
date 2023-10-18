public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(550);
        boss.setDamage(135);
        boss.weapon.setWeaponType(WeaponType.VODNOE);
        boss.weapon.setWeaponName("Gun");
        System.out.println("HEALTH: " + boss.getHealth() + "\nDAMAGE: " + boss.getDamage() +
                "\nWEAPONTYPE: " + boss.weapon.getWeaponType() + "\nWEAPONNAME: " + boss.weapon.getWeaponName());
    }
}