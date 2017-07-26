pipeline {
	agent {
        label 'centos'
         }

	stages {
		stage('build') {
		steps {
                 sh 'echo 1123'
		}	
		}
	}

	post {
		always {
			archiveArtifacts artifacts: 'dist/*.txt', fingerprint: true
		}
	}
}
