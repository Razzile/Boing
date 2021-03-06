###### best viewed in a markdown viewer/editor
# Boing

![image](http://i.imgur.com/a80Rb3u.png)

Boing is an experimental program to teach us how to use classes and inheritence as well as file parsing. It reads a shape file and for each shape defined draws it to a window. The shapes move around the window.

I have used git version control to keep track of my progress of the assignment. You can find the repo [here](https://github.com/Razzile/Boing) 
(please note that I haven't exactly been using git very well)
### Shape format
I have slightly modified the shape format so I can implement flashing shapes (see further down in the document).

All shapes begin with the following format:
`<shape> <x> <y> <vx> <vy>`

If the shape is an equilateral (i.e. square or circle) the side/diameter follows: `<side | diameter>`
otherwise, the width and the height follow: `<width> <height>`

all shapes have the boolean value `<filled>` next determining whether the shape is filled or not. This is followed by `<flashing>` indicating whether or not the shape flashes.

The next values to follow are the r g and b values of the primary colour: `<r> <g> <b>`. If `<flashing>` is true then the seconadry r g b colour follows: `<r2> <g2> <b2>`

lastly, all shapes have `<insertion time>` at the end of the definition which determines when the shape should appear.

This format is quite confusing at first so find below an example:
A rect at position (10, 20) with initial velocity (5, -5) with width 5 and height 10. It is filled and flashing and has primary colour (255, 0, 0) and secondary colour (0, 0, 255) and insertion time 0.

definition: `rect 10 10 5 -5 5 10 true true 255 0 0 0 0 255 0`

definition format: `<shape> <x> <y> <vx> <vy> <width> <height> <filled> <flashing> <r> <g> <b> <r2> <b2> <g2> <insertion time>`

#### Shape definition table
**Circle**

| entry          | type    | description                                       |
| -------------- | ------- | ------------------------------------------------- |
| circle         | string  | defines the shape type as circle                  |
| x              | int     | the x pos of the shape                            |
| y              | int     | the y pos of the shape                            |
| vx             | int     | the x velocity of the shape                       |
| vy             | int     | the y velocity of the shape                       |
| diameter       | int     | the diameter of the circle                        |
| filled         | boolean | whether or not the shape should be filled         |
| flashing       | boolean | whether or not the shape should be flashing       |
| r              | int     | red value of shape's primary colour               |
| g              | int     | green value of shape's primary colour             |
| b              | int     | blue value of shape's primary colour              |
| r2             | int     | red value of shape's secondary colour             |
| g2             | int     | green value of shape's secondary colour           |
| b2             | int     | blue value of shape's secondary colour            |
| insertion time | int     | when the shape should be inserted into the window |

**Oval**

| entry          | type    | description                                       |
| -------------- | ------- | ------------------------------------------------- |
| oval           | string  | defines the shape type as oval                    |
| x              | int     | the x pos of the shape                            |
| y              | int     | the y pos of the shape                            |
| vx             | int     | the x velocity of the shape                       |
| vy             | int     | the y velocity of the shape                       |
| width          | int     | the width of the shape                            |
| height         | int     | the height of the shape                           |
| filled         | boolean | whether or not the shape should be filled         |
| flashing       | boolean | whether or not the shape should be flashing       |
| r              | int     | red value of shape's primary colour               |
| g              | int     | green value of shape's primary colour             |
| b              | int     | blue value of shape's primary colour              |
| r2             | int     | red value of shape's secondary colour             |
| g2             | int     | green value of shape's secondary colour           |
| b2             | int     | blue value of shape's secondary colour            |
| insertion time | int     | when the shape should be inserted into the window |

**Square**

| entry          | type    | description                                       |
| -------------- | ------- | ------------------------------------------------- |
| square         | string  | defines the shape type as square                  |
| x              | int     | the x pos of the shape                            |
| y              | int     | the y pos of the shape                            |
| vx             | int     | the x velocity of the shape                       |
| vy             | int     | the y velocity of the shape                       |
| side           | int     | the length of the sides                           |
| filled         | boolean | whether or not the shape should be filled         |
| flashing       | boolean | whether or not the shape should be flashing       |
| r              | int     | red value of shape's primary colour               |
| g              | int     | green value of shape's primary colour             |
| b              | int     | blue value of shape's primary colour              |
| r2             | int     | red value of shape's secondary colour             |
| g2             | int     | green value of shape's secondary colour           |
| b2             | int     | blue value of shape's secondary colour            |
| insertion time | int     | when the shape should be inserted into the window |

**Rect**

| entry          | type    | description                                       |
| -------------- | ------- | ------------------------------------------------- |
| rect           | string  | defines the shape type as rect                    |
| x              | int     | the x pos of the shape                            |
| y              | int     | the y pos of the shape                            |
| vx             | int     | the x velocity of the shape                       |
| vy             | int     | the y velocity of the shape                       |
| width          | int     | the width of the shape                            |
| height         | int     | the height of the shape                           |
| filled         | boolean | whether or not the shape should be filled         |
| flashing       | boolean | whether or not the shape should be flashing       |
| r              | int     | red value of shape's primary colour               |
| g              | int     | green value of shape's primary colour             |
| b              | int     | blue value of shape's primary colour              |
| r2             | int     | red value of shape's secondary colour             |
| g2             | int     | green value of shape's secondary colour           |
| b2             | int     | blue value of shape's secondary colour            |
| insertion time | int     | when the shape should be inserted into the window |

**Pentagon**

| entry          | type    | description                                       |
| -------------- | ------- | ------------------------------------------------- |
| pentagon       | string  | defines the shape type as pentagon                |
| x              | int     | the x pos of the shape                            |
| y              | int     | the y pos of the shape                            |
| vx             | int     | the x velocity of the shape                       |
| vy             | int     | the y velocity of the shape                       |
| side           | int     | the length of the sides                           |
| filled         | boolean | whether or not the shape should be filled         |
| flashing       | boolean | whether or not the shape should be flashing       |
| r              | int     | red value of shape's primary colour               |
| g              | int     | green value of shape's primary colour             |
| b              | int     | blue value of shape's primary colour              |
| r2             | int     | red value of shape's secondary colour             |
| g2             | int     | green value of shape's secondary colour           |
| b2             | int     | blue value of shape's secondary colour            |
| insertion time | int     | when the shape should be inserted into the window |

### Custom shape
For my custom shape I decided to implement a pentagon. This proved to be quite a challenge as there was quite a lot of maths involved with drawing the shape. 

I also had to research the `Polygon` API in the java SDK. Find below my steps of implementing the pentagon shape

  - use the pentagon height formula (height = side / 2 * sqrt(5 + 2) * sqrt(5)) for method overloads `getHeight()` and `getWidth()`
  - calculate points of indicies by using formula x=(72 * cos(2pi/5 * n)) and y=(72 * sin(2pi/5 * n)) where n is the current side. This was done in a for loop from 0 .. 5 for each side of the pentagon. These points were added to a `Polygon` object using `addPoint(point)`
  - to draw the polygon I used the `drawPolygon(polygon)` and `fillPolygon(polygon)` methods of the `Graphics` class.
  
The pentagon format in the txt file mirrors that of square, the only difference being the shape saying pentagon instead of square.

### Flashing shapes

To implement flashing shapes I had to first create a new shape format for the .txt files. This format was documented above.

I then had to reprogram the `ClosedShape` class to accept both a primary and secondary colour. I did this by making a new constructor that took the extra secondary colour. I also added a new member variable `secondaryColour` to accomodate the secondary colour.

I had to rewrite the constructors of all the subclasses of ClosedShape to adjust to this change, providing the new constructor format for them too.

To make the shapes actually flash, I added the methods `shouldFlash()` and `flipColours()` to `ClosedShape`. `shouldFlash()` returns true if the secondary colour of the shape is not null and `flipColours()` switches the primary colour and secondary colour. 
Then in the `BouncingShapesWindow` class, I added some code to the paint method of the anonymous JPanel class's `paint()` method to flip the colours if `shouldFLash()` was true. It did this every 15 frames by using the modulus operator on the `currentTime` variable and only flipping colours if `currentTime % 15 == 0`.

### Caveats
Whilst I am quite pleased with my code, there are a few things I would have liked to change given I had more time. 

1. The `construct*` functions in `ReadShapeFile` all share quite a lot of reused code. It would make more sense to supply a static function with a definition like `static ClosedShape constructShape(Scanner in)` in `ClosedShape` to construct a new shape from a scanner. Then the other shape classes could overload this method to parse data specific to them.

2. The calculations for pentagon position, width and height are not accurate. This is due to the fact that `Graphics.drawPolygon()` and the `Polygon` class only accept integer values for points. My calculations resulted in decimal values so I had to cast these values to ints for use in my draw method.

3. The shape format is pretty bad. If this were a production application I would've probably switched the shape definitions to a more standard format like JSON or XML
