package test.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.solr.common.util.NamedList;

public class mytest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr1 = {"1_a_b_c_d_e","2_a_b_c_d_e","3_a_d_c","4_a_b_c","5_b_k_n_d_e"};
		HashMap<Integer,NamedList> levelXMap = new HashMap<Integer,NamedList>();
		NamedList levelRecAll=new NamedList();
		NamedList levelRecPer=new NamedList();

		HashMap<Integer,ArrayList> mymap = new HashMap<Integer,ArrayList>();
		for(int i=0; i< arr1.length;i++){
			String[] arr2 = arr1[i].split("_");
			String str =null;			
			for(int j=0;j<arr2.length;j++){
				ArrayList arrlist = new ArrayList();
				if(str==null){
					str = arr2[j];
					if(j==0) str ="";
				}else{
					if(str!="")str = str+"_"+arr2[j];
					else str = arr2[j];
				}
				
				if(arrlist.isEmpty() && i==0 && j!=0){
					arrlist.add(str);
				}
				if(mymap.get(j)==null){
					mymap.put(j,arrlist);
				}else{
					arrlist = mymap.get(j);
					arrlist.add(str);
					mymap.put(j,arrlist);
				}				
			}
		}
			
	/*	for(int k=1; k<mymap.size();k++){
				System.out.println("in map loop");
				ArrayList arr12 = mymap.get(k);
				Iterator itr = arr12.iterator();
				while(itr.hasNext()){
					System.out.println("printing arr list at index K :: "+k+" .... "+itr.next());
				}
		}*/
		
		for(int key=0; key<mymap.size();key++){
			ArrayList levelRec= mymap.get(key);
			for(int l=0;l<levelRec.size();l++)
			{
				int levelindex = levelRecAll.indexOf(levelRec.get(l).toString(), 0);
				if (levelindex!=-1)
				{
					levelRecAll.setVal(levelindex, (Integer.parseInt(levelRecAll.getVal(levelindex).toString()))+1);

				}
				else
				{
					levelRecAll.add(levelRec.get(l).toString(), "1");
				}
			}	
			levelXMap.put(key, levelRecAll);
			levelRecAll=new NamedList();
		}
		for(int k=1; k<levelXMap.size();k++){
			NamedList arr12 = levelXMap.get(k);
			Iterator itr = arr12.iterator();
			while(itr.hasNext()){
				System.out.println("printing arr list at index K :: "+k+" .... "+itr.next());
			}
		}
	
		
	}

}
