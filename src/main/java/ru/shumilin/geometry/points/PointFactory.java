package ru.shumilin.geometry.points;

public class PointFactory {
    public Point createPoint(int... args){
        if(args.length < 2 || args.length > 3 ) throw new IllegalArgumentException();

        return args.length == 2 ?
                new Point(args[0],args[1]) :
                new Point3D(args[0],args[1],args[2]);
    }
}
