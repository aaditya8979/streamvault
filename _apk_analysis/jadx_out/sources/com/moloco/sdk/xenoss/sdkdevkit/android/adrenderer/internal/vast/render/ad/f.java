package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import cn.f0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.vungle.ads.internal.protos.Sdk;
import go.l;
import go.u;
import go.v;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;
import sn.q;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<k> f50004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h f50005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l0 f50006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final l<k> f50007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final u<i.a> f50008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f50009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final go.d<Boolean> f50010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final u<Boolean> f50011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c f50012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final go.k<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> f50013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final go.d<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> f50014l;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$1", f = "AdPlaylistControllerImpl.kt", l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50015a;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$a$a, reason: collision with other inner class name */
        public static final class C0659a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<d.a> f50017b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f50018c;

            public C0659a(Ref$ObjectRef<d.a> ref$ObjectRef, f fVar) {
                this.f50017b = ref$ObjectRef;
                this.f50018c = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // go.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(d.a aVar, hn.c<? super r> cVar) {
                if ((this.f50017b.element instanceof d.a.b) && (aVar instanceof d.a.C0683a)) {
                    this.f50018c.J(b.j.f49999a);
                }
                this.f50017b.element = aVar;
                return r.f5635a;
            }
        }

        public a(hn.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return f.this.new a(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50015a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                u<d.a> uVarL = f.this.l();
                C0659a c0659a = new C0659a(ref$ObjectRef, f.this);
                this.f50015a = 1;
                if (uVarL.collect(c0659a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$2", f = "AdPlaylistControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50020b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f50022d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f50022d = kVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar, hn.c<? super r> cVar) {
            return ((b) create(bVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            b bVar = f.this.new b(this.f50022d, cVar);
            bVar.f50020b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50019a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b) this.f50020b;
            if (bVar instanceof b.d) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.f50005c;
                if (hVar != null) {
                    hVar.b(x.f49970j);
                }
                f.this.J(new b.f(((b.d) bVar).a()));
            } else if (bVar instanceof b.a) {
                f.this.J(b.a.f49990a);
            } else if (bVar instanceof b.c) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar2 = f.this.f50005c;
                if (hVar2 != null) {
                    jn.a.a(hVar2.c());
                }
                f.this.J(b.C0658b.f49991a);
            } else {
                if (!(bVar instanceof b.C0666b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((k.a) this.f50022d).a().destroy();
                r rVar = r.f5635a;
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$3", f = "AdPlaylistControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50024b;

        public c(hn.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar, hn.c<? super r> cVar) {
            return ((c) create(dVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = f.this.new c(cVar);
            cVar2.f50024b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50023a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) this.f50024b;
            if (dVar instanceof d.C0684d) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.f50005c;
                if (hVar != null) {
                    hVar.b(x.f49967g);
                }
                f.this.J(new b.f(((d.C0684d) dVar).a()));
            } else if (tn.p.f(dVar, d.a.f50585a)) {
                f.this.J(b.a.f49990a);
            } else if (tn.p.f(dVar, d.e.f50589a)) {
                f.this.J(b.i.f49998a);
                f.this.H();
                r rVar = r.f5635a;
            } else if (tn.p.f(dVar, d.b.f50586a)) {
                f.this.J(b.c.f49992a);
                jn.a.a(f.this.E());
            } else {
                if (!tn.p.f(dVar, d.c.f50587a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar2 = f.this.f50005c;
                if (hVar2 != null) {
                    jn.a.a(hVar2.c());
                }
                f.this.J(b.g.f49996a);
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$4", f = "AdPlaylistControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50027b;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50029a;

            static {
                int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.values().length];
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.f50488b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.f50487a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f50029a = iArr;
            }
        }

        public d(hn.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b bVar, hn.c<? super r> cVar) {
            return ((d) create(bVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            d dVar = f.this.new d(cVar);
            dVar.f50027b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50026a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            int i10 = a.f50029a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) this.f50027b).ordinal()];
            if (i10 == 1) {
                f.this.J(b.a.f49990a);
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.f50005c;
                if (hVar != null) {
                    jn.a.a(hVar.c());
                }
                f.this.J(b.d.f49993a);
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$5", f = "AdPlaylistControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50031b;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50033a;

            static {
                int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l.values().length];
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l.f48411a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l.f48412b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f50033a = iArr;
            }
        }

        public e(hn.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l lVar, hn.c<? super r> cVar) {
            return ((e) create(lVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            e eVar = f.this.new e(cVar);
            eVar.f50031b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50030a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            int i10 = a.f50033a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l) this.f50031b).ordinal()];
            if (i10 == 1) {
                f.this.J(b.i.f49998a);
                f.this.H();
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f.this.J(b.a.f49990a);
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$f, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$canReplay$1", f = "AdPlaylistControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class C0660f extends SuspendLambda implements q<k, Boolean, hn.c<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50036c;

        public C0660f(hn.c<? super C0660f> cVar) {
            super(3, cVar);
        }

        @Override // sn.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, Boolean bool, hn.c<? super Boolean> cVar) {
            C0660f c0660f = f.this.new C0660f(cVar);
            c0660f.f50035b = kVar;
            c0660f.f50036c = bool;
            return c0660f.invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50034a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            k kVar = (k) this.f50035b;
            return jn.a.a((kVar == null || !tn.p.f(kVar, f0.F0(f.this.f50004b)) || tn.p.f((Boolean) this.f50036c, jn.a.a(true))) ? false : true);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$onEvent$1", f = "AdPlaylistControllerImpl.kt", l = {261}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b f50039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f50040c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, f fVar, hn.c<? super g> cVar) {
            super(2, cVar);
            this.f50039b = bVar;
            this.f50040c = fVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return new g(this.f50039b, this.f50040c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f50038a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdController", "Emitting event: " + this.f50039b, null, false, 12, null);
                go.k kVar = this.f50040c.f50013k;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar = this.f50039b;
                this.f50038a = 1;
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

    public static final class h implements go.d<i.a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go.d f50041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f50042c;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ go.e f50043b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f50044c;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$special$$inlined$map$1$2", f = "AdPlaylistControllerImpl.kt", l = {50}, m = "emit")
            public static final class C0661a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f50045a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f50046b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f50047c;

                public C0661a(hn.c cVar) {
                    super(cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f50045a = obj;
                    this.f50046b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(go.e eVar, f fVar) {
                this.f50043b = eVar;
                this.f50044c = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // go.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, hn.c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.h.a.C0661a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.h.a.C0661a) r0
                    int r1 = r0.f50046b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f50046b = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f50045a
                    java.lang.Object r1 = in.a.g()
                    int r2 = r0.f50046b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.c.b(r7)
                    goto L92
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.c.b(r7)
                    go.e r7 = r5.f50043b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f r2 = r5.f50044c
                    java.util.List r2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.M(r2)
                    java.lang.Object r2 = cn.f0.G0(r2)
                    boolean r2 = tn.p.f(r2, r6)
                    boolean r4 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.a
                    if (r4 == 0) goto L56
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$a r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.a) r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a r6 = r6.a()
                    r4.<init>(r6, r2)
                    goto L89
                L56:
                    boolean r4 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.c
                    if (r4 == 0) goto L66
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$c r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$c
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$c r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.c) r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c r6 = r6.a()
                    r4.<init>(r6, r2)
                    goto L89
                L66:
                    boolean r4 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.b
                    if (r4 == 0) goto L76
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$b r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$b r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.b) r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a r6 = r6.a()
                    r4.<init>(r6, r2)
                    goto L89
                L76:
                    boolean r4 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.d
                    if (r4 == 0) goto L86
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$d r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$d
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$d r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.d) r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0 r6 = r6.a()
                    r4.<init>(r6, r2)
                    goto L89
                L86:
                    if (r6 != 0) goto L95
                    r4 = 0
                L89:
                    r0.f50046b = r3
                    java.lang.Object r6 = r7.emit(r4, r0)
                    if (r6 != r1) goto L92
                    return r1
                L92:
                    bn.r r6 = bn.r.f5635a
                    return r6
                L95:
                    kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.h.a.emit(java.lang.Object, hn.c):java.lang.Object");
            }
        }

        public h(go.d dVar, f fVar) {
            this.f50041b = dVar;
            this.f50042c = fVar;
        }

        @Override // go.d
        public Object collect(go.e<? super i.a> eVar, hn.c cVar) {
            Object objCollect = this.f50041b.collect(new a(eVar, this.f50042c), cVar);
            return objCollect == in.a.g() ? objCollect : r.f5635a;
        }
    }

    public static final class i implements go.d<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go.d f50049b;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ go.e f50050b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$i$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$special$$inlined$map$2$2", f = "AdPlaylistControllerImpl.kt", l = {50}, m = "emit")
            public static final class C0662a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f50051a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f50052b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f50053c;

                public C0662a(hn.c cVar) {
                    super(cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f50051a = obj;
                    this.f50052b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(go.e eVar) {
                this.f50050b = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // go.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, hn.c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.i.a.C0662a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$i$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.i.a.C0662a) r0
                    int r1 = r0.f50052b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f50052b = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$i$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f50051a
                    java.lang.Object r1 = in.a.g()
                    int r2 = r0.f50052b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.c.b(r6)
                    goto L70
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.c.b(r6)
                    go.e r6 = r4.f50050b
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) r5
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.a
                    if (r2 == 0) goto L47
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$a r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.a) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a r5 = r5.a()
                    boolean r5 = r5.J()
                    goto L63
                L47:
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.c
                    if (r2 == 0) goto L56
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$c r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.c) r5
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c r5 = r5.a()
                    boolean r5 = r5.J()
                    goto L63
                L56:
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.b
                    if (r2 == 0) goto L5b
                    goto L62
                L5b:
                    boolean r2 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k.d
                    if (r2 == 0) goto L60
                    goto L62
                L60:
                    if (r5 != 0) goto L73
                L62:
                    r5 = 0
                L63:
                    java.lang.Boolean r5 = jn.a.a(r5)
                    r0.f50052b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L70
                    return r1
                L70:
                    bn.r r5 = bn.r.f5635a
                    return r5
                L73:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f.i.a.emit(java.lang.Object, hn.c):java.lang.Object");
            }
        }

        public i(go.d dVar) {
            this.f50049b = dVar;
        }

        @Override // go.d
        public Object collect(go.e<? super Boolean> eVar, hn.c cVar) {
            Object objCollect = this.f50049b.collect(new a(eVar), cVar);
            return objCollect == in.a.g() ? objCollect : r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull List<? extends k> list, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar) {
        go.d dVarG;
        tn.p.k(list, "playlist");
        this.f50004b = list;
        this.f50005c = hVar;
        l0 l0VarA = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f50006d = l0VarA;
        l<k> lVarA = v.a(null);
        this.f50007e = lVarA;
        h hVar2 = new h(lVarA, this);
        a.C0862a c0862a = kotlinx.coroutines.flow.a.f73397a;
        this.f50008f = go.f.M(hVar2, l0VarA, a.C0862a.b(c0862a, 0L, 0L, 3, null), null);
        i iVar = new i(lVarA);
        kotlinx.coroutines.flow.a aVarB = a.C0862a.b(c0862a, 0L, 0L, 3, null);
        Boolean bool = Boolean.FALSE;
        this.f50009g = go.f.M(iVar, l0VarA, aVarB, bool);
        go.d<Boolean> dVarJ = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.j(lVarA, l0VarA);
        this.f50010h = dVarJ;
        this.f50011i = go.f.M(go.f.m(lVarA, dVarJ, new C0660f(null)), l0VarA, a.C0862a.b(c0862a, 0L, 0L, 3, null), bool);
        this.f50012j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e.a(lVarA, l0VarA);
        p000do.i.d(l0VarA, null, null, new a(null), 3, null);
        go.k<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> kVarB = go.q.b(0, 0, null, 7, null);
        this.f50013k = kVarB;
        this.f50014l = kVarB;
        for (k kVar : list) {
            if (kVar instanceof k.a) {
                dVarG = go.f.G(((k.a) kVar).a().a(), new b(kVar, null));
            } else if (kVar instanceof k.c) {
                dVarG = go.f.G(((k.c) kVar).a().a(), new c(null));
            } else if (kVar instanceof k.b) {
                dVarG = go.f.G(((k.b) kVar).a().a(), new d(null));
            } else {
                if (!(kVar instanceof k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVarG = go.f.G(((k.d) kVar).a().a(), new e(null));
            }
            go.f.D(dVarG, this.f50006d);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void A() {
        k value = this.f50007e.getValue();
        if (value instanceof k.a) {
            ((k.a) value).a().j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.a());
            return;
        }
        if (value instanceof k.c) {
            ((k.c) value).a().j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.a());
            return;
        }
        if (value instanceof k.b) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA DEC playlist item reached", null, false, 12, null);
        } else if (value instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA Mraid playlist item reached", null, false, 12, null);
        } else {
            if (value != null) {
                throw new NoWhenBranchMatchedException();
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty CTA playlist item reached", null, false, 12, null);
        }
    }

    public final void C() {
        k kVar = (k) f0.v0(this.f50004b);
        if (kVar == null) {
            return;
        }
        L(kVar);
    }

    public final boolean E() {
        List<k> list = this.f50004b;
        k kVar = (k) f0.w0(list, f0.y0(list, this.f50007e.getValue()) + 1);
        if (kVar == null) {
            return false;
        }
        L(kVar);
        return true;
    }

    public final void H() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a aVarG = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.g(this.f50004b, this.f50007e.getValue());
        if (aVarG != null) {
            aVarG.t();
        }
        if (E()) {
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = this.f50005c;
        if (hVar != null) {
            hVar.a();
        }
        J(b.e.f49994a);
    }

    public final kotlinx.coroutines.g J(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
        return p000do.i.d(this.f50006d, null, null, new g(bVar, this, null), 3, null);
    }

    public final void L(k kVar) {
        this.f50007e.setValue(kVar);
        if (kVar instanceof k.c) {
            ((k.c) kVar).a().r();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a
    @NotNull
    public go.d<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> a() {
        return this.f50014l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a
    public void d() {
        C();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        kotlinx.coroutines.d.e(this.f50006d, null, 1, null);
        for (k kVar : this.f50004b) {
            if (kVar instanceof k.a) {
                ((k.a) kVar).a().destroy();
            } else if (kVar instanceof k.c) {
                ((k.c) kVar).a().destroy();
            } else if (kVar instanceof k.b) {
                ((k.b) kVar).a().destroy();
            } else {
                if (!(kVar instanceof k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((k.d) kVar).a().destroy();
            }
        }
        L(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    @NotNull
    public u<i.a> k() {
        return this.f50008f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public u<d.a> l() {
        return this.f50012j.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void l(@NotNull a.AbstractC0696a.c cVar) {
        tn.p.k(cVar, "button");
        a.AbstractC0696a.c cVarI = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.i(this.f50004b, this.f50007e.getValue(), cVar);
        k value = this.f50007e.getValue();
        if (value instanceof k.c) {
            ((k.c) value).a().l(cVarI);
            return;
        }
        if (value instanceof k.a) {
            ((k.a) value).a().l(cVarI);
            return;
        }
        if (value instanceof k.b) {
            ((k.b) value).a().l(cVarI);
            return;
        }
        if (value instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty onButtonRendered MRAID playlist item reached", null, false, 12, null);
            return;
        }
        if (value != null) {
            throw new NoWhenBranchMatchedException();
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Displaying " + cVarI.c() + " at position: " + cVarI.d() + " of size: " + cVarI.e() + " in unknown playlist item type", null, false, 12, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    @NotNull
    public u<Boolean> n() {
        return this.f50009g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r
    public void o(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        tn.p.k(enumC0698a, "buttonType");
        a.AbstractC0696a.c.EnumC0698a enumC0698aH = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.h(this.f50004b, this.f50007e.getValue(), enumC0698a);
        k value = this.f50007e.getValue();
        if (value instanceof k.c) {
            ((k.c) value).a().o(enumC0698aH);
            return;
        }
        if (value instanceof k.a) {
            ((k.a) value).a().o(enumC0698aH);
            return;
        }
        if (value instanceof k.b) {
            ((k.b) value).a().o(enumC0698aH);
            return;
        }
        if (value instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Empty onButtonUnRendered MRAID playlist item reached", null, false, 12, null);
            return;
        }
        if (value != null) {
            throw new NoWhenBranchMatchedException();
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdController", "Unrendering " + enumC0698aH + " in unknown playlist item type", null, false, 12, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void x() {
        if (l().getValue() instanceof d.a.C0683a) {
            k value = this.f50007e.getValue();
            k.c cVar = value instanceof k.c ? (k.c) value : null;
            if (cVar != null) {
                cVar.a().h();
            } else {
                H();
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void z() {
        C();
        J(b.h.f49997a);
    }
}
