# ArrayList VS LinkedList

ArrayList and LinkedList are two implementations of the List interface. 
Each have their own appealing features which we will explore in this task.

In this task LinkedList is singly linked.

## Task
For both ArrayList and LinkedList, implement **add(element)**, **add(index, element)** and **get(index)**.
Run ArrayLinkedTest.java to see if your implementation is correct.

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
  ArrayList      | time elapsed: ?? microseconds (?? seconds)
  LinkedList     | time elapsed: ?? microseconds (?? seconds)
  ?? BEST
  LinkedList spent ?? % of the time ArrayList did.

  ----100 000  Head Insertions----
  ArrayList      | time elapsed: ?? microseconds (?? seconds)
  LinkedList     | time elapsed: ?? microseconds (?? seconds)
  ?? BEST
  LinkedList spent ?? % of the time ArrayList did.

  ----100 000  Tail Insertions----
  ArrayList      | time elapsed: ?? microseconds (?? seconds)
  LinkedList     | time elapsed: ?? microseconds (?? seconds)
  ?? BEST
  LinkedList spent ?? % of the time ArrayList did.

  ----100 000  Random Access----
  ArrayList      | time elapsed: ?? microseconds (?? seconds)
  LinkedList     | time elapsed: ?? microseconds (?? seconds)
  ?? BEST
  LinkedList spent ?? % of the time ArrayList did.

  ----100 000  Head Access----
  ArrayList      | time elapsed: ?? microseconds (?? seconds)
  LinkedList     | time elapsed: ?? microseconds (?? seconds)
  ?? BEST
  LinkedList spent ?? % of the time ArrayList did.

  ----100 000  Tail Access----
  ArrayList      | time elapsed: ?? microseconds (?? seconds)
  LinkedList     | time elapsed: ?? microseconds (?? seconds)
  ?? BEST
  LinkedList spent ?? % of the time ArrayList did.
  ```
