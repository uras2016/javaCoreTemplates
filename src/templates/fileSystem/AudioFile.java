package templates.fileSystem;

public class AudioFile extends File{

    @Override
    public String getFileType() {
        return "mp3";
    }

    public AudioFile(String fileName, String fileType, int size) { // constructor
        super(fileName, fileType, size);


    }
}
