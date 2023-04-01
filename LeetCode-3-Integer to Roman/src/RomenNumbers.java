public class RomenNumbers {
    int value (char character){
        if(character == 'I')return 1;
        if(character == 'V')return 5;
        if(character == 'X')return 10;
        if(character == 'L')return 50;
        if(character == 'C')return 100;
        if(character == 'D')return 500;
        if(character == 'M')return 1000;
        return -1;
    }
    int romanToInt(String s)
    {
        int total = 0;
        for (int i=0; i<s.length(); i++)
        {
            int s1 = value(s.charAt(i));
            if (i+1 <s.length())
            {
                int s2 = value(s.charAt(i+1));
                if (s1 >= s2)
                {
                    total = total + s1;
                }
                else
                {
                    total = total - s1;
                }
            }
            else
            {
                total = total + s1;
            }
        }
        return total;
    }
}
