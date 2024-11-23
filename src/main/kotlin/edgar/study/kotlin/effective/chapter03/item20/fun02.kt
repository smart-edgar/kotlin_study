package edgar.study.kotlin.effective.chapter03.item20

//overrride fun saveCallResult(item: SourceResponse) {
//    var sourceList = ArrayList<SourceEntity>()
//    item.sources.forEach {
//        var sourceEntity = SourceEntity()
//        sourceEntity.id = it.id
//        sourceEntity.category = it.category
//        sourceEntity.country = it.country
//        sourceEntity.description = it.description
//        sourceList.add(sourceEntity)
//    }
//    db.insertSource(sourceList)
//}


//overrride fun saveCallResult(item: SourceResponse) {
//    val sourceEntries = item.source.map(::sourceToEntity)
//    db.insertSource(sourceEntries)
//}
//
//private fun sourceToEntity(source: Source) = SourceEntity().apply {
//    id = source.id
//    category = source.category
//    country = source.country
//    description = source.description
//}
