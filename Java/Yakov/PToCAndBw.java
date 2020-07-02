
public class PToCAndBw {
    private double x,y;
    private boolean z;
    public PToCAndBw(boolean z0, double x0, double y0){
        x = x0;
        y = y0;
        z = z0; //false is Cartesian, true is polar
    }

    private void CtoP(){
        if (!z) {
            double l = Math.sqrt(x * x + y * y);
            double angle = Math.signum(y) * Math.acos(x / l);
            x = l;
            y = angle;
            z = true;
        }
    }
    private void PtoC(){
        if (z) {
            double x1 = Math.cos(y * Math.PI / 180) * x;
            double y1 = Math.sin(y * Math.PI / 180) * x;
            x = x1;
            y = y1;
            z = false;
        }
    }

    public double getCx(){
        if (z){
            PtoC();
        }
        return x;
    }

    public double getCy(){
        if (z){
            PtoC();
        }
        return y;
    }


    public double getPr(){
        if (!z){
            CtoP();
        }
        return x;
    }


    public double getPAn(){
        if (!z){
            CtoP();
        }
        return y;
    }


}
