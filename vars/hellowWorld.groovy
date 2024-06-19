def call() {
  pipeline {
    agent any
    
    stages{
        stage("git_checkout") {
            steps{
                 git credentialsId: 'GIT_PATH', url: 'https://github.com/kanchana08/Dockerfile_python.git'
            }
        }
        
        stage('checking'){
   
       when {
                expression{ 
                    
                    env.BRANCH_NAME == 'master' || env.BRANCH_NAME == 'dev' 
                    
                    
                } 
           
       }

            steps { 


                echo "testing the application....."

            } 

        } 
   }
    
}


}
