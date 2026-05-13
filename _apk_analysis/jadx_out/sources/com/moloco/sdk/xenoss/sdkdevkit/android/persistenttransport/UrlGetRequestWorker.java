package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import cn.o0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.t;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public final class UrlGetRequestWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f50963b = {t.h(new PropertyReference0Impl(UrlGetRequestWorker.class, "url", "<v#0>", 0))};

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker", f = "PersistentHttpRequest.kt", l = {84}, m = "doWork")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f50964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f50965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50966c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f50968e;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f50966c = obj;
            this.f50968e |= Integer.MIN_VALUE;
            return UrlGetRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlGetRequestWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(com.moloco.sdk.internal.android_context.b.a(context), workerParameters);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(workerParameters, "params");
    }

    public static final String b(Map<String, Object> map) {
        tn.p.h(map);
        return (String) o0.a(map, f50963b[0].getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull hn.c<? super androidx.work.ListenableWorker.Result> r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlGetRequestWorker.doWork(hn.c):java.lang.Object");
    }
}
