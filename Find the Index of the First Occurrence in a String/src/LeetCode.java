public class LeetCode {
    public int strStr(String hayStack,String needle){

        if(hayStack.contains(needle)){
            int index = hayStack.indexOf(needle);
            while(index >= 0){
                System.out.println("found at index :"+index);
               index = hayStack.indexOf(needle,index+needle.length());

            }
            return 0;
        }
        else return -1;


    }
}
