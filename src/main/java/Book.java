class Book {
    public Book () {}
    public Book (int id) {
        setId(id);
    }

    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
