package templates.fileSystem;

public class ImageFile extends File {

    public ImageFile(String fileName, String fileType, int size) {
        super(fileName, fileType, size);
    }

    @Override
    public String getFileType() {
        return "GPEG";
    }
}
