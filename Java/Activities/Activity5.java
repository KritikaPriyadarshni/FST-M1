package activities;

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;

    }

     static class MyBook extends Book{
        public void setTitle(String s) {
            title = s;
        }

    }




}

public class Activity5 {
    public static void main(String[] args){
        String title = "Positive thinking";
        Book newNovel = new Book.MyBook();
        newNovel.setTitle(title);
        System.out.println("Tile of the book:" + newNovel.getTitle() );
    }
}
