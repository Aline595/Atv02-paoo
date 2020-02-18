package atv_02;

public abstract class Character {

    WeaponBeharvior weapon;

    public void fight() {
        System.out.println("Lutando. ");
    }

    public void setWeapon(WeaponBeharvior w) {
        this.weapon = w;
    }

}
