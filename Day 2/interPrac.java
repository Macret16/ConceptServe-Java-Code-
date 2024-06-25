interface inter {
    void printt();
    int number();
}

class interPrac implements inter{
    public void printt() {
        System.out.println("Hello Interface!");
    }

    public int number() {
        return 45;
    }

    public static void main(String args[]) {
        interPrac obj1 = new interPrac();
        obj1.printt();
        System.out.println(obj1.number());
    }
}
