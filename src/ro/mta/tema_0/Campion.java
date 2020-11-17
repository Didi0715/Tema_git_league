package ro.mta.tema_0;

public class Campion {
    private String name;
    private String role;
    private int damage;
    private int movement_speed;

    public Campion(String name, String role, int damage, int movement_speed) {
        this.name = name;
        this.role = role;
        this.damage = damage;
        this.movement_speed = movement_speed;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getDamage() {
        return damage;
    }

    public int getMovement_speed() {
        return movement_speed;
    }


}
