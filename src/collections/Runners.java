package collections;





import java.util.ArrayList;

import java.util.Map;
import java.util.TreeMap;

public class Runners {
    public static void main(String[] args) {



        ArrayList bulkRequest = new ArrayList();  // коллекция содержит объекты разных классов



        bulkRequest.add(new MusicFiles("mp3", 4));
        bulkRequest.add(new PictureFiles("Spring", 15));
        bulkRequest.add(new DocFiles("Book", 3));
        bulkRequest.add("854");



       for (int i = 0; i < bulkRequest.size(); i++){
           System.out.println("Element " + "|" + i + "|" + bulkRequest.get(i) + "|");
       }

        TreeMap <Integer, MusicFiles> album = new TreeMap<Integer, MusicFiles>();

        album.put(12, new MusicFiles("Aria", 45));
        album.put(98, new MusicFiles("Ballads", 14));
        album.put(4, new MusicFiles("Scorpions", 5));
        album.put(100, new MusicFiles("Poem", 20));


       // System.out.println("Keys :" + album.keySet() + album.values());

        System.out.println(album.size());

        for (Map.Entry<Integer, MusicFiles> entry : album.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}













