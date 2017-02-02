/**
 * Created by Mostafa Asgari
 * Email : mostafa.asg@gmail.com
 * Github : https://github.com/mostafa-asg
 */
public class SortedCollection<E> extends AbstractCollection<E> {

    private ArrayList<E> elementData;
    private Comparator<E> comparator;

    public SortedCollection() {
        this((Comparator<E>)null);
    }

    public SortedCollection(Comparator<E> comparator) {
        elementData = new ArrayList<E>();
        this.comparator = comparator;
    }

    public SortedCollection(int initialCapacity){
        this(initialCapacity,null);
    }

    public SortedCollection(int initialCapacity , Comparator<E> comparator){
        elementData = new ArrayList<E>(initialCapacity);
        this.comparator = comparator;
    }

    public SortedCollection(Collection<? extends E> c , Comparator<E> comparator) {
        this( c.size() , comparator );
        addAll( c );
    }

    public SortedCollection(Collection<? extends E> c){
        this(c,null);
    }

    @Override
    public boolean add(E e) {
        E temp = e;

        elementData.add( e );
        int pos = elementData.size()-1;

        if( comparator != null ){
            while (pos!=0 && comparator.compare( elementData.get(pos-1) , temp ) > 0){
                elementData.set( pos , elementData.get(pos-1) );
                --pos;
            }
        }
        else{
            while (pos!=0 && ((Comparable)elementData.get(pos-1)).compareTo( temp ) > 0){
                elementData.set( pos , elementData.get(pos-1) );
                --pos;
            }
        }

        if( pos+1 != elementData.size() )
            elementData.set( pos , e );

        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return elementData.iterator();
    }

    @Override
    public int size() {
        return elementData.size();
    }
}
