package mddemo.library.com.demo1;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月1日13:49:31
 * Description:
 */
public class demo2 {


    private void rxRetrofit(){
//        @GET("/token")
//        public Observable<String> getToken();
//
//        @GET("/user")
//        public Observable<User> getUser(@Query("token") String token, @Query("userId") String userId);
//
//        ...=========================================================================================
//
//        getToken()
//                .flatMap(new Func1<String, Observable<User>>() {
//                    @Override
//                    public Observable<User> onNext(String token) {
//                        return getUser(token, userId);
//                    })
//                            .observeOn(AndroidSchedulers.mainThread())
//                            .subscribe(new Observer<User>() {
//                        @Override
//                        public void onNext(User user) {
//                            userView.setUser(user);
//                        }
//
//                        @Override
//                        public void onCompleted() {
//                        }
//
//                        @Override
//                        public void onError(Throwable error) {
//                            // Error handling
//                            ...
//                        }
//                    });
    }
}
