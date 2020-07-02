
public class PToCAndBw {
    private double x,y;
    private boolean z;
    public PToCAndBw(boolean z0, double xOrLength, double yOrAngle){
        x = xOrLength;
        y = yOrAngle;
        z = z0; //false is Cartesian, true is polar
    }

    private void CtoP(){ //convert Carthesian to Polar
        if (!z) {
            double l = Math.sqrt(x * x + y * y);
            double angle = Math.signum(y) * Math.acos(x / l);
            x = l;
            y = angle;
            z = true;
        }
    }
    private void PtoC(){ //convert Polar to Carthesian
        if (z) {
            double x1 = Math.cos(y * Math.PI / 180) * x;
            double y1 = Math.sin(y * Math.PI / 180) * x;
            x = x1;
            y = y1;
            z = false;
        }
    }

    public double getCx(){ //get Cathesian x
        if (z){
            PtoC();
        }
        return x;
    }

    public double getCy(){ //get Carthesian y
        if (z){
            PtoC();
        }
        return y;
    }


    public double getPr(){  //get Polar length
        if (!z){
            CtoP();
        }
        return x;
    }


    public double getPAn(){ //get Polar radius
        if (!z){
            CtoP();
        }
        return y;
    }


}
