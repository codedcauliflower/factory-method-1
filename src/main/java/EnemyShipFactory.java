public class EnemyShipFactory extends EnemyShip{
    EnemyShip makeEnemyShip(String ship, String name, double damage){
        switch(ship){
            case "rocket":
                return new RocketEnemyShip(name, damage);
            case "ufo":
                return new UFOEnemyShip(name, damage);
        }
        return null;
    }
}
