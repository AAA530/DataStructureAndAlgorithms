class Solution {
    public String predictPartyVictory(String senate) {

        List<Boolean> on = new ArrayList<>();
        int l = senate.length();

        for (int i = 0; i < senate.length(); i++) {
            on.add(true);
        }

        Boolean retry = true;
        while (retry) {
            // System.out.println(on.toString());
            // System.out.println(l);

            retry = false;

            for (int i = 0; i < senate.length(); i++) {
                if (on.get(i) == true && senate.charAt(i) == 'R') {
                    for (int j = i; j < i + senate.length(); j++) {
                        if (on.get(j % senate.length()) == true && senate.charAt(j % senate.length()) == 'D') {
                            on.set(j % senate.length(), false);
                            l--;
                            retry = true;
                            break;
                        }
                    }

                }

                if (on.get(i) == true && senate.charAt(i) == 'D') {
                    for (int j = i; j < i + senate.length(); j++) {
                        if (on.get(j % senate.length()) == true && senate.charAt(j % senate.length()) == 'R') {
                            on.set(j % senate.length(), false);
                            l--;
                            retry = true;
                            break;
                        }
                    }

                }
            }
        }

        // Character t ='';
        for (int i = 0; i < senate.length(); i++) {
            if (on.get(i) == true) {
                if (senate.charAt(i) == 'R') {
                    return "Radiant";
                } else {
                    return "Dire";
                }
            }
        }

        return "";

    }
}