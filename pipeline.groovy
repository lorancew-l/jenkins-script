pipeline {
    agent any

    stages {
        stage('Check disk space') {
            steps {
                sh 'df -h'
            }
        }
    }
}