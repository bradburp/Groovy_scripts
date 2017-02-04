/**
 * Created by paul on 04/02/2017.
 * https://www.timroes.de/2015/06/28/groovy-tutorial-for-java-developers-part2-closures/
 */

def helloWorld = {
    println "Hello World"
}

helloWorld()

def power = { int x, int y ->
    return Math.pow(x, y)
}
println power(2, 3) // Will print 8.0

def say = { what ->
    println what
}
say "Hello World"

def say2 = { println it }
say2 "Hello World"

def clos = { ->
    println "This closure does not take any arguments."
}

clos()

def square = { it * it }
println square(4) // Will print out 16

def transform = { str, transformation ->
    transformation(str)
}

println transform("Hello World", { it.toUpperCase() })

println transform("Hello World") { it.toUpperCase() }

def createGreeter = { name ->
    return {
        def day = new Date().getDay()
        if (day == 0 || day == 6) {
            println "Nice Weekend, $name"
        } else {
            println "Hello, $name"
        }
    }
}

def greetWorld = createGreeter("World")
greetWorld()


