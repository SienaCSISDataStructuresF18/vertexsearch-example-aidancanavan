
/**
 * Class to represent one waypoint on a METAL TMG file.
 *
 * @author Aidan C
 * 
 */
public class Waypoint
{
    //instance variables
    private String label;
    private double lat;
    private double lng;
    
    //constructor for a waypoint
    public Waypoint(String label, double lat, double lng){
    this.label = label;
    this.lat = lat;
    this.lng = lng;
    }
    public double getLat(){return lat;}
    public double getLng(){return lng;}
    public String getLabel(){return label;}
    public String toString(){
    return label + " ("+lat+","+lng+")";
    }
}
