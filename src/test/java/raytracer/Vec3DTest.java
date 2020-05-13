package raytracer;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Vec3DTest {

    private final Vec3D vec3D1 = new Vec3D(1, 1, 1);
    private final Vec3D vec3D2 = new Vec3D(0, 1, 0);
    private final Vec3D vec3D3 = new Vec3D(0, 0, 0);
    private final Vec3D vec3D4 = new Vec3D(100, 100, 100);
    private final double precision = 0.00001;


    @Test
    public void toStringTest() {
        assertEquals("[ 1.0, 1.0, 1.0 ]", vec3D1.toString());
        assertEquals("[ 0.0, 1.0, 0.0 ]", vec3D2.toString());
        assertEquals("[ 0.0, 0.0, 0.0 ]", vec3D3.toString());
        assertEquals("[ 100.0, 100.0, 100.0 ]", vec3D4.toString());
    }


    @Test
    public void addTest(){
        Vec3D result1 = vec3D1.add(vec3D2);
        Vec3D result2 = vec3D3.add(vec3D4);
        assertEquals("[ 1.0, 2.0, 1.0 ]", result1.toString());
        assertEquals("[ 100.0, 100.0, 100.0 ]", result2.toString());
    }


    @Test
    public void subTest(){
        Vec3D result1 = vec3D1.sub(vec3D2);
        Vec3D result2 = vec3D3.sub(vec3D4);
        assertEquals("[ 1.0, 0.0, 1.0 ]", result1.toString());
        assertEquals("[ -100.0, -100.0, -100.0 ]", result2.toString());
    }


    @Test
    public void mulTest(){
        Vec3D result1 = vec3D1.mul(1);
        Vec3D result2 = vec3D3.mul(1);
        Vec3D result3 = vec3D4.mul(100);
        assertEquals("[ 1.0, 1.0, 1.0 ]", result1.toString());
        assertEquals("[ 0.0, 0.0, 0.0 ]", result2.toString());
        assertEquals("[ 10000.0, 10000.0, 10000.0 ]", result3.toString());
    }


    @Test
    public void dotTest(){
        assertEquals(1, vec3D1.dot(vec3D2), precision);
        assertEquals(0, vec3D3.dot(vec3D4), precision);
    }


    @Test
    public void lenTest(){
        assertEquals(1.73205080757, vec3D1.len(), precision);
        assertEquals(1, vec3D2.len(), precision);
        assertEquals(0, vec3D3.len(), precision);
        assertEquals(173.205080757, vec3D4.len(), precision);
    }


    @Test
    public void crossTest(){
        Vec3D result1 = vec3D1.cross(vec3D2);
        Vec3D result2 = vec3D3.cross(vec3D4);
        assertEquals("[ -1.0, -0.0, 1.0 ]", result1.toString());
        assertEquals("[ 0.0, -0.0, 0.0 ]", result2.toString());
    }


    @Test
    public void normalizeTest(){
       assertEquals("[ 0.5773502691896258, 0.5773502691896258, 0.5773502691896258 ]", vec3D1.normalize().toString());
       assertEquals("[ 0.0, 1.0, 0.0 ]", vec3D2.normalize().toString());
       assertEquals("[ NaN, NaN, NaN ]", vec3D3.normalize().toString());
       assertEquals("[ 0.5773502691896258, 0.5773502691896258, 0.5773502691896258 ]", vec3D4.normalize().toString());
    }


    @Test
    public void coordinateTest(){
        assertEquals(1, vec3D1.getX(), precision);
        assertEquals(1, vec3D2.getY(), precision);
        assertEquals(0, vec3D3.getZ(), precision);
        assertEquals(100, vec3D4.getY(), precision);
    }
}

