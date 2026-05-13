package com.inmobi.media;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: renamed from: com.inmobi.media.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3849x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Interceptor[] f28480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OkHttpClient f28481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28482c;

    public C3849x4(Interceptor[] interceptorArr, Interceptor[] interceptorArr2, Dispatcher dispatcher, C3666pk c3666pk) {
        tn.p.k(dispatcher, "dispatcher");
        tn.p.k(c3666pk, "timeoutConfig");
        this.f28480a = interceptorArr2;
        this.f28482c = c3666pk.f27887c;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (interceptorArr != null) {
            for (Interceptor interceptor : interceptorArr) {
                builder.addInterceptor(interceptor);
            }
        }
        Interceptor[] interceptorArr3 = this.f28480a;
        if (interceptorArr3 != null) {
            for (Interceptor interceptor2 : interceptorArr3) {
                builder.addNetworkInterceptor(interceptor2);
            }
        }
        builder.addInterceptor(new C3913zi());
        builder.addNetworkInterceptor(new Xb());
        builder.protocols(cn.w.s(Protocol.HTTP_2, Protocol.HTTP_1_1));
        builder.retryOnConnectionFailure(false);
        builder.dispatcher(dispatcher);
        long j10 = c3666pk.f27885a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(j10, timeUnit);
        builder.readTimeout(c3666pk.f27886b, timeUnit);
        OkHttpClient okHttpClientBuild = builder.build();
        tn.p.j(okHttpClientBuild, "build(...)");
        this.f28481b = okHttpClientBuild;
    }

    public static Pair a(Me me2) {
        RequestBody c3774u4;
        Request.Builder builderUrl = new Request.Builder().url(me2.c());
        Map mapA = me2.a();
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                builderUrl.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Ai aiB = me2.b();
        if (aiB != null) {
            builderUrl.tag(aiB);
        }
        if (me2 instanceof Je) {
            builderUrl.get();
        } else if (me2 instanceof Le) {
            try {
                AbstractC3788ui abstractC3788ui = ((Le) me2).f25881d;
                if (abstractC3788ui == null) {
                    c3774u4 = RequestBody.create((MediaType) null, new byte[0]);
                    tn.p.h(c3774u4);
                } else {
                    c3774u4 = new C3774u4(abstractC3788ui);
                }
                builderUrl.post(c3774u4);
            } catch (FileNotFoundException e10) {
                e10.getStackTrace();
                return new Pair(builderUrl.build(), new C3299b6(((Le) me2).f25878a, EnumC3273a6.f26753m));
            } catch (IOException e11) {
                e11.getStackTrace();
                return new Pair(builderUrl.build(), new C3299b6(((Le) me2).f25878a, EnumC3273a6.f26745e));
            } catch (Exception e12) {
                e12.getStackTrace();
                return new Pair(builderUrl.build(), new C3299b6(((Le) me2).f25878a, EnumC3273a6.f26744d));
            }
        } else {
            if (!(me2 instanceof Ke)) {
                throw new NoWhenBranchMatchedException();
            }
            builderUrl.head();
        }
        return new Pair(builderUrl.build(), null);
    }

    public final Object a(Me me2, ContinuationImpl continuationImpl) {
        OkHttpClient okHttpClient = this.f28481b;
        Pair pairA = a(me2);
        Request request = (Request) pairA.component1();
        C3299b6 c3299b6 = (C3299b6) pairA.component2();
        return c3299b6 != null ? c3299b6 : a(okHttpClient, request, me2.c(), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(okhttp3.OkHttpClient r20, okhttp3.Request r21, java.lang.String r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3849x4.a(okhttp3.OkHttpClient, okhttp3.Request, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
