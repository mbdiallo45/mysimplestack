public class Item {
    private Object value;

    Item( Object v ){
        value = v;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object v) {
        this.value = v;
    }
}
