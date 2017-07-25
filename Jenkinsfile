pipeline {
	agent centos

	stages {
		stage('build') {
		steps {
		 sh 'ant -f build.xml -v'
		}	
		}
	}
}
