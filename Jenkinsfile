pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Swedlg/SSPR_LAB_3.git'
                bat './gradlew build'
            }
        }
        stage('Test') {
            steps {
                bat './gradlew test'
            }

            post {
                always {
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
        }
    }
}
