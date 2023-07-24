import javaposse.jobdsl.dsl.DslScriptLoader
import javaposse.jobdsl.plugin.JenkinsJobManagement

def plugin = Jenkins.instance.pluginManager.getPlugin('job-dsl')
def dslScriptLoader = new DslScriptLoader(new JenkinsJobManagement(System.out, [:], new File('.')))

String dslScript = """
pipelineJob('Web Usage') {
    definition {
        cps {
            script('''
                node {
                    stage('Run shell script') {
                        sh './run.sh'
                    }
                }
            ''')
            sandbox()
        }
    }
}
"""

dslScriptLoader.runScript(dslScript)
