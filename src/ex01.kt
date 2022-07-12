import java.util.Random

fun calculator(x : Int, y : Int, lambda : (x : Int, y: Int) -> Int): Int {
     return lambda(x,y)
}

fun main(){
    val minus = { x : Int, y: Int -> x - y }
    val plus = { x : Int, y: Int -> x + y }
    val division = { x : Int, y : Int -> x / y }
    val multiplication = { x : Int, y : Int -> x * y }
    var random = Random()
    var index = random.nextInt(4)
    when(index){
        0 -> {
            println("뺼셈 : ${calculator(5, 3, minus)}")
            }
        1 -> {
            println("덧셈 : ${calculator(5, 3, plus)}")
        }
        2 -> {
            println("곱셈 : ${calculator(5, 3, multiplication)}")
        }
        3 -> {
            println("나눗셈 : ${calculator(5, 3, division)}")
        }
    }
}
