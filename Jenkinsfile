pipeline {
	agent any

	stages {
		stage ("first step"){
			steps {
				script {
					println "first step script"
				}
			}
		}
		
		stage ("fibonacci") {
			steps {
				script {
					println "Fibonacci start"
					fibonacci(100)
					println "Fibonacci end"
				}
			}
			
		}
		stage ("last step"){
			steps {
				script {
					println "last step"
				}
			}
		}
	}
}

def fibonacci(target) {
	def a = 1
	def b = 1

	println a
	
	while (b < target) {
		println b
		def t = b
		b = a + b
		a = t
	}
}
