package raytracer;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class SceneTest {
    final private double precision = 0.00001;
    final Vec3D scale = new Vec3D(1, 1, 1);
    final Vec3D rotation = new Vec3D(0, 0, 0);
    final Vec3D translation = new Vec3D(0, 0, 0);

    @Test
    public void TransformTest(){
        try {
            Class.forName( "Transform" );
            Transform transform = new Transform(scale, rotation, translation);
        } catch( ClassNotFoundException ignored) {
        }
    }

    @Test
    public void GroupTest(){
        try {
            Class.forName( "Group" );
            Object Group = null;
            assertTrue(Group instanceof Transform);
            Transform group = new Group(scale, rotation, translation);
        } catch( ClassNotFoundException ignored) {
        }
    }

    @Test
    public void PlaneTest() throws Exception {
        try {
            Class.forName( "Plane" );
            Object Plane = null;
            assertTrue(Plane instanceof Geometry);
            Method intersect = Plane.class.getDeclaredMethod("intersect", Ray.class);
        } catch( ClassNotFoundException ignored) {
        }
    }

    @Test
    public void ConeTest() throws Exception {
        try {
            Class.forName( "Cone" );
            Object Cone = null;
            assertTrue(Cone instanceof Geometry);
            Method intersect = Cone.class.getDeclaredMethod("intersect", Ray.class);
        } catch( ClassNotFoundException ignored) {
        }
    }

    @Test
    public void SphereTest() throws Exception {
        try {
            Class.forName( "Sphere" );
            Object Sphere = null;
            assertTrue(Sphere instanceof Geometry);
            Method intersect = Sphere.class.getDeclaredMethod("intersect", Ray.class);
        } catch( ClassNotFoundException ignored) {
        }
    }

    @Test
    public void ShapeTest() throws Exception {
        try {
            Class.forName( "Shape" );
            Object Shape = null;
            Field appearance = Shape.class.getField("appearance");
            Field geometry = Shape.class.getField("geometry");
        } catch( ClassNotFoundException ignored) {
        }
    }

    @Test
    public void GeometryTest() throws Exception {
        try {
            Class.forName( "Geometry" );
            Object Geometry = null;
            Method intersect = Geometry.class.getDeclaredMethod("intersect", Ray.class);
        } catch( ClassNotFoundException ignored) {
        }
    }

    @Test
    public void Appearance() throws Exception {
        try {
            Class.forName( "Appearance" );
            Field material = Shape.class.getField("material");
        } catch( ClassNotFoundException ignored) {
        }
    }

    @Test
    public void Material() throws Exception {
        try {
            Class.forName( "Material" );
            Field diffuseColor = Shape.class.getField("diffuseColor");
        } catch( ClassNotFoundException ignored) {
        }
    }
}
