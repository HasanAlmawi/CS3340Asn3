/*Author: Hasan Almawi
 * Edge class returns an edge based on a start vertex and end vertex, and weight
 * */
import java.util.*;

public class Edge {
	private int start;
	private int end;
	private int weight;
	
	public Edge(int i, int j, int w){
		this.start = i;
		this.end = j;
		this.weight = w;
	}
	
	public int getStart(){
		return this.start;
	}
	
	public int getEnd(){
		return this.end;
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public void setStart(int x){
		this.start = x;
	}
	
	public void setEnd(int x){
		this.end = x;
	}
	
	public void setWeight(int x){
		this.weight = x;
	}
}
