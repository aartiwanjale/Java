package Immutable;

final class Pro1 {
    private final int id;
    private final String name;

    Pro1(int id, String name) {
        this.id = id;
        this.name = name;
    }



    public int getId() {
        System.out.println("This is the getID");
        return this.id;
    }

    public String getName() {
        System.out.println("This is the get Name");
        return this.name;
    }


   public static void main(String[] args) {
        Pro1 p=new Pro1(1,"Aarti");
        p.getId();
        p.getName();
       System.out.println(p.id);
       System.out.println(p.name);
    }
}
