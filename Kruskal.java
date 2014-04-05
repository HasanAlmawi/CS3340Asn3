/*Author: Hasan Almawi
 * Solves the Kruskal algorithm
 * */
import java.util.*;

public class Kruskal {
	public Kruskal(List<Edge> listEdges, int size){
		uandf edgeStuff = new uandf(size);
		for(int i = 0; i<size;i++){
			edgeStuff.makeset(i);
		}
		
		Collections.sort(listEdges, new Comparator<Edge>(){
			public int compare(Edge x, Edge y){
				if(x.getWeight()>y.getWeight())return 1;
				else if(x.getWeight()<y.getWeight())return -1;
				else return 0;
			}
		});
		
		for(int i=0; i<listEdges.size();i++){
			if(edgeStuff.find_set(listEdges.get(i).getStart()-1)!=edgeStuff.find_set(listEdges.get(i).getEnd()-1)){
				System.out.println(listEdges.get(i).getStart()+" "+listEdges.get(i).getEnd()+" "+listEdges.get(i).getWeight());
				edgeStuff.unionsets(listEdges.get(i).getStart()-1, listEdges.get(i).getEnd()-1);
			}
		}
	}
}
