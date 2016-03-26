package templates.fileSystem;

public class PrintCollection {

    public void print() {

        CollectionArrayList collectionArrayList = new CollectionArrayList();
        collectionArrayList.formCollectionList();

        System.out.println("collectionArrayList.size() = " +
                collectionArrayList.collectionArrayList.size());

       // System.out.println(collectionArrayList.getCollection().get(0).fileName);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|Super   |  Object      | Object    |Object | Object |");
        System.out.println("|Name    |  Name        | Field1    |Field2 | Field3 |");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");



        for (int i=0; i<collectionArrayList.getCollection().size();i++){
            Object k = collectionArrayList.getCollection().get(i);
            System.out.println(k);

        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}

