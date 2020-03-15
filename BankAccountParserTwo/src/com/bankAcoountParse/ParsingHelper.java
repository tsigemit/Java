package com.bankAcoountParse;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.*;

/**
 * A helper class for the main class
 */
public class ParsingHelper {
    /**
     *
     * @param value a String to check if it is parsable to Integer or not
     * @return true if the string is parsable to Integer, otherwise false
     */
     boolean tryParsePrice(String value) {
     try {
         Double.parseDouble(value);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
}
   /**
     *
     * @param value a String to check if it is parsable to Date or not
     * @return true if the string is parsable to Date, otherwise false
     */
 boolean tryParseDate(String value) {
     try {
         DateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
         Date date = (Date) parser.parse(value);
         return true;
      }
     catch (ParseException e) {
               return false;
      }
}

    /**
     *
     * @param row is the row to be searched to merge
     * @param arr an array of string contain all the rows
     * @return the number of rows wich are equals with row
     */
    int countRow(String row, ArrayList<String> arr){
        int countRow=0;
        for(String str: arr){
                if(row.equals(str))
                    countRow++;
        }
        return countRow;
    }

    /**
     *
     * @param finalList a list of rows from the textArea
     * @return filterd list of row
     */
 ArrayList<String> finalListArray(ArrayList<String> finalList ){
     ArrayList <String> finalResult = new ArrayList<String>();
     for (String arr : finalList) {
         boolean checFlag=false;
                        String lineToArray[] = arr.split("\\s+");
                        for (int i=0; i < lineToArray.length; i++) {
                            String repDate = lineToArray[i];
                            String repPrice = lineToArray[lineToArray.length-1].replace(",", ".");
                            if (tryParseDate(repDate) &&
                                    tryParsePrice(repPrice) &&
                                     lineToArray.length<8
                            )
                            {
                              checFlag=true;
                               break;
                            }
                        }
                        if(checFlag)
                            finalResult.add(arr);

                    }
     return finalResult;
}
}
