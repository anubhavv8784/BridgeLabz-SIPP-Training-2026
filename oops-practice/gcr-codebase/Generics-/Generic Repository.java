class Repository<T> {

    T data;

    void save(T data) {
        this.data = data;
    }

    T get() {
        return data;
    }

    public static void main(String[] args) {

        Repository<String> r = new Repository<>();

        r.save("Hello Java");

        System.out.println(r.get());
    }
}