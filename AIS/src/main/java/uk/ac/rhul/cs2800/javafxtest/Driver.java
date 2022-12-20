package uk.ac.rhul.cs2800.javafxtest;


/**
 * JavaFX for GUI feature.
 * 
 * @author ahmet
 */

public class Driver {

  /**
   * The main method that launches the JavaFX.
   * 
   * @param args is the first input from the command line.
   */
  public static void main(String[] args) {
    Launcher.startJavaFX(new Controller(), args);
  }

}
