package raytracer;

/**
 * Represents a projected ray.
 */
public class Ray {

    private float length;
    private Vec3D origin, direction;

    /**
     * Constructs a Ray.
     * @param origin
     *          The origin position of the ray.
     * @param direction
     *          The line direction of the ray.
     * @param length
     *          The length of the ray.
     */
    public Ray(Vec3D origin, Vec3D direction, float length) {
        this.length = length;
        this.origin = origin;
        this.direction = direction;
    }

    Vec3D getOrigin() {
        return this.origin;
    }

    Vec3D getDirection() {
        return this.direction;
    }
}

