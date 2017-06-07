package portfolio.exam_1;

/**
 * Created by Козак on 07.06.2017.
 */
public class ObjectBox {
    private Object object;
    private ObjectBox next;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public ObjectBox getNext() {
        return next;
    }

    public void setNext(ObjectBox next) {
        this.next = next;
    }
}