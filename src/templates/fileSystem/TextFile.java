package templates.fileSystem;

public class TextFile extends File{

    public TextFile(String fileName, String fileType, int size) {
        super(fileName, fileType, size);
    }

    @Override
    public String getFileType() {
        return "word";
    }
}
