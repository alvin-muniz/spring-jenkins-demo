pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Test') {
            withMaven {
                sh 'mvn clean test'
            }
        }
        stage('Build') {
            withMaven {
                sh 'mvn install -DskipTests'
            }
        }
    }
}
