package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0;
import go.k;
import go.l;
import go.u;
import go.v;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;
import sn.q;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@MainThread
public final class f implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c f50736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f50737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f50738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final k<Boolean> f50739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> f50740f;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$1", f = "VisibilityAwareVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements q<Boolean, Boolean, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f50742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f50743c;

        public a(hn.c<? super a> cVar) {
            super(3, cVar);
        }

        public final Object a(boolean z10, boolean z11, hn.c<? super r> cVar) {
            a aVar = f.this.new a(cVar);
            aVar.f50742b = z10;
            aVar.f50743c = z11;
            return aVar.invokeSuspend(r.f5635a);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, hn.c<? super r> cVar) {
            return a(bool.booleanValue(), bool2.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50741a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            boolean z10 = this.f50742b;
            boolean z11 = this.f50743c;
            if (z10 && z11) {
                f.this.f50736b.play();
            } else {
                f.this.f50736b.pause();
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$2", f = "VisibilityAwareVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements q<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, Boolean, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f50747c;

        public b(hn.c<? super b> cVar) {
            super(3, cVar);
        }

        public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, boolean z10, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> cVar) {
            b bVar = new b(cVar);
            bVar.f50746b = aVar;
            bVar.f50747c = z10;
            return bVar.invokeSuspend(r.f5635a);
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Boolean bool, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> cVar) {
            return a(aVar, bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50745a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f50746b, false, this.f50747c, false, 5, null);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.VisibilityAwareVideoPlayer$3", f = "VisibilityAwareVideoPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50749b;

        public c(hn.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, hn.c<? super r> cVar) {
            return ((c) create(aVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = f.this.new c(cVar);
            cVar2.f50749b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50748a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            f.this.f50740f.setValue((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f50749b);
            return r.f5635a;
        }
    }

    public f(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c cVar, @NotNull c0 c0Var) {
        tn.p.k(cVar, "basePlayer");
        tn.p.k(c0Var, "viewVisibilityTracker");
        this.f50736b = cVar;
        l0 l0VarB = kotlinx.coroutines.d.b();
        this.f50737c = l0VarB;
        u<Boolean> uVarM = go.f.M(i.b(c0Var, cVar.N()), l0VarB, kotlinx.coroutines.flow.a.f73397a.c(), Boolean.FALSE);
        this.f50738d = uVarM;
        k<Boolean> kVarB = go.q.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f50739e = kVarB;
        this.f50740f = v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a.a(cVar.isPlaying().getValue(), false, uVarM.getValue().booleanValue(), false, 5, null));
        go.f.D(go.f.m(uVarM, kVarB, new a(null)), l0VarB);
        go.f.D(go.f.G(go.f.m(cVar.isPlaying(), uVarM, new b(null)), new c(null)), l0VarB);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    @Nullable
    public View N() {
        return this.f50736b.N();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    @Nullable
    public Object a(@NotNull hn.c<? super r> cVar) {
        return this.f50736b.a(cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    public void a(@Nullable String str) {
        this.f50736b.a(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    public void b(boolean z10) {
        this.f50736b.b(z10);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f50737c, null, 1, null);
        this.f50736b.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    @NotNull
    public u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> f() {
        return this.f50736b.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    @NotNull
    public u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> isPlaying() {
        return this.f50740f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    @NotNull
    public u<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> o() {
        return this.f50736b.o();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    public void pause() {
        this.f50739e.h(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    public void play() {
        this.f50739e.h(Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.h
    public void seekTo(long j10) {
        this.f50736b.seekTo(j10);
    }
}
