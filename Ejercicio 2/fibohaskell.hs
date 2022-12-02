let fib = (\x -> case x of {0 -> 0; 1 -> 1; 2 -> 1; num -> fib(num-1) + fib(num-2) + fib(num-3)})
(\y -> map fib ((\x -> [0..x]) y)) 8