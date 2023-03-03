package review10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {

        Set<String>qaJobs =new HashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api tester");
        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println(qaJobs);
        qaJobs.add("Api Tester");
        qaJobs.add("Api Tester");
        System.out.println("Added duplicates "+qaJobs);

        Set<String>lset=new LinkedHashSet<>(qaJobs);
        System.out.println("LinkedHashSet "+lset);


        Set<String>tSet=new TreeSet<>();
        tSet.addAll(qaJobs);
        System.out.println("TreeSet "+tSet);






    }
}
