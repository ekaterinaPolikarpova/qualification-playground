pipeline {
    agent any

    stages {
        stage('Run Single Test') {
            steps {
                sh './gradlew test --tests "BrowserStackTest.java"'
                sh './gradlew allureReport'
            }
        }
    }

    post {
        always {
            allure includeProperties: false,
                   jdk: '',
                   results: [[path: 'build/allure-results']]
        }
    }
}
