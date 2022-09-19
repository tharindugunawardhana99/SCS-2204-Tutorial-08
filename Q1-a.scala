object myApp extends App{

    val p1 = Point(2,3)
    val p2 = Point(2,-5)

    println("\nThe addition of two Points : " + (p1+p2) + "\n")
} 

case class Point(a:Int, b:Int){

    def x:Int = a
    def y:Int = b

    def +(that:Point) = Point(this.x+that.x,this.y+that.y)
}