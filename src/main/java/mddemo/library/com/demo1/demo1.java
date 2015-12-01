package mddemo.library.com.demo1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import mddemo.library.com.activityanimation_master.R;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月1日11:06:10
 * Description:
 */
public class demo1 {

    /**
     *   创建最基本的观察者  打印出数组里面的东西
     */
    private void createNewObserver(){
        String [] names={"a","b","c"};
        Observable.from(names).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                Log.e("lcc",s);
            }
        });
    }

    /**
     * 将获取的图片显示出来
     */
    private void getImage(){
        int drawableimage= R.mipmap.ic_launcher;
        final ImageView imageView = null;
        Observable.create(new Observable.OnSubscribe<Drawable>() {
            @Override
            public void call(Subscriber<? super Drawable> subscriber) {
                Drawable drawable = null;//在这获取图片
                subscriber.onNext(drawable);
                subscriber.onCompleted();
            }
        }).subscribe(new Observer<Drawable>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                //输出错误信息
            }

            @Override
            public void onNext(Drawable drawable) {
                imageView.setImageDrawable(drawable);
            }
        });
    }

    /**
     * 后台线程取数据，主线程显示』的程序策略。
     */
    private void testThread(){
        Observable.just(1,2,3,4)
                .subscribeOn(Schedulers.io())//在io线程里面
        .observeOn(AndroidSchedulers.mainThread())//在android的主线程里面回调
        .subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                //此处相当于onnext（）输出number
            }
        });
    }

    /**
     * 关于mapmap() 方法将参数中的 String 对象转换成一个 Bitmap 对象后返回，而在经过 map() 方法后，
     * 事件的参数类型也由 String 转为了 Bitmap。这种直接变换对象并返回的，是最常见的也最容易理解的变换
     */
    private void mapText(){
        Observable.just("images/logo.png") // 输入类型 String
                .map(new Func1<String, Bitmap>() {
                    @Override
                    public Bitmap call(String filePath) { // 参数类型 String
                        //return getBitmapFromPath(filePath); // 返回类型 Bitmap
                        return null;
                    }
                })
                .subscribe(new Action1<Bitmap>() {
                    @Override
                    public void call(Bitmap bitmap) { // 参数类型 Bitmap
                        //showBitmap(bitmap);
                    }
                });
    }

    /**
     * 因为 map() 是一对一的转化
     */
    private void printStudent(){
        Student s=new Student();
        s.setName("1");
        Student[] names={s,s,s};
        Subscriber<String> subscriber=new Subscriber<String>() {
            @Override
            public void onCompleted() {
                
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String name) {
                Log.d("name", name);
            }
        };
        
        Observable.from(names).map(new Func1<Student, String>() {
            @Override
            public String call(Student student) {
                return student.getName();
            }
        }).subscribe(subscriber);

    }

    /**
     *请先暂时无视这个案例
     */
    private void printCourse(){
        Student s=new Student();
        s.setName("1");
        Student[] names={s,s,s};
        Subscriber<Course> subscriber=new Subscriber<Course>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Course name) {
                Log.d("name", name.getValue());
            }
        };

        Observable.from(names).flatMap(new Func1<Student, Observable<Course>>() {
            @Override
            public Observable<Course> call(Student student) {
                return Observable.from(student.getCourse());
            }
        })
        .subscribe(subscriber);

    }



}
