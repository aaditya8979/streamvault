package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S;
import com.vungle.ads.internal.protos.Sdk;
import fo.m;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: loaded from: classes12.dex */
public final class S {

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$collectLatestIsAttachedWindow$2", f = "ViewVisibilityTracker.kt", l = {46, 49}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<Boolean, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f47915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<Boolean> f47916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f47917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(m<? super Boolean> mVar, View view, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f47916c = mVar;
            this.f47917d = view;
        }

        public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
            return ((a) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            a aVar = new a(this.f47916c, this.f47917d, cVar);
            aVar.f47915b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super bn.r> cVar) {
            return a(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47914a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                if (this.f47915b) {
                    m<Boolean> mVar = this.f47916c;
                    View view = this.f47917d;
                    this.f47914a = 1;
                    if (S.k(mVar, view, this) == objG) {
                        return objG;
                    }
                } else {
                    m<Boolean> mVar2 = this.f47916c;
                    Boolean boolA = jn.a.a(false);
                    this.f47914a = 2;
                    if (mVar2.I(boolA, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$collectLatestIsEnoughAreaVisible$2", f = "ViewVisibilityTracker.kt", l = {69}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<Boolean, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f47919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<Boolean> f47920c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(m<? super Boolean> mVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f47920c = mVar;
        }

        public final Object a(boolean z10, hn.c<? super bn.r> cVar) {
            return ((b) create(Boolean.valueOf(z10), cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            b bVar = new b(this.f47920c, cVar);
            bVar.f47919b = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(Boolean bool, hn.c<? super bn.r> cVar) {
            return a(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47918a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                boolean z10 = this.f47919b;
                m<Boolean> mVar = this.f47920c;
                Boolean boolA = jn.a.a(z10);
                this.f47918a = 1;
                if (mVar.I(boolA, this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$collectLatestIsLifecycleResumed$2", f = "ViewVisibilityTracker.kt", l = {59, 62}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<Boolean, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m<Boolean> f47923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f47924d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(m<? super Boolean> mVar, View view, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f47923c = mVar;
            this.f47924d = view;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(Boolean bool, hn.c<? super bn.r> cVar) {
            return ((c) create(bool, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            c cVar2 = new c(this.f47923c, this.f47924d, cVar);
            cVar2.f47922b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47921a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                if (tn.p.f((Boolean) this.f47922b, jn.a.a(false))) {
                    m<Boolean> mVar = this.f47923c;
                    Boolean boolA = jn.a.a(false);
                    this.f47921a = 2;
                    if (mVar.I(boolA, this) == objG) {
                        return objG;
                    }
                } else {
                    m<Boolean> mVar2 = this.f47923c;
                    View view = this.f47924d;
                    this.f47921a = 1;
                    if (S.j(mVar2, view, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$isAttachedToWindowFlow$1", f = "ViewVisibilityTracker.kt", l = {75, 91}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<m<? super Boolean>, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f47927c;

        public static final class a implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m<Boolean> f47928b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(m<? super Boolean> mVar) {
                this.f47928b = mVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                tn.p.k(view, "p0");
                this.f47928b.i(Boolean.TRUE);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                tn.p.k(view, "p0");
                this.f47928b.i(Boolean.FALSE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f47927c = view;
        }

        public static final bn.r a(View view, a aVar) {
            view.removeOnAttachStateChangeListener(aVar);
            return bn.r.f5635a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(m<? super Boolean> mVar, hn.c<? super bn.r> cVar) {
            return ((d) create(mVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            d dVar = new d(this.f47927c, cVar);
            dVar.f47926b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            m mVar;
            Object objG = in.a.g();
            int i10 = this.f47925a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                mVar = (m) this.f47926b;
                Boolean boolA = jn.a.a(this.f47927c.isAttachedToWindow());
                this.f47926b = mVar;
                this.f47925a = 1;
                if (mVar.I(boolA, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return bn.r.f5635a;
                }
                mVar = (m) this.f47926b;
                kotlin.c.b(obj);
            }
            final a aVar = new a(mVar);
            this.f47927c.addOnAttachStateChangeListener(aVar);
            final View view = this.f47927c;
            sn.a aVar2 = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d0
                @Override // sn.a
                public final Object invoke() {
                    return S.d.a(view, aVar);
                }
            };
            this.f47926b = null;
            this.f47925a = 2;
            if (ProduceKt.b(mVar, aVar2, this) == objG) {
                return objG;
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$isEnoughAreaVisibleFlow$1", f = "ViewVisibilityTracker.kt", l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 134}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements sn.p<go.e<? super Boolean>, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f47931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f47932d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view, hn.c<? super e> cVar) {
            super(2, cVar);
            this.f47932d = view;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(go.e<? super Boolean> eVar, hn.c<? super bn.r> cVar) {
            return ((e) create(eVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            e eVar = new e(this.f47932d, cVar);
            eVar.f47931c = obj;
            return eVar;
        }

        /* JADX WARN: Path cross not found for [B:14:0x0046, B:17:0x0050], limit reached: 24 */
        /* JADX WARN: Path cross not found for [B:17:0x0050, B:14:0x0046], limit reached: 24 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006e -> B:12:0x003e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r8.f47930b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L30
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.f47929a
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                java.lang.Object r5 = r8.f47931c
                go.e r5 = (go.e) r5
                kotlin.c.b(r9)
                goto L3d
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f47929a
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                java.lang.Object r5 = r8.f47931c
                go.e r5 = (go.e) r5
                kotlin.c.b(r9)
                r9 = r8
                goto L62
            L30:
                kotlin.c.b(r9)
                java.lang.Object r9 = r8.f47931c
                r5 = r9
                go.e r5 = (go.e) r5
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r4, r4, r4, r4)
            L3d:
                r9 = r8
            L3e:
                android.view.View r6 = r9.f47932d
                boolean r6 = r6.isShown()
                if (r6 == 0) goto L50
                android.view.View r6 = r9.f47932d
                boolean r6 = r6.getGlobalVisibleRect(r1)
                if (r6 == 0) goto L50
                r6 = r3
                goto L51
            L50:
                r6 = r4
            L51:
                java.lang.Boolean r6 = jn.a.a(r6)
                r9.f47931c = r5
                r9.f47929a = r1
                r9.f47930b = r3
                java.lang.Object r6 = r5.emit(r6, r9)
                if (r6 != r0) goto L62
                return r0
            L62:
                r9.f47931c = r5
                r9.f47929a = r1
                r9.f47930b = r2
                r6 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r6 = p000do.s0.a(r6, r9)
                if (r6 != r0) goto L3e
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$isLifecycleResumedFlow$1", f = "ViewVisibilityTracker.kt", l = {118}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<m<? super Boolean>, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f47935c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f47936a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f47936a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Lifecycle lifecycle, hn.c<? super f> cVar) {
            super(2, cVar);
            this.f47935c = lifecycle;
        }

        public static final bn.r a(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            lifecycle.removeObserver(lifecycleEventObserver);
            return bn.r.f5635a;
        }

        public static final void a(m mVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            int i10 = a.f47936a[event.ordinal()];
            if (i10 == 1) {
                kotlinx.coroutines.channels.a.b(mVar.i(Boolean.FALSE));
            } else if (i10 != 2) {
                bn.r rVar = bn.r.f5635a;
            } else {
                kotlinx.coroutines.channels.a.b(mVar.i(Boolean.TRUE));
            }
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(m<? super Boolean> mVar, hn.c<? super bn.r> cVar) {
            return ((f) create(mVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            f fVar = new f(this.f47935c, cVar);
            fVar.f47934b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47933a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                final m mVar = (m) this.f47934b;
                final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        S.f.a(mVar, lifecycleOwner, event);
                    }
                };
                this.f47935c.addObserver(lifecycleEventObserver);
                final Lifecycle lifecycle = this.f47935c;
                sn.a aVar = new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f0
                    @Override // sn.a
                    public final Object invoke() {
                        return S.f.a(lifecycle, lifecycleEventObserver);
                    }
                };
                this.f47933a = 1;
                if (ProduceKt.b(mVar, aVar, this) == objG) {
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

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$isLifecycleResumedFlow$lifecycle$1", f = "ViewVisibilityTracker.kt", l = {102}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements sn.p<go.e<? super Boolean>, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47938b;

        public g(hn.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(go.e<? super Boolean> eVar, hn.c<? super bn.r> cVar) {
            return ((g) create(eVar, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            g gVar = new g(cVar);
            gVar.f47938b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47937a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.e eVar = (go.e) this.f47938b;
                this.f47937a = 1;
                if (eVar.emit(null, this) == objG) {
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

    public static final go.d<Boolean> a(View view) {
        return f(go.f.f(new d(view, null)));
    }

    public static final go.d<Boolean> b(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        return (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? go.f.z(new g(null)) : f(go.f.f(new f(lifecycle, null)));
    }

    public static final go.d<Boolean> e(View view) {
        return f(go.f.z(new e(view, null)));
    }

    public static final <T> go.d<T> f(go.d<? extends T> dVar) {
        return go.f.C(go.f.p(go.f.n(dVar)), com.moloco.sdk.internal.scheduling.c.a().getMain());
    }

    public static final Object i(m<? super Boolean> mVar, View view, hn.c<? super bn.r> cVar) {
        Object objL = go.f.l(a(view), new a(mVar, view, null), cVar);
        return objL == in.a.g() ? objL : bn.r.f5635a;
    }

    public static final Object j(m<? super Boolean> mVar, View view, hn.c<? super bn.r> cVar) {
        Object objL = go.f.l(e(view), new b(mVar, null), cVar);
        return objL == in.a.g() ? objL : bn.r.f5635a;
    }

    public static final Object k(m<? super Boolean> mVar, View view, hn.c<? super bn.r> cVar) {
        Object objL = go.f.l(b(ViewTreeLifecycleOwner.get(view)), new c(mVar, view, null), cVar);
        return objL == in.a.g() ? objL : bn.r.f5635a;
    }
}
