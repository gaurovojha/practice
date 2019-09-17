package practice.core.java.java8.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WeightSortNumbers {

    public static void main(String[] args) {
        WeightSortNumbers weightSortNumbers = new WeightSortNumbers();
        //weightSortNumber("10 11 13 14 144");
        //System.out.println(1001/10);
        //System.out.println(calcSum(11111));

        weightSortNumbers.weightSortNumber("10 11 13 14 144 441").forEach((i)->{
            System.out.println(i.getNum()+" "+i.getWeight());
        });
    }


    public List<Number> weightSortNumber(String spaceDelimitedNumbers){

        String[] numberArr = spaceDelimitedNumbers.split(" ");
        List<Integer> intArr = Arrays.asList(numberArr).stream().
                map(Integer::valueOf).collect(Collectors.toList());

        List<Number> numberList = new ArrayList<>();
        intArr.forEach((i)->{
            numberList.add(new Number(i,calcSum(i)));
        });

        Collections.sort(numberList);
        return numberList;

    }

    private static int calcSum(int num){
        int sum=0;
        while(num>0){
            sum= sum + num%10;
            num=num/10;
        }
        return sum;
    }

    class Number implements Comparable<Number>{
       Integer num;
       Integer weight;

        public Number(Integer num, Integer weight) {
            this.num = num;
            this.weight = weight;
        }

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        @Override
        public int compareTo(Number o) {
            if(this.getWeight().compareTo(o.getWeight())==0){
                return this.getNum().compareTo(o.getNum());
            }
            return this.getWeight().compareTo(o.getWeight());
        }
    }
}
