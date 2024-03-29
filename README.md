Java : Algorithms and Data Structure 
==============================

## Table of Contents
- [Basic data Structures](#data-structures)
- [Numbers/math](#numbers)
- [Graphs](#graphs)
- [Search](#search)
- [Dynamic programming](#sequences)
- [Sorts](#sorts)
- [String](#string-functions)

## Data Structures
* [Queue [backed by an array or a linked list]](src/com/pa3lo/algorithms/data_structures/Queue.java)


## Numbers/math
* [Integers](src/com/pa3lo/algorithms/numbers/Integers.java) 
  + to binary String
    - using divide and modulus
  + is a power of 2
    - using a loop
    - using recursion
  
  + to English (e.g. 1 would return "one")
* [Longs](src/com/pa3lo/algorithms/numbers/Longs.java)
  + to binary String
    - using divide and modulus
  
* [Complex](src/com/pa3lo/algorithms/numbers/Complex.java)
  + addition
  + subtraction
  + multiplication
 

* [Distance](src/com/pa3lo/algorithms/mathematics/Distance.java)
  + euclidean
  + manhatan
* [Division](src/com/pa3lo/algorithms/mathematics/Division.java)
  + using a loop
  + using recursion
  + using shifts and multiplication
  + using only shifts
  + using logarithm
* [Multiplication](src/com/pa3lo/algorithms/mathematics/Multiplication.java)
  + using a loop
  + using recursion
  + using only shifts
  + using logarithms
  + [Fast Fourier Transform](src/com/pa3lo/algorithms/mathematics/FastFourierTransform.java)
* [Exponentiation](src/com/pa3lo/algorithms/mathematics/Exponentiation.java)
  + recursive exponentiation
  + fast recursive exponentiation
  + fast modular recursive exponentiation
* [Primes](src/com/pa3lo/algorithms/mathematics/Primes.java)
  + is prime
  + [Co-Primes (relatively prime, mutually prime)](src/com/pa3lo/algorithms/mathematics/Coprimes.java)
  + [Greatest Common Divisor](src/com/pa3lo/algorithms/mathematics/GreatestCommonDivisor.java)
    - using Euclid's algorithm
    - using recursion
* [Permutations](src/com/pa3lo/algorithms/mathematics/Permutations.java)
  + strings
  + numbers
* [Modular arithmetic](src/com/pa3lo/algorithms/mathematics/Modular.java)
  + add
  + subtract
  + multiply
  + divide
  + power
* [Knapsack](src/com/pa3lo/algorithms/mathematics/Knapsack.java) 
* [Ramer Douglas Peucker](src/com/pa3lo/algorithms/mathematics/RamerDouglasPeucker.java)   

## Graphs
* Find shortest path(s) in a Graph from a starting Vertex
  - [Dijkstra's algorithm (non-negative weight graphs)](src/com/pa3lo/algorithms/graph/Dijkstra.java)
  - [Bellman-Ford algorithm (negative and positive weight graphs)](src/com/pa3lo/algorithms/graph/BellmanFord.java)
* Find minimum spanning tree
  - [Prim's (undirected graphs)](src/com/pa3lo/algorithms/graph/Prim.java)
  - [Kruskal's (undirected graphs)](src/com/pa3lo/algorithms/graph/Kruskal.java)
* Find all pairs shortest path
  - [Johnsons's algorithm (negative and positive weight graphs)](src/com/pa3lo/algorithms/graph/Johnsons.java)
  - [Floyd-Warshall (negative and positive weight graphs)](src/com/pa3lo/algorithms/graph/FloydWarshall.java)
* [Cycle detection](src/com/pa3lo/algorithms/graph/CycleDetection.java)
  - Depth first search while keeping track of visited Verticies
  - [Connected Components](src/com/pa3lo/algorithms/graph/ConnectedComponents.java)
* [Topological sort](src/com/pa3lo/algorithms/graph/TopologicalSort.java)
* [A* path finding algorithm](src/com/pa3lo/algorithms/graph/AStar.java)
* Maximum flow
  - [Push-Relabel](src/com/pa3lo/algorithms/graph/PushRelabel.java)
* Graph Traversal
  - [Depth First Traversal](src/com/pa3lo/algorithms/graph/DepthFirstTraversal.java)
  - [Breadth First Traversal](src/com/pa3lo/algorithms/graph/BreadthFirstTraversal.java)
* [Edmonds Karp](src/com/pa3lo/algorithms/graph/EdmondsKarp.java)
* Matching
  - [Turbo Matching](src/com/pa3lo/algorithms/graph/TurboMatching.java)
* [Lowest common ancestor in tree](src/com/pa3lo/algorithms/data_structures/Tree.java)


## Search
* Get index of value in array
  + [Linear](src/com/pa3lo/algorithms/search/LinearSearch.java)
  + [Quickselect](src/com/pa3lo/algorithms/search/QuickSelect.java)
  + [Binary [sorted array input only]](src/com/pa3lo/algorithms/search/BinarySearch.java)
  + [Lower bound [sorted array input only]](src/com/pa3lo/algorithms/search/LowerBound.java)
  + [Upper bound [sorted array input only]](src/com/pa3lo/algorithms/search/UpperBound.java)
  + Optimized binary (binary until a threashold then linear) [sorted array input only]
  + [Interpolation [sorted array input only]](src/com/pa3lo/algorithms/search/InterpolationSearch.java)

## Sequences
* [Find longest common subsequence (dynamic programming)](src/com/pa3lo/algorithms/sequence/LongestCommonSubsequence.java)
* [Find longest increasing subsequence (dynamic programming)](src/com/pa3lo/algorithms/sequence/LongestIncreasingSubsequence.java)
* [Find number of times a subsequence occurs in a sequence (dynamic programming)](src/com/pa3lo/algorithms/sequence/SubsequenceCounter.java)
* [Find i-th element in a Fibonacci sequence](src/com/pa3lo/algorithms/sequence/FibonacciSequence.java)
  + using a loop
  + using recursion
  + using matrix multiplication
  + using Binet's formula
* [Find total of all elements in a sequence(Arithmetic Progression)](src/com/pa3lo/algorithms/sequence/ArithmeticProgression.java)
  + using a loop
  + using Triangular numbers
* [Largest sum of contiguous subarray (Kadane's algorithm)](src/com/pa3lo/algorithms/sequence/LargestSumContiguousSubarray.java)
* [Longest palin­dromic sub­se­quence (dynamic programming)](src/com/pa3lo/algorithms/sequence/LongestPalindromicSubsequence.java)

## Sorts
* [American Flag Sort](src/com/pa3lo/algorithms/sorts/AmericanFlagSort.java)
* [Bubble Sort](src/com/pa3lo/algorithms/sorts/BubbleSort.java)
* [Counting Sort (Integers only)](src/com/pa3lo/algorithms/sorts/CountingSort.java)
* [Heap Sort](src/com/pa3lo/algorithms/sorts/HeapSort.java)
* [Insertion Sort](src/com/pa3lo/algorithms/sorts/InsertionSort.java)
* [Merge Sort](src/com/pa3lo/algorithms/sorts/MergeSort.java)
* [Quick Sort](src/com/pa3lo/algorithms/sorts/QuickSort.java)
* [Radix Sort (Integers only)](src/com/pa3lo/algorithms/sorts/RadixSort.java)
* [Shell's Sort](src/com/pa3lo/algorithms/sorts/ShellSort.java)

## String Functions
### [String Functions](src/com/pa3lo/algorithms/strings/StringFunctions.java)
* Reverse characters in a string
  + using additional storage (a String or StringBuilder)
  + using in-place swaps
  + using in-place XOR
* Reverse words in a string
  + using char swaps and additional storage (a StringBuilder)
  + using StringTokenizer and additional (a String)
  + using split() method and additional storage (a StringBuilder and String[])
  + using in-place swaps
* Is Palindrome
  + using additional storage (a StringBuilder)
  + using in-place symetric element compares
* Subsets of characters in a String
* Edit (Levenshtein) Distance of two Strings (Recursive, Iterative)
### [Manacher's algorithm (Find the longest Palindrome)](src/com/pa3lo/algorithms/strings/Manacher.java)
### [KMP (Knuth–Morris–Pratt) Algorithm - Length of maximal prefix-suffix for each prefix](src/com/pa3lo/algorithms/strings/KnuthMorrisPratt.java)
### [String rotations](src/com/pa3lo/algorithms/strings/Rotation.java)
  + Find in lexicographically minimal string rotation
  + Find in lexicographically maximal string rotation

