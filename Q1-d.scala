object myApp extends App{

    val p1 = Point(-3,3)
    val p2 = p1.switch()

    println("\nThe Point AFTER Moving : " + p2 + "\n")
} 

case class Point(a:Int, b:Int){

    def x:Int = a
    def y:Int = b

    def switch() = Point(this.b,this.a)
}