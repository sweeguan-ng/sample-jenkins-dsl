pipeline {
    agent any
    stages {
        stage('Generate jobs') {
            steps {
                jobDsl  targets: ['*.groovy'].join('\n')
            }
        }
    }
}
