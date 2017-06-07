package portfolio.exam_8;

import java.util.List;

/**
 * Created by Козак on 06.06.2017.
 */
public class Vertex {

    private int distance;
    private String name;
    private List<Vertex> list;

    public Vertex(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void addVertex(Vertex vertex) {
        list.add(vertex);
    }

    public List<Vertex> getVertices() {
        return list;
    }

}
