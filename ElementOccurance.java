package ABC.src;

import java.util.*;

public class ElementOccurance {

    public static void main(String[] Ak) {

        int a[]= {1,2,3,4,1,2,5,3,6,8};

//      Using Collection(Set-Interface).

//		Set<String> s = new TreeSet<>();
//
//		for(int i=0;i<a.length;i++) {
//			int count=0;
//			for(int j=0;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					count++;
//				}
//			}
//
//		if(count>0) {
//			s.add(a[i]+" : "+count);
//		}
//		}

//      Without Using Collections.

        String []c=new String[a.length];

        for(int i=0;i<a.length;i++) {
            int count=0;
            for(int j=0;j<a.length;j++) {
                if(a[i]==a[j]) {
                    count++;
                }
            }

            c[i]=a[i]+" : "+count;
        }

//        System.out.print(Arrays.toString(c));
//        System.out.println();
//        System.out.println();

        for(int i=0;i<c.length;i++) {
            int count=0;
            for(int j=i+1;j<c.length;j++) {
                if((c[i].equals(c[j]))&&c[j]!="-") {
                    c[j]="-";
                    count++;
                }
            }

            if(! c[i].equals("-")) {
                System.out.println(c[i]);
            }
        }



    }

}