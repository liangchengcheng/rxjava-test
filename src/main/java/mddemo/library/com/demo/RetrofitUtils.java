package mddemo.library.com.demo;

import android.content.Context;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;

import java.io.IOException;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:   2015年12月1日10:45:21
 * Description:  retrofit的工具类
 */
public class RetrofitUtils {

    public static <T> T createApi(Context context, Class<T> clazz) {
        OkHttpClient client = new OkHttpClient();
        client.interceptors().add(new Interceptor() {
            @Override
            public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                com.squareup.okhttp.Response response = chain.proceed(chain.request());
                return response;
            }
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.17yxb.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit.create(clazz);
    }
}
