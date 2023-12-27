public class FloatSum extends Sumnation {
  float c;
  float d;
  public void FloatSum(float c, float d){
    this.c = c;
    this.d = d;
  }
  @Override
  public void add(float c, float d){
    System.out.println(c+d);
  }
}
