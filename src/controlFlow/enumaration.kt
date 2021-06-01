package controlFlow

fun main() {
    val colors: Array<Color> = Color.values()

    // looping value dari list color
    colors.forEach { color ->
        println(color)
    }
    
    var color: Color = Color.RED

    when (color){
        Color.RED -> println("Color is Red")
        Color.BLUE -> println("Color is Blue")
        Color.GREEN -> println("Color is Green")
    }

}

enum class Color(val value: Int){
    RED(0xFF0000){
      override fun printValue(){
          println("value of RED is $value")
      }
    },
    GREEN(0x00FF0){
        override fun printValue(){
            println("value of RED is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue(){
            println("value of RED is $value")
        }
    };

    abstract fun printValue();
}
