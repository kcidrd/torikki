// Code From http://www.vogella.com/tutorials/RSSFeed/article.html
package uk.ac.bristol.torikki.ingest.rss.tests;
import uk.ac.bristol.torikki.ingest.rss.RSSFeedParser;
import uk.ac.bristol.torikki.ingest.rss.core.Feed;
import uk.ac.bristol.torikki.ingest.rss.core.FeedMessage;

public class ReadTest {
  public static void main(String[] args) {
    RSSFeedParser parser = new RSSFeedParser("http://feeds.bbci.co.uk/news/rss.xml");
    Feed feed = parser.readFeed();
    System.out.println(feed);
    for (FeedMessage message : feed.getMessages()) {
      System.out.println(message);
    }
  }
} 
