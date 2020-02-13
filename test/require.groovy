import org.junit.*
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*
import org.tools.*

class Require extends BasePipelineTest {
    def script 

    @Before
    void setUp() {
        super.setUp()
        script = loadScript("vars/require.groovy")
    }
    @Test
    void require_ruby() throws Exception {
        script('ruby')
        assertEquals([['name': 'ruby', 'image': 'ruby', 'ttyEnabled': 'true', 'command': 'cat']], Tools.getRequired())
    }
}