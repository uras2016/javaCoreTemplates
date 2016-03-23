package collections;


public class Files {
    @Override
    public String toString() {
        return "Files{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    private String name;
    private int size;

    public Files(String name, int size) {
        this.name = name;
        this.size = size;
    }


    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
    public void open(){
        System.out.println("Start");

    }
    public String close(String x) {
        System.out.println("Exit of " + x);

        return x;
    }




}

