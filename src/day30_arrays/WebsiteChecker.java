package day30_arrays;

public class WebsiteChecker {
    public static void main(String[] args) {
        /*
        Website checker
            Given some urls determine how many .com, .org, and .edu websites
            there are. Also keep track of an ‘other’ category for websites that have
            a different domain
        */

        String[] websites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};

        int indexOfCom = 0;
        int indexOforg = 0;
        int indexOfedu = 0;
        int indexOfother = 0;

        int com = 0;
        int org = 0;
        int edu = 0;
        int other = 0;

        for (int i = 0; i < websites.length; i++) {
            if(websites[i].contains(".com")){
                com+=1;
                indexOfCom = i;
                System.out.println ("The next websites have .com: " + websites[indexOfCom] );

            }

        }

        System.out.println("The total number is: " + com);

        System.out.println();

        for (int i = 0; i < websites.length; i++) {
            if(websites[i].contains(".org")){
                org+=1;
                indexOforg = i;
                System.out.println("The next websites have .org: " + websites[i]);
            }
        }
        System.out.println("the total number is: " + org);
        System.out.println();

        for (int i = 0; i < websites.length; i++) {
            if(websites[i].contains(".edu")){
                edu+=1;
                indexOfedu = i;
                System.out.println("The next websites have .edu: " + websites[i]);
            }
        }
        System.out.println("the total number is: " + edu);

        System.out.println();

        for (int i = 0; i < websites.length; i++) {
            if(!websites[i].contains(".edu") && !websites[i].contains(".com") && !websites[i].contains(".org")){
                other+=1;
                indexOfother = i;
                System.out.println("The next websites have other domains: " + websites[i]);
            }
        }
        System.out.println("the total number is: " + other);
    }
}
