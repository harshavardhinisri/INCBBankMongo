pipeline{
    agent any

    stages {
        
        stage('compile'){
            steps {
                shell 'mvn clean compile'
            }
        }
        
        stage('unit test'){
            steps {
               shell 'mvn test'
            }
        }
        
        stage('build'){
            steps {
                 shell 'mvn -DskipTests package'
            }
        }
        
        stage('image'){
            steps {
                echo 'creating docker image...'
            }
        }

    }

}
