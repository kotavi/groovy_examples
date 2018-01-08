# groovy_examples

### Install SDKMAN!

http://sdkman.io/

$ curl -s "https://get.sdkman.io" | bash

$ source "$HOME/.sdkman/bin/sdkman-init.sh"

$ sdk version

*To list candidates*

$ sdk list

*To list a specific candidate*

$ sdk list groovy

*To install a specific version of Groovy*

$ sdk install groovy 2.4.0

*Change default version*

$ sdk default groovy 2.4.5

### Groovy shall - groovysh

http://groovy-lang.org/groovysh.html

$ groovysh

Example:
<pre><code>
groovy:000> class License {
groovy:001>     String id
groovy:002>     String name
groovy:003>     String description
groovy:004> }
===> true
</code></pre>
