import jenkins.model.*
import hudson.security.*
import javaposse.jobdsl.dsl.DslScriptLoader
import javaposse.jobdsl.plugin.JenkinsJobManagement

def instance = Jenkins.getInstance()

def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount('user', '1234')
instance.setSecurityRealm(hudsonRealm)

def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
strategy.setAllowAnonymousRead(false)
instance.setAuthorizationStrategy(strategy)

instance.save()

def plugin = instance.pluginManager.getPlugin('job-dsl')
def dslScriptLoader = new DslScriptLoader(new JenkinsJobManagement(System.out, [:], new File('.')))

String dslScript = """
pipelineJob('Web Testing') {
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