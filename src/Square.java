public class Square extends Shape {

  public void draw() {
    String htmlBody = "<rect x=\"" + getLeft() + "\" y=\"" + getTop() + "\" width=\"" + getWidth() + "\" height=\"" + getHeight() + "\" fill=\"" + getColor() + "\" />";
    execute(htmlBody);
  }
}
