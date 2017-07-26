pipeline {
	agent {
        label 'centos'
         }
 	options {
		buildDiscarder(logRotator(numToKeepStr: '2', artifactNumToKeepStr: '1'))
	}

	stages {
		stage('build') {
		steps {
                 sh 'echo 1123'
		}	
		}
	}

}
