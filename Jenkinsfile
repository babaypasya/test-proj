pipeline {
	agent {
        label 'centos'
         }

	stages {
		stage('build') {
		steps {
		 sh 'ant -f /var/lib/jenkins/content-jenkins-java-project/build.xml -v'
		}	
		}
	}
}
