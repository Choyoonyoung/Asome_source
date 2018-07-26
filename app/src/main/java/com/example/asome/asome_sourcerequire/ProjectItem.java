package com.example.asome.asome_sourcerequire;

public class ProjectItem {
    String title;
    String about;
    public ProjectItem(String title, String about){
        this.title = title;
        this.about = about;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
