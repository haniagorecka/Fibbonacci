package com.example.fibbonacci

fun fibo (n: Int): List<Int>
{

    check (n>0) {"Wrong argument"}
    var list= mutableListOf<Int>()
    var i: Int=2

    if(n==1)
    {
        list.add(0,0)
    }
    else if(n==2)
    {
        list.add(0,0)
        list.add(1,1)
    }
    else
    {
        list.add(0,0)
        list.add(1,1)
        while(i<=n-1)
        {
            list.add(list.size, list[i-1]+list[i-2])
            i++
        }

    }
    return list
}

fun fiboRec(n: Int): MutableList<Int> //https://stackoverflow.com/questions/68426233/correct-way-to-return-list-of-fibonacci-sequence-using-recursion
{
    check (n>0) {"Wrong argument"}
    if(n==1)
    {
        return mutableListOf<Int>(0)
    }
    else if(n==2)
    {
        val list = mutableListOf<Int>(0,1)
        return list
    }
    else
    {
        val list = fiboRec(n-1)
        list.add(list[n-2]+list[n-3])
        return list
    }

    assert(fiboRec(2)== listOf<Int>(0,1))
    assert(fiboRec(4)== listOf<Int>(0,1,1,2))

}

fun main()
{
val list3 = fibo(3)
println(list3)
val list10 = fibo(10)
println(list10)
val list20 = fibo(20)
println(list20)

val rec3 = fiboRec(20)
println(rec3)
}