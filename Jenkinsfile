pipeline {
	agent {
        label 'centos'
         }

	stages {
		stage('build') {
		steps {
                 sh 'ANT_LIB=/opt/ant/lib'
		 sh 'JAVA_HOME="/usr/lib/jvm/java-1.6.0/'
		 sh 'ant -f /var/lib/jenkins/content-jenkins-java-project/build.xml -v'
		}	
		}
	}
}
