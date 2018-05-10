def text1 = "When knitters and crocheters think about the best winter yarn, wool is usually the first fiber that comes to mind. But guess what? Not only are there several different types of wool, but we can mix wool with plenty of other fibers — silk, acrylic, and alpaca just to name a few — to get warm and cozy projects."
def pattern1 = ~/think about/
println pattern1.class
def finder1 = text1 =~ pattern1
println finder1
println finder1.class
println finder1.size()

40.times { print '-' }
println()

def text2 = "When knitters and crocheters."
def pattern2 = ~/When knitters and crocheters./
println pattern2.class
def matcher2 = text2 ==~ pattern2
println matcher2
println matcher2.class

if ( matcher2 ) { /* do smth */ }
//println finder2.size()

40.times { print '-' }
println()

def text3 = "When knitters and crocheters."
def pattern3 = ~/knitters and crocheters/
text3 = text3.replaceFirst(pattern3, "you and I")
println text3

40.times { print '-' }
println()
// Using Matcher object returned by =~ operator
matcher = "Link (f6cac02146e3d474) deployed successfully." =~ /Link \((\S*)\) deployed successfully./
if (matcher.matches()) id = matcher[0][1]
assert id == "f6cac02146e3d474"

// We can make this a little tidier using the 'with' method
id = ("Link (f6cac02146e3d474) deployed successfully." =~ /Link \((\S*)\) deployed successfully./).with { matches() ? it[0][1] : null }
assert id == "f6cac02146e3d474"
println id

