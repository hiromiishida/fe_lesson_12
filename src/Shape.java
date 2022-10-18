import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Shape {
  private int width;
  private int height;
  private String color;

  private int left;

  public int getTop() {
    return top;
  }

  public void setTop(int top) {
    this.top = top;
  }

  private int top;

  public int getLeft() {
    return left;
  }

  public void setLeft(int left) {
    this.left = left;
  }

  protected void execute(String htmlBody) {
    try{
      File file = new File("shape.html");
      FileWriter filewriter = new FileWriter(file, true);
      filewriter.write(htmlBody);
      filewriter.close();
    }catch(IOException e){
      System.out.println(e);
    }
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

}
