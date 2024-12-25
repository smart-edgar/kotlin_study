package edgar.study.kotlin.effective.chapter07.item45

import java.sql.Connection

private val connections = mutableMapOf<String, Connection>()

//fun getConnection(host: String) = connections.getOrPut(host) {
//    createConnection(host)
//}

