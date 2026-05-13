package io.bidmachine.rendering.internal.animation;

import android.view.View;
import android.view.ViewGroup;
import bn.r;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.util.ViewUtilsKt;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements io.bidmachine.rendering.internal.animation.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f70114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.h f70115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f70116c;

    public static final class a extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.c f70119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f70120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f70121e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hn.c cVar, io.bidmachine.rendering.internal.c cVar2, i iVar, boolean z10) {
            super(2, cVar);
            this.f70119c = cVar2;
            this.f70120d = iVar;
            this.f70121e = z10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            a aVar = new a(cVar, this.f70119c, this.f70120d, this.f70121e);
            aVar.f70118b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70117a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            View viewK = this.f70119c.k();
            if (viewK != null) {
                this.f70120d.a(viewK, io.bidmachine.rendering.internal.animation.d.a(this.f70119c.h(), this.f70121e));
            }
            return r.f5635a;
        }
    }

    public static final class b extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.d f70124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f70125d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hn.c cVar, io.bidmachine.rendering.internal.d dVar, i iVar) {
            super(2, cVar);
            this.f70124c = dVar;
            this.f70125d = iVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            b bVar = new b(cVar, this.f70124c, this.f70125d);
            bVar.f70123b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70122a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ViewGroup viewGroupC = this.f70124c.c();
            if (viewGroupC != null) {
                this.f70125d.a(viewGroupC, io.bidmachine.rendering.internal.animation.d.a(this.f70124c.b()));
            }
            return r.f5635a;
        }
    }

    public static final class c extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f70128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f70129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.animation.a f70130e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(hn.c cVar, i iVar, View view, io.bidmachine.rendering.internal.animation.a aVar) {
            super(2, cVar);
            this.f70128c = iVar;
            this.f70129d = view;
            this.f70130e = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            c cVar2 = new c(cVar, this.f70128c, this.f70129d, this.f70130e);
            cVar2.f70127b = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70126a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f70128c.f70116c.put(jn.a.d(this.f70129d.getId()), this.f70130e);
            return r.f5635a;
        }
    }

    public static final class d extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.c f70133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f70134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f70135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Runnable f70136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Runnable f70137g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(hn.c cVar, io.bidmachine.rendering.internal.c cVar2, i iVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2) {
            super(2, cVar);
            this.f70133c = cVar2;
            this.f70134d = iVar;
            this.f70135e = animationEventType;
            this.f70136f = runnable;
            this.f70137g = runnable2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            d dVar = new d(cVar, this.f70133c, this.f70134d, this.f70135e, this.f70136f, this.f70137g);
            dVar.f70132b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70131a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            View viewK = this.f70133c.k();
            if (viewK != null) {
                this.f70134d.a(viewK, this.f70135e, this.f70133c.j(), this.f70136f, this.f70137g);
            }
            return r.f5635a;
        }
    }

    public static final class e extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.d f70140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f70141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f70142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Runnable f70143f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Runnable f70144g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(hn.c cVar, io.bidmachine.rendering.internal.d dVar, i iVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2) {
            super(2, cVar);
            this.f70140c = dVar;
            this.f70141d = iVar;
            this.f70142e = animationEventType;
            this.f70143f = runnable;
            this.f70144g = runnable2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            e eVar = new e(cVar, this.f70140c, this.f70141d, this.f70142e, this.f70143f, this.f70144g);
            eVar.f70139b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70138a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ViewGroup viewGroupC = this.f70140c.c();
            if (viewGroupC != null) {
                this.f70141d.a(viewGroupC, this.f70142e, true, this.f70143f, this.f70144g);
            }
            return r.f5635a;
        }
    }

    public static final class f extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f70147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f70148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Runnable f70149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Runnable f70150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f70151g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f70152h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(hn.c cVar, i iVar, View view, Runnable runnable, Runnable runnable2, boolean z10, AnimationEventType animationEventType) {
            super(2, cVar);
            this.f70147c = iVar;
            this.f70148d = view;
            this.f70149e = runnable;
            this.f70150f = runnable2;
            this.f70151g = z10;
            this.f70152h = animationEventType;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            f fVar = new f(cVar, this.f70147c, this.f70148d, this.f70149e, this.f70150f, this.f70151g, this.f70152h);
            fVar.f70146b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            io.bidmachine.rendering.internal.animation.a aVar;
            Object objG = in.a.g();
            int i10 = this.f70145a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                io.bidmachine.rendering.internal.animation.a aVar2 = (io.bidmachine.rendering.internal.animation.a) this.f70147c.f70116c.get(jn.a.d(this.f70148d.getId()));
                if (aVar2 == null) {
                    Runnable runnable = this.f70149e;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = this.f70150f;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    return r.f5635a;
                }
                if (this.f70151g) {
                    View view = this.f70148d;
                    this.f70146b = aVar2;
                    this.f70145a = 1;
                    if (ViewUtilsKt.awaitLayout(view, this) == objG) {
                        return objG;
                    }
                }
                aVar = aVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (io.bidmachine.rendering.internal.animation.a) this.f70146b;
                kotlin.c.b(obj);
            }
            aVar.a(this.f70148d, this.f70152h);
            aVar.a(this.f70148d, this.f70152h, this.f70149e, this.f70150f);
            return r.f5635a;
        }
    }

    public static final class g extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.c f70155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f70156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f70157e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(hn.c cVar, io.bidmachine.rendering.internal.c cVar2, i iVar, AnimationEventType animationEventType) {
            super(2, cVar);
            this.f70155c = cVar2;
            this.f70156d = iVar;
            this.f70157e = animationEventType;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            g gVar = new g(cVar, this.f70155c, this.f70156d, this.f70157e);
            gVar.f70154b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70153a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            View viewK = this.f70155c.k();
            if (viewK != null) {
                this.f70156d.a(viewK, this.f70157e, this.f70155c.j());
            }
            return r.f5635a;
        }
    }

    public static final class h extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.d f70160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f70161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f70162e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(hn.c cVar, io.bidmachine.rendering.internal.d dVar, i iVar, AnimationEventType animationEventType) {
            super(2, cVar);
            this.f70160c = dVar;
            this.f70161d = iVar;
            this.f70162e = animationEventType;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((h) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            h hVar = new h(cVar, this.f70160c, this.f70161d, this.f70162e);
            hVar.f70159b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70158a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ViewGroup viewGroupC = this.f70160c.c();
            if (viewGroupC != null) {
                this.f70161d.a(viewGroupC, this.f70162e, true);
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.animation.i$i, reason: collision with other inner class name */
    public static final class C0824i extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f70165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f70166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f70167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AnimationEventType f70168f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0824i(hn.c cVar, i iVar, View view, boolean z10, AnimationEventType animationEventType) {
            super(2, cVar);
            this.f70165c = iVar;
            this.f70166d = view;
            this.f70167e = z10;
            this.f70168f = animationEventType;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((C0824i) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            C0824i c0824i = new C0824i(cVar, this.f70165c, this.f70166d, this.f70167e, this.f70168f);
            c0824i.f70164b = obj;
            return c0824i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            io.bidmachine.rendering.internal.animation.a aVar;
            Object objG = in.a.g();
            int i10 = this.f70163a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                io.bidmachine.rendering.internal.animation.a aVar2 = (io.bidmachine.rendering.internal.animation.a) this.f70165c.f70116c.get(jn.a.d(this.f70166d.getId()));
                if (aVar2 != null) {
                    if (this.f70167e) {
                        View view = this.f70166d;
                        this.f70164b = aVar2;
                        this.f70163a = 1;
                        if (ViewUtilsKt.awaitLayout(view, this) == objG) {
                            return objG;
                        }
                    }
                    aVar = aVar2;
                }
                return r.f5635a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (io.bidmachine.rendering.internal.animation.a) this.f70164b;
            kotlin.c.b(obj);
            aVar.a(this.f70166d, this.f70168f);
            return r.f5635a;
        }
    }

    public static final class j extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.c f70171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f70172d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(hn.c cVar, io.bidmachine.rendering.internal.c cVar2, i iVar) {
            super(2, cVar);
            this.f70171c = cVar2;
            this.f70172d = iVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((j) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            j jVar = new j(cVar, this.f70171c, this.f70172d);
            jVar.f70170b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70169a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            View viewK = this.f70171c.k();
            if (viewK != null) {
                this.f70172d.a(viewK);
            }
            return r.f5635a;
        }
    }

    public static final class k extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.bidmachine.rendering.internal.d f70175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f70176d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(hn.c cVar, io.bidmachine.rendering.internal.d dVar, i iVar) {
            super(2, cVar);
            this.f70175c = dVar;
            this.f70176d = iVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((k) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            k kVar = new k(cVar, this.f70175c, this.f70176d);
            kVar.f70174b = obj;
            return kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70173a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            ViewGroup viewGroupC = this.f70175c.c();
            if (viewGroupC != null) {
                this.f70176d.a(viewGroupC);
            }
            return r.f5635a;
        }
    }

    public static final class l extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f70179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f70180d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(hn.c cVar, i iVar, View view) {
            super(2, cVar);
            this.f70179c = iVar;
            this.f70180d = view;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((l) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            l lVar = new l(cVar, this.f70179c, this.f70180d);
            lVar.f70178b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70177a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            io.bidmachine.rendering.internal.animation.a aVar = (io.bidmachine.rendering.internal.animation.a) this.f70179c.f70116c.remove(jn.a.d(this.f70180d.getId()));
            if (aVar != null) {
                aVar.a();
            }
            return r.f5635a;
        }
    }

    public static final class m extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f70182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f70183c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(hn.c cVar, i iVar) {
            super(2, cVar);
            this.f70183c = iVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((m) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            m mVar = new m(cVar, this.f70183c);
            mVar.f70182b = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70181a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            Iterator it = this.f70183c.f70116c.entrySet().iterator();
            while (it.hasNext()) {
                ((io.bidmachine.rendering.internal.animation.a) ((Map.Entry) it.next()).getValue()).a();
            }
            this.f70183c.f70116c.clear();
            return r.f5635a;
        }
    }

    public i(l0 l0Var, io.bidmachine.rendering.internal.h hVar) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(hVar, "coroutineDispatchers");
        this.f70114a = l0Var;
        this.f70115b = hVar;
        this.f70116c = new ConcurrentHashMap();
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a() {
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new m(null, this), 2, null);
    }

    public void a(View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new l(null, this, view), 2, null);
    }

    public void a(View view, io.bidmachine.rendering.internal.animation.a aVar) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(aVar, "animation");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new c(null, this, view, aVar), 2, null);
    }

    public void a(View view, AnimationEventType animationEventType, boolean z10) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(animationEventType, "eventType");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new C0824i(null, this, view, z10, animationEventType), 2, null);
    }

    public void a(View view, AnimationEventType animationEventType, boolean z10, Runnable runnable, Runnable runnable2) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(animationEventType, "eventType");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new f(null, this, view, runnable, runnable2, z10, animationEventType), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c cVar) {
        tn.p.k(cVar, "adElement");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new j(null, cVar, this), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType) {
        tn.p.k(cVar, "adElement");
        tn.p.k(animationEventType, "eventType");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new g(null, cVar, this, animationEventType), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2) {
        tn.p.k(cVar, "adElement");
        tn.p.k(animationEventType, "eventType");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new d(null, cVar, this, animationEventType, runnable, runnable2), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c cVar, boolean z10) {
        tn.p.k(cVar, "adElement");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new a(null, cVar, this, z10), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.d dVar) {
        tn.p.k(dVar, "adPhase");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new k(null, dVar, this), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.d dVar, AnimationEventType animationEventType) {
        tn.p.k(dVar, "adPhase");
        tn.p.k(animationEventType, "eventType");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new h(null, dVar, this, animationEventType), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.d dVar, AnimationEventType animationEventType, Runnable runnable, Runnable runnable2) {
        tn.p.k(dVar, "adPhase");
        tn.p.k(animationEventType, "eventType");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new e(null, dVar, this, animationEventType, runnable, runnable2), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public boolean a(int i10) {
        io.bidmachine.rendering.internal.animation.a aVar = (io.bidmachine.rendering.internal.animation.a) this.f70116c.get(Integer.valueOf(i10));
        return aVar != null && aVar.b();
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void b(io.bidmachine.rendering.internal.d dVar) {
        tn.p.k(dVar, "adPhase");
        p000do.i.d(this.f70114a, this.f70115b.d(), null, new b(null, dVar, this), 2, null);
    }
}
