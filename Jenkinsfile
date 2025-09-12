pipeline {
    agent any

    stages {
        stage('Checkout'){
            steps {
                git 'https://github.com/ekaterinaPolikarpova/qualification-playground.git'
            }
        }
            stage('Test'){
                steps{
                 sh './gradlew test --tests "BrowserStackTest"'
                }
            }
    }
 }
