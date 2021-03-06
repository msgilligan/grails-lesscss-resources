import geb.spock.GebSpec
/**
 * @author Paul Fairless
 *
 */

class LesscssBundleSpec extends GebSpec {
    def setupSpec() {
//        browser.getDriver().setJavascriptEnabled(true)
    }
    def "check lesscss rules rendered"(){
        when:
            go('http://localhost:8080/lesscss-resources')
        then:
        $('h1').text() == 'Less Test'
        $('h1').jquery.css('color') == 'rgb(34, 34, 251)'
        $('h2').jquery.css('color') == 'rgb(132, 34, 16)'
        $('h3').jquery.css('color') == 'rgb(34, 251, 34)'

        and:'css processor still runs'
        $('h3').jquery.css('background-url') == 'images/header-pattern.png'
    }
}