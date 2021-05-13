pipeline {
    agent any
     tools {
            maven 'Maven 3.3.9'
            jdk 'jdk8'
        }

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Test') {
           steps {
                 sh 'mvn -Dmaven.test.failure.ignore=true install'
            }
        }
    }
}
