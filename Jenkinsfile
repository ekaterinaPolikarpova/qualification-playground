pipeline {
    agent any

    stages {
        // Stage 1: Подготовка окружения (филлер)
        stage('Setup Environment') {
            steps {
                echo '🔧 Настраиваю окружение...'
                sh 'gradle --version'
                sh 'java -version'
            }
        }

        stage('Install Dependencies') {
            steps {
                echo '📦 Загружаю зависимости...'
                sh './gradlew dependencies --no-daemon'
            }
        }

        stage('Run Single Test') {
            steps {
                echo '🚀 Запускаю тест BrowserStackTest.java...'
                sh './gradlew test --tests "BrowserStackTest"'
            }
        }

        stage('Archive Artifacts') {
            steps {
                echo '📦 Сохраняю артефакты...'
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