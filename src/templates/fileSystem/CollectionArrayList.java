package templates.fileSystem;

import java.util.ArrayList;

public class CollectionArrayList {


    // collection of File type
    public ArrayList<File> collectionArrayList = new ArrayList();

    public ArrayList<File> getCollection() {
        return collectionArrayList;
    }

    public void formCollectionList() {

        ImageFile image = new ImageFile("im1", "GPEG", 14);
        ImageFile image1 = new ImageFile("im2", "GPEG", 15);
        ImageFile image2 = new ImageFile("im3", "GPEG", 16);
        ImageFile image3 = new ImageFile("im4", "GPEG", 17);
        // System.out.println(image.toString());
        TextFile text = new TextFile("rtf1", "word", 1);
        TextFile text1 = new TextFile("rtf2", "word", 2);
        TextFile text2 = new TextFile("rtf3", "word", 3);
        // System.out.println(text.toString());
        AudioFile music = new AudioFile("song1", "mp3", 20);
        AudioFile music1 = new AudioFile("song2", "mp3", 30);
        AudioFile music2 = new AudioFile("song3", "mp3", 40);
        // System.out.println(music.toString());

        collectionArrayList.add(image);
        collectionArrayList.add(image1);
        collectionArrayList.add(image2);
        collectionArrayList.add(image3);
        collectionArrayList.add(text);
        collectionArrayList.add(text1);
        collectionArrayList.add(text2);
        collectionArrayList.add(music);
        collectionArrayList.add(music1);
        collectionArrayList.add(music2);
    }

    @Override
    public String toString() {
        return "CollectionArrayList{"+
                "size=" + collectionArrayList.size()+
                "}";
    }
}