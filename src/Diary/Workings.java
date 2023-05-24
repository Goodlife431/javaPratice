package Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Workings {
    private int id;
    private String title;
    private String words;
    private LocalDateTime timeOfEntry;
    public Workings(int id,String title, String words){
        this.id = id;
        this.title = title;
        this.words = words;
        timeOfEntry = LocalDateTime.now();
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return words;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWords(String words) {
        this.words = words;
    }

    @Override
    public String toString() {
        String time = DateTimeFormatter.ofPattern("EEE,dd/MM/yyyy, hh:mm:ss a").format(timeOfEntry);
        return String.format("""
                ===========================
                Entry %s
                Written on: %s
                Title: %s
                Body: %s
                ===========================
                """,id,time,title,words);

}

}
