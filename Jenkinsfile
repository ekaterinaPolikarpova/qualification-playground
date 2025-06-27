pipeline {
    agent any

    stages {

        stage('Run Single Test') {
            steps {
            sh "echo '${param}'"
                sh './gradlew test --tests "BrowserStackTest"'
            }
        }

        stage('Archive Artifacts') {
            steps {
             ${param} = '9999';
                echo '${param}'
                archiveArtifacts 'build/reports/**/*'
            }
        }

        stage('Notifications') {
            steps {
                echo '📢 Отправляю уведомления...'
                script {
                    if (currentBuild.currentResult == 'SUCCESS') {
                        echo '✅ Тест пройден успешно!'
                    } else {
                        echo '❌ Тест упал!'
                    }
                }
            }
       }
     }
  }