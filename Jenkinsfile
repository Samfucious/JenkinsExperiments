pipeline {
	agent any

	stages {
		
		stage ("fibonacci") {
			
			steps {
				script {
					echo "Fibonacci start"
					fibonacci(100)
					echo "Fibonacci end"
				}
			}
			
		}
		
	}
}

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
