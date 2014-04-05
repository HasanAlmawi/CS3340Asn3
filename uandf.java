/* Class: uandf
 * Author: Hasan Almawi
 * Description: Creates a union find data type
 * */

import java.util.*;

public class uandf {
	//Array to store the parent integers
	private int[] parent;
	//Array to store the ranks of each integer
	private int[] rank;
	//Boolean value to see whether or not final set is called
	private boolean finalSet;
	
	//Uandf constructor: Constructs an Union-find Data type with n elements
	public uandf(int n){
		//set parent size to n
		this.parent = new int[n];
		//Initialize parent elements
		for(int i=0;i<n;i++){
			this.parent[i]=0;
		}
		//Initialize rank elements
		this.rank = new int[n];
		for(int i=0;i<n;i++){
			this.rank[i]=0;
		}
		//Set final set to false
		this.finalSet = false;
	}
	
	//Makeset: Creates a new set whose only member is i
	public void makeset(int i){
		//If the final set is false
		if(this.finalSet==false){
			//set the parent to the i passed
			this.parent[i]=i;
		}
	}
	
	//Union sets: Unites the dynamic sets that contain i and j, int a new set that is the union
	//of these two sets
	public void unionsets(int i, int j){
		//If the final set is false
		if(this.finalSet==false){
			//Find the parent of i
			i=find_set(i);
			//Find the parent of j
			j=find_set(j);
			
			//If the rank of i is greater than j
			if(this.rank[i]>this.rank[j]){
				//Set the parent of j to be equal to the parent of i
				this.parent[j]=this.parent[i];
			}
			//Otherwise vice versa
			else if(this.rank[j]>this.rank[i]){
				this.parent[i]=this.parent[j];
			}
			//Otherwise if they have the same ranks and are different nodes
			else if(this.parent[i]!=this.parent[j]){
				//Set parent of j to be parent of i
				this.parent[j]=this.parent[i];
				//increment rank of i
				this.rank[i]++;
			}
		}
	}
	
	//Find set: Returns the representative of the set containing i
	public int find_set(int i){
		//If finalset is false
		if(this.finalSet==false){
			//If i is not its parent
			if(this.parent[i]!=i){ 
				//recursive call
				this.parent[i]=find_set(this.parent[i]);
				//return the parent
				return parent[i];
			}
			//Otherwise return i
			return i;
		}
		//If final set is true
		else{
			//Return the parent of i
			return this.parent[i];
		}
	}
}
