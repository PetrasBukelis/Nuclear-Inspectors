public class Direction {
    public double bearing;
    public void setBearing(double bearing)
    {
        this.bearing = bearing;
    }

    public String getDirection() {
        if (bearing >= 22.5 && bearing <= 67.5) {
            return "NE";
        }
        else if (bearing >= 67.5 && bearing <= 112.5) {
            return "E";
        }
        else if (bearing >= 112.5 && bearing <= 157.5) {
            return "SE";
        }
        else if (bearing >= 157.5 && bearing <= 202.5)
        {
            return "S";
        }
        else if (bearing >= 202.5 && bearing <= 247.5)
        {
            return "SW";
        }
        else if (bearing >= 247.5 && bearing <= 292.5)
        {
            return "W";
        }
        else if (bearing >= 292.5 && bearing <= 337.5)
        {
            return "NW";
        }
        else
            return "N";
    }
}

