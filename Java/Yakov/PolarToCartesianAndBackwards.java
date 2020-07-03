public class PolarToCartesianAndBackwards {
    private double x,y;
    private boolean z;
    public PolarToCartesianAndBackwards(boolean z0, double xOrLength, double yOrAngle){
        x = xOrLength;
        y = yOrAngle;
        z = z0; //false is Cartesian, true is polar
    }

    private void cartesiantopolar(){ //convert Cartesian to Polar
        if (!z) {
            double l = Math.sqrt(x * x + y * y);
            double angle = Math.signum(y) * Math.acos(x / l);
            x = l;
            y = angle* 180/ Math.PI;
            z = true;
        }
    }
    private void polartocarthesian(){ //convert Polar to Cartesian
        if (z) {
            double x1 = Math.cos(y * Math.PI / 180) * x;
            double y1 = Math.sin(y * Math.PI / 180) * x;
            x = x1;
            y = y1;
            z = false;
        }
    }

    public double getCartesianX(){ //get Cartesian x
        if (z){
            polartocarthesian();
        }
        return x;
    }

    public double getCartesianY(){ //get Cartesian y
        if (z){
            polartocarthesian();
        }
        return y;
    }


    public double getPolarRadius(){  //get Polar length
        if (!z){
            cartesiantopolar();
        }
        return x;
    }


    public double getPolarAngle(){ //get Polar radius
        if (!z){
            cartesiantopolar();
        }
        return y;
    }


}
