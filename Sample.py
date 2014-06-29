class Sample
public
	int* a b c d = NULL

	Sample()
		Sample 1 2 3

	Sample(int first second, float third)
		*a = first
		*b = second
		*c = third

	void doStuff(int yes)
		switch yes
			case 1..4
				print "yes is in the range 1 to 4"
			case 5
				print "it is 5"
			case 6
				print "it is 6"

		int deal[] = {1 2 3 4 5}
		int length = 5

		int sum =
			deal |> multiplyBy 4 |> sum |> add1

		int change =
			if yes - sum > 36
				24
			elif sum*sum < 4
				34
			elif sum*sum > 5
				33
			else
				23

		for(i in 0..length)
			deal[i] = change



