pipeline {
    agent any
    tools {
            maven 'apache-maven-3.6.3'
        }

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn install -DskipTests'
            }
        }
    }
}
