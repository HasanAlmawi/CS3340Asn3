import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class asn3{
	public static void main(String args[]) throws FileNotFoundException {
		try{
		//Initialize string to read in line
		String line;
		//Buffered reader to read in input from Input Stream
		BufferedReader scnr = new BufferedReader(new InputStreamReader(System.in));		
		List<Edge> listEdge = new ArrayList<Edge>();	
		String sizeString = scnr.readLine();
		int size = Integer.parseInt(sizeString);
		String[] graphList = new String[size];
		for(int i=0;i<graphList.length;i++){
			int num = i+1;
			graphList[i] = num+ " ";
		}
		while((line = scnr.readLine())!= null){
			String[] temp = line.split("\\s+");
			int start = Integer.parseInt(temp[0]);
			int end = Integer.parseInt(temp[1]);
			int weight = Integer.parseInt(temp[2]);
			
			//add nodes to array
			graphList[start-1] = graphList[start-1] + " " + end;
			graphList[end-1] = graphList[end-1] + " " + start;
			
			
			Edge tempEdge = new Edge(start,end,weight);
			listEdge.add(tempEdge);
			
			//create string representation of graph
		}
		scnr.close();
		
		for(int i =0; i < graphList.length;i++){
			System.out.println(graphList[i]);
		}
		System.out.println("*************************PART B***************************");
		Kruskal answer = new Kruskal(listEdge, size);
		
		}catch(IOException e){}
}}