pipeline{
    agent any
    stages{
        stage('checkout') {
            steps {
                git credentialsId: 'pat', url: 'https://github.com/kanchana08/Dockerfile_python.git'
                
            }
        }
        stage('copy'){
            steps {
                sh 'rm -rf /var/opt/copy || true'
                sh 'cp -r /var/lib/jenkins/workspace/copy  /var/opt'
                
            }
            
        }
        
    }
    
}
    







  




    

