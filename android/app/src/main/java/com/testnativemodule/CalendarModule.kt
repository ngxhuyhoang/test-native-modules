import android.util.Log
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class CalendarModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String {
        return "CalendarModule"
    }

    @ReactMethod
    fun createCalendarEvent(name: String, location: String, promise: Promise) {
        try {
            val eventId = "Event Id"
            promise.resolve(eventId)
        } catch (e: Throwable) {
            promise.reject("Create Event Error", e)
        }
    }

    override fun getConstants(): MutableMap<String, Any> =
        hashMapOf("DEFAULT_EVENT_NAME" to "New Event")
}
