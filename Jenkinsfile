pipeline {
    agent any
    
    parameters {
        string(name: 'message', defaultValue: 'Hello, World!', description: 'Message to display')
        string(name: 'function', defaultValue: 'fibonacci', description: 'Name of function to execute')
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

    	stage ("execute") {
            steps {
                script {
                    def func = load "${workspace}@functions/${params.function}.groovy"
		            func.pipeline()
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
