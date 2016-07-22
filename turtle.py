
t = turtle.Turtle()

myWin = turtle.Screen()

def tree(branchLen,t):

if branchLen > 5:

width = branchLen/10;

t.width(width);

if (branchLen >25):

t.color("brown")

if (branchLen <25):

t.color("green")

rightAngle = random.randrange(15, 30);

leftAngle = random.randrange(15, 30);

leftLen = random.randrange(10, 15);

rightLen = random.randrange(10, 15);


t.forward(branchLen)

t.right(rightAngle);

tree(branchLen - leftLen,t)

t.left(rightAngle + leftAngle)

tree(branchLen - rightLen,t)

t.right(leftAngle)

t.penup();

t.backward(branchLen)
t.pendown();

t.speed(0)

t.left(90)

t.up()

t.backward(150)

t.down()

tree(120,t)

myWin.exitonclick()
