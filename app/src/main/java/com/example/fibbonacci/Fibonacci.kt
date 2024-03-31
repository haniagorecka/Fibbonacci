package com.example.fibbonacci

fun fibo (n: Int): List<Int>
{
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

fun fiboRec(n: Int): MutableList<Int>
{
    if(n<=2)
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

}

fun main()
{
val list3 = fibo(3)
println(list3)
val list10 = fibo(10)
println(list10)
val list20 = fibo(20)
println(list20)

val rec3 = fiboRec(10)
println(rec3)
}