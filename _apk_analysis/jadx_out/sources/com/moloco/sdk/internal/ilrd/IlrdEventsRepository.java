package com.moloco.sdk.internal.ilrd;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import bn.r;
import co.b;
import com.moloco.sdk.g0;
import com.moloco.sdk.i0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.f;
import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class IlrdEventsRepository implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final c f46084t = new c(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f46085u = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f46086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f46087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f46088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f46091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f46092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.j f46093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final p f46094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f46095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f46096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final h0 f46097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.ilrd.d f46098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.ilrd.d f46099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.ilrd.d f46100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final mo.a f46101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public com.moloco.sdk.internal.ilrd.a f46102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final List<g0> f46103s;

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$1", f = "IlrdEventsRepository.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f46105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IlrdEventsRepository f46106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lifecycle lifecycle, IlrdEventsRepository ilrdEventsRepository, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f46105b = lifecycle;
            this.f46106c = ilrdEventsRepository;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f46105b, this.f46106c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f46104a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f46105b.addObserver(this.f46106c);
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$2", f = "IlrdEventsRepository.kt", l = {499, 119}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46109c;

        public b(hn.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return IlrdEventsRepository.this.new b(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            mo.a aVar;
            IlrdEventsRepository ilrdEventsRepository;
            mo.a aVar2;
            Object objG = in.a.g();
            int i10 = this.f46109c;
            try {
                if (i10 == 0) {
                    kotlin.c.b(obj);
                    aVar = IlrdEventsRepository.this.f46101q;
                    ilrdEventsRepository = IlrdEventsRepository.this;
                    this.f46107a = aVar;
                    this.f46108b = ilrdEventsRepository;
                    this.f46109c = 1;
                    if (aVar.c(null, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (mo.a) this.f46107a;
                        try {
                            kotlin.c.b(obj);
                            r rVar = r.f5635a;
                            aVar2.d(null);
                            return rVar;
                        } catch (Throwable th2) {
                            mo.a aVar3 = aVar2;
                            th = th2;
                            aVar = aVar3;
                            aVar.d(null);
                            throw th;
                        }
                    }
                    ilrdEventsRepository = (IlrdEventsRepository) this.f46108b;
                    mo.a aVar4 = (mo.a) this.f46107a;
                    kotlin.c.b(obj);
                    aVar = aVar4;
                }
                this.f46107a = aVar;
                this.f46108b = null;
                this.f46109c = 2;
                if (ilrdEventsRepository.e(this) == objG) {
                    return objG;
                }
                aVar2 = aVar;
                r rVar2 = r.f5635a;
                aVar2.d(null);
                return rVar2;
            } catch (Throwable th3) {
                th = th3;
                aVar.d(null);
                throw th;
            }
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(tn.i iVar) {
            this();
        }

        public final byte[] b(byte[] bArr) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    r rVar = r.f5635a;
                    on.b.a(gZIPOutputStream, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    on.b.a(byteArrayOutputStream, null);
                    tn.p.j(byteArray, "use(...)");
                    return byteArray;
                } finally {
                }
            } finally {
            }
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$onEvent$1", f = "IlrdEventsRepository.kt", l = {499, 251, 259, 267}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f46114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46115e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ f.a f46117g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.a aVar, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f46117g = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return IlrdEventsRepository.this.new d(this.f46117g, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00f2 A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:17:0x0048, B:33:0x00b4, B:35:0x00f2, B:37:0x00f8), top: B:59:0x0048 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0118 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0121 A[Catch: all -> 0x0035, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0030, B:41:0x011b, B:43:0x0121, B:44:0x0123), top: B:61:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.IlrdEventsRepository.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository", f = "IlrdEventsRepository.kt", l = {148, TextFieldImplKt.AnimationDuration, 153, 166, 176, 194, 205, 209}, m = "restoreSavedSession")
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f46120c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46122e;

        public e(hn.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46120c = obj;
            this.f46122e |= Integer.MIN_VALUE;
            return IlrdEventsRepository.this.e(this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$restoreSavedSession$restoredSession$1", f = "IlrdEventsRepository.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<l0, hn.c<? super com.moloco.sdk.internal.ilrd.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46123a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f46125c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, hn.c<? super f> cVar) {
            super(2, cVar);
            this.f46125c = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super com.moloco.sdk.internal.ilrd.a> cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return IlrdEventsRepository.this.new f(this.f46125c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f46123a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return new com.moloco.sdk.internal.ilrd.a(IlrdEventsRepository.this.f46093i, this.f46125c);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleInactiveSessionExpiry$1", f = "IlrdEventsRepository.kt", l = {358}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements sn.l<hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46126a;

        public g(hn.c<? super g> cVar) {
            super(1, cVar);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hn.c<? super r> cVar) {
            return ((g) create(cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(hn.c<?> cVar) {
            return IlrdEventsRepository.this.new g(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46126a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.internal.ilrd.a aVarR = IlrdEventsRepository.this.r();
                if (aVarR != null) {
                    aVarR.b();
                }
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f46126a = 1;
                if (ilrdEventsRepository.i(this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleMaxSessionLength$1", f = "IlrdEventsRepository.kt", l = {377}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements sn.l<hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46128a;

        public h(hn.c<? super h> cVar) {
            super(1, cVar);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hn.c<? super r> cVar) {
            return ((h) create(cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(hn.c<?> cVar) {
            return IlrdEventsRepository.this.new h(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46128a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                com.moloco.sdk.internal.ilrd.a aVarR = IlrdEventsRepository.this.r();
                if (aVarR != null) {
                    aVarR.b();
                }
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f46128a = 1;
                if (ilrdEventsRepository.i(this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$scheduleUploadIntervalScheduler$1", f = "IlrdEventsRepository.kt", l = {392}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements sn.l<hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46130a;

        public i(hn.c<? super i> cVar) {
            super(1, cVar);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hn.c<? super r> cVar) {
            return ((i) create(cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(hn.c<?> cVar) {
            return IlrdEventsRepository.this.new i(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46130a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f46130a = 1;
                if (ilrdEventsRepository.i(this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$sendEvents$1", f = "IlrdEventsRepository.kt", l = {406}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46132a;

        public j(hn.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((j) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return IlrdEventsRepository.this.new j(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46132a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                IlrdEventsRepository ilrdEventsRepository = IlrdEventsRepository.this;
                this.f46132a = 1;
                if (ilrdEventsRepository.i(this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository", f = "IlrdEventsRepository.kt", l = {499, 437}, m = "sendEventsSuspending")
    public static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f46134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f46135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f46136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f46137d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46139f;

        public k(hn.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46137d = obj;
            this.f46139f |= Integer.MIN_VALUE;
            return IlrdEventsRepository.this.i(this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$storeEventsToPersistentStorage$2", f = "IlrdEventsRepository.kt", l = {448, 455}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46140a;

        public l(hn.c<? super l> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((l) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return IlrdEventsRepository.this.new l(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46140a;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                    return r.f5635a;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return r.f5635a;
            }
            kotlin.c.b(obj);
            if (IlrdEventsRepository.this.j().isEmpty()) {
                h0 h0Var = IlrdEventsRepository.this.f46097m;
                this.f46140a = 1;
                if (h0Var.a("ilrd_events_store", this) == objG) {
                    return objG;
                }
                return r.f5635a;
            }
            String strEncodeToString = Base64.encodeToString(i0.j().a(IlrdEventsRepository.this.j()).build().toByteArray(), 2);
            h0 h0Var2 = IlrdEventsRepository.this.f46097m;
            this.f46140a = 2;
            if (h0Var2.b("ilrd_events_store", strEncodeToString, this) == objG) {
                return objG;
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.ilrd.IlrdEventsRepository$storeSessionToPersistentStorage$2", f = "IlrdEventsRepository.kt", l = {130}, m = "invokeSuspend")
    public static final class m extends SuspendLambda implements sn.p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.ilrd.a f46143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IlrdEventsRepository f46144c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.moloco.sdk.internal.ilrd.a aVar, IlrdEventsRepository ilrdEventsRepository, hn.c<? super m> cVar) {
            super(2, cVar);
            this.f46143b = aVar;
            this.f46144c = ilrdEventsRepository;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((m) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new m(this.f46143b, this.f46144c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f46142a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                String strI = this.f46143b.i();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Storing current session: " + strI, null, false, 12, null);
                h0 h0Var = this.f46144c.f46097m;
                this.f46142a = 1;
                if (h0Var.b("ilrd_session_store", strI, this) == objG) {
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

    public IlrdEventsRepository(l0 l0Var, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, long j10, int i10, long j11, long j12, com.moloco.sdk.internal.services.j jVar, Lifecycle lifecycle, p pVar, String str2, String str3, h0 h0Var, com.moloco.sdk.internal.ilrd.d dVar, com.moloco.sdk.internal.ilrd.d dVar2, com.moloco.sdk.internal.ilrd.d dVar3) {
        tn.p.k(l0Var, "scope");
        tn.p.k(str, "url");
        tn.p.k(lVar, "persistentHttpRequest");
        tn.p.k(jVar, "timeProvider");
        tn.p.k(lifecycle, "processLifeycle");
        tn.p.k(pVar, "advertisingIdService");
        tn.p.k(str2, "pubId");
        tn.p.k(str3, "appId");
        tn.p.k(h0Var, "dataStoreService");
        tn.p.k(dVar, "sessionInactiveScheduler");
        tn.p.k(dVar2, "sessionMaxLengthScheduler");
        tn.p.k(dVar3, "scheduledUploadScheduler");
        this.f46086b = l0Var;
        this.f46087c = str;
        this.f46088d = lVar;
        this.f46089e = j10;
        this.f46090f = i10;
        this.f46091g = j11;
        this.f46092h = j12;
        this.f46093i = jVar;
        this.f46094j = pVar;
        this.f46095k = str2;
        this.f46096l = str3;
        this.f46097m = h0Var;
        this.f46098n = dVar;
        this.f46099o = dVar2;
        this.f46100p = dVar3;
        this.f46101q = mo.g.b(false, 1, null);
        this.f46103s = new ArrayList();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "ILRD repository initialized - url=" + str + ", uploadInterval=" + ((Object) co.b.M(j11)) + ", maxBatchSize=" + i10 + ", sessionExpiry=" + ((Object) co.b.M(j10)) + ", maxSessionLength=" + ((Object) co.b.M(j12)), null, false, 12, null);
        p000do.i.d(l0Var, com.moloco.sdk.internal.scheduling.c.a().a(), null, new a(lifecycle, this, null), 2, null);
        p000do.i.d(l0Var, null, null, new b(null), 3, null);
    }

    public /* synthetic */ IlrdEventsRepository(l0 l0Var, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, long j10, int i10, long j11, long j12, com.moloco.sdk.internal.services.j jVar, Lifecycle lifecycle, p pVar, String str2, String str3, h0 h0Var, com.moloco.sdk.internal.ilrd.d dVar, com.moloco.sdk.internal.ilrd.d dVar2, com.moloco.sdk.internal.ilrd.d dVar3, int i11, tn.i iVar) {
        this(l0Var, str, lVar, j10, i10, j11, j12, jVar, lifecycle, pVar, str2, str3, h0Var, (i11 & 8192) != 0 ? new com.moloco.sdk.internal.ilrd.d(l0Var, jVar, "SessionInactiveScheduler") : dVar, (i11 & 16384) != 0 ? new com.moloco.sdk.internal.ilrd.d(l0Var, jVar, "SessionMaxLengthScheduler") : dVar2, (i11 & 32768) != 0 ? new com.moloco.sdk.internal.ilrd.d(l0Var, jVar, "UploadIntervalScheduler") : dVar3, null);
    }

    public /* synthetic */ IlrdEventsRepository(l0 l0Var, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, long j10, int i10, long j11, long j12, com.moloco.sdk.internal.services.j jVar, Lifecycle lifecycle, p pVar, String str2, String str3, h0 h0Var, com.moloco.sdk.internal.ilrd.d dVar, com.moloco.sdk.internal.ilrd.d dVar2, com.moloco.sdk.internal.ilrd.d dVar3, tn.i iVar) {
        this(l0Var, str, lVar, j10, i10, j11, j12, jVar, lifecycle, pVar, str2, str3, h0Var, dVar, dVar2, dVar3);
    }

    public final g0 b(f.a aVar) {
        g0.a aVarA = g0.f().a(UUID.randomUUID().toString());
        com.moloco.sdk.internal.ilrd.a aVar2 = this.f46102r;
        if (aVar2 != null) {
            aVarA.d(aVar2.f());
            b.a aVar3 = co.b.f6773c;
            long jT = co.d.t(this.f46093i.a() - aVar2.g(), DurationUnit.MILLISECONDS);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Event created: sessionId=" + aVar2.f() + ", sessionAge=" + ((Object) co.b.M(jT)), null, false, 12, null);
        }
        if (aVar instanceof f.a.b) {
            aVarA.c(((f.a.b) aVar).a());
        } else {
            if (!(aVar instanceof f.a.C0563a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarA.b(((f.a.C0563a) aVar).a());
        }
        return aVarA.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(hn.c<? super bn.r> r27) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.IlrdEventsRepository.e(hn.c):java.lang.Object");
    }

    @VisibleForTesting
    public final void f() {
        com.moloco.sdk.internal.ilrd.a aVar = this.f46102r;
        if (aVar == null || aVar.h()) {
            x();
            return;
        }
        b.a aVar2 = co.b.f6773c;
        long jT = co.d.t(this.f46093i.a() - aVar.g(), DurationUnit.MILLISECONDS);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Session validation - age: " + ((Object) co.b.M(jT)) + ", limit: " + ((Object) co.b.M(this.f46092h)), null, false, 12, null);
    }

    public final void g(long j10) {
        this.f46099o.b(j10, new h(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, mo.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(hn.c<? super bn.r> r14) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.IlrdEventsRepository.i(hn.c):java.lang.Object");
    }

    @NotNull
    public final List<g0> j() {
        return this.f46103s;
    }

    public final void l(@NotNull f.a aVar) {
        tn.p.k(aVar, "ilrdData");
        p000do.g.c(this.f46086b, EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new d(aVar, null));
    }

    public final Object o(hn.c<? super r> cVar) {
        Object objG = p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getDefault(), new l(null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        tn.p.k(lifecycleOwner, "owner");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "onPause called, sending events", null, false, 12, null);
        w();
    }

    public final Object q(hn.c<? super r> cVar) {
        Object objG;
        com.moloco.sdk.internal.ilrd.a aVar = this.f46102r;
        return (aVar != null && (objG = p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getDefault(), new m(aVar, this, null), cVar)) == in.a.g()) ? objG : r.f5635a;
    }

    @Nullable
    public final com.moloco.sdk.internal.ilrd.a r() {
        return this.f46102r;
    }

    @VisibleForTesting
    public final boolean s() {
        boolean z10 = this.f46103s.size() >= this.f46090f;
        if (z10) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "batch size reached", null, false, 12, null);
        }
        return z10;
    }

    public final synchronized void t() {
        f();
        u();
    }

    @VisibleForTesting
    public final void u() {
        this.f46098n.b(this.f46089e, new g(null));
    }

    public final void v() {
        this.f46100p.b(this.f46091g, new i(null));
    }

    @VisibleForTesting
    public final void w() {
        p000do.i.d(this.f46086b, null, null, new j(null), 3, null);
    }

    @VisibleForTesting
    public final void x() {
        com.moloco.sdk.internal.ilrd.a aVar = new com.moloco.sdk.internal.ilrd.a(this.f46093i, null, 2, null);
        this.f46102r = aVar;
        g(this.f46092h);
        v();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "New session started: sessionId=" + aVar.f() + ", maxBatch=" + this.f46090f + ", uploadInterval=" + ((Object) co.b.M(this.f46091g)) + ", sessionExp=" + ((Object) co.b.M(this.f46089e)) + ", maxLength=" + ((Object) co.b.M(this.f46092h)), null, false, 12, null);
    }
}
