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
    }
}
