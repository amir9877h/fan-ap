public class MyGenericClass<T> {
    T obj;

    MyGenericClass(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}
