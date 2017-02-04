/**
 * Created by paul on 04/02/2017.
 * https://www.timroes.de/2015/06/28/groovy-tutorial-for-java-developers-part3-collections/
 */

def list = [1,1,2,3,5,6]

println("$list")

println list[0] // will print 1
println list[-1] // negative indexes for access from the end of the list, will print out 5

if (9 in list) {
    println('Found it')
}else{
    println('Not found it')
}

list.each {
    println(it)
}

def even = list.findAll { it % 2 == 0 }
println("$even")

def squaredList = list.collect { it * it }
println("$squaredList")

def upper = ["Hello", "World"].collect { it.toUpperCase() }
println("$upper")

def upper2 = ["Hello", "World"]*.toUpperCase()
println("$upper2")

//MAPS


def key = 'Key3'
def aMap = [
        'Key1': 'Value 1', // Put key1 -> Value 1 to the map
        Key2: 'Value 2', // You can also skip the quotes, the key will automatically be a String
        (key): 'Another value' // If you want the key to be the value of a variable, you need to put it in parantheses
]

println("$aMap")
println aMap.getClass()

println aMap['Key1'] // Access the key Key1
println aMap[key] // Access the entry with the value of key variable
println aMap.Key1 // Access Key1 entry

def map = [:]
println("$map")
println map.getClass()

aMap.each {
    println it.key
    println it.value
}

map.each {
    println it.key
    println it.value
}

// Returns a ArrayList
def mymap = aMap.collect { return it }
println mymap.getClass()
println("$mymap")

// Returns a LinkedHashMap
def mymap2 = aMap.collectEntries { return it }
println mymap2.getClass()
println("$mymap2")

// Return one entry
def test = aMap.collectEntries { keys, value -> return [(key): value] }
print("$test")

def test2 = aMap.collectEntries { keys, value ->
    def newKey = keys + "^2"
    return [(key): value, (newKey): value]
}
println("$test2")