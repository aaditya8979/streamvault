package com.inmobi.media;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3879y9 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SdkInitializationListener f28573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f28574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3879y9(Context context, String str, SdkInitializationListener sdkInitializationListener, long j10, hn.c cVar) {
        super(1, cVar);
        this.f28571b = context;
        this.f28572c = str;
        this.f28573d = sdkInitializationListener;
        this.f28574e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3879y9(this.f28571b, this.f28572c, this.f28573d, this.f28574e, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((C3879y9) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28570a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                Yk.a(this.f28571b);
                Context context = Ji.f25747a;
                if (context != null) {
                    File file = new File(context.getFilesDir(), "im_cached_content");
                    if (file.mkdir() || !file.isDirectory()) {
                        tn.p.j("Ji", "TAG");
                    } else {
                        tn.p.j("Ji", "TAG");
                    }
                }
                p000do.h.b(null, new Xk(null), 1, null);
                String str = this.f28572c;
                tn.p.k(str, "primaryAccountId");
                Context context2 = Ji.f25747a;
                if (context2 != null) {
                    ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                    Da.a(context2, "coppa_store").a("im_accid", str, false);
                }
                Context context3 = this.f28571b;
                this.f28570a = 1;
                if (p000do.h.b(null, new Wk(context3, null), 1, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            Ji.f25755i = 2;
            InMobiSdk inMobiSdk = InMobiSdk.INSTANCE;
            InMobiSdk.access$provideCallback(inMobiSdk, this.f28573d, null);
            Og.f26086a.getClass();
            p000do.i.d(A9.f25149e, null, null, new Kg(null), 3, null);
            Map mapAccess$prepareTelemetryPayload = InMobiSdk.access$prepareTelemetryPayload(inMobiSdk, this.f28574e);
            Wj wj2 = Wj.f26549a;
            Wj.b("SdkInitialized", mapAccess$prepareTelemetryPayload, EnumC3287ak.f26805a);
            InMobiUnifiedIdService.push(C3274a7.f26761b);
        } catch (Exception e10) {
            tn.p.j(InMobiSdk.access$getTAG$p(), "access$getTAG$p(...)");
            e10.getMessage();
            Ji.f25749c = null;
            Ji.f25747a = null;
            Ji.f25755i = 3;
            InMobiSdk.access$provideCallback(InMobiSdk.INSTANCE, this.f28573d, "SDK could not be initialized; an unexpected error was encountered.");
        }
        return bn.r.f5635a;
    }
}
