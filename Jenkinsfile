pipeline {
    parameters {
        string(name: 'message', defaultValue: 'Hello, World!', description: 'Message to display')
    }

    stages {
    	stage ("start") {

    	}

    	stage ("echo") {
    		script {
    			echo "${params.message}"
    		}
    	}

    	stage ("end") {

    	}
    }
}