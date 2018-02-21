@Grab('mysql:mysql-connector-java:5.1.25')
@GrabConfig(systemClassLoader = true)
import groovy.sql.Sql
import groovy.sql.GroovyRowResult

String username = "<username>"
String password = "<pswrd>"

Class.forName("com.mysql.jdbc.Driver");
def sql = Sql.newInstance('jdbc:mysql:/<path>:3306/lms', username, password)


List<GroovyRowResult> rows = sql.rows("select * from lms.License where status = 'ACTIVE' limit 1;")

!rows[0]?.id ?: println(rows[0].id)

//sql.eachRow("select * from lms.License;") { row ->
//    println row.id
//}


sql.close()