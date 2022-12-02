object Fibonacci extends App{
	def fib(n:Int):Int = {
		var a = -1
		var b = 1
		var c = 0
		var d = 0
		var cont = 0
		while(cont < n){
			d = a+b+c
			a=b
			b=c
			c=d
			cont = cont +1
		}
		d
	}
	print(fib(1)+" ")
	print(fib(2)+" ")
	print(fib(3)+" ")
	print(fib(4)+" ")
	print(fib(5)+" ")
	print(fib(6)+" ")
	print(fib(7)+" ")
    print(fib(8)+" ")
}