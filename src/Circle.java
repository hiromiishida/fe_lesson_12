public class Circle extends Shape {

  public void draw() {
    String htmlBody = "<ellipse cx=\"" + getLeft() / 2 + "\" cy=\"" + getTop() / 2 + "\" rx=\"" + getWidth() / 2 + "\" ry=\"" + getHeight() / 2 + "\" fill=\"" + getColor() + "\"/>";
    execute(htmlBody);
  }
}
