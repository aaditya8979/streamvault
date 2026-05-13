package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3978d4;
import com.ironsource.C4266t8;
import com.ironsource.InterfaceC4276u1;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4242s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f33462a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f33463b;

    /* JADX INFO: renamed from: com.ironsource.s1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f33464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final C4266t8.e f33465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f33466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final JSONObject f33467d;

        public a(@NotNull String str, @NotNull C4266t8.e eVar, @NotNull String str2, @NotNull JSONObject jSONObject) {
            tn.p.k(str, "name");
            tn.p.k(eVar, C3978d4.i.f31349m);
            tn.p.k(str2, "demandSourceName");
            tn.p.k(jSONObject, "params");
            this.f33464a = str;
            this.f33465b = eVar;
            this.f33466c = str2;
            this.f33467d = jSONObject;
        }

        public static /* synthetic */ a a(a aVar, String str, C4266t8.e eVar, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f33464a;
            }
            if ((i10 & 2) != 0) {
                eVar = aVar.f33465b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f33466c;
            }
            if ((i10 & 8) != 0) {
                jSONObject = aVar.f33467d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }

        @NotNull
        public final a a(@NotNull String str, @NotNull C4266t8.e eVar, @NotNull String str2, @NotNull JSONObject jSONObject) {
            tn.p.k(str, "name");
            tn.p.k(eVar, C3978d4.i.f31349m);
            tn.p.k(str2, "demandSourceName");
            tn.p.k(jSONObject, "params");
            return new a(str, eVar, str2, jSONObject);
        }

        @NotNull
        public final String a() {
            return this.f33464a;
        }

        @NotNull
        public final C4266t8.e b() {
            return this.f33465b;
        }

        @NotNull
        public final String c() {
            return this.f33466c;
        }

        @NotNull
        public final JSONObject d() {
            return this.f33467d;
        }

        @NotNull
        public final String e() {
            return this.f33466c;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return tn.p.f(this.f33464a, aVar.f33464a) && this.f33465b == aVar.f33465b && tn.p.f(this.f33466c, aVar.f33466c) && tn.p.f(this.f33467d.toString(), aVar.f33467d.toString());
        }

        @NotNull
        public final String f() {
            return this.f33464a;
        }

        @NotNull
        public final JSONObject g() {
            return this.f33467d;
        }

        @NotNull
        public final C4266t8.e h() {
            return this.f33465b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public final JSONObject i() throws JSONException {
            JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit(this.f33467d.toString()).put(C3978d4.i.f31349m, this.f33465b).put("demandSourceName", this.f33466c);
            tn.p.j(jSONObjectPut, "JSONObject(params.toStri…eName\", demandSourceName)");
            return jSONObjectPut;
        }

        @NotNull
        public String toString() {
            return "CallbackResult(name=" + this.f33464a + ", productType=" + this.f33465b + ", demandSourceName=" + this.f33466c + ", params=" + this.f33467d + ")";
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s1$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s1$c */
    @jn.d(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", l = {80}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33468a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MeasurementManager f33470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f33471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MotionEvent f33472e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f33470c = measurementManager;
            this.f33471d = uri;
            this.f33472e = motionEvent;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull p000do.l0 l0Var, @Nullable hn.c<? super bn.r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<bn.r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return C4242s1.this.new c(this.f33470c, this.f33471d, this.f33472e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.f33468a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                C4242s1 c4242s1 = C4242s1.this;
                MeasurementManager measurementManager = this.f33470c;
                Uri uri = this.f33471d;
                tn.p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
                MotionEvent motionEvent = this.f33472e;
                this.f33468a = 1;
                if (c4242s1.a(measurementManager, uri, motionEvent, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s1$d */
    @jn.d(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", l = {60}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33473a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MeasurementManager f33475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f33476d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MeasurementManager measurementManager, Uri uri, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f33475c = measurementManager;
            this.f33476d = uri;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull p000do.l0 l0Var, @Nullable hn.c<? super bn.r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final hn.c<bn.r> create(@Nullable Object obj, @NotNull hn.c<?> cVar) {
            return C4242s1.this.new d(this.f33475c, this.f33476d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = in.a.g();
            int i10 = this.f33473a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                C4242s1 c4242s1 = C4242s1.this;
                MeasurementManager measurementManager = this.f33475c;
                Uri uri = this.f33476d;
                tn.p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
                this.f33473a = 1;
                if (c4242s1.a(measurementManager, uri, null, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    static {
        String name = b.class.getName();
        tn.p.j(name, "this::class.java.name");
        f33463b = name;
    }

    private final a a(Context context, InterfaceC4276u1.a aVar) {
        MeasurementManager measurementManagerA = C4099k0.a(context);
        if (measurementManagerA == null) {
            Logger.i(f33463b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC4276u1.a.b) {
                return a(aVar, measurementManagerA);
            }
            if (aVar instanceof InterfaceC4276u1.a.C0406a) {
                return a((InterfaceC4276u1.a.C0406a) aVar, measurementManagerA);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return a(aVar, "failed to handle attribution, message: " + e10.getMessage());
        }
    }

    private final a a(InterfaceC4276u1.a.C0406a c0406a, MeasurementManager measurementManager) throws InterruptedException {
        Uri uri = Uri.parse(c0406a.b());
        long jUptimeMillis = SystemClock.uptimeMillis();
        p000do.h.b(null, new c(measurementManager, uri, MotionEvent.obtain(jUptimeMillis, jUptimeMillis, c0406a.n(), c0406a.o().c(), c0406a.o().d(), c0406a.p()), null), 1, null);
        return a(c0406a);
    }

    private final a a(InterfaceC4276u1.a aVar) throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("params", IronSourceVideoBridge.jsonObjectInit().put("type", aVar instanceof InterfaceC4276u1.a.C0406a ? "click" : "impression"));
        String strA = aVar.a();
        C4266t8.e eVarD = aVar.d();
        String strE = aVar.e();
        tn.p.j(jSONObjectPut, "params");
        return new a(strA, eVarD, strE, jSONObjectPut);
    }

    private final a a(InterfaceC4276u1.a aVar, MeasurementManager measurementManager) throws InterruptedException {
        p000do.h.b(null, new d(measurementManager, Uri.parse(aVar.b()), null), 1, null);
        return a(aVar);
    }

    private final a a(InterfaceC4276u1 interfaceC4276u1, String str) throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("reason", str).put("type", interfaceC4276u1 instanceof InterfaceC4276u1.a.C0406a ? "click" : "impression");
        String strC = interfaceC4276u1.c();
        C4266t8.e eVarD = interfaceC4276u1.d();
        String strE = interfaceC4276u1.e();
        JSONObject jSONObjectPut2 = IronSourceVideoBridge.jsonObjectInit().put("params", jSONObjectPut);
        tn.p.j(jSONObjectPut2, "JSONObject().put(\"params\", payload)");
        return new a(strC, eVarD, strE, jSONObjectPut2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, hn.c<? super bn.r> cVar) throws Throwable {
        hn.f fVar = new hn.f(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C4259t1.a(fVar));
        Object objB = fVar.b();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB == in.a.g() ? objB : bn.r.f5635a;
    }

    @NotNull
    public final a a(@NotNull Context context, @NotNull InterfaceC4276u1 interfaceC4276u1) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(interfaceC4276u1, "message");
        if (interfaceC4276u1 instanceof InterfaceC4276u1.a) {
            return a(context, (InterfaceC4276u1.a) interfaceC4276u1);
        }
        throw new NoWhenBranchMatchedException();
    }
}
