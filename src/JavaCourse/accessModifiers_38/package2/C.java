package JavaCourse.accessModifiers_38.package2;
import JavaCourse.accessModifiers_38.package1.*;

public class C {

    // public modifiers makes it visible to any package within the project folder
    public String publicMessage = "This is a public message";
    // protected is accessible to a different class in a different package as long as that class is a sub class
    protected String protectedMessage = "This is protected";
    private String privateMessage = "This is the private";


}
