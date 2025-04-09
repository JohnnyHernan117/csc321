# Johnny Hernandez
# CSC321
# Lab 12
import math

def CalculateRectangleArea(base, height):
    return base * height
def CalculateCircleArea(radius):
    return math.pi * radius ** 2

base = float(input("Enter the base of a rectangle: "))
height = float(input("Enter the height of a rectangle: "))

rectangle_area = CalculateRectangleArea(base, height)

print(f"The area of the rectangle is {rectangle_area}.")

radius = float(input("Enter the radius of a circle: "))
circle_area = CalculateCircleArea(radius)

print(f"The area of the rectang;e is {circle_area}.")
