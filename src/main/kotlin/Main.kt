fun main() {
    val toyo = Car( "Toyota", "Prado","KDG 234N",0)
    val audi = Car("Audi","A4","KCT 345L",0)
    audi.start()
    println(toyo.speed)
    toyo.accelarate(60)
    println(toyo.speed)
    toyo.accelarate(35)
    println(toyo.speed)
    toyo.deccelarate(30)
    println(toyo.speed)
    toyo.hooting()
    toyo.stop()
    println(toyo.speed)
    val myBook = Book("Born a crime", "Trevoh Noah", 288, 2017)
    println(myBook.title)
    println(myBook.pages)

}

class Car(var make: String,var model:String,var registration:String,var speed:Int ){
    fun start(){
        println("chikchik chik vrrrrrrm")
    }
    fun accelarate(accelaration: Int): Int{
        speed += accelaration
        return speed
    }

        fun deccelarate(deccelaration: Int): Int{
        speed -= deccelaration
        return speed
    }
    fun hooting(){
        println("puuuuuuuuu")
    }
    fun stop(){
        speed=0
        println("ssshhh")

    }

}


data class Book(var title: String, var author: String, var pages: Int, var year: Int)
data class AgeStats(var max:Int, var min:Int, var mean:Double, var median:Double)

//fun ageCalculations( ages: Array<Int>): AgeStats{
//    var max =



