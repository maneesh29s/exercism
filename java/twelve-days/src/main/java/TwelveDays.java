class TwelveDays {
    String[] days = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};

    String[] gifts= {"a Partridge in a Pear Tree",
                    "two Turtle Doves",
                    "three French Hens",
                    "four Calling Birds",
                    "five Gold Rings",
                    "six Geese-a-Laying",
                    "seven Swans-a-Swimming",
                    "eight Maids-a-Milking",
                    "nine Ladies Dancing",
                    "ten Lords-a-Leaping",
                    "eleven Pipers Piping",
                    "twelve Drummers Drumming"};


    String verse(int verseNumber) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuilder gift_str = new StringBuilder();

        for(int i = verseNumber-1; i >= 0; i--){
            if(i == 0 && verseNumber != 1) gift_str.append("and ");
            gift_str.append(gifts[i]).append(", ");
        }
        gift_str = new StringBuilder(gift_str.substring(0, gift_str.length() - 2));

        return "On the " + days[verseNumber-1] + " day of Christmas my true love gave to me: " + gift_str + ".\n";
    }

    String verses(int startVerse, int endVerse) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
//        StringBuilder ans = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(int verseNumber = startVerse ; verseNumber <= endVerse; verseNumber++){
            StringBuilder gift_str = new StringBuilder();

            for(int i = verseNumber-1; i >= 0; i--){
                if(i == 0 && verseNumber != 1) gift_str.append("and ");
                gift_str.append(gifts[i]).append(", ");
            }
            gift_str = new StringBuilder(gift_str.substring(0, gift_str.length() - 2));

            ans.append("On the ").append(days[verseNumber - 1]).append(" day of Christmas my true love gave to me: ").append(gift_str).append(".\n\n");
//            ans.append("On the ").append(days[verseNumber-1]).append(" day of Christmas my true love gave to me: ").append()
//            return "On the " + days[verseNumber-1] + " day of Christmas my true love gave to me: " + gift_str + ".\n";
        }

        String s = ans.toString().substring(0, ans.length() - 1);
        return s;
    }
    
    String sing() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return verses(1,12);
    }
}
