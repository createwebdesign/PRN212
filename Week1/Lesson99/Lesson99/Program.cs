using System;
using System.Collections.Generic;

namespace exercises
{
    class Program
    {
        // Method to check if a number is prime
        public static bool IsPrime(uint n)
        {
            if (n <= 1)
            {
                return false;
            }

            int ctr = 0;
            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0)
                {
                    ctr++;
                }
                if (ctr > 2)
                {
                    return false;
                }
            }

            return true;
        }

        static void Main(string[] args)
        {
            var Q = new Queue<uint>(); // Queue to store numbers
            var prime_nums = new List<uint>(); // List to store prime numbers

            // Enqueue initial numbers from 1 to 9 into the queue
            for (uint i = 1; i <= 9; i++)
            {
                Q.Enqueue(i);
            }

            // Continue while the queue is not empty
            while (Q.Count > 0)
            {
                // Dequeue a number
                uint n = Q.Dequeue();

                // Check if the dequeued number is prime and add it to the list of prime numbers
                if (IsPrime(n))
                {
                    prime_nums.Add(n);
                }

                // Enqueue the next potential prime numbers formed by appending digits from 1 to 9
                for (uint i = n % 10 + 1; i <= 9; i++)
                {
                    Q.Enqueue(n * 10 + i);
                }
            }
                // abcasdqweqe
            // Display the generated prime numbers
            foreach (uint p in prime_nums)
            {
                Console.Write(p);
                Console.Write(", ");
            }
            Console.WriteLine();
        }
    }
}
