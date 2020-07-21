println "Task start"

pipeline {
	agent any

	stages {
		println "Fibonacci start"
		stage ("fibonacci") {
			steps {
				script {
					fibonacci(100)
				}
			}
		}
		println "Fibonacci end"
	}
}

println "Task end"

def fibonacci(target) {
	def a = 1
	def b = 1

	print "" + a
	
	while (b < target) {
		print ", " + b
		def t = b
		b = a + b
		a = t
	}
}
