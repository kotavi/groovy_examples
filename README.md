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
  <tr>
    <td>Change default version</td>
    <td><code>$ sdk default groovy 2.4.5</code></td>
  </tr>
  <tr>
    <td>To see all available commands in groovysh</td>
    <td><code>$ groovy:000> :h</code></td>
  </tr>
  <tr>
    <td>Compile groovy files with <a href="http://groovy-lang.org/groovyc.html">groovyc</a> </td>
    <td><code>$ groovyc *.groovy</code></td>
  </tr>
  <tr>
    <td>groovy <a href="http://groovy-lang.org/groovyconsole.html">console</a> </td>
    <td><code>$ groovyConsole</code></td>
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
groovy:000> license = new License()
===> License@df4b72
</code></pre>

<pre><code>
groovy:000> def matchTwoInputs(String arg1, String arg2) {
groovy:001>     if (arg1 ==~ arg2) {
groovy:002>       println "Both inputs are the same"
groovy:003>     }
groovy:004>     else { println "Inputs are not the same" }
groovy:005> }
===> true
groovy:000> matchTwoInputs("123", "123")
Both inputs are the same
===> null
groovy:000> matchTwoInputs("1231", "71237")
Inputs are not the same
===> null
</code></pre>



