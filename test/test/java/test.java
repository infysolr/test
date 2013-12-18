package test.java;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;

import org.apache.commons.lang.StringUtils;




//import org.apache.commons.lang.StringUtils;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String int1 =  "041 63720320";
		//String int2 =  "041 63720";
		String values[]={"12605_1_Abc","12605_1_abc_kbc","12605_1_abk_bbk_cck_avc",};
		String lName  = values[2];
		String values1[]={"12605_Abc","12605_abc_kbc","12605_abc_def_ghi",};
		//String val = "L10,L1,l02,l03,l04,l05,l10,l15";
		int levell = 9; 
		String strr = "12605_4_abk_bbk_cck_avc";
		String cName = "12605_abc_def_ghi";
		int levelCurrent = sLevel(values1);
		Set<String> categoriesSet = new HashSet<String>();
		String fq="categories:(\"12_fd_fg_sg_5\")";
		int idx2=fq.lastIndexOf("\"");
		int idx1=fq.indexOf("_");
		fq = fq.substring(idx1+1,idx2);
		String category ="12605_Kids_Kids&#039; Clothing & Accessories_Girls&#039; Clothing_Girls&#039; Accessories";
		String splitArray[] = category.split("_");
		String catalog = splitArray[0];
		int size= splitArray.length -1;
		String ret="categories".concat(":\"").concat(catalog).concat("_")+size+"_"+category.substring(category.indexOf("_")+1).concat("\"");
		boolean flagNlevel=true;
		String filter = "subcatAttributes:(\"12605_Kids_Kids&#039; Clothing & Accessories_Size=XS\")";
		if(flagNlevel==true){
			String[] arr = filter.split("\"");
			if(arr.length>=2){
				String str = arr[1].substring(arr[1].lastIndexOf("_")+1);
				filter="searchableAttributes:("+"\""+ str+"\")";
				//System.out.println("filter ... "+filter);
			}
		}
	/*	String fqField="categories:(\"12605_Appliances_Refrigerators_French Door Refrigerators\"  OR  \"12605_Appliances_Refrigerators_Top Freezer Refrigerators\")";
		String slevel = "L"+String.format("%02d",0);
		System.out.println("print slevel .."+slevel);
		List<String> prefixes = new ArrayList<String>();
		boolean parsed = false;
    	while(!parsed) {
    		int quoteStart = fqField.indexOf("\"");
	    	int quoteEnd = (quoteStart >= 0) ? fqField.indexOf("\"", quoteStart+1) : -1;
	    	if(quoteEnd > 0) {
	    	    //System.out.println("fqField.substring(quoteStart+1, quoteEnd) .. "+fqField.substring(quoteStart+1, quoteEnd));
	    		prefixes.add(fqField.substring(quoteStart+1, quoteEnd));
	    		fqField = fqField.substring(quoteEnd+1, fqField.length());
	    		//System.out.println("fqField /// .. "+fqField);
	    	} else {
	    		parsed = true;
	    	}
    	}
    	String[] arr = prefixes.toArray(new String[]{});
    	int le=sLevel(arr);
    	System.out.println("le ... "+le);
    	for(int k=0;k<arr.length;k++){
    		System.out.println("arr ... "+arr[k]);
    	}*/
		String value1="primaryImg_http://c.shld.net/rpx/i/s/i/spin/image/spin_prod_682420101";
		System.out.println("value 1 ... "+value1.substring(value1.indexOf("_")+1));
		Date startDate = new Date();
		startDate=javax.xml.bind.DatatypeConverter.parseDateTime("2013-09-23T01:15:01.090Z").getTime();
		
		Date endDate = new Date();
		TimeZone aLocale = TimeZone.getDefault();
		
		//endDate
		Calendar cal=javax.xml.bind.DatatypeConverter.parseDateTime("2013-09-25T15:36:00Z");
		TimeZone tz= cal.getTimeZone();
		
				//.getTime();
		
		
		System.out.println("printing end date .. "+endDate+tz);
		
		Date currentDate = new Date();
		
		System.out.println("printing date .. "+currentDate);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		String formattedStartDate = sdf.format(startDate);
		String formattedEndDate = sdf.format(endDate);
		String formattedCurrentDate = sdf.format(currentDate);
		
		if(currentDate.after(startDate) && currentDate.before(endDate)) {
			System.out.println("printing ... "+formattedCurrentDate);
		}
		
    	ArrayList arrrList = new ArrayList();
    	arrrList.add("12605_Gifts_A_B");
    	arrrList.add("12605_A_B_C");
    	
    	ArrayList arrrList1 = new ArrayList();
    	arrrList1.add("12605_Gifts");
    	
    	arrrList.removeAll(arrrList1);
    	for(Object o:arrrList){
    		boolean ab=arrrList.contains(o);
    		//System.out.println("printing o .. "+o+ab);
    	}
    	
    	
    	//parseFQ("categories", fqs);
    	
    	
		
		//System.out.println("printing ret ... "+ret);
		//System.out.println("lenth is :: "+fq.split("_").length);
		
		String catgrouPathArr[] = {"/Spring/Outdoor Hobbies/Gardening/Nursery Plants/Lawn Grasses","/Spring/Outdoor Hobbies/Gardening/Nursery Plants/Trees"};
		//getPrefixWithLevel(cName,levelCurrent);
		String catgrouPath=null;
		for(int i=0;i<catgrouPathArr.length; i++){
			catgrouPath = catgrouPathArr[0];
			String[] catgroupArray = StringUtils.split(catgrouPath,"/");
			String level = null;
			String catalogId ="12605";
			StringBuffer sbuff =new StringBuffer();
			String str = null;
			/*for(int k=1;k<catgroupArray.length;k++){
				int len=k;
				if(k==1){
					level = catgroupArray[1].trim();				
				}
				else{
					level = level+"_"+catgroupArray[k];
				}
				str= catalogId+"_"+len+"_"+level;
				sbuff.append(str).append(";");
				
			}*/
			//System.out.println("printing sbuff :: "+sbuff.toString());
			
			
			for(int k=0;k<catgroupArray.length;k++){
				int len=k+1;
				if(k==0){
					level = StringUtils.trim(catgroupArray[k]);				
				}
				else{
					level = level+"_"+StringUtils.trim(catgroupArray[k]);
				}
				str= catalogId+"_"+len+"_"+level;
				sbuff.append(str.trim()).append("::");
				
			}
			categoriesSet.add(sbuff.toString());
			//System.out.println("printing sbuff :: "+sbuff.toString());
		}
		//System.out.println("printing value :: "+convertSetToString(categoriesSet));
		
		
		
		int catIdEnd = strr.indexOf("_");
		
		
		
		//System.out.println("printing :: "+strr.substring(catIdEnd+3,strr.length()));
		//sLevel(values);
		//System.out.println(""+String.format("%02d", levell));
		/*String slevel = "L0"+String.valueOf(levell);
		if(val.contains(slevel)){
			System.out.println("printing level :; "+slevel+" .... "+val);
		}*/
		int l=4;
		int l1 =4;
		/*for(int i=1;i<=levell;i++){
			String cName = lName.substring(0, lName.lastIndexOf("_")+1);
			int slevelNew =levell-i;
			String returnval = lowLevel(cName,slevelNew);
			lName = returnval.substring(0,returnval.length()-1);	
			int len =Integer.parseInt(lName.substring(lName.indexOf("_")+1,lName.indexOf("_")+2));
			if(len ==0) break;
			System.out.println("lName :: "+lName);
		}*/
		/*if(l<levell){
			String nLName = lName.substring(lName.indexOf("_")+2,lName.lastIndexOf("_"));
			System.out.println("print nlname "+nLName);
			levell=l;
			String str = levell+nLName.substring(nLName.indexOf("_"),nLName.lastIndexOf("_"));
			System.out.println("print sys "+str);
			
		}
		if(l1==levell){
		  String str = (lName.substring(lName.indexOf("_")+1,lName.lastIndexOf("_")));
			System.out.println("......  "+str.substring(0,str.lastIndexOf("_")));
			
		}*/
		
		//System.out.println("cName new :: "+cName.replace(sLevel,sLevel-1));
				
		//method(int2);
		//System.out.println("printing level val :: "+sLevel(values));
	}
	
	public static String[] stripCatId(String values[]) {
		
		//If values is null, return empty array.
		if(values == null) return new String[]{};
		
		Set<String> uniqueValues = new TreeSet<String>();		
		//Logic for stripping off the catalogs in the given values.
		for(String val : values) {
			int catIdEnd = val.indexOf("_");
			if(catIdEnd > 0) uniqueValues.add(val.substring(catIdEnd+1, val.length()));
		}
		
		return uniqueValues.toArray(new String[]{});
	}
	
	public static int sLevel(String values[]) {		
		if(values == null) return 0;
		int levelVal=0;
		for(String val : values) {
			/*if(levelVal<Integer.parseInt(val.substring(val.indexOf("_")+1,val.indexOf("_")+2))){
				levelVal=Integer.parseInt(val.substring(val.indexOf("_")+1,val.indexOf("_")+2));
			}*/
			int length =0;
			/*if(val.contains("OR") || val.contains("or") 
				|| val.contains("AND") || val.contains("and")){
				length = val.split("_");
			}
			else{*/
			length =val.split("_").length; 
			//}
			if(levelVal<length){
				levelVal = length-1;
			}
			
		}
		return levelVal;
	}
	
