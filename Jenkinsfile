pipeline {
	agent any

	stages {
		stage ("first step"){
			steps {
				echo "first step"
				script {
					echo "first step script"
				}
			}
		},
		
		stage ("fibonacci") {
			echo "fibonacci step"
			steps {
				script {
					echo "Fibonacci start"
					fibonacci(100)
					echo "Fibonacci end"
				}
			}
			
		},
		stage ("last step"){
			steps {
				echo "last step"
				script {
					echo "last step"
				}
			}
		}
	}
}

def fibonacci(target) {
	def a = 1
	def b = 1

	echo "" + a
	
	while (b < target) {
		print ", " + b
		def t = b
		b = a + b
		a = t
	}
}
