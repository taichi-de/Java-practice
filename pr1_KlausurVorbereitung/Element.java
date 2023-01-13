package pr1_KlausurVorbereitung;

public class Element {
    Object object;
    Element next;

    public Element(Object object){
        this.object = object;
        next = null;
    }

    public void setNext(Element next){this.next = next;}

    public Element getNext(){return next;}

    public Object geto(){return object;}
}
