package edgar.study.kotlin.effective.chapter06.item40

import java.util.TimeZone

class DataTime(
    private var millis: Long = 0,
    private var timezone: TimeZone? = null
) {
    private var asStringCache = ""
    private var change = false

    override fun equals(other: Any?): Boolean =
        other is DataTime && millis == other.millis && other.timezone == timezone
}
