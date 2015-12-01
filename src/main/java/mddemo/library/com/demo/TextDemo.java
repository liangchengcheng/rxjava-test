package mddemo.library.com.demo;

import android.app.Activity;

import java.util.List;

import rx.Observer;
import rx.android.app.AppObservable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月1日10:46:36
 * Description:AppObservable.bindActivity
 */
public class TextDemo extends Activity{

    /*这个是我在github上看见的githot的开源项目的时候学习到的rxandroid的使用方法*
      直接通过AppObservable.bindActivity的方式当然fragment是通过AppObservable.bindFragment
     */
    private void retrofitText(String page){
        ApiService apiService=RetrofitUtils.createApi(TextDemo.this,ApiService.class);
        AppObservable.bindActivity(TextDemo.this, apiService.getUserRepositories(page))
                .map(new Func1<List<JavaBean>, List<JavaBean>>() {
                    @Override
                    public List<JavaBean> call(List<JavaBean> repositoryRepositories) {
                        return repositoryRepositories;
                    }
                }).subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(repositoryObserver);
    }

    private Observer<List<JavaBean>> repositoryObserver = new Observer<List<JavaBean>>() {
        @Override
        public void onCompleted() {
            //onCompleted(): 事件队列完结。RxJava 不仅把每个事件单独处理，还会把它们看做一个队列。RxJava 规定，当不会再有新的
        }

        @Override
        public void onError(Throwable e) {
            //onError(): 事件队列异常。在事件处理过程中出异常时，onError() 会被触发，同时队列自动终止，不允许再有事件发出。
        }


        @Override
        public void onNext(List<JavaBean> repositories) {
            //onNext() 发出时，需要触发 onCompleted() 方法作为标志
        }

        //在一个正确运行的事件序列中, onCompleted() 和 onError() 有且只有一个，并且是事件序列中的最后一个。
        // 需要注意的是，onCompleted() 和 onError() 二者也是互斥的，即在队列中调用了其中一个，就不应该再调用另一个。
    };

}
