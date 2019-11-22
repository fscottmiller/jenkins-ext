// package org.miller

import org.junit.*
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*

class Simple extends BasePipelineTest {
    def script 

    @Before
    void setUp() {
        super.setUp()
        script = loadScript("vars/simple.groovy")
    }
    @Test
    void should_print_value() throws Exception {
        def result = script()
        assertEquals "hello world", result
    }
}