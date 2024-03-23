public class Vector {
    public int x;
    public int y;
    public int z;

    Vector(int xx, int yy, int zz) {
        x = xx;
        y = yy;
        z = zz;
    }

    Vector addVector(Vector a, Vector b) {
        Vector c = new Vector(0,0,0);
        c.x = a.x + b.x;
        c.y = a.y + b.y;
        c.z = a.z + b.z;
        return c;
    }

    Vector subVector(Vector a, Vector b) {
        Vector c = new Vector(0,0,0);
        c.x = a.x - b.x;
        c.y = a.y - b.y;
        c.z = a.z - b.z;
        return c;
    }

    Vector mulVectorWithConstan(Vector a, int q){
        Vector c = new Vector(0,0,0);
        c.x = c.x*q;
        c.y = c.y*q;
        c.z = c.z*q;
        return c;
    }

    int mulVector(Vector a, Vector b) {
        return a.x*b.x + a.y*b.y + a.z+b.z;
    }

}
