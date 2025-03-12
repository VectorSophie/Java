package kosa.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streamer {
	public static void main(String[] args) {
		List<Integer> numbers = IntStream.rangeClosed(1,10).filter(n -> n%2==0).map(n -> n * n).boxed().collect(Collectors.toList());
		
		List<Integer> squared = numbers.stream().filter(n -> n%2==0).map(n -> n * n).collect(Collectors.toList());
		System.out.println(numbers);
	}
}
