package templates.fileSystem;

public class File {
    public String fileName;
    public String fileType;
    public int size;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {

        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "|  "  + getClass().getSuperclass().getSimpleName()+
                " | " + getClass().getSimpleName()+ "\t   " +
                " | " + fileName + "\t   " +
                " | " + fileType +
                "  | " +
                size + "     | ";

    }

    public File(String fileName, String fileType, int size) { // create constructor
        this.fileName = fileName;
        this.fileType = fileType;
        this.size = size;


    }
}
