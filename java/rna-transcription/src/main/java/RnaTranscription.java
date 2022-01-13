class RnaTranscription {

    String transcribe(String dnaStrand) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String ans = "";
        for (char c : dnaStrand.toCharArray()) {
            switch (c){
                case 'G':
                    ans += "C";
                    break;
                case 'C':
                    ans += "G";
                    break;
                case 'T':
                    ans += "A";
                    break;
                case 'A':
                    ans += "U";
                    break;
            }
        }

        return ans;

    }

}
