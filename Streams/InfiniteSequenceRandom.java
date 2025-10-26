package Streams;

import java.util.Random;
import java.util.stream.Stream;

public class InfiniteSequenceRandom {
    public static void main(String[] args) {
        Random rnd = new Random();

        Stream <Integer> seqRand = Stream.generate(rnd::nextInt);

        seqRand.limit(10)
        .forEach(System.out::println);
                                    
    }   
}
