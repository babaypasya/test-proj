pipeline {
	agent {
        label 'centos'
         }

	stages {
		stage('build') {
		steps {
                 sh 'export ANT_LIB=/opt/ant/lib'
		 sh 'export JAVA_HOME=/usr/lib/jvm/java-1.6.0/'
		}	
		}
	}

	post {
		always {
			archiveArtifacts artifacts: '/var/lib/jenkins/test-proj/dist/*', fingerprint: true
		}
	}
}
