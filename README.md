# JSCollection
Implementing sorted collection in Java

## Basic usage:
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

