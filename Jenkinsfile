pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Swedlg/SSPR_LAB_3.git'
                bat './gradlew test'
            }
        }
    }
}
