import math.{sqrt,pow}

object myApp extends App{

    val p1 = Point(3,3)
    val p2 = Point(1,1)
    val d = p1.distance(p2)

    println("\nThe DISTANCE between two ponits : " + d + "\n")
} 

case class Point(a:Int, b:Int){

    def x:Int = a
    def y:Int = b

    def distance(that:Point) = sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2))
}