package wuhao.bwei.com.wuhaoonepiece.netWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class MyInterceptor implements Interceptor {
    private static final int DEFAULT_TIMEOUT = 30; //此处默认超时时间为30s
    private TimeUnit mTimeUnitSECONDS = TimeUnit.SECONDS;
    private OkHttpClient.Builder build = new OkHttpClient.Builder();

    public OkHttpClient build() {
        return build.build();
    }

    public MyInterceptor addTimeOut(int timeOut) {
        if (timeOut <= 0) timeOut = DEFAULT_TIMEOUT;
        build.connectTimeout(timeOut, mTimeUnitSECONDS)
                .writeTimeout(timeOut, mTimeUnitSECONDS)
                .readTimeout(timeOut, mTimeUnitSECONDS);
        return this;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request orinal = chain.request();
        HttpUrl url = orinal.url()
                .newBuilder()
                .addQueryParameter("source","android")
                .addQueryParameter("appVersion","101")
                .addQueryParameter("token","AC79AC355AAB71BC677D4EF8BA97FCC8")
                .build();

        Request build = orinal.newBuilder()
                .url(url)
                .build();

        return chain.proceed(build);
    }
}