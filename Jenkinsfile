pipeline {
  agent any
    stages {
      stage('build') {
        steps { 
           withMaven(maven: 'maven3') {
              echo 'Hello world!' 
           }
        }
      }
      
      stage ('Test') {
            steps { 
                sh 'make check || true'
                junit '**/target/*.xml'
            }
        }
    }
}
