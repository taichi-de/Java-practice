package pr1_KlausurVorbereitung;

public class Node {
    Object obj;
    ListElement next, prev;

    public Node(Object obj){
        this.obj = obj;
        next = null;
    }

    public void setNext(ListElement next){this.next = next;}

    public void setPrev(ListElement prev){this.prev = prev;}

    public ListElement getNext(){return next;}

    public ListElement getPrev(){return prev;}

    public Object geto(){return obj;}
}
