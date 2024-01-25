package com.company;

public class Main {

    public static void main(String[] args) {
	/*
        Create public enum for types of figures
        Create class Figure with one dimension table for Enum types
        Create class Polygon with fields base and high extend class FigureCreate class Rectangle, Triangle(equilateral), Diamond, Trapeze(isosceles) extends class Polygon
        Create class Circle extends class Figure
        Create class Square extends class Rectangle
        Add methods to calculate surface area , circuit and print all information about object
        Create exception ImpossibleFigureException and throw it when user want create figure with negative values.
        In main class get methode to build example figure but close the program when user set wrong data.

    */
        Square square = Square.build();
        square.print();

      /*  Rectangle rectangle = Rectangle.build();
        rectangle.print();

        Triangle triangle = Triangle.build();
        triangle.print();

        Diamond diamond = Diamond.build();
        diamond.print();

        Trapeze trapeze = Trapeze.build();
        trapeze.print();*/


    }




}
