pipeline{
    agent any

    stages {
        
        stage('compile'){
            steps {
                 'mvn clean compile'
            }
        }
        
        stage('unit test'){
            steps {
                'mvn test'
            }
        }
        
        stage('build'){
            steps {
                'mvn -DskipTests package'
            }
        }
        
        stage('image'){
            steps {
                echo 'creating docker image...'
            }
        }

    }

}
