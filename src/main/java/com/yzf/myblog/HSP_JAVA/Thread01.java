package com.yzf.myblog.HSP_JAVA;

/**
 * name:余泽斐
 * version：
 */
//实现线程的两种方法：1：继承THREAD类，实现run方法
public class Thread01{
    public static void main(String[] args) throws InterruptedException{
        Cat cat = new Cat();
        cat.start();
        //说明;当main线程启动一个子线程Thread_0,主线程不会阻塞，会继续执行
        System.out.println("主线程继续执行"+Thread.currentThread().getName());
        for (int i = 0;i<10;i++){
            System.out.println("主线程 i="+i);
            //让主线程休眠
            Thread.sleep(1000);
        }
    }

}

//业务说明：开启一个线程，每隔1秒打印一句话
//当一个类继承了thread，该类可以当线程使用
//我们会重写run方法，方法中写我们自己的业务逻辑
class Cat extends Thread{
    int times = 0;
    @Override
    public void run(){
        while (true){
            System.out.println("喵喵，我是喵喵"+(++times)+"线程名称="+Thread.currentThread().getName());
            //让该线程休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 8){
                return;
            }
        }

    }
}