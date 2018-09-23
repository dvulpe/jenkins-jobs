pipelineJob('spring-databinder-example') {
    description 'Build and test spring-databinder-example project'
    definition {
        cpsScm {
            lightweight(true)
            scm {
                github 'dvulpe/spring-databinder-example', 'master'
                scriptPath 'Jenkinsfile'
            }
        }
    }
}
        
