package task4;

public class Song {
    String name;
    int id;
    String composer;

    public Song(String name, int id, String composer) {
        this.name = name;
        this.id = id;
        this.composer = composer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompose() {
        return composer;
    }

    public void setCompose(String compose) {
        this.composer = compose;
    }

    public String toString() {
        return "Song{name=" + name + ", id=" + id + ", composer=" + composer + "}";
    }
}
