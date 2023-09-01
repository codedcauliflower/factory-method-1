abstract class EnemyShip
{
    private String name;
    private double damageAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamageAmount() {
        return damageAmount;
    }

    public void setDamageAmount(double damageAmount) {
        this.damageAmount = damageAmount;
    }

    void displayEnemyShip(){
        System.out.println("\n" +
                "                              __    __    __\n" +
                "                             |==|  |==|  |==|\n" +
                "                           __|__|__|__|__|__|_\n" +
                "                        __|___________________|___\n" +
                "                     __|__[]__[]__[]__[]__[]__[]__|___\n" +
                "                    |............................o.../\n" +
                "                    \\.............................../\n" +
                "               hjw_,~')_,~')_,~')_,~')_,~')_,~')_,~')/,~')_");

        System.out.println("\n\n\nName: "+getName()+"\nDamage: "+getDamageAmount());
    }
}
