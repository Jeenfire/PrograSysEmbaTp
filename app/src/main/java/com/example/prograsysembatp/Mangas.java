package com.example.prograsysembatp;

public class Mangas {

    int id;
    String title;
    String author;
    String description;
    String image;

    public Mangas(){
        System.out.println("Création dun manga !");
        id = 0;
        title = "Inconnu";
        author = "Inconnu";
        description = "";
        image = "";
    }

    public Mangas(int mId, String mTitle, String mAuthor,String mDescription,String mImage)
    {
        System.out.println("Création d'un manga avec des paramètres !");
        id = mId;
        title = mTitle;
        author = mAuthor;
        description = mDescription;
        image = mImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
