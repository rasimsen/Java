import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		LocalDate currenctDate = LocalDate.now();
		Instant now = currenctDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
		ZoneId currentZone = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
		System.out.println("Zoned date: " + zonedDateTime);

		// How will you print 10 random numbers using forEach of java 8?
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);

		System.out.println("----------------------------------------------------------");
		// How will you print unique squares of numbers in java 8?
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());

		System.out.println(squaresList);

		System.out.println("----------------------------------------------------------");
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		// get count of empty string
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);

		System.out.println("----------------------------------------------------------");

		// What is Parallel Processing in Java 8?
		List<String> strings2 = Arrays.asList("abc", "", "", "bc", "efg", "abcd", "", "jkl");
		// get count of empty string
		int count2 = (int) strings2.parallelStream().filter(string -> string.isEmpty()).count();
		// It is very easy to switch between sequential and parallel streams.
		System.out.println(count2);

		System.out.println("----------------------------------------------------------");

		// What are collectors in Java 8?
		List<String> strings3 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings3.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

		System.out.println("----------------------------------------------------------");

		// How will you get the highest number present in a list using Java 8?
		List<Integer> numbers4 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = numbers4.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());

		System.out.println("----------------------------------------------------------");
		// How will you get the lowest number present in a list using Java 8?
		List<Integer> numbers5 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats2 = numbers5.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Lowest number in List : " + stats2.getMin());

		System.out.println("----------------------------------------------------------");
		// How will you get the sum of all numbers present in a list using Java 8?
		List<Integer> numbers6 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats3 = numbers6.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Sum of all numbers : " + stats3.getSum());

		System.out.println("----------------------------------------------------------");
		// How will you get the average of all numbers present in a list using Java 8?
		List<Integer> numbers7 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats7 = numbers7.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Average of all numbers : " + stats7.getAverage());

		// ----------------------------------------------- DATE
		// -----------------------------------------
		System.out.println("----------------------------------------------------------");
		// Get the current date
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);

		System.out.println("----------------------------------------------------------");
		// How will you add 1 week to current date using local datetime api of java8?
		// add 1 week to the current date
		LocalDate today2 = LocalDate.now();
		LocalDate nextWeek = today2.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week: " + nextWeek);

		System.out.println("----------------------------------------------------------");
		// How will you add 1 month to current date using local datetime api of java8?
		// add 1 month to the current date
		LocalDate today3 = LocalDate.now();
		LocalDate nextMonth = today3.plus(1, ChronoUnit.MONTHS);
		System.out.println("Next month: " + nextMonth);

		System.out.println("----------------------------------------------------------");
		// How will you add 1 year to current date using local datetime api of java8?
		// add 1 year to the current date
		LocalDate today4 = LocalDate.now();
		LocalDate nextYear = today4.plus(1, ChronoUnit.YEARS);
		System.out.println("Next year: " + nextYear);

		System.out.println("----------------------------------------------------------");
		// How will you add 10 years to current date using local datetime api of java8?
		// add 10 years to the current date
		LocalDate today5 = LocalDate.now();
		LocalDate nextDecade = today5.plus(1, ChronoUnit.DECADES);
		System.out.println("Date after ten year: " + nextDecade);

		System.out.println("----------------------------------------------------------");
		// How will you get next tuesday using java8?
		// get the next tuesday
		LocalDate today6 = LocalDate.now();
		LocalDate nextTuesday = today6.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println("Next Tuesday on : " + nextTuesday);

		System.out.println("----------------------------------------------------------");
		// How will you get second saturday of next month using java8?
		// get the second saturday of next month
		LocalDate date1 = LocalDate.now();
		LocalDate firstInYear = LocalDate.of(date1.getYear(), date1.getMonth(), 1);
		LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Second Saturday on : " + secondSaturday);

		System.out.println("----------------------------------------------------------");
		// How will you get the instant of current date in terms of milliseconds using
		// java8?

		// Get the instant of current date in terms of milliseconds
		Date currentDate = new Date();
		Instant instant2 = currentDate.toInstant();
		System.out.println(instant2);

		System.out.println("----------------------------------------------------------");
		// How will you get the instant of local date time using time in of milliseconds
		// using java8?

		Instant now3 = currentDate.toInstant();
		ZoneId currentZone3 = ZoneId.systemDefault();
		LocalDateTime localDateTime = LocalDateTime.ofInstant(now3, currentZone3);
		System.out.println("Local date: " + localDateTime);

		// How will you get the instant of zoned date time using time in of milliseconds
		// using java8?
		Instant now4 = currentDate.toInstant();
		ZoneId currentZone4 = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime4 = ZonedDateTime.ofInstant(now4, currentZone4);
		System.out.println("Zoned date: " + zonedDateTime4);

	}

	// sort using java 8
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
}
