package com.example.demo.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
  /**
   * StreamとOptionalの練習
   * findFirst(),findAny()
   * 
   */
  public void streamOptionalDemo() {

  }

  /**
   * 配列における比較方法の確認
   * ==, equals, deepEquals
   * 
   */
  public void arrayComparison() {
    
    String[] array1 = {"aaa", "bbb", "ccc" };

    // 元の配列を代入　→ 値も参照先も同じ    
    String[] asArray1 = array1;
    // 元の配列をコピー　→ 値は一緒だが参照先は異なる
    String[] copyArray1 = Arrays.copyOf(array1, 3);
    // 元の配列を同じ値を代入　→　値は一緒だが参照先は異なる
    String[] likeArray1 = {"aaa", "bbb", "ccc" };

    // ==
    System.out.println(array1 == asArray1); /* true */
    System.out.println(array1 == copyArray1); /* false */
    System.out.println(array1 == likeArray1); /* false */

    // equals
    System.out.println(Arrays.equals(array1, asArray1)); /* true */
    System.out.println(Arrays.equals(array1, copyArray1)); /* true */
    System.out.println(Arrays.equals(array1, likeArray1)); /* true */

    // deepEquals
    System.out.println(Arrays.deepEquals(array1, asArray1)); /* true */
    System.out.println(Arrays.deepEquals(array1, copyArray1)); /* true */
    System.out.println(Arrays.deepEquals(array1, likeArray1)); /* true */

    // 二次元配列の場合
    String[][] array2 = {{"aaa", "bbb", "ccc" }, {"ddd", "eee", "fff"}};

    String[][] asArray2 = array2;
    String[][] copyArray2 = Arrays.copyOf(array2, 2);
    String[][] likeArray2 = {{"aaa", "bbb", "ccc" }, {"ddd", "eee", "fff"}};

    // ==
    System.out.println(array2 == asArray2); /* true */
    System.out.println(array2 == copyArray2); /* false */
    System.out.println(array2 == likeArray2); /* false */

    // equals
    // equalsは配列の中の参照先が同じか判断している。
    // likeArray2は"配列の中の配列"の参照先が異なるため、falseとなる
    System.out.println(Arrays.equals(array2, asArray2)); /* true */
    System.out.println(Arrays.equals(array2, copyArray2)); /* true */
    System.out.println(Arrays.equals(array2, likeArray2)); /* false */

    // deepEquals
    // "配列の中の配列"の値が同じか判断するため、全てtrueとなる。
    System.out.println(Arrays.deepEquals(array2, asArray2));  /* true */
    System.out.println(Arrays.deepEquals(array2, copyArray2));  /* true */
    System.out.println(Arrays.deepEquals(array2, likeArray2));  /* true */

  }

}
