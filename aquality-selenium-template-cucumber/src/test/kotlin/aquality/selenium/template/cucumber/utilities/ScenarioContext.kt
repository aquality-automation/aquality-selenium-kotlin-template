package aquality.selenium.template.cucumber.utilities

import io.cucumber.guice.ScenarioScoped
import java.util.HashMap

/***
 * ScenarioContext allows you to share state between steps in a scenario.
 * It guarantees the clear state in a new scenario.
 */
@ScenarioScoped
class ScenarioContext {

    private val context: MutableMap<String, Any> = HashMap()

    fun add(key: String, value: Any) {
        context[key] = value
    }

    @Suppress("UNCHECKED_CAST")
    operator fun <T> get(key: String): T {
        return context[key] as T
    }
}