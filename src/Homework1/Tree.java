package Homework1;


public class Tree {
    public static String type;
    public static int height;
    public static int coutOfsticks;
    public static String colour;



    public static void main(String[] args) {

    }
    public String getType;
    public int getHeight(){
        return height;
    }

    public int getCoutOfsticks(){
        return coutOfsticks;
    }
    public String getColour;

    public Tree(String type, int height){
        this.type=type;
        this.height=height;
        this.coutOfsticks=13;
        this.colour="Зеленый";
    }
    public Tree(int height, int coutOfsticks, String colour){
        this.height=height;
        this.coutOfsticks=coutOfsticks;
        this.colour=colour;
        this.type="пихта";
    }
    public Tree(){
        this.height=350;
        this.coutOfsticks=29;
        this.colour= "Желтый";
    }
    public Tree(String type){
        this();
        this.type=type;
    }
    public static void getInfo(){
        System.out.println(type);
        System.out.println(height);
        System.out.println(coutOfsticks);
        System.out.println(colour);
    }



    }

