pipeline {
    agent any

    stages {
        stage('Run Single Test') {
            steps {
                sh './gradlew test --tests "src/test/java/browserStack/BrowserStackTest.java"'
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
