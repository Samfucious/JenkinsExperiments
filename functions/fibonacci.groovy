def fibonacci_pipeline() {
	pipeline {
		agent any

		parameters {
	        string(name: 'target', defaultValue: '100', description: 'How far to go in the sequence')
	    }

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
						
						def target = 100
						def a = 1
						def b = 1

						println a
						
						while (b < target) {
							println b
							def t = b
							b = a + b
							a = t
						}
						
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
}

def fibonacci() {
	println "Fibonacci start"
	
	def target = 100
	def a = 1
	def b = 1

	println a
	
	while (b < target) {
		println b
		def t = b
		b = a + b
		a = t
	}
	
	println "Fibonacci end"
}

return this
