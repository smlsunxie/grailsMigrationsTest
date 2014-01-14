databaseChangeLog = {

	changeSet(author: "Spooky (generated)", id: "1389681182984-1") {
		addNotNullConstraint(columnDataType: "varchar(255)", columnName: "description", tableName: "part")
	}

	changeSet(author: "Spooky (generated)", id: "1389681182984-2") {
		dropNotNullConstraint(columnDataType: "varchar(255)", columnName: "title", tableName: "part")
	}

	changeSet(author: "Spooky (generated)", id: "1389681182984-3") {
		dropIndex(indexName: "name_uniq_1389679387009", tableName: "part")
	}

	changeSet(author: "Spooky (generated)", id: "1389681182984-4") {
		createIndex(indexName: "unique_name", tableName: "part", unique: "true") {
			column(name: "title")

			column(name: "name")
		}
	}
}
