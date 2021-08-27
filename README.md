# ArrayList VS LinkedList

ArrayList and LinkedList are two implementations of the List interface. 
Each have their own appealing features which we will explore in this task.

In this task LinkedList is singly linked.

## Task
For both ArrayList and LinkedList implement:
1. **get(index)**
2. **add(index, element)**


Run LinkedListTest.java and ArrayListTest.java to see if your implementation is correct.

Main.java performs a set of operations using both ArrayList and LinkedList:
  * Insertion
    - Insert an element at a random index
    - Insert an element at index 0
    - Insert an element at index size()-1
  * Access
    - Access an element at a random index
    - Access an element at index 0
    - Access an element at index size()-1

Each operation is repeated ``n`` times. Each operation is timed and compared for the two different datastructures.

Why do ArrayList and LinkedList perform differently at these operations? **Give a Big-O analysis**.

## Expected output
```
----100 000  Random Insertions----
  ArrayList      | time elapsed: 28946639 microseconds (28,946639 seconds)
  LinkedList     | time elapsed: 91898   microseconds (0,091898 seconds)
  LINKEDLIST BEST
  LinkedList spent 0,3 % of the time ArrayList did.

  ----100 000  Head Insertions----
  ArrayList      | time elapsed: 140901256 microseconds (140,901256 seconds)
  LinkedList     | time elapsed: 2617    microseconds (0,002617 seconds)
  LINKEDLIST BEST
  LinkedList spent 0,0 % of the time ArrayList did.

  ----100 000  Tail Insertions----
  ArrayList      | time elapsed: 3991    microseconds (0,003991 seconds)
  LinkedList     | time elapsed: 94879096 microseconds (94,879096 seconds)
  ARRAYLIST BEST
  ArrayList spent 0,0 % of the time LinkedList did.

  ----100 000  Random Access----
  ArrayList      | time elapsed: 5964    microseconds (0,005964 seconds)
  LinkedList     | time elapsed: 54203762 microseconds (54,203762 seconds)
  ARRAYLIST BEST
  ArrayList spent 0,0 % of the time LinkedList did.

  ----100 000  Head Access----
  ArrayList      | time elapsed: 2047    microseconds (0,002047 seconds)
  LinkedList     | time elapsed: 1145    microseconds (0,001145 seconds)
  LINKEDLIST BEST
  LinkedList spent 55,9 % of the time ArrayList did.

  ----100 000  Tail Access----
  ArrayList      | time elapsed: 2550    microseconds (0,002550 seconds)
  LinkedList     | time elapsed: 97548460 microseconds (97,548460 seconds)
  ARRAYLIST BEST
  ArrayList spent 0,0 % of the time LinkedList did.
  ```
