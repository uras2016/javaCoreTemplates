package templates.fileSystem;

public class Directory {
    String directoryName;
    String directoryOwner;
    int directorySize;
    File file;

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getDirectoryOwner() {
        return directoryOwner;
    }

    public void setDirectoryOwner(String directoryOwner) {
        this.directoryOwner = directoryOwner;
    }

    public int getDirectorySize() {
        return directorySize;
    }

    public void setDirectorySize(int directorySize) {
        this.directorySize = directorySize;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Directory() {
        System.out.println("Создан экземпляр класса Directory");
        System.out.println("Создан экземпляр класса File");
        System.out.println("Создано отношение композиция классов Directory(контейнер) и Files(содержимое)");

    }
}
