/**
 * Created by rtbkit on 8/3/17.
 */
public class DistanceCalculator {



    public static final double MEAN_RADIUS_OF_EARTH = 6371.00507;//in kilometers
    public static final double LAT_X = 90;
    public static final double LONG_X = 0;
    public static final double LAT_Y = 0;
    public static final double LONG_Y = 30;
    public static final double LAT_Z = 0;
    public static final double LONG_Z = 120;

    //calculate the distance between two points with given their lat/long.
    public double calculateDistance(double lat1, double long1, double lat2,
                                    double long2) {


        double baseLatitude = lat1;
        double baseLongitude = long1;

        //http://www.movable-type.co.uk/scripts/latlong.html

        double dLat = Math.toRadians((lat2 - baseLatitude));
        double dLon = Math.toRadians((long2 - baseLongitude));
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(baseLatitude)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = MEAN_RADIUS_OF_EARTH * c;
        //return ((new BigDecimal(d)).setScale(2, BigDecimal.ROUND_HALF_UP));
        return d;
    }
    //following three methods
    //calculate the distance between a fix point to the given point.
    //This is to optimize the typical distance targating logic.
    public double calculateXDistance(double lat1, double long1) {

        return calculateDistance(LAT_X,LONG_X,lat1,long1);
    }
    public double calculateYDistance(double lat1, double long1) {

        return calculateDistance(LAT_Y,LONG_Y,lat1,long1);
    }
    public double calculateZDistance(double lat1, double long1) {

        return calculateDistance(LAT_Z,LONG_Z,lat1,long1);
    }
}
