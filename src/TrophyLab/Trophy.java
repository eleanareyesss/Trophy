
package TrophyLab;

/**
 *
 * @author elean
 */
public enum Trophy {
    PLATINO("PLATINO",5), ORO("ORO",3), PLATA("PLATA",2), BRONCE("BRONCE",1);

    public int points;
    public String type;

    Trophy(String type, int points) {
        this.type = type;
        this.points = points;
    }
    
    public String getType() {
        return type;
    }

    public int getPoints() {
        return points;
    }
}
