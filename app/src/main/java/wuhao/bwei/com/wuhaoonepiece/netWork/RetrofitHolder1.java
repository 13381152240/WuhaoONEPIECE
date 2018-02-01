package wuhao.bwei.com.wuhaoonepiece.netWork;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alienware on 2018/1/22.
 */

public class RetrofitHolder1 {
    private static OkHttpClient okHttpClient;
    private static ServesApi1 servesApi1;
    static {
        init();
    }

    private static void init() {
        if(okHttpClient==null){
            synchronized (RetrofitHolder1.class){
                if(okHttpClient==null){
                    okHttpClient=new OkHttpClient.Builder()
                            .build();
                }
            }
        }
    }

    public static ServesApi1 getApi(){
        if(servesApi1==null){
            synchronized (ServesApi1.class){
                if(servesApi1==null){
                    servesApi1= RetrofitHolder1.caresApi(ServesApi1.class,UrlUtils1.HOST);
                }
            }
        }
        return servesApi1;
    }

    public static <T> T caresApi(Class<T> clazz,String url){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(UrlUtils1.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(clazz);
    }

}
