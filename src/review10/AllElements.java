package review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllElements {
    public static void main(String[] args) {

        Set<String> qaJobs =new LinkedHashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api tester");
        System.out.println(qaJobs);

        for(String qa:qaJobs){
            System.out.print(qa);
        }

        Iterator<String>it=qaJobs.iterator();

        while(it.hasNext()){
            String element=it.next();
            System.out.print(element);
        }

    }
}
