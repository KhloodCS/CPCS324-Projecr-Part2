/* CPCS324 Project Part 2

 Group members: 
    1- Razan Alamri
    2- Khloud Alsofyani
    3- Leen Ba Galaql
    4- Shatha Binmahfouz
 */
package AirFreightApp;

import GraphFramework.Edge;
import GraphFramework.Graph;
import GraphFramework.Vertex;

// AFRouteMap is a subclass of Graph, it inherits all attributes, operations & relationships. 
public class AFRouteMap extends Graph {

    public AFRouteMap() {
        super();
    }

    public AFRouteMap(int verticesNo, int edgeNo, boolean isDigraph) {
        super(verticesNo, edgeNo, isDigraph);
    }

    @Override
    public Vertex creatVertex(int ID) {
        return new Location(ID);
    }

    @Override
    public Edge creatEdge(Vertex v, Vertex u, int w) {
        return new Route(v, u, w);
    }

    @Override
    public Edge creatEdge(int w) {
        return new Route(w);
    }

    @Override
    public Edge creatEdge() {
        return new Route();
    }

}
