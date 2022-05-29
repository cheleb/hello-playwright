// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
import scala.util.Using
import com.microsoft.playwright.Playwright
import scala.util.Success
class MySuite extends munit.FunSuite {
  test("example test that succeeds") {

    val title = Using(Playwright.create) { playwright =>
      val browser = playwright.chromium().launch()
      val page = browser.newPage()
      page.navigate("http://playwright.dev")

      page.title()
    }
    assertEquals(title, Success("Fast and reliable end-to-end testing for modern web apps | Playwright"))
  }
}
