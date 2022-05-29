import scala.util.Using
import com.microsoft.playwright.*
import java.nio.file.Paths

@main def hello: Unit =
  Using(Playwright.create) { playwright =>
    val browser = playwright.chromium().launch()
    val page = browser.newPage()
    page.navigate("http://playwright.dev")
    println(page.title())

  }

@main def userAgent: Unit =
  Using(Playwright.create) { playwright =>
    val browser = playwright.webkit().launch()
    val page = browser.newPage()
    page.navigate("http://whatsmyuseragent.org/")
    page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("target/example.png")))
  }
