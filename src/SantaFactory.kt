/**
 * Created by Christoffer Grännby
 * Date: 2021-01-19
 * Time: 14:08
 * Project: Inlämningsuppgift2
 * Copyright: MIT
 */
/*

 */

var tomten = listOf("Glader", "Butter")
var glader = listOf("Tröger", "Trötter", "Blyger")
var butter = listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven")
var trötter = listOf("Skumtomten")
var skumtomten = listOf("Dammråttan")
var räven = listOf("Gråsuggan", "Myran")
var myran = listOf("Bladlusen")

var hiearchy = mapOf("Tomten" to tomten, "Glader" to glader,"Butter" to butter,"Trötter" to trötter,
        "Skumtomten" to skumtomten,"Räven" to räven,"Myran" to myran)
fun main() {
    println("State a worker")
    val worker = readLine().toString()
    getWorker(worker)
    if (listWithWorkers.isEmpty()){
        println("$worker has no elves working for him")
    }
    else println("These elves work for $worker: $listWithWorkers")
}

val listWithWorkers : MutableList<String> = mutableListOf()

    fun getWorker(input : String) : List<String> {
        val ignoreCase = input[0].toUpperCase() + input.substring(1)
            if (hiearchy.containsKey(ignoreCase)){
                hiearchy.getValue(ignoreCase).forEach {a -> listWithWorkers.add(a)
                getWorker(a) //rekursion
                }
            }
return listWithWorkers
    }


