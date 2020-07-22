pipeline {
    agent any
    
    parameters {
        string(name: 'message', defaultValue: 'Hello, World!', description: 'Message to display')
    }

    stages {
    	stage ("start") {
            steps {
                println "start"
            }
    	}

    	stage ("echo") {
            steps {
                script {
                    println "${params.message}"
                }
            }
    	}

    	stage ("end") {
            steps {
                println "end"
            }
    	}
    }
}
