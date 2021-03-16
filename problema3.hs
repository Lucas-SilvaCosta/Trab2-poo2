class (Integral x) => MeuInt x where
	bigger :: x -> x -> x
	smaller :: x -> x-> x
	par :: x -> Bool
	impar :: x -> Bool
	checaPrimo :: x -> x -> Bool
	primo :: x -> Bool
	checaMdc :: x -> x -> x -> x
	mdc :: x -> x -> x
	(===) :: x -> x -> Bool
	distancia :: x -> x -> x
	checaDistancia :: x -> x -> x -> x
	(=/=) :: x -> x -> Bool

	bigger a b | a > b = a
		| otherwise = b

	smaller a b | a == (bigger a b) = b
		| otherwise = a

	par a | (mod a 2) == 0 = True
		| otherwise = False

	impar a = not(par a)

	checaPrimo a b | b == 2 = True
		| (mod a (pred b)) == 0 = False
		| otherwise = (checaPrimo a (pred b))

	primo a | (a < 2) = False 
		| (a == 2) = True
		| (par a) = False
		| otherwise = (checaPrimo a a)

	checaMdc a b c | c == 1 = c
		| (mod a c) == 0 && (mod b c) == 0 = c
		| otherwise = checaMdc a b (pred c)

	mdc a b | mod a b == 0 = b
		| mod b a == 0 = a
		| primo a || primo b = 1
		| bigger a b == a = checaMdc a b b
		| otherwise = checaMdc b a a

	(===) a b | a == (pred b) = True
		| b == (pred a) = True
		| otherwise = False

	checaDistancia a b c | a == succ b = succ c
		| otherwise = checaDistancia a (succ b) (succ c)

	distancia a b | a == b = 0
		| (bigger a b) == a = checaDistancia a b 0
		| otherwise = checaDistancia b a 0

	(=/=) a b | mdc a b == 1 = False
		| otherwise = True

instance MeuInt Integer
instance MeuInt Int

main = do
	putStrLn("Teste metodo bigger e smaller para 4 e 12")
	print (bigger (4::Integer) (12::Integer))
	print (smaller (4::Integer) (12::Integer))

	putStrLn("\nTeste metodo par para 4 e 3")
	print(par (4::Integer))
	print(par (3::Integer))

	putStrLn("\nTeste metodo impar para 4 e 3")
	print(impar (4::Integer))
	print(impar (3::Integer))

	putStrLn("\nTeste metodo primo para 1, 2, 4 e 5")
	print(primo (1::Integer))
	print(primo (2::Integer))
	print(primo (4::Integer))
	print(primo (5::Integer))

	putStrLn("\nTeste metodo mdc")
	putStrLn("para 4 e 2: "++show(mdc (4::Integer) (2::Integer)))
	putStrLn("para 2 e 4: "++show(mdc (2::Integer) (4::Integer)))
	putStrLn("para 4 e 4: "++show(mdc (4::Integer) (4::Integer)))
	putStrLn("para 5 e 2: "++show(mdc (5::Integer) (2::Integer)))
	putStrLn("para 2 e 5: "++show(mdc (2::Integer) (5::Integer)))
	putStrLn("para 30 e 18: "++show(mdc (30::Integer) (18::Integer)))

	putStrLn("\nTeste operador ===")
	putStrLn("para 4 e 5: "++show((4::Integer) === (5::Integer)))
	putStrLn("para 6 e 5: "++show((6::Integer) === (5::Integer)))
	putStrLn("para 4 e 10: "++show((4::Integer) === (10::Integer)))
	putStrLn("para 10 e 5: "++show((10::Integer) === (5::Integer)))

	putStrLn("\nTeste metodo extra: distancia - checa a distancia entre dois numeros")
	putStrLn("para 10 e 10: "++show(distancia (10::Integer) (10::Integer)))
	putStrLn("para 10 e 4: "++show(distancia (10::Integer) (4::Integer)))
	putStrLn("para 4 e 10: "++show(distancia (4::Integer) (10::Integer)))

	putStrLn("\nTeste operador extra: =/= - retorna verdadeiro caso os dois numeros tenham um divisor comum diferente de 1")
	putStrLn("para 4 e 2: "++show((4::Integer) =/= (2::Integer)))
	putStrLn("para 5 e 2: "++show((5::Integer) =/= (2::Integer)))