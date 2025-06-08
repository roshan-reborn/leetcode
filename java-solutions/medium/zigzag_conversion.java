class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int n = s.length();
        int index;
        int secondIndex;
        int diff = 2 * (numRows - 1);
        int diaDiff = diff;
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<numRows;i++){
            index = i;
            while(index<n){
                ans.append(s.charAt(index));
                if (i != 0 && i != numRows-1){
                    diaDiff = diff - 2*i;
                    secondIndex = index + diaDiff;
                    if (secondIndex<n){
                        ans.append(s.charAt(secondIndex));
                    }
                }
				index += diff;
            }
        }
        return ans.toString();
    }
}