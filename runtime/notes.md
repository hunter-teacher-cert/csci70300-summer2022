# Outside Resources

This article has an appropriate depth of content for what we are aiming for:
https://towardsdatascience.com/essential-programming-time-complexity-a95bb2608cac

Some resources will explain more than you need to know and be more confusing. 

# Overall Idea

We are interested in how quickly an algorithm runs relative to the input of the problem. Generally, we think of N as the input size (a list with N elements), but N could be the actual input (such as when calculating the Nth term of a series, or the Nth prime.)

We do not care about an exact number of seconds. Instead, think along the lines:

"How MUCH LONGER does it take when we double N? And when we double N again?"

# Every time you double the input:

1. If the work required stays the same, we say it runs in constant time.
2. If the work required increases by a constant factor (double triple or something similar), we say it runs in linear time. The constant (slope of the line) is not important.
3. If the work required increases more and more each time you double, then it may be a more complex polynomial time (n<sup>2</sup>, n<sup>3</sup>,  2<sup>n</sup> etc.) exponential, or even worse.

We care about very large input sizes, we want to know how the algorithm behaves as N gets "arbitrarily large."

# Big O notation
We designate the growth using the notation above.
O(n) is read as: "oh of n" "big oh of n", or "order n" and it means "linear time"

O(1) means constant time

O(n) means linear time

O(n<sup>2</sup>) means quadatic time

O(2<sup>n</sup>) means exponential

O(logn) means logarithmic time


# Nested loops
When you have a loop, it multiplies the runtime of the code inside the loop by how many times the loop happens.

```java
public int loopTime(int A, int B){
      int total = 0;
      for( int i = 0; i < A; i++){//repeat A times
         for( int j = 0; j < B; j++){//repeat B times
           total ++;
          }
      }
      return total;//total will equal A*B
}
```

# Examples where n is the array length
## Constant time 
Constant time doesn't increase when you increase the input. This is also called O(1)
```java
public int foo(int [] ary){
      return ary[0];
}
```
```java
public int bar(int [] ary){
      return ary[ary.length-1]+ary[0];
}
```
## linear time
Linear times grows proportionally as the input increases. If you double the input size, you double the work required. This is called O(n)
```java
public int sumarray(int [] ary){
      int total = 0;
      //loop happens n times
      for( int i = 0; i < ary.length; i++){
        total += ary[i];
      }
   return total;
}
```

A loop CAN be constant, be careful this function is still linear:
```java
public int foo2(int [] ary){
  int total = 0;
  //outer loop happens n times
  for( int i = 0; i < ary.length; i++){
    //inner loop happens 10 times no matter what, this means it does not grow with the data size!
    for( int j = 0; j < 10; j++){
      total += i*j*ary[i];
    }
  }
  return total;
}
```
          
## Quadratic time

If each time you double the input size, your work quadrouples, you have quadratic time. This is also written as O(n<sup>2</sup>)

This happens in the selection sort, the handshake problem mentioned in class, and more! (bubble sort, insertion sort)

```java
public int foo3(int [] ary){
  int total = 0;
  //outer loop runs N times.
  for( int i = 0; i < ary.length; i++){
    //inner loop runs N times
    for( int j = 1 ; j < ary.length; j++){
      total += ary[i]*ary[j];
    }
  }
  return total;
}
```    

Your selection sort is O(n<sup>2</sup>) 

```java
public void selectionSort(int [] ary){
  for( each index of the n elements){//this loop repeats the inside n times.
    smallIndex = findSmallestIndex();//findSmallest is O(n)
    swap(ary,smallIndex,index);//O(1)
  }
  return total;
}
```        

## Exponential Time

Some functions grow exponentially like the recursive fib(n) you wrote!

We would call this kind of growth as O(2<sup>n</sup>)

Exponential growth can become too much to compute even with small inputs. 

recursive fib(50) will not complete on any computer in a reasonable amount of time no matter how fast the computer is.

Remember: Each time you increase your data size by 1, your work doubles.

## Logarithmic Time

This will be discussed on Monday! But here is a preview:

Mathematically log and exponents are inverse functions that cancel out eachother (think:  + cancels - , and * cancels / )
Exponents grow fast, Logs grow slowly.

### Intuitively logn represents the number of times you could cut an integer in half until you reach 1.
8 can be cut in half 3 times before it reaches 1. (8 -> 4 -> 2 -> 1)
1024 can be cut in half 10 times.
2048 can be cut in half 11 times.
4096 can be cut in half 12 times.

Each time you double your data size you only have to do one extra step. 

The reason this is important is that the binary search cuts the data in half each time you look at a value. It effectively throws away half the data, then throws half of the remaining data, until you run out of elements.