/*	private static void method(String str){
	    if(str.matches("^((\\d\\d\\d) (.....))$")){
	    	str = str.replaceAll(" ","-");
	    	System.out.println("print syso :: "+str);
	    }
		else if(str.matches("^\\d{3}[\\s][a-zA-Z0-9]{1,5}$") && false){
			System.out.println("print str :: "+str);
		}
		else if(str.matches("^\\d{3}[\\s][a-zA-Z0-9]{1,8}$")){
			System.out.println("print str2 :: "+str);			
		}
	}*/	
	
/*	public static int sLevel(String values[]) {		
		if(values == null) return 0;
		int levelVal=0;
		for(String val : values) {
			if(levelVal<Integer.parseInt(val.substring(val.indexOf("_")+1,val.indexOf("_")+2))){
				levelVal=Integer.parseInt(val.substring(val.indexOf("_")+1,val.indexOf("_")+2));
			}
			int length =val.split("_").length; 
			if(levelVal<length){
				levelVal = length-1;
			}
			
		}
		return levelVal;
	}*/
	public static String lowLevel(String cName,int levelCurrent){
		String catlog = cName.substring(0,cName.indexOf("_"));
		int lenght =cName.indexOf("_")+1;
		int level = Integer.parseInt(cName.substring(cName.indexOf("_")+1,lenght+1));
		level = levelCurrent;
		String retrn = catlog+"_"+level+cName.substring(cName.indexOf("_")+2,cName.length());
		System.out.println("printing ?:: "+retrn);
		return retrn;
	}
	
	public static String getPrefixWithLevel(String cName,int currentLevel){
		String retrn = cName;
		if(currentLevel >= 0){	
			currentLevel=currentLevel+1;
			retrn = currentLevel+cName.substring(cName.indexOf("_"),cName.length());
		}				
		System.out.println("printing retrn :: "+retrn);
		return retrn;
	}
	
	private static String convertSetToString(Set<String> set){
		StringBuffer sb = new StringBuffer(50);

		for(String s: set){
			String str =escapeSplChar(s, ";");
			str = str.replaceAll("::",";");
			sb.append(str).append(";");
			
		}
		return StringUtils.chop(sb.toString());
	}
	
	public static String escapeSplChar(String data, String splChar){
		if (data==null || data.length()==0) return StringUtils.EMPTY;
		data=StringUtils.trim(data);
		/*		  StringBuffer sb = new StringBuffer();
		  StringTokenizer st = new StringTokenizer(data, splChar);

		  // The subfield delimiter ";" is escaped in this script and
		  // requires "\\" due to a bug in CSVRequestHandler.  Only
		  // handle multi-value fields this way.

		  if(data.startsWith(splChar)){
			  if (splChar.equals(";"))
				  sb.append("\\\\"+ splChar);
			  else
				  sb.append("\\"+ splChar);			
		  }
		  sb.append(st.nextToken());
		  while(st.hasMoreTokens()){
			  if (splChar.equals(";"))
				  sb.append("\\\\"+ splChar);
			  else
				  sb.append("\\"+ splChar);
			  sb.append(st.nextToken());				  
		  }

		  return sb.toString();*/

		StringBuffer sb = new StringBuffer();
		String[] st=data.split(splChar);
		sb.append(st[0]);
		for(int i=1;i<st.length;i++){
			if(splChar.equals(";"))
				sb.append("\\\\").append(splChar).append(st[i]);
			else
				sb.append("\\").append(splChar).append(st[i]);			
		}
		if (data.endsWith(splChar)){
			if(splChar.equals(";"))
				sb.append("\\\\").append(splChar);
			else
				sb.append("\\").append(splChar);						
		}

		return sb.toString();

	}
		
}
