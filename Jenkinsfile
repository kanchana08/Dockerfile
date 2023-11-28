pipeline {
  agent any
  stages {
    stage('clone') {
      steps {
        git(credentialsId: 'PAT', url: 'https://github.com/kanchana08/Dockerfile_python.git')
      }
    }

  }
}