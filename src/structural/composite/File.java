package structural.composite;

public class File implements Component {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}
