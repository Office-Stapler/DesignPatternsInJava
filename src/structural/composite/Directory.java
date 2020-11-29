package structural.composite;

import java.util.ArrayList;


public class Directory implements Component {
    private String name;

    public Directory(String name) {
        this.name = name;
    }

    ArrayList<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public int getSize() {
        int size = 1;
        for (Component component : components)
            size += component.getSize();
        return size;
    }

    @Override
    public void show() {
        System.out.println("===Directory===");
        System.out.println(name);
        for (Component component : components)
            component.show();
    }
    
}
