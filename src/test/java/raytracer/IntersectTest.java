package raytracer;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class IntersectTest {
    final private double precision = 0.00001;

    // sphere
    private final double radius = 1.7;
    private final Vec3D center = new Vec3D(0, 0, 5);
    private final Sphere sphere = new Sphere(center, radius);

    // ray
    private final Vec3D origin = new Vec3D(0, 0, 0);
    private final float length = 100000000000000000f;


    @Test
    public void SphereTest(){
        // ... This dummy test is suited to Exercise 2, which currently does not have
        //     implementation for ray-tracing (and will be implemented further down the line)
        //
        // ray with known no intersection points
        Vec3D dir = new Vec3D(0.3623975938255366, 0.24084809030641247, 0.9003666927342523);
        Ray ray = new Ray(origin, dir, length);
        assertFalse(sphere.intersect(ray));
    }
}

