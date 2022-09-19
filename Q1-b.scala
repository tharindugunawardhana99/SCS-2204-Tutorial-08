object myApp extends App{

    val p1 = Point(2,3)
    val p2 = p1.move(-1,1)

    println("\nThe Point AFTER Moving : " + p2 + "\n")
} 

case class Point(a:Int, b:Int){

    def x:Int = a
    def y:Int = b

    def move(dx:Int, dy:Int) = Point(this.x+dx,this.y+dy)
}