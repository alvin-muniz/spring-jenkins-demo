pipeline {
    agent { docker { image 'maven:3.3.3' } }

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
