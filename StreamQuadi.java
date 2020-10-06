/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamshue_3;

import java.util.stream.IntStream;

/**
 *
 * @author Jonny
 */
public class StreamQuadi {
    
    final int result = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i % 2 == 0);
}
