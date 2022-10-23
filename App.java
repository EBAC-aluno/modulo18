@Retention(RetentionPolicy.RUNTIME)
@interface Tabela{

  public String name();
}

public class App {
  
  @Tabela(name = "TABLE_NAME")
  public static void myMethod() {
  }
  
  public static void main(String args[]) {

  }
}
