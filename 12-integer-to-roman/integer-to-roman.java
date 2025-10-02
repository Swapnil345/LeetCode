class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int duplicate=num;
        while (num > 0) {
            list.add(num % 10);
            num = num / 10;
        }
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(20, "XX");
        map.put(30, "XXX");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(60, "LX");
        map.put(70, "LXX");
        map.put(80, "LXXX");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(200, "CC");
        map.put(300, "CCC");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(600, "DC");
        map.put(700, "DCC");
        map.put(800, "DCCC");
        map.put(900, "CM");
        map.put(1000, "M");
        map.put(2000, "MM");
        map.put(3000, "MMM");
        map.put(0,"");
        if(map.containsKey(duplicate)){
            return map.get(duplicate);
        }
        String s = "";
        int n;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i == 3) {
                n = list.get(i) * 1000;
                s += map.get(n);
            } else if (i == 2) {
                n = list.get(i) * 100;
                s += map.get(n);
            } else if (i == 1) {
                n = list.get(i) * 10;
                s += map.get(n);
            } else if (i == 0) {
                n = list.get(i);
                s += map.get(n);
            }
        }

        return s;
    }
}