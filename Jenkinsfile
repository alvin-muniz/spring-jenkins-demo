pipeline {
    agent any
     tools {
            maven 'Maven 3.6.3'
            jdk 'jdk9'
        }

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Test') {
           steps {
                 sh 'mvn -Dmaven.test.failure.ignomvre=true install'
            }
        }
    }
}
