/**
 * The next example taken from
 * https://gist.github.com/hgbrown/8172124*/
@Grab(group = 'org.apache.httpcomponents',module = 'httpclient',version = '4.2.1')
import org.apache.http.impl.client.DefaultHttpClient
import org.apache.http.client.methods.HttpGet

DefaultHttpClient httpClient = new DefaultHttpClient()
String url = 'http://www.google.com/search?q=Groovy'
HttpGet httpGet = new HttpGet(url)

def httpResponse = httpClient.execute(httpGet)

new File('result.html').text =httpResponse.entity.content.text