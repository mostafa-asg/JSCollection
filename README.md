# JSCollection
Implementing sorted collection in Java

## Basic usage:
```java
            //create new instance of sorted collection
            SortedCollection<Integer> lst1 = new SortedCollection<Integer>();

            //add 10 items in descending order , it will automatically sort in ascending order whenever it add to list
            for (int i = 10; i >= 1 ; --i) {
                        lst1.add( i );
            }
            //bellow line will print : 1 2 3 4 5 6 7 8 9 10
            for( int n : lst1 ){
                        System.out.print(n + "\t");
            }
```
If you want to change the sort order or element of your collection does not implement Comparable interface you can provide your Comparator: 
```java
        Comparator<Integer> descOrder = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        };

        SortedCollection<Integer> lst2 = new SortedCollection<Integer>(descOrder);
        
        for (int i = 10; i >= 1 ; --i) {
            lst2.add( i );
        }
        //bellow line will print : 10 9 8 7 6 5 4 3 2 1
        for( int n : lst2 ){
            System.out.print(n + "\t");
        }
```
