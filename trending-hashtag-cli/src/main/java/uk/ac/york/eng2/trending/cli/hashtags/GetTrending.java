package uk.ac.york.eng2.trending.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.trending.cli.domain.HashtagCount;
import uk.ac.york.eng2.trending.cli.helpers.NameTotalPair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.stream.Collectors;

/**
 * Class which declares a command to get the trending hashtag.
 * <p>
 * Retrieves hashtag counts, gets totals of the ones not "expired", then
 * sorts in descending order based on total until the 10th tag.
 *
 * @author Y3884331
 * @version 0.1
 * @since 0.1
*/
@Command(name="get-trending", description="Gets currently trending tags", mixinStandardHelpOptions=true)
public class GetTrending implements Runnable {
	
	Hashtable<String, Integer> aggregatedValues = new Hashtable<String, Integer>();
	
	ArrayList<NameTotalPair> myList = new ArrayList<NameTotalPair>();
	
	@Inject
	private HashtagCountsClient client;
	
	@Override
	public void run() {
		for (HashtagCount h : client.list()) {
			if (h.getTimeStamp() < (System.currentTimeMillis() - 3600000)) {continue;}
			if (aggregatedValues.containsKey(h.getName())) {
				aggregatedValues.replace(h.getName(), aggregatedValues.get(h.getName()) + 1);
			} else {
				aggregatedValues.put(h.getName(), 1);
			}
		}
		
		aggregatedValues.forEach((key, value) -> myList.add(new NameTotalPair(key, value)));
		
		Collections.sort(myList, new MyComparator());
		
		myList = (ArrayList<NameTotalPair>) myList.stream().limit(10).collect(Collectors.toList());
		
		for(NameTotalPair x : myList) {
			System.out.println(x.getName() + " " + x.getTotal());
		}
		
	}
	
	public class MyComparator implements Comparator<NameTotalPair> {
		@Override
		public int compare(NameTotalPair o1, NameTotalPair o2) {
			return o2.getTotal().compareTo(o1.getTotal());
		}
	}

}
