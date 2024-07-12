package javaexercises;

import java.util.*;
import java.util.stream.Collectors;

public final class EmployeeImmutableCalss {

    private final String name; //immutable class
    private final Date doj; // mutable class
    private final List<String> mobile;
    final AddressMutableClass address;


    private AddressMutableClass getAddress(){
       return new AddressMutableClass(address.getCity(),address.getZip());//return new obj
      //  return address; if return this obj only, user can set new address
    }


    public String getName() {
        return name;
    }

    public Date getDoj() {
      //  return doj; if we return like this, it still can modify
        //so maike it clone
        return (Date) doj.clone();
    }

    public List<String> getMobile() {
        //return mobile;// this one can be modify
        //so need to use unmodifiableList
        return Collections.unmodifiableList(mobile);
      //  return new ArrayList<>(mobile);can return copy of arraylist->

    }

    public EmployeeImmutableCalss(String name, Date doj, List<String> mobile, AddressMutableClass address) {
        this.name = name;
        this.doj = doj;
        this.mobile = mobile;
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeImmutableCalss{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {

        final int a=10;
        final List<String> list = new ArrayList<>();
        list.add("test");
        list.add("arisha");
      // list.remove("test");
        System.out.println(list);

        AddressMutableClass addr = new AddressMutableClass("Banglore","84943");
        EmployeeImmutableCalss employee = new EmployeeImmutableCalss("Bronsant",
                new Date(), Arrays.stream(new String[]{"3453","2332"}).collect(Collectors.toList()), addr);

        //try to add name here,bcoz String is Immutable class
       // employee.name ="tester"; **can not reassign

        //employee.getDoj().setDate(20);// we can reassign even declare with final

//        employee.getMobile().add("90999");//able to modify it

        employee.getAddress().setCity("pune");
        System.out.println(employee);
    }


}
