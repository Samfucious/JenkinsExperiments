pipeline {
    agent any
    
    parameters {
        string(name: 'message', defaultValue: 'Hello, World!', description: 'Message to display')
        string(name: 'sourcefile', defaultValue: 'functions', description: 'File to load with target groovy (minus extension)')
        string(name: 'function', defaultValue: 'fibonacci', description: 'Name of function to execute')
        string(name: 'color', defaultValue: '', description: 'For playing with when blocks')
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
                    def functions = load "functions/${params.sourcefile}.groovy"
                    functions.{params.function}()
                }
            }
            
            when {
                expression { color = 'blue' }
            }
            steps {
                script {
                    println 'blue'
                }
            }
            
            
            when {
                expression { color = 'red' }
            }
            steps {
                script {
                    println 'red'
                }
            }
            
            
            when {
                expression { color = 'green' }
            }
            steps {
                script {
                    println 'green'
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
