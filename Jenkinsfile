pipeline{
    agent any

    stages {
        
        stage('compile'){
            steps {
                sh 'mvn clean compile'
            }
        }
        
        stage('unit test'){
            steps {
               sh 'mvn test'
            }
        }
        
        stage('build'){
            steps {
                 sh 'mvn -DskipTests package'
            }
        }
        
        stage('image'){
            steps {
                echo 'creating docker image...'
            }
        }

    }

}
