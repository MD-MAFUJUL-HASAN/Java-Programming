
package chain_constructor_using_super;

class Chain_Constructor_Using_Super {

  Chain_Constructor_Using_Super(int version1, int version2) {

    if (version1 > version2) {
      System.out.println("The latest version is: " + version1);
    }

    else {
      System.out.println("The latest version is: " + version2);
    }

  }
  public static void main(String[] args) {
    Main obj = new Main();
  }
}

class Main extends Chain_Constructor_Using_Super {

  Main() {
    super(11, 8);
  }
}
