package aquality.selenium.template.cucumber.stepdefinitions

import aquality.selenium.template.cucumber.utilities.ScenarioContext
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.testng.Assert.assertEquals
import javax.inject.Inject

class ScenarioContextDemoSteps {
    @Inject lateinit var scenarioContext: ScenarioContext

    @When("I store '{int}' as '{}'")
    fun storeValue(value: Int, key: String) {
        scenarioContext.add(key, value)
    }

    @When("I add '{}' to '{}' and store it as '{}'")
    fun addAndStore(key1: String, key2: String, resultKey: String) {
        val value1:Int  = scenarioContext.get(key1)
        val value2:Int = scenarioContext.get(key2)
        scenarioContext.add(resultKey, value1 + value2)
    }

    @Then("'{}' should be equal to '{int}'")
    fun theResultShouldBeEqualTo(resultKey: String, expectedResult: Int) {
        val actualResult:Int = scenarioContext.get(resultKey)
        assertEquals(actualResult, expectedResult, "The result is incorrect")
    }
}