ReadablePlusPlus
================

making c++ more readable

c++ is not a readable language. This is an effort to just make it more pleasing.

##This rpp file:

	```python
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
	```

##Turns into this hpp file:

	```c++
	class Sample
	{
	public:
		int* a,*b,*c,*d;
		void constructorOverloading(int first, int second, float third);
		Sample();
		Sample(int first, int second, float third);

	void doStuff(int yes);

	};
	```

##And this cpp file:

	```c++
	#include "Sample.hpp"

	int* a = NULL;
	int* b = NULL;
	int* c = NULL;
	int* d = NULL;

	void Sample::constructorOverloading(int first, int second, float third)
	{
		*a = first;
		*b = second;
		*c = third;
	}

	Sample::Sample()
	{
		constructorOverloading(1, 2, 3);
	}

	Sample::Sample(int first, int second, float third)
	{
		constructorOverloading(first, second, third);
	}

	void doStuff(int yes)
	{
		switch(yes)
		{
			case 1:
			case 2:
			case 3:
			case 4:
				print("yes is in range 1 to 4");
				break;
			case 5:
				print("it is 5");
				break;
			case 6:
				print("it is 6");
				break;
		}

		int deal[] = {1, 2, 3, 4, 5};
		int length = 5;

		int sum = sum(multiplyBy(4,add1(deal)));

		int change;

		if(yes - sum > 36)
			change = 24;
		else if(sum*sum < 4)
			change = 34;
		else if(sum*sum > 5)
			change = 33;
		else
			change = 23;

		for(int i = 0; i<=length-1;i++)
			deal[i] = change;


	}
	```