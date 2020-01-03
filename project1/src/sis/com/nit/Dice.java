package sis.com.nit;

import java.util.Random;

public class Dice {
  public static int roll(){
	  Random rand=new Random();
	  return rand.nextInt(6)+1;
  }
}
