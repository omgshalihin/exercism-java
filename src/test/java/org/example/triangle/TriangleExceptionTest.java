package org.example.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleExceptionTest {

    @Test
    public void equilateralTrianglesHaveEqualSides() throws TriangleException {
        Triangle triangle = new Triangle(2, 2, 2);
        assertTrue(triangle.isEquilateral());
    }
    @Test
    public void isoscelesTrianglesHaveLastTwoSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(3, 4, 4);
        assertTrue(triangle.isIsosceles());
    }
    @Test
    public void noSidesAreEqualCantBeIsoceles() throws TriangleException {
        Triangle triangle = new Triangle(2, 3, 4);
        assertFalse(triangle.isIsosceles());
    }
    @Test
    public void verySmallTrianglesCanBeIsosceles() throws TriangleException {
        Triangle triangle = new Triangle(0.5, 0.4, 0.5);
        assertTrue(triangle.isIsosceles());
    }
    @Test
    public void scaleneTrianglesHaveNoEqualSides() throws TriangleException {
        Triangle triangle = new Triangle(5, 4, 6);
        assertTrue(triangle.isScalene());
    }
    @Test
    public void trianglesWithNoEqualSidesAreNotEquilateral() throws TriangleException {
        Triangle triangle = new Triangle(5, 4, 6);
        assertFalse(triangle.isEquilateral());
    }
    @Test
    public void equilateralTrianglesAreAlsoIsosceles() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 4);
        assertTrue(triangle.isIsosceles());
    }
    @Test
    public void trianglesWithNoSizeAreIllegal() {
        assertThrows(TriangleException.class, () -> new Triangle(0, 0, 0));
    }
    @Test
    public void firstTriangleInequalityViolation() {
        assertThrows(TriangleException.class, () -> new Triangle(1, 1, 3));
    }

}