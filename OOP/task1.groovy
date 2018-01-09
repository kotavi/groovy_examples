import groovy.transform.Canonical
//Tweet
//
// We are going to create a class that represents a single tweet.
// This is an exercise both about code and starting to think about
// what goes into building a class. There is no right or wrong answer here
// so don't be afraid to build your class how you see fit.
// I will go over in the review what I was thinking about
// when I built mine but again my answer is not the right one.
//
// What properties and methods go into building a tweet class?
//
//Bonus Points
//How could you extract mentions and hashtags from the post text?


class TweeterAccount {
    Integer tweets
    Integer following
    Integer followers
}

@Canonical
class Tweet extends TweeterAccount{
    String text
    String tweetId
    Integer tweetLikes
    Integer retweets
    Integer replies
    Date timePosted

    private List whoFaivored = []
    private List whoRetweeted = []
    private List whoMentioned = []
    private List whoHashtagged = []


    Integer addLike(){
        tweetLikes += 1
    }

    Integer addRetweet(){
        retweets += 1
    }

    void favorite(String username) {
        whoFaivored << username
    }

    List getFavoritesList() {
        whoFaivored
    }

    void retweets(String username) {
        whoRetweeted << username
    }

    List getRetweetsList() {
        whoRetweeted
    }
}

Tweet tweet = new Tweet(text: "This is my first tweet",tweetId: "qwpo-12", tweetLikes: 12,
        retweets: 4, replies: 6, timePosted: new Date())

println tweet
tweet.addLike()
tweet.addRetweet()
println tweet


