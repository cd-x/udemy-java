package main.java.implementation;

public enum Dept {
    CSE("Sulu Reddy", "lyceum"),
    ECE("Bala Sir", "Blaock B"),
    MCA("Alphonse", "Block D"),
    CIVIL("Mr cx", "LHC"),
    EEE("Srinivas","Bloack A");
    final private String head;
    private final String location;

    private Dept(String head, String location){
        this.head = head;
        this.location = location;
    }
    public String getHead(){
        return this.head;
    }
    public String getLocation(){
        return this.location;
    }
}
