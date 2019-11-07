package objects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Tweet {
    private String autor;
    private String tweet;
    private String fecha;

    public Tweet(String autor, String tweet) {
        this.autor = autor;
        this.tweet = tweet;
    }

    public void publicarTweet() {
        String fecha_actual = "29/10/2019";
        this.fecha = fecha_actual;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}