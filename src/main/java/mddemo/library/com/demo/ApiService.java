package mddemo.library.com.demo;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by chengcheng on 2015/11/25.
 */
public interface ApiService {

    @GET("Zhuangbeihandler/{pd}")
    rx.Observable<List<JavaBean>> getUserRepositories(@Query("pd") String pd);
}
