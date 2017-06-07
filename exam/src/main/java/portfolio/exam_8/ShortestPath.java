package portfolio.exam_8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Козак on 06.06.2017.
 */

public class ShortestPath {

    private static List<String> vnames = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
    private int[] nums = {1,2,3};
    private static int INF = Integer.MAX_VALUE;
    private String start;
    private String end;
    private Vertex vertex;

    public ShortestPath(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public void myAlgotythm() {

    }

    public static void main(String args[]) {

        String s, e;

        Scanner scan = new Scanner(System.in);
        LinkedList<Vertex> vertices = new LinkedList<Vertex>();
        for(String str: vnames) {
            vertices.add(new Vertex(str, INF));
        }


        System.out.println("choose start position from the list:");
        System.out.println(vnames);
        s = scan.next();
        if(vnames.contains(s)) {
            System.out.println("choose end position");
            e = scan.next();
        }

    }


}

