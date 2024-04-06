package com.example.fibbonacci

/**
 * @author Hanna Górecka
 * Funkcja zwraca n-elementowy ciąg fibonacciego z wykorzystaniem iteracji
 * @param n długość ciągu
 * @return listę elementów ciągu
 * @throws Exception jeśli argument jest mniejszy niż 0
 */
fun fibo (n: Int): List<Int>
{

    if (n<0) throw Exception ("Wrong argument")
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

/**
 * @author Hanna Górecka
 * Funkcja zwraca n-elementowy ciąg fibonacciego z wykorzystaniem rekurencji
 * @param n długość ciągu
 * @return listę elementów ciągu
 * @throws Exception jeśli argument jest mniejszy niż 0
 * Wspomogłam się algorytmem rekurencyjnym przedstawionym w źródle: https://stackoverflow.com/questions/68426233/correct-way-to-return-list-of-fibonacci-sequence-using-recursion
 */
fun fiboRec(n: Int): MutableList<Int>
{
    if (n<0) throw Exception ("Wrong argument")
    if(n==1)
    {
        return mutableListOf<Int>(0)
    }
    else if(n==2)
    {

        return mutableListOf<Int>(0,1)
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

val rec3 = fiboRec(20)
println(rec3)
}