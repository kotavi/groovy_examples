# groovy_examples

### Install SDKMAN!

http://sdkman.io/

<pre><code>
$ curl -s "https://get.sdkman.io" | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
$ sdk version
</code></pre>


#### SDK commands
<table>
  <tr>
    <td>To list candidates</td>
    <td><code>$ sdk list</code></td>
  </tr>
  <tr>
    <td>To list a specific candidate</td>
    <td><code>$ sdk list groovy</code></td>
  </tr>   
  <tr>
    <td>To install a specific version of Groovy</td>
    <td><code>$ sdk install groovy 2.4.0</code></td>
  </tr>
  <tr>
    <td>Change default version</td>
    <td><code>$ sdk default groovy 2.4.5</code></td>
  </tr>
  <tr>
    <td>Launch <a href="http://groovy-lang.org/groovysh.html">groovy shell</a> </td>
    <td><code>$ groovysh</code></td>
  </tr>
</table>

#### groovysh example:
<pre><code>
groovy:000> class License {
groovy:001>     String id
groovy:002>     String name
groovy:003>     String description
groovy:004> }
===> true
</code></pre>



