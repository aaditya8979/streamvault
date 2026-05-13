package com.moloco.sdk.internal.ilrd.provider;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.g;
import bn.r;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.moloco.sdk.internal.ilrd.f;
import com.moloco.sdk.internal.ilrd.i;
import com.moloco.sdk.m0;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import go.k;
import go.l;
import go.q;
import go.u;
import go.v;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class a implements com.moloco.sdk.internal.ilrd.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final C0564a f46212h = new C0564a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f46213i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static volatile AppLovinCommunicatorSubscriber f46214j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f46215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f46216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.ilrd.model.a f46217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final g f46218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final g f46219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final l<i> f46220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final k<f.a.b> f46221g;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.provider.a$a, reason: collision with other inner class name */
    public static final class C0564a {
        public C0564a() {
        }

        public /* synthetic */ C0564a(tn.i iVar) {
            this();
        }
    }

    public static final class b implements AppLovinCommunicatorSubscriber {

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.provider.a$b$a, reason: collision with other inner class name */
        @jn.d(c = "com.moloco.sdk.internal.ilrd.provider.ApplovinIlrd$createCallback$1$onMessageReceived$1", f = "ApplovinIlrd.kt", l = {106}, m = "invokeSuspend")
        public static final class C0565a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f46223a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f46224b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f.a.b f46225c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0565a(a aVar, f.a.b bVar, hn.c<? super C0565a> cVar) {
                super(2, cVar);
                this.f46224b = aVar;
                this.f46225c = bVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
                return ((C0565a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<r> create(Object obj, hn.c<?> cVar) {
                return new C0565a(this.f46224b, this.f46225c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objG = in.a.g();
                int i10 = this.f46223a;
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    k kVar = this.f46224b.f46221g;
                    f.a.b bVar = this.f46225c;
                    this.f46223a = 1;
                    if (kVar.emit(bVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                return r.f5635a;
            }
        }

        public b() {
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return "Moloco";
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
            tn.p.k(appLovinCommunicatorMessage, "message");
            if (kotlinx.coroutines.d.h(a.this.f46216b) && tn.p.f("max_revenue_events", appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                tn.p.j(messageData, "getMessageData(...)");
                p000do.i.d(a.this.f46216b, null, null, new C0565a(a.this, a.this.a(messageData), null), 3, null);
            }
        }
    }

    public a(@NotNull Context context, @NotNull l0 l0Var) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "scope");
        this.f46215a = context;
        this.f46216b = l0Var;
        this.f46217c = com.moloco.sdk.internal.ilrd.model.a.f46208a;
        this.f46218d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.ilrd.provider.b
            @Override // sn.a
            public final Object invoke() {
                return a.g(this.f46226b);
            }
        });
        this.f46219e = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.ilrd.provider.c
            @Override // sn.a
            public final Object invoke() {
                return a.e(this.f46227b);
            }
        });
        this.f46220f = v.a(i.c.f46207a);
        this.f46221g = q.b(0, 0, null, 7, null);
    }

    public static final go.p e(a aVar) {
        return go.f.b(aVar.f46221g);
    }

    public static final u g(a aVar) {
        return go.f.c(aVar.f46220f);
    }

    public final f.a.b a(Bundle bundle) {
        double d10 = bundle.getDouble("revenue");
        String string = bundle.getString("country_code");
        String string2 = bundle.getString(BrandSafetyEvent.f52736ad);
        String string3 = bundle.getString(BrandSafetyEvent.f52757l);
        String string4 = bundle.getString(BrandSafetyEvent.f52756k);
        String string5 = bundle.getString("ad_format");
        String string6 = bundle.getString("user_segment");
        String string7 = bundle.getString("id");
        m0.a aVarK = m0.k();
        aVarK.f(d10);
        if (string != null) {
            aVarK.b(string);
        }
        if (string2 != null) {
            aVarK.e(string2);
        }
        if (string3 != null) {
            aVarK.d(string3);
        }
        if (string4 != null) {
            aVarK.g(string4);
        }
        if (string5 != null) {
            aVarK.a(string5);
        }
        if (string6 != null) {
            aVarK.h(string6);
        }
        if (string7 != null) {
            aVarK.c(string7);
        }
        m0 m0VarBuild = aVarK.build();
        tn.p.j(m0VarBuild, "build(...)");
        return new f.a.b(m0VarBuild);
    }

    @Override // com.moloco.sdk.internal.ilrd.f
    @NotNull
    public com.moloco.sdk.internal.ilrd.model.a a() {
        return this.f46217c;
    }

    @Override // com.moloco.sdk.internal.ilrd.f
    @NotNull
    public synchronized Object b() {
        Object objH;
        objH = h();
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objH);
        if (thM7537exceptionOrNullimpl != null) {
            this.f46220f.setValue(new i.a(thM7537exceptionOrNullimpl.toString()));
        }
        if (Result.m7540isSuccessimpl(objH)) {
            this.f46220f.setValue(i.b.f46206a);
        }
        return objH;
    }

    @Override // com.moloco.sdk.internal.ilrd.f
    @NotNull
    public go.p<f.a.b> c() {
        return (go.p) this.f46219e.getValue();
    }

    public final b f() {
        return new b();
    }

    @Override // com.moloco.sdk.internal.ilrd.f
    @NotNull
    public u<i> getState() {
        return (u) this.f46218d.getValue();
    }

    public final Object h() {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            int i10 = AppLovinCommunicator.f7599g;
            Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage");
            objM7534constructorimpl = Result.m7534constructorimpl(AppLovinCommunicator.getInstance(this.f46215a));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null) {
            return Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl));
        }
        b bVarF = f();
        f46214j = bVarF;
        ((AppLovinCommunicator) objM7534constructorimpl).subscribe(bVarF, "max_revenue_events");
        return Result.m7534constructorimpl(r.f5635a);
    }
}
