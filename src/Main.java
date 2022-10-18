import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        drawHeader();

        Circle circle1 = new Circle();
        circle1.setWidth(100);
        circle1.setHeight(50);
        circle1.setColor("blue");
        circle1.setLeft(50);
        circle1.setTop(120);
        circle1.draw();

        Circle circle2 = new Circle();
        circle2.setWidth(120);
        circle2.setHeight(30);
        circle2.setColor("yellow");
        circle2.setLeft(50);
        circle2.setTop(200);
        circle2.draw();

        Square square = new Square();
        square.setWidth(100);
        square.setHeight(100);
        square.setLeft(250);
        square.setTop(0);
        square.setColor("red");
        square.draw();

        drawFooter();
    }

    private static void drawHeader(){
        String result;
        result =
                "<!DOCTYPE html>" +
                        "<html>" +
                        "<head>" +
                        "<meta charset=\"utf-8\">" +
                        "<title>SVG Test</title>" +
                        "</head>" +
                        "<body>" +
                        "<svg x=0 y=0 width=1000 height=1000 style=\"background-color: #fff\">";

        try{
            File file = new File("shape.html");
            FileWriter filewriter = new FileWriter(file);
            filewriter.write(result);
            filewriter.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    private static void drawFooter() {
        String result;
        result =
                "</svg>" +
                        "</body>" +
                        "</html>";
        try{
            File file = new File("shape.html");
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(result);
            filewriter.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}