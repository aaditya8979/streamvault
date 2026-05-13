package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiNetworkBridge;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: renamed from: com.inmobi.media.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3824w4 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OkHttpClient f28419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Request f28420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3824w4(OkHttpClient okHttpClient, Request request, hn.c cVar) {
        super(2, cVar);
        this.f28419b = okHttpClient;
        this.f28420c = request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3824w4(this.f28419b, this.f28420c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3824w4(this.f28419b, this.f28420c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28418a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return obj;
        }
        kotlin.c.b(obj);
        Call callNewCall = this.f28419b.newCall(this.f28420c);
        tn.p.j(callNewCall, "newCall(...)");
        this.f28418a = 1;
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(this), 1);
        cVar.K();
        cVar.P(new C3340cl(callNewCall));
        InMobiNetworkBridge.okhttp3CallEnqueue(callNewCall, new C3366dl(cVar));
        Object objB = cVar.B();
        if (objB == in.a.g()) {
            jn.f.c(this);
        }
        return objB == objG ? objG : objB;
    }
}
