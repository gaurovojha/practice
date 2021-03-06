package practice.core.gaurov.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Filtering {

    static Map<String, List<Order>> order = new HashMap<>();
    static Map<String, List<Employee>> employee = new HashMap<>();

    public static void main(String[] args) {
        order.put("A", new ArrayList<>(Arrays.asList(new Order("A"), new Order("B"))));
        order.put("B", new ArrayList<>(Arrays.asList(new Order("C"), new Order("D"))));

        Map<String, List<Order>> newOrder  = order.entrySet().stream()
                .peek(e -> System.out.println(e.getValue().stream().collect(Collectors.toList())))
                .filter(i -> i.getValue().stream().anyMatch( e -> "".equals(e.getOrderId())))
                .peek(e -> System.out.println(e.getValue().stream().collect(Collectors.toList())))
                .collect(Collectors.toMap(i -> i.getKey(), i -> i.getValue()));
        System.out.println(newOrder.values().stream().collect(Collectors.toList()));


        employee.put("1", new ArrayList<>(Arrays.asList(new Employee("M"), new Employee("F"))));
        employee.put("2", new ArrayList<>(Arrays.asList(new Employee("M"), new Employee("F"))));


        Map<String, List<Employee>> r2 = employee.entrySet().stream()
                .filter(i -> i.getValue().stream().allMatch(e-> "M".equals(e.gender)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        Map<String, List<Order>> r1 = order.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        i -> i.getValue().stream()
                                .filter(e -> "122".equals(e.getOrderId())).collect(Collectors.toList())));


        System.out.println(r2);
        System.out.println(r1);

    }



}

class Employee{
    public String gender;

    public String getGender() {
        return gender;
    }

    public Employee(String gender) {
        this.gender = gender;
    }
}

class Order{

    String orderId;
    String orderValue;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(String orderValue) {
        this.orderValue = orderValue;
    }

    public Order(String orderId) {
        this.orderId = orderId;
    }
}
