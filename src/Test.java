//Рекурсия - вызов метода внутри самого метода.
public class Test {
    public static void main(String[] args) {
//        counter(3);

        //4! = 4*3*2*1
        //1! = 1
        //0! = 1

        System.out.println(fac(4));
    }

//    //counter(3)->counter(2) -> counterются в стек:
//    //counter(3)
//    //counter(2)
//    //counter(1)
//    //counter(0)    - когда мы доходим до выполнения условия - тогда поднимаемся по цепочке вверх
//
//    //В таком порядке вызовы метода помеща
//
//    private static void counter(int n) {
//        if (n == 0)
//            return;
//        System.out.println(n);
//        counter(n - 1); //3,2,1*
//    }


    //fac(4)
    //4*fac(3) - 1             ->4*6=24 -7
    //3*fac(2)  -2            ->3*2=6   -6
    //2*fac(1)  -3            ->2*1=2   -5
    //fac(1) = return 1 - 4
    private static int fac(int n) {
        if(n == 1)
            return 1;
        return  n * fac(n - 1);
    }

}

/*
* counter(3) ждет пока выполнится counter(2), a counter(2) ждет, пока выполнится counter(1)
 */