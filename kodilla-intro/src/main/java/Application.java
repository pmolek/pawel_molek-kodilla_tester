

public class Application {
    String name;
    double age;
    double height;


    public Application( String name,  int age,  int height) {
        this.name = name;
        this.age = age;
        this.height = height;


    }

public boolean verifyName(){
        return name != null;
}

public boolean verifyAge(){
        return age > 30;
}

public boolean verifyHeigth(){
        return height > 160;
    }


}
