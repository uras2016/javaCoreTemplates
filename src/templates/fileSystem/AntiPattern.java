package templates.fileSystem;

import java.util.ArrayList;

public class AntiPattern {
    public ArrayList antiPatternCollectionList = new ArrayList();

    public ArrayList getAntiPatternCollectionList(){
        return antiPatternCollectionList;
    }

    public void formAntiPatternCollectionList(){

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

        antiPatternCollectionList.add(image);
        antiPatternCollectionList.add(image1);
        antiPatternCollectionList.add(image2);
        antiPatternCollectionList.add(image3);
        antiPatternCollectionList.add(text);
        antiPatternCollectionList.add(text1);
        antiPatternCollectionList.add(text2);
        antiPatternCollectionList.add(music);
        antiPatternCollectionList.add(music1);
        antiPatternCollectionList.add(music2);
    }

    @Override
    public String toString() {
        return "CollectionArrayList{"+
                "size=" + antiPatternCollectionList.size()+
                "}";
    }
}
