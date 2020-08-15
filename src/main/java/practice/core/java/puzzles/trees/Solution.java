package practice.core.java.puzzles.trees;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.Comparator.reverseOrder;

// CLASS BEGINS, THIS CLASS IS REQUIRED
class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static ArrayList<String> topNCompetitors(int numCompetitors,
                                             int topNCompetitors,
                                             List<String> competitors,
                                             int numReviews,
                                             List<String> reviews)
    {

        // WRITE YOUR CODE HERE

        Map<String,Integer> competitorsReviewCountMap = new HashMap<>();

        for(String competitor : competitors){
            competitorsReviewCountMap.put(competitor,0);
            for(String review : reviews){
                Pattern pattern = Pattern.compile(competitor);
                Matcher matcher = pattern.matcher(review);
                if(matcher.find()){
                    competitorsReviewCountMap.put(competitor,competitorsReviewCountMap.get(competitor)+1);
                }
            }
        }


        final Map<String, Integer> competitorsSortedByCount = competitorsReviewCountMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));


        ArrayList<String> result = new ArrayList<>();



        int i = 1;
        for (String key : competitorsSortedByCount.keySet()){
            result.add(key);
            if(i>=topNCompetitors){
                break;
            }
            i++;
        }

        return result;
    }
    // METHOD SIGNATURE ENDS

    public static void main(String[] args) {
        List<String> competitors = new ArrayList<>();
        competitors.add("a");
        competitors.add("b");
        competitors.add("c");

        List<String> reviews= new ArrayList<>();
        reviews.add("a is good");
        reviews.add("b is good");
        reviews.add("a is good");
        topNCompetitors(5,2,competitors,3,reviews);
    }

}