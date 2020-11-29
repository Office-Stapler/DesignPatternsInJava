package structural.composite;


public class Main {
    public static void main(String[] args) {
        Directory mainDirectory = new Directory("main");
        File javaFile = new File("test.java", 10);
        mainDirectory.add(javaFile);

        Directory subDirectory = new Directory("src");
        File mainFile = new File("report.pdf", 128);
        subDirectory.add(mainFile);

        mainDirectory.add(subDirectory);
        mainDirectory.show();
        System.out.println(mainDirectory.getSize());
    }
}