package portfolio.exam_1;

class RecTest {
  int values[];

  RecTest(int i) {
    values = new int[i];
  }
  void printarray(int i) {
    if (i == 0) return;
    else printarray(i - 1);
    System.out.println("[" + (i - 1) + "] " + values[i - 1]);
  }
}

class Recursion {
  public static void main(String[] args) {
    RecTest ob = new RecTest(10);
    int i;
    for (i = 0; i < 10; i++) ob.values[i] = i;
    ob.printarray(10);
  }
}
  