package com.github.sufiazarquiel.workspace.oop;

public class Rectangle {
    // Attributes
    private int width;
    private int height;

    // Constructors
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int width, int height) {
        if (width < 0 || height < 0) {
            System.out.println("Invalid width or height, setting to 0");
            this.width = 0;
            this.height = 0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    
    // Methods
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        if (width < 0) {
            System.out.println("Invalid width, setting to 0");
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(int height) {
        if (height < 0) {
            System.out.println("Invalid height, setting to 0");
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    /**
     * Calculates the area of the rectangle
     * @return int Area of the rectangle
     */
    public int area() {
        return this.width * this.height;
    }

    /**
     * Calculates the perimeter of the rectangle
     * @return int Perimeter of the rectangle
     */
    public int perimeter() {
        return 2 * (this.width + this.height);
    }

    /**
     * Checks if the rectangle is vertical or horizontal
     * @return String Orientation of the rectangle
     */
    public String orientation() {
        if (this.width > this.height) {
            return "Horizontal";
        } else if (this.width < this.height) {
            return "Vertical";
        } else {
            return "Square";
        }
    }

    @Override
    public String toString() {
        return "Rectangle \n[width=" + width + ", height=" + height + "]";
    }

    /**
     * Prints out the rectangle with asterisks
     * @return void
     */
    public void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}
