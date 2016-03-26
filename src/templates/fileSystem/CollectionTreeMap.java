package templates.fileSystem;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CollectionTreeMap {

    public TreeMap <Integer, File> collectionTreeMap = new TreeMap<Integer, File>();

  /*  public CollectionTreeMap getCollection(){
        return collectionTreeMap;
    }
  */

   public void formCollectionTreeMap(){
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


        collectionTreeMap.put(1,music);
        collectionTreeMap.put(8,music1);
        collectionTreeMap.put(3,music2);
        collectionTreeMap.put(543,text);
        collectionTreeMap.put(4,text1);
        collectionTreeMap.put(1,text2);
        collectionTreeMap.put(0,image);
        collectionTreeMap.put(32,image1);
        collectionTreeMap.put(45,image2);
        collectionTreeMap.put(15,image3);

       System.out.println(collectionTreeMap.size());

       for (Map.Entry e : collectionTreeMap.entrySet()){
           System.out.println(e.getKey() + "-" + e.getValue());
       }
    }



    @Override
    public String toString() {
        return "CollectionList{" +
                "size=" + CollectionTreeMap.this +
                '}';
    }
}
