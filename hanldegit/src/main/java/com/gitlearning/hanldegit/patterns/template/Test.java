package com.gitlearning.hanldegit.patterns.template;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * 编写一个程序，输出从1到n的数字的字符串表示形式  ，但是：
 *
 * 如果该数字可被3整除，则输出“ fizz”。
 * 如果数字可以被5整除，则输出“嗡嗡声”。
 * 如果数字可以被3和5整除，则输出“ fizzbuzz”。
 * 例如，对于  n = 15，我们输出：  1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz。
 *
 * 假设您得到以下代码：
 *
 * FizzBu​​zz类{
 *   public FizzBu​​zz（int n）{...} //构造函数
 *   public void fizz（printFizz）{...} //仅输出“ fizz”
 *   public void buzz（printBuzz）{...} //仅输出“ buzz”
 *   public void fizzbuzz（printFizzBu​​zz）{...} //仅输出“ fizzbuzz”
 *   public void number（printNumber）{...} //仅输出数字
 * }
 * 实现FizzBuzz具有四个线程的多线程版本。的相同实例FizzBuzz将传递到四个不同的线程：
 *
 * 线程A将调用  fizz() 检查3和输出的除数  fizz。
 * 线程B将调用  buzz() 检查5和输出的可除性  buzz。
 * 线程C将调用fizzbuzz() 检查3和5与输出的除数  fizzbuzz。
 * 线程D将调用number()，后者仅应输出数字。
 */
public class Test {
	public static void main(String[] args) throws InterruptedException {
		FizzBuzz fb = new FizzBuzz(15);

		new Thread(() -> {
			try {
				fb.fizz(() -> {
					System.out.print("Fizz");
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		new Thread(() -> {
			try {
				fb.buzz(() -> {
					System.out.print("Buzz");
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		new Thread(() -> {
			try {
				fb.number(System.out::print);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		new Thread(() -> {
			try {
				fb.fizzbuzz(() -> {
					System.out.print("FizZBuzZ");
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
	}
}

class FizzBuzz {
	private int n;
	volatile int x;
	Semaphore c3;
	Semaphore c5;
	Semaphore c15;
	Semaphore cx;

	public FizzBuzz(int n) {
		this.n = n;
		x = 1;
		c3 = new Semaphore(0);
		c5 = new Semaphore(0);
		c15 = new Semaphore(0);
		cx = new Semaphore(0);
	}

	public void fizz(Runnable printFizz) throws InterruptedException {
		while (x<=n) {
			if (x % 3 == 0 && x % 5 != 0) {
				c3.acquire();
				printFizz.run();
				x++;
			}
		}
	}

	public void buzz(Runnable printBuzz) throws InterruptedException {
		while (x<=n) {
			if (x % 5 == 0 && x % 3 != 0) {
				c5.acquire();
				printBuzz.run();
				x++;
			}
		}
	}

	public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
		while (x<=n) {
			if (x % 5 == 0 && x % 3 == 0) {
				c15.acquire();
				printFizzBuzz.run();
				x++;
			}
		}
	}

	public void number(IntConsumer printNumber) throws InterruptedException {
		while (x <= n) {
				if (x % 3 == 0 && x % 5 != 0) {
					c3.release();
				} else if (x % 5 == 0 && x % 3 != 0) {
					c5.release();
				} else if (x % 5 == 0 && x % 3 == 0) {
					c15.release();
				} else {
					cx.release();
					printNumber.accept(x);
					x++;
				}
		}
	}
}