databaseChangeLog = {

	changeSet(author: "Spooky (generated)", id: "1389679387050-1") {
		createTable(tableName: "part") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "partPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(255)")

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Spooky (generated)", id: "1389679387050-2") {
		createIndex(indexName: "name_uniq_1389679387009", tableName: "part", unique: "true") {
			column(name: "name")
		}
	}
}
