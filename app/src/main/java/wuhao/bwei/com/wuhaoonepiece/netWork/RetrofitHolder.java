package wuhao.bwei.com.wuhaoonepiece.netWork;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alienware on 2018/1/22.
 */

public class RetrofitHolder {
    private static OkHttpClient okHttpClient;
    private static ServesApi servesApi;


    static {
        init();
    }

    private static void init() {
        if(okHttpClient==null){
            synchronized (RetrofitHolder.class){
                if(okHttpClient==null){
                    okHttpClient=new OkHttpClient.Builder()
                            .addInterceptor(new MyInterceptor())
                            .connectTimeout(30, TimeUnit.SECONDS)
                            .writeTimeout(30,TimeUnit.SECONDS)
                            .readTimeout(30,TimeUnit.SECONDS)
                            .build();
                }
            }
        }
    }

    public static ServesApi getApi(){
        if(servesApi==null){
            synchronized (ServesApi.class){
                if(servesApi==null){
                    servesApi=RetrofitHolder.caresApi(ServesApi.class,UrlUtils.HOST);
                }
            }
        }
        return servesApi;
    }

    public static <T> T caresApi(Class<T> clazz,String url){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(UrlUtils.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
        return retrofit.create(clazz);
    }

}
