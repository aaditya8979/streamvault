package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.ironsource.C3978d4;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import fo.m;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public h f48271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final go.d<h> f48272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public l<? super File, r> f48273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public p<? super File, ? super h.d, r> f48274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public l<? super h.a, r> f48275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public l<? super h.b, r> f48276f;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.MediaStreamListenerFlow$streamStatusFlow$1", f = "MediaStreamListenerFlow.kt", l = {30}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<m<? super h>, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f48278b;

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        public static final r a(b bVar) {
            bVar.f48273c = null;
            bVar.f48274d = null;
            bVar.f48275e = null;
            bVar.f48276f = null;
            return r.f5635a;
        }

        public static final r a(m mVar, h.a aVar) {
            mVar.i(aVar);
            return r.f5635a;
        }

        public static final r a(m mVar, h.b bVar) {
            mVar.i(bVar);
            return r.f5635a;
        }

        public static final r a(m mVar, File file) {
            mVar.i(new h.c(file, new h.d(0L, 0L)));
            return r.f5635a;
        }

        public static final r a(m mVar, File file, h.d dVar) {
            mVar.i(new h.c(file, dVar));
            return r.f5635a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(m<? super h> mVar, hn.c<? super r> cVar) {
            return ((a) create(mVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            a aVar = b.this.new a(cVar);
            aVar.f48278b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f48277a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final m mVar = (m) this.f48278b;
                b.this.f48273c = new l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c
                    @Override // sn.l
                    public final Object invoke(Object obj2) {
                        return b.a.a(mVar, (File) obj2);
                    }
                };
                b.this.f48274d = new p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d
                    @Override // sn.p
                    /* JADX INFO: renamed from: invoke */
                    public final Object mo2invoke(Object obj2, Object obj3) {
                        return b.a.a(mVar, (File) obj2, (h.d) obj3);
                    }
                };
                b.this.f48275e = new l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e
                    @Override // sn.l
                    public final Object invoke(Object obj2) {
                        return b.a.a(mVar, (h.a) obj2);
                    }
                };
                b.this.f48276f = new l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f
                    @Override // sn.l
                    public final Object invoke(Object obj2) {
                        return b.a.a(mVar, (h.b) obj2);
                    }
                };
                final b bVar = b.this;
                sn.a aVar = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g
                    @Override // sn.a
                    public final Object invoke() {
                        return b.a.a(bVar);
                    }
                };
                this.f48277a = 1;
                if (ProduceKt.b(mVar, aVar, this) == objG) {
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

    public b(@NotNull h hVar) {
        tn.p.k(hVar, "initialStatus");
        this.f48271a = hVar;
        this.f48272b = go.f.f(new a(null));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void a(@NotNull h.b bVar) {
        tn.p.k(bVar, "error");
        this.f48271a = bVar;
        l<? super h.b, r> lVar = this.f48276f;
        if (lVar != null) {
            lVar.invoke(bVar);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void b(@NotNull h.a aVar) {
        tn.p.k(aVar, "result");
        this.f48271a = aVar;
        l<? super h.a, r> lVar = this.f48275e;
        if (lVar != null) {
            lVar.invoke(aVar);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a
    public void c(@NotNull File file, @NotNull h.d dVar) {
        tn.p.k(file, C3978d4.i.f31327b);
        tn.p.k(dVar, "progress");
        this.f48271a = new h.c(file, dVar);
        p<? super File, ? super h.d, r> pVar = this.f48274d;
        if (pVar != null) {
            pVar.mo2invoke(file, dVar);
        }
    }

    @NotNull
    public h d() {
        return this.f48271a;
    }

    @NotNull
    public final go.d<h> g() {
        return this.f48272b;
    }
}
