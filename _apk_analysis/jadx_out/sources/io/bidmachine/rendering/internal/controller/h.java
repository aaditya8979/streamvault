package io.bidmachine.rendering.internal.controller;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import bo.a0;
import bo.d0;
import com.ironsource.C4157n2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.internal.animation.b;
import io.bidmachine.rendering.internal.v;
import io.bidmachine.rendering.internal.w;
import io.bidmachine.rendering.internal.x;
import io.bidmachine.rendering.internal.y;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.BrokenCreativeDetectorParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MethodParams;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.NetworkRequest;
import io.bidmachine.rendering.utils.Tag;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.rendering.utils.VisibilityChanger;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements io.bidmachine.rendering.internal.controller.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f70224s = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tag f70225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.state.c f70226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.controller.f f70227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.animation.b f70228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f70229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.repository.a f70230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.d f70231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.bidmachine.rendering.internal.controller.g f70232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.event.f f70233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.detector.brokencreative.b f70234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final bn.g f70235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final bn.g f70236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TaskManager f70237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f70238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f70239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f70240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f70241q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final bn.g f70242r;

    public final class a extends b {
        public a() {
            super();
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar) {
            tn.p.k(aVar, "adForm");
            super.b(aVar);
            if (h.a(h.this, aVar, false, 2, (Object) null)) {
                if (!h.this.f70238n.isEmpty()) {
                    return;
                }
                h.this.r();
            } else {
                c(aVar, new Error("Failed to setup ad element (" + aVar + ')'));
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            tn.p.k(aVar, "adForm");
            tn.p.k(error, "error");
            super.b(aVar, error);
            h.this.a(error);
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void c(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            tn.p.k(aVar, "adForm");
            tn.p.k(error, "error");
            super.c(aVar, error);
            h.this.a(error);
        }
    }

    public abstract class b implements io.bidmachine.rendering.internal.adform.c {
        public b() {
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void a(io.bidmachine.rendering.internal.adform.a aVar) {
            tn.p.k(aVar, "adForm");
            io.bidmachine.rendering.internal.o.b(h.this.f70225a, "AdsElement (" + aVar + ") - onAdFormShown", new Object[0]);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void a(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            tn.p.k(aVar, "adForm");
            tn.p.k(error, "error");
            io.bidmachine.rendering.internal.o.a(h.this.f70225a, "AdsElement (" + aVar + ") - onAdFormFailToShow - " + error, new Object[0]);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar) {
            tn.p.k(aVar, "adForm");
            io.bidmachine.rendering.internal.o.b(h.this.f70225a, "AdsElement (" + aVar + ") - onAdFormLoaded", new Object[0]);
            h.this.f70238n.remove(aVar);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            tn.p.k(aVar, "adForm");
            tn.p.k(error, "error");
            io.bidmachine.rendering.internal.o.a(h.this.f70225a, "AdsElement (" + aVar + ") - onAdFormExpired - " + error, new Object[0]);
        }

        @Override // io.bidmachine.rendering.internal.adform.c
        public void c(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            tn.p.k(aVar, "adForm");
            tn.p.k(error, "error");
            io.bidmachine.rendering.internal.o.a(h.this.f70225a, "AdsElement (" + aVar + ") - onAdFormFailToLoad - " + error, new Object[0]);
            h.this.f70238n.remove(aVar);
        }
    }

    public final class c implements io.bidmachine.rendering.internal.detector.brokencreative.b {
        public c() {
        }

        @Override // io.bidmachine.rendering.internal.detector.brokencreative.b
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            tn.p.k(brokenCreativeEvent, "brokenCreativeEvent");
            h.this.a(brokenCreativeEvent);
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(tn.i iVar) {
            this();
        }
    }

    public final class e extends b {
        public e() {
            super();
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar) {
            tn.p.k(aVar, "adForm");
            super.b(aVar);
            if (!h.this.a(aVar, true)) {
                c(aVar, new Error("Failed to setup ad element (" + aVar + ')'));
            }
            if (!h.this.f70238n.isEmpty()) {
                return;
            }
            h.this.r();
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void b(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            tn.p.k(aVar, "adForm");
            tn.p.k(error, "error");
            super.b(aVar, error);
            h hVar = h.this;
            hVar.a((io.bidmachine.rendering.internal.c) aVar, hVar.j());
        }

        @Override // io.bidmachine.rendering.internal.controller.h.b, io.bidmachine.rendering.internal.adform.c
        public void c(io.bidmachine.rendering.internal.adform.a aVar, Error error) {
            tn.p.k(aVar, "adForm");
            tn.p.k(error, "error");
            super.c(aVar, error);
            h hVar = h.this;
            hVar.a((io.bidmachine.rendering.internal.c) aVar, hVar.j());
        }
    }

    public final class f implements io.bidmachine.rendering.internal.event.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f70247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f70248b;

        public static final class a implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f70249a;

            public a(Object obj) {
                this.f70249a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.g) this.f70249a).b();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class b implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f70250a;

            public b(Object obj) {
                this.f70250a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.g) this.f70250a).b();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class c implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f70251a;

            public c(Object obj) {
                this.f70251a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.g) this.f70251a).b();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class d implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f70252a;

            public d(Object obj) {
                this.f70252a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((io.bidmachine.rendering.internal.g) this.f70252a).b();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class e extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70253a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70254b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70255c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70256d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70257e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70258f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ h f70259g;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70260a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f70261b;

                public a(Object obj, h hVar) {
                    this.f70260a = obj;
                    this.f70261b = hVar;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    VisibilityChanger visibilityChanger = (VisibilityChanger) this.f70260a;
                    this.f70261b.a(visibilityChanger, false, (Runnable) new C0826f(visibilityChanger));
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(h hVar, String str, String str2, Class cls, String str3, hn.c cVar, h hVar2) {
                super(2, cVar);
                this.f70254b = hVar;
                this.f70255c = str;
                this.f70256d = str2;
                this.f70257e = cls;
                this.f70258f = str3;
                this.f70259g = hVar2;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((e) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new e(this.f70254b, this.f70255c, this.f70256d, this.f70257e, this.f70258f, cVar, this.f70259g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70253a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70254b.b(this.f70255c);
                if (objB == null) {
                    this.f70254b.a(this.f70256d, this.f70255c);
                } else if (!this.f70257e.isInstance(objB)) {
                    this.f70254b.a(this.f70256d, this.f70255c, this.f70258f);
                } else if (this.f70257e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f70259g));
                }
                return bn.r.f5635a;
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.controller.h$f$f, reason: collision with other inner class name */
        public static final class C0826f implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ VisibilityChanger f70262a;

            public C0826f(VisibilityChanger visibilityChanger) {
                this.f70262a = visibilityChanger;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                this.f70262a.setVisibility(false);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class g extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70264b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70265c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70266d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70267e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70268f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f70269g;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70270a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f70271b;

                public a(Object obj, boolean z10) {
                    this.f70270a = obj;
                    this.f70271b = z10;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((VisibilityChanger) this.f70270a).lockVisibility(this.f70271b);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(h hVar, String str, String str2, Class cls, String str3, hn.c cVar, boolean z10) {
                super(2, cVar);
                this.f70264b = hVar;
                this.f70265c = str;
                this.f70266d = str2;
                this.f70267e = cls;
                this.f70268f = str3;
                this.f70269g = z10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((g) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new g(this.f70264b, this.f70265c, this.f70266d, this.f70267e, this.f70268f, cVar, this.f70269g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70263a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70264b.b(this.f70265c);
                if (objB == null) {
                    this.f70264b.a(this.f70266d, this.f70265c);
                } else if (!this.f70267e.isInstance(objB)) {
                    this.f70264b.a(this.f70266d, this.f70265c, this.f70268f);
                } else if (this.f70267e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f70269g));
                }
                return bn.r.f5635a;
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.controller.h$f$h, reason: collision with other inner class name */
        public static final class C0827h extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70273b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70274c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70275d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70276e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70277f;

            /* JADX INFO: renamed from: io.bidmachine.rendering.internal.controller.h$f$h$a */
            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70278a;

                public a(Object obj) {
                    this.f70278a = obj;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.q) this.f70278a).l();
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0827h(h hVar, String str, String str2, Class cls, String str3, hn.c cVar) {
                super(2, cVar);
                this.f70273b = hVar;
                this.f70274c = str;
                this.f70275d = str2;
                this.f70276e = cls;
                this.f70277f = str3;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((C0827h) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new C0827h(this.f70273b, this.f70274c, this.f70275d, this.f70276e, this.f70277f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70272a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70273b.b(this.f70274c);
                if (objB == null) {
                    this.f70273b.a(this.f70275d, this.f70274c);
                } else if (!this.f70276e.isInstance(objB)) {
                    this.f70273b.a(this.f70275d, this.f70274c, this.f70277f);
                } else if (this.f70276e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB));
                }
                return bn.r.f5635a;
            }
        }

        public static final class i implements io.bidmachine.rendering.internal.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f70279a;

            public i(h hVar) {
                this.f70279a = hVar;
            }

            public void a(boolean z10) {
                io.bidmachine.rendering.internal.controller.g gVarM = this.f70279a.m();
                if (gVarM != null) {
                    gVarM.c();
                }
            }

            @Override // io.bidmachine.rendering.internal.m, io.bidmachine.util.SafeExecutable, io.bidmachine.util.Executable
            @CallSuper
            public /* bridge */ /* synthetic */ void execute(Object obj) {
                super.execute(obj);
            }

            @Override // io.bidmachine.rendering.internal.m, io.bidmachine.util.SafeExecutable, io.bidmachine.util.Executable
            public /* bridge */ /* synthetic */ boolean executeSafely(@Nullable Object obj) {
                return super.executeSafely(obj);
            }

            @Override // io.bidmachine.rendering.internal.m, io.bidmachine.util.SafeExecutable
            public /* bridge */ /* synthetic */ void onExecute(Object obj) {
                a(((Boolean) obj).booleanValue());
            }

            @Override // io.bidmachine.rendering.internal.m, io.bidmachine.util.SafeExecutable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }
        }

        public static final class j extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70280a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70281b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70282c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70283d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70284e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70285f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ long f70286g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ long f70287h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ float f70288i;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70289a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f70290b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f70291c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f70292d;

                public a(Object obj, long j10, long j11, float f10) {
                    this.f70289a = obj;
                    this.f70290b = j10;
                    this.f70291c = j11;
                    this.f70292d = f10;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.s) this.f70289a).a(this.f70290b, this.f70291c, this.f70292d);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(h hVar, String str, String str2, Class cls, String str3, hn.c cVar, long j10, long j11, float f10) {
                super(2, cVar);
                this.f70281b = hVar;
                this.f70282c = str;
                this.f70283d = str2;
                this.f70284e = cls;
                this.f70285f = str3;
                this.f70286g = j10;
                this.f70287h = j11;
                this.f70288i = f10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((j) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new j(this.f70281b, this.f70282c, this.f70283d, this.f70284e, this.f70285f, cVar, this.f70286g, this.f70287h, this.f70288i);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70280a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70281b.b(this.f70282c);
                if (objB == null) {
                    this.f70281b.a(this.f70283d, this.f70282c);
                } else if (!this.f70284e.isInstance(objB)) {
                    this.f70281b.a(this.f70283d, this.f70282c, this.f70285f);
                } else if (this.f70284e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f70286g, this.f70287h, this.f70288i));
                }
                return bn.r.f5635a;
            }
        }

        public static final class k extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70293a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70294b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70295c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70296d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70297e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70298f;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70299a;

                public a(Object obj) {
                    this.f70299a = obj;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.t) this.f70299a).m();
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(h hVar, String str, String str2, Class cls, String str3, hn.c cVar) {
                super(2, cVar);
                this.f70294b = hVar;
                this.f70295c = str;
                this.f70296d = str2;
                this.f70297e = cls;
                this.f70298f = str3;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((k) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new k(this.f70294b, this.f70295c, this.f70296d, this.f70297e, this.f70298f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70293a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70294b.b(this.f70295c);
                if (objB == null) {
                    this.f70294b.a(this.f70296d, this.f70295c);
                } else if (!this.f70297e.isInstance(objB)) {
                    this.f70294b.a(this.f70296d, this.f70295c, this.f70298f);
                } else if (this.f70297e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB));
                }
                return bn.r.f5635a;
            }
        }

        public static final class l extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70300a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70301b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70302c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70303d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70304e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70305f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ long f70306g;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70307a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f70308b;

                public a(Object obj, long j10) {
                    this.f70307a = obj;
                    this.f70308b = j10;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.v) this.f70307a).a(this.f70308b);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(h hVar, String str, String str2, Class cls, String str3, hn.c cVar, long j10) {
                super(2, cVar);
                this.f70301b = hVar;
                this.f70302c = str;
                this.f70303d = str2;
                this.f70304e = cls;
                this.f70305f = str3;
                this.f70306g = j10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((l) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new l(this.f70301b, this.f70302c, this.f70303d, this.f70304e, this.f70305f, cVar, this.f70306g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70300a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70301b.b(this.f70302c);
                if (objB == null) {
                    this.f70301b.a(this.f70303d, this.f70302c);
                } else if (!this.f70304e.isInstance(objB)) {
                    this.f70301b.a(this.f70303d, this.f70302c, this.f70305f);
                } else if (this.f70304e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f70306g));
                }
                return bn.r.f5635a;
            }
        }

        public static final class m extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70310b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70311c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70312d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70313e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70314f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ h f70315g;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70316a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f70317b;

                public a(Object obj, h hVar) {
                    this.f70316a = obj;
                    this.f70317b = hVar;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    VisibilityChanger visibilityChanger = (VisibilityChanger) this.f70316a;
                    this.f70317b.a(visibilityChanger, true, (Runnable) new n(visibilityChanger));
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(h hVar, String str, String str2, Class cls, String str3, hn.c cVar, h hVar2) {
                super(2, cVar);
                this.f70310b = hVar;
                this.f70311c = str;
                this.f70312d = str2;
                this.f70313e = cls;
                this.f70314f = str3;
                this.f70315g = hVar2;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((m) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new m(this.f70310b, this.f70311c, this.f70312d, this.f70313e, this.f70314f, cVar, this.f70315g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70309a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70310b.b(this.f70311c);
                if (objB == null) {
                    this.f70310b.a(this.f70312d, this.f70311c);
                } else if (!this.f70313e.isInstance(objB)) {
                    this.f70310b.a(this.f70312d, this.f70311c, this.f70314f);
                } else if (this.f70313e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f70315g));
                }
                return bn.r.f5635a;
            }
        }

        public static final class n implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ VisibilityChanger f70318a;

            public n(VisibilityChanger visibilityChanger) {
                this.f70318a = visibilityChanger;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                this.f70318a.setVisibility(true);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class o extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70319a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70320b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70321c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70322d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70323e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70324f;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70325a;

                public a(Object obj) {
                    this.f70325a = obj;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.c) this.f70325a).o();
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(h hVar, String str, String str2, Class cls, String str3, hn.c cVar) {
                super(2, cVar);
                this.f70320b = hVar;
                this.f70321c = str;
                this.f70322d = str2;
                this.f70323e = cls;
                this.f70324f = str3;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((o) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new o(this.f70320b, this.f70321c, this.f70322d, this.f70323e, this.f70324f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70319a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70320b.b(this.f70321c);
                if (objB == null) {
                    this.f70320b.a(this.f70322d, this.f70321c);
                } else if (!this.f70323e.isInstance(objB)) {
                    this.f70320b.a(this.f70322d, this.f70321c, this.f70324f);
                } else if (this.f70323e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB));
                }
                return bn.r.f5635a;
            }
        }

        public static final class p implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f70326a;

            public p(Object obj) {
                this.f70326a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((w) this.f70326a).e();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class q implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f70327a;

            public q(Object obj) {
                this.f70327a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((w) this.f70327a).e();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class r implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f70328a;

            public r(Object obj) {
                this.f70328a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((w) this.f70328a).e();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class s implements io.bidmachine.rendering.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f70329a;

            public s(Object obj) {
                this.f70329a = obj;
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                ((w) this.f70329a).e();
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }
        }

        public static final class t extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70330a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70331b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70332c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70333d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70334e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70335f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f70336g;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70337a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f70338b;

                public a(Object obj, String str) {
                    this.f70337a = obj;
                    this.f70338b = str;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((x) this.f70337a).a(this.f70338b);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(h hVar, String str, String str2, Class cls, String str3, hn.c cVar, String str4) {
                super(2, cVar);
                this.f70331b = hVar;
                this.f70332c = str;
                this.f70333d = str2;
                this.f70334e = cls;
                this.f70335f = str3;
                this.f70336g = str4;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((t) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new t(this.f70331b, this.f70332c, this.f70333d, this.f70334e, this.f70335f, cVar, this.f70336g);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70330a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70331b.b(this.f70332c);
                if (objB == null) {
                    this.f70331b.a(this.f70333d, this.f70332c);
                } else if (!this.f70334e.isInstance(objB)) {
                    this.f70331b.a(this.f70333d, this.f70332c, this.f70335f);
                } else if (this.f70334e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB, this.f70336g));
                }
                return bn.r.f5635a;
            }
        }

        public static final class u extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70340b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70341c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70342d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70343e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70344f;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70345a;

                public a(Object obj) {
                    this.f70345a = obj;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((VisibilityChanger) this.f70345a).unlockVisibility();
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public u(h hVar, String str, String str2, Class cls, String str3, hn.c cVar) {
                super(2, cVar);
                this.f70340b = hVar;
                this.f70341c = str;
                this.f70342d = str2;
                this.f70343e = cls;
                this.f70344f = str3;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((u) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new u(this.f70340b, this.f70341c, this.f70342d, this.f70343e, this.f70344f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70339a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70340b.b(this.f70341c);
                if (objB == null) {
                    this.f70340b.a(this.f70342d, this.f70341c);
                } else if (!this.f70343e.isInstance(objB)) {
                    this.f70340b.a(this.f70342d, this.f70341c, this.f70344f);
                } else if (this.f70343e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB));
                }
                return bn.r.f5635a;
            }
        }

        public static final class v extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70346a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f70347b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f70348c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f70349d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Class f70350e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f70351f;

            public static final class a implements io.bidmachine.rendering.internal.n {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Object f70352a;

                public a(Object obj) {
                    this.f70352a = obj;
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    ((io.bidmachine.rendering.internal.q) this.f70352a).i();
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
                public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
                    super.onThrows(th2);
                }

                @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
                @CallSuper
                public /* bridge */ /* synthetic */ void run() {
                    super.run();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public v(h hVar, String str, String str2, Class cls, String str3, hn.c cVar) {
                super(2, cVar);
                this.f70347b = hVar;
                this.f70348c = str;
                this.f70349d = str2;
                this.f70350e = cls;
                this.f70351f = str3;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((v) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return new v(this.f70347b, this.f70348c, this.f70349d, this.f70350e, this.f70351f, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70346a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Object objB = this.f70347b.b(this.f70348c);
                if (objB == null) {
                    this.f70347b.a(this.f70349d, this.f70348c);
                } else if (!this.f70350e.isInstance(objB)) {
                    this.f70347b.a(this.f70349d, this.f70348c, this.f70351f);
                } else if (this.f70350e.isInstance(objB)) {
                    UiUtils.onUiThread(new a(objB));
                }
                return bn.r.f5635a;
            }
        }

        public f(h hVar, Context context) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            this.f70248b = hVar;
            Context applicationContext = context.getApplicationContext();
            tn.p.j(applicationContext, "context.applicationContext");
            this.f70247a = applicationContext;
        }

        private final void l(String str) {
            io.bidmachine.rendering.internal.controller.g gVarM = this.f70248b.m();
            if (gVarM != null) {
                gVarM.a();
            }
            UrlHandler.openUrl(this.f70247a, str, new i(this.f70248b));
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(PrivacySheetParams privacySheetParams) {
            tn.p.k(privacySheetParams, "privacySheetParams");
            io.bidmachine.rendering.internal.controller.g gVarM = this.f70248b.m();
            if (gVarM != null) {
                gVarM.a(privacySheetParams);
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String str) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new m(hVar, str, C4157n2.f33013v, VisibilityChanger.class, "VisibilityChanger", null, hVar), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String str, long j10) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new l(hVar, str, "schedule", io.bidmachine.rendering.internal.v.class, "Schedule", null, j10), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String str, long j10, long j11, float f10) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new j(hVar, str, "progress", io.bidmachine.rendering.internal.s.class, VastTagName.PROGRESS, null, j10, j11, f10), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String str, String str2) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new t(hVar, str, "start", x.class, "Startable", null, str2), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void a(String str, boolean z10) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new g(hVar, str, "lockVisibility", VisibilityChanger.class, "VisibilityChanger", null, z10), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void b() {
            h hVar = this.f70248b;
            for (io.bidmachine.rendering.internal.c cVar : hVar.i()) {
                if (io.bidmachine.rendering.internal.g.class.isInstance(cVar)) {
                    UiUtils.onUiThread(new a(cVar));
                }
            }
            for (io.bidmachine.rendering.internal.c cVar2 : hVar.j()) {
                if (io.bidmachine.rendering.internal.g.class.isInstance(cVar2)) {
                    UiUtils.onUiThread(new b(cVar2));
                }
            }
            for (io.bidmachine.rendering.internal.p pVar : hVar.l()) {
                if (io.bidmachine.rendering.internal.g.class.isInstance(pVar)) {
                    UiUtils.onUiThread(new c(pVar));
                }
            }
            y yVarK = hVar.k();
            if (io.bidmachine.rendering.internal.g.class.isInstance(yVarK)) {
                UiUtils.onUiThread(new d(yVarK));
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void b(String str) {
            tn.p.k(str, "stateGroups");
            this.f70248b.n().a(str);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void c(String str) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new e(hVar, str, "hide", VisibilityChanger.class, "VisibilityChanger", null, hVar), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void d(String str) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new C0827h(hVar, str, CampaignEx.JSON_NATIVE_VIDEO_MUTE, io.bidmachine.rendering.internal.q.class, "Mutable", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void e() {
            h hVar = this.f70248b;
            for (io.bidmachine.rendering.internal.c cVar : hVar.i()) {
                if (w.class.isInstance(cVar)) {
                    UiUtils.onUiThread(new p(cVar));
                }
            }
            for (io.bidmachine.rendering.internal.c cVar2 : hVar.j()) {
                if (w.class.isInstance(cVar2)) {
                    UiUtils.onUiThread(new q(cVar2));
                }
            }
            for (io.bidmachine.rendering.internal.p pVar : hVar.l()) {
                if (w.class.isInstance(pVar)) {
                    UiUtils.onUiThread(new r(pVar));
                }
            }
            y yVarK = hVar.k();
            if (w.class.isInstance(yVarK)) {
                UiUtils.onUiThread(new s(yVarK));
            }
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void e(String str) {
            tn.p.k(str, "url");
            l(str);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void f(String str) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new k(hVar, str, "repeat", io.bidmachine.rendering.internal.t.class, "Repeatable", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void g(String str) {
            tn.p.k(str, "url");
            io.bidmachine.rendering.internal.controller.g gVarM = this.f70248b.m();
            if (gVarM != null) {
                gVarM.d();
            }
            l(str);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void h(String str) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new u(hVar, str, "unlockVisibility", VisibilityChanger.class, "VisibilityChanger", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void i(String str) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new o(hVar, str, "simulateClick", io.bidmachine.rendering.internal.c.class, "AdElement", null), 2, null);
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void j(String str) {
            tn.p.k(str, "url");
            new NetworkRequest.Builder(str, NetworkRequest.Method.Get).setUserAgent(Rendering.getUserAgent()).send();
        }

        @Override // io.bidmachine.rendering.internal.event.f
        public void k(String str) {
            tn.p.k(str, "targetElementName");
            h hVar = this.f70248b;
            p000do.i.d(hVar.h(hVar), hVar.g(hVar).b(), null, new v(hVar, str, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, io.bidmachine.rendering.internal.q.class, "Mutable", null), 2, null);
        }
    }

    public final class g extends y {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f70353c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h hVar, io.bidmachine.rendering.internal.event.b bVar) {
            super(bVar);
            tn.p.k(bVar, "eventCallback");
            this.f70353c = hVar;
        }

        @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.g
        public void b() {
            io.bidmachine.rendering.internal.controller.g gVarM = this.f70353c.m();
            if (gVarM != null) {
                gVarM.b();
            }
        }

        @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.w
        public void e() {
            io.bidmachine.rendering.internal.controller.g gVarM = this.f70353c.m();
            if (gVarM != null) {
                gVarM.e();
            }
        }

        @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.q
        public void i() {
            q().c();
        }

        @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.q
        public void l() {
            q().f();
        }

        @Override // io.bidmachine.rendering.internal.y
        public String r() {
            return q().g();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.controller.h$h, reason: collision with other inner class name */
    public static final class C0828h extends Lambda implements sn.a {
        public C0828h() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.adform.b invoke() {
            Context context = h.this.f70229e;
            tn.p.j(context, "applicationContext");
            return new io.bidmachine.rendering.internal.adform.b(context, h.this.f70230f);
        }
    }

    public static final class i extends Lambda implements sn.a {
        public i() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            ViewGroup viewGroupC = h.this.e().c();
            if (viewGroupC != null) {
                return Integer.valueOf(viewGroupC.getId());
            }
            return null;
        }
    }

    public static final class j extends Lambda implements sn.a {
        public j() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            h hVar = h.this;
            return new g(hVar, hVar.a("system"));
        }
    }

    public static final class k extends SuspendLambda implements sn.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70357a;

        public k(hn.c cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((k) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return h.this.new k(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70357a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            if (h.this.o()) {
                h.this.p();
                h.this.q();
            }
            return bn.r.f5635a;
        }
    }

    public static final class l implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f70359a;

        public l(Object obj) {
            this.f70359a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f70359a).pause();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class m implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f70360a;

        public m(Object obj) {
            this.f70360a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f70360a).pause();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class n implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f70361a;

        public n(Object obj) {
            this.f70361a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f70361a).pause();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class o implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f70362a;

        public o(Object obj) {
            this.f70362a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f70362a).pause();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class p implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f70363a;

        public p(Object obj) {
            this.f70363a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f70363a).n();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class q implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f70364a;

        public q(Object obj) {
            this.f70364a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f70364a).n();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class r implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f70365a;

        public r(Object obj) {
            this.f70365a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f70365a).n();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class s implements io.bidmachine.rendering.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f70366a;

        public s(Object obj) {
            this.f70366a = obj;
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public final void onRun() {
            ((v) this.f70366a).n();
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static final class t extends Lambda implements sn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdPhaseParams f70367a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(AdPhaseParams adPhaseParams) {
            super(0);
            this.f70367a = adPhaseParams;
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.groups.a invoke() {
            return new io.bidmachine.rendering.internal.groups.a(this.f70367a.getStateGroups());
        }
    }

    public h(Context context, AdPhaseParams adPhaseParams, Tag tag, io.bidmachine.rendering.internal.state.c cVar, io.bidmachine.rendering.internal.controller.f fVar, io.bidmachine.rendering.internal.animation.b bVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(adPhaseParams, "adPhaseParams");
        tn.p.k(tag, "tag");
        tn.p.k(cVar, "adState");
        tn.p.k(fVar, "adPhaseControllerListener");
        tn.p.k(bVar, "adAnimationController");
        this.f70225a = tag;
        this.f70226b = cVar;
        this.f70227c = fVar;
        this.f70228d = bVar;
        Context applicationContext = context.getApplicationContext();
        this.f70229e = applicationContext;
        tn.p.j(applicationContext, "applicationContext");
        io.bidmachine.rendering.internal.repository.b bVar2 = new io.bidmachine.rendering.internal.repository.b(applicationContext, h(this), g(this));
        this.f70230f = bVar2;
        tn.p.j(applicationContext, "applicationContext");
        this.f70231g = new io.bidmachine.rendering.internal.d(applicationContext, bVar2, adPhaseParams);
        this.f70233i = new f(this, context);
        this.f70234j = new c();
        this.f70235k = kotlin.b.b(new t(adPhaseParams));
        this.f70236l = kotlin.b.b(new j());
        this.f70237m = new CoroutineTaskManager(h(this).getCoroutineContext().plus(g(this).c()));
        this.f70238n = new ConcurrentHashMap();
        this.f70239o = new CopyOnWriteArrayList();
        this.f70240p = new CopyOnWriteArrayList();
        this.f70241q = new CopyOnWriteArrayList();
        this.f70242r = kotlin.b.b(new C0828h());
    }

    private final io.bidmachine.rendering.internal.detector.brokencreative.a a(AdElementParams adElementParams) {
        BrokenCreativeDetectorParams brokenCreativeDetectorParams = adElementParams.getBrokenCreativeDetectorParams();
        if (brokenCreativeDetectorParams != null) {
            return new io.bidmachine.rendering.internal.detector.brokencreative.a(e().b().getSequence(), adElementParams.getName(), brokenCreativeDetectorParams, this.f70234j);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(io.bidmachine.rendering.internal.c cVar) {
        tn.p.k(cVar, "$item");
        cVar.f();
    }

    public static /* synthetic */ void a(h hVar, y yVar, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        hVar.a(yVar, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(BrokenCreativeEvent brokenCreativeEvent) {
        io.bidmachine.rendering.internal.controller.g gVarM;
        if (this.f70226b.h() || (gVarM = m()) == null) {
            return;
        }
        gVarM.a(brokenCreativeEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(VisibilityChanger visibilityChanger, boolean z10, Runnable runnable) {
        if (!(visibilityChanger instanceof io.bidmachine.rendering.internal.c) || !this.f70226b.d() || this.f70226b.h()) {
            runnable.run();
            return;
        }
        AnimationEventType animationEventType = z10 ? AnimationEventType.Appear : AnimationEventType.Disappear;
        Runnable runnable2 = z10 ? runnable : null;
        if (z10) {
            runnable = null;
        }
        this.f70228d.a((io.bidmachine.rendering.internal.c) visibilityChanger, animationEventType, runnable2, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, String str2) {
        io.bidmachine.rendering.internal.o.a(this.f70225a, "EventTask - " + str + ", target object (" + str2 + ") not found", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, String str2, String str3) {
        io.bidmachine.rendering.internal.o.a(this.f70225a, "EventTask - " + str + ", target object (" + str2 + ") not " + str3, new Object[0]);
    }

    public static /* synthetic */ boolean a(h hVar, io.bidmachine.rendering.internal.adform.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return hVar.a(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(io.bidmachine.rendering.internal.c cVar) {
        tn.p.k(cVar, "$item");
        cVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.bidmachine.rendering.internal.h g(h hVar) {
        return hVar.f70226b.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 h(h hVar) {
        return hVar.f70226b.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y k() {
        return (y) this.f70236l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.bidmachine.rendering.internal.groups.b n() {
        return (io.bidmachine.rendering.internal.groups.b) this.f70235k.getValue();
    }

    public final io.bidmachine.rendering.internal.adform.a a(AdElementParams adElementParams, io.bidmachine.rendering.internal.adform.c cVar) {
        tn.p.k(adElementParams, "elementParams");
        tn.p.k(cVar, "adFormListener");
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Create AdElement - " + adElementParams.getName(), new Object[0]);
        return h().a(adElementParams, cVar, a(adElementParams.getName()), a(adElementParams));
    }

    public final io.bidmachine.rendering.internal.event.b a(String str) {
        tn.p.k(str, "sourceName");
        return new io.bidmachine.rendering.internal.event.c(str, new io.bidmachine.rendering.internal.groups.c(n()), new io.bidmachine.rendering.internal.animation.c(this.f70228d, new i()), new io.bidmachine.rendering.internal.event.a(this.f70233i, str), h(this), g(this), e().b().getEventTypeMap(str));
    }

    public final List a(List list, io.bidmachine.rendering.internal.adform.c cVar) {
        tn.p.k(list, "elementsParams");
        tn.p.k(cVar, "adFormListener");
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((AdElementParams) it.next(), cVar));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((io.bidmachine.rendering.internal.adform.a) it2.next(), cVar);
        }
        return arrayList;
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void a() {
        io.bidmachine.rendering.internal.o.b(this.f70225a, "AdPhase - destroy", new Object[0]);
        f();
        a(this.f70239o);
        a(this.f70240p);
        g();
        b(this.f70241q);
        a(this, k(), (List) null, 2, (Object) null);
        a((io.bidmachine.rendering.internal.controller.g) null);
        this.f70226b.a();
    }

    public final void a(io.bidmachine.rendering.internal.adform.a aVar, io.bidmachine.rendering.internal.adform.c cVar) {
        tn.p.k(aVar, "adForm");
        tn.p.k(cVar, "adFormListener");
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Load AdElement - " + aVar.h().getName(), new Object[0]);
        io.bidmachine.rendering.internal.controller.d dVar = new io.bidmachine.rendering.internal.controller.d(aVar);
        this.f70238n.put(aVar, dVar);
        try {
            this.f70237m.execute(dVar);
        } catch (Throwable th2) {
            cVar.c(aVar, Error.INSTANCE.create(th2));
        }
    }

    public final void a(final io.bidmachine.rendering.internal.c cVar, List list) {
        tn.p.k(cVar, "item");
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Destroy AdElement - " + cVar.h().getName(), new Object[0]);
        this.f70228d.a(cVar);
        if (list != null) {
            list.remove(cVar);
        }
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.n() { // from class: lk.m
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                cVar.a();
            }
        });
    }

    public final void a(final io.bidmachine.rendering.internal.c cVar, boolean z10) {
        tn.p.k(cVar, "item");
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Hide AdElement - " + cVar.h().getName() + ", animated: " + z10, new Object[0]);
        io.bidmachine.rendering.internal.n nVar = new io.bidmachine.rendering.internal.n() { // from class: lk.p
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.controller.h.a(cVar);
            }
        };
        if (z10) {
            b.a.a(this.f70228d, cVar, AnimationEventType.Disappear, null, nVar, 4, null);
        } else {
            nVar.run();
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void a(io.bidmachine.rendering.internal.controller.g gVar) {
        this.f70232h = gVar;
    }

    public final void a(final y yVar, List list) {
        tn.p.k(yVar, "item");
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Destroy TargetObject - " + yVar.r(), new Object[0]);
        if (list != null) {
            tn.y.a(list).remove(yVar);
        }
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.n() { // from class: lk.q
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                yVar.a();
            }
        });
    }

    public final void a(Error error) {
        tn.p.k(error, "error");
        if (this.f70226b.a(false)) {
            this.f70227c.a(this, error);
        }
    }

    public final void a(List list) {
        tn.p.k(list, "item");
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Destroy AdElements", new Object[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((io.bidmachine.rendering.internal.c) it.next(), list);
        }
        list.clear();
    }

    public final void a(List list, boolean z10) {
        tn.p.k(list, "items");
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Hide AdElements, animated: " + z10, new Object[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((io.bidmachine.rendering.internal.c) it.next(), z10);
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void a(boolean z10) {
        io.bidmachine.rendering.internal.o.b(this.f70225a, "AdPhase - performHide, isFinishing: " + z10, new Object[0]);
        for (io.bidmachine.rendering.internal.c cVar : i()) {
            if (v.class.isInstance(cVar)) {
                UiUtils.onUiThread(new l(cVar));
            }
        }
        for (io.bidmachine.rendering.internal.c cVar2 : j()) {
            if (v.class.isInstance(cVar2)) {
                UiUtils.onUiThread(new m(cVar2));
            }
        }
        for (io.bidmachine.rendering.internal.p pVar : l()) {
            if (v.class.isInstance(pVar)) {
                UiUtils.onUiThread(new n(pVar));
            }
        }
        y yVarK = k();
        if (v.class.isInstance(yVarK)) {
            UiUtils.onUiThread(new o(yVarK));
        }
        a(this.f70239o, z10);
        a(this.f70240p, z10);
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public boolean a(ViewGroup viewGroup) {
        tn.p.k(viewGroup, "container");
        return e().a(viewGroup, this.f70239o, this.f70240p);
    }

    public final boolean a(io.bidmachine.rendering.internal.adform.a aVar, boolean z10) {
        tn.p.k(aVar, "item");
        boolean zD = aVar.D();
        if (zD) {
            this.f70228d.a(aVar, z10);
            this.f70228d.a(aVar, AnimationEventType.Appear);
        }
        return zD;
    }

    public final Object b(String str) {
        Object next;
        Object next2;
        tn.p.k(str, "name");
        if (d0.u0(str)) {
            return null;
        }
        Iterator it = this.f70239o.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (a0.J(((io.bidmachine.rendering.internal.c) next).h().getName(), str, true)) {
                break;
            }
        }
        Object next3 = (io.bidmachine.rendering.internal.c) next;
        if (next3 == null) {
            Iterator it2 = this.f70240p.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (a0.J(((io.bidmachine.rendering.internal.c) next2).h().getName(), str, true)) {
                    break;
                }
            }
            next3 = (io.bidmachine.rendering.internal.c) next2;
            if (next3 == null) {
                Iterator it3 = this.f70241q.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (a0.J(((io.bidmachine.rendering.internal.p) next3).s().getName(), str, true)) {
                        break;
                    }
                }
            }
        }
        if (next3 != null) {
            return next3;
        }
        if (tn.p.f(k().r(), str)) {
            return k();
        }
        return null;
    }

    public final void b(final io.bidmachine.rendering.internal.c cVar, boolean z10) {
        tn.p.k(cVar, "item");
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Show AdElement - " + cVar.h().getName() + ", animated: " + z10, new Object[0]);
        io.bidmachine.rendering.internal.n nVar = new io.bidmachine.rendering.internal.n() { // from class: lk.n
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                io.bidmachine.rendering.internal.controller.h.b(cVar);
            }
        };
        if (z10) {
            b.a.a(this.f70228d, cVar, AnimationEventType.Appear, nVar, null, 8, null);
        } else {
            nVar.run();
        }
    }

    public final void b(List list) {
        tn.p.k(list, "items");
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Destroy TargetObjects", new Object[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((y) it.next(), list);
        }
        list.clear();
    }

    public final void b(List list, boolean z10) {
        tn.p.k(list, "items");
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Show AdElements, animated: " + z10, new Object[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((io.bidmachine.rendering.internal.c) it.next(), z10);
        }
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public boolean b() {
        return this.f70226b.b();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void c() {
        io.bidmachine.rendering.internal.o.b(this.f70225a, "AdPhase - load", new Object[0]);
        p000do.i.d(h(this), g(this).c(), null, new k(null), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void d() {
        io.bidmachine.rendering.internal.o.b(this.f70225a, "AdPhase - performShow", new Object[0]);
        for (io.bidmachine.rendering.internal.c cVar : i()) {
            if (v.class.isInstance(cVar)) {
                UiUtils.onUiThread(new p(cVar));
            }
        }
        for (io.bidmachine.rendering.internal.c cVar2 : j()) {
            if (v.class.isInstance(cVar2)) {
                UiUtils.onUiThread(new q(cVar2));
            }
        }
        for (io.bidmachine.rendering.internal.p pVar : l()) {
            if (v.class.isInstance(pVar)) {
                UiUtils.onUiThread(new r(pVar));
            }
        }
        y yVarK = k();
        if (v.class.isInstance(yVarK)) {
            UiUtils.onUiThread(new s(yVarK));
        }
        if (this.f70226b.m()) {
            b(this.f70239o, false);
            b(this.f70240p, false);
        }
        this.f70226b.l();
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public io.bidmachine.rendering.internal.d e() {
        return this.f70231g;
    }

    public final void f() {
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Cancel loading AdElements", new Object[0]);
        Iterator it = this.f70238n.entrySet().iterator();
        while (it.hasNext()) {
            this.f70237m.cancel((Runnable) ((Map.Entry) it.next()).getValue());
        }
        this.f70238n.clear();
    }

    public final void g() {
        io.bidmachine.rendering.internal.o.b(this.f70225a, "Destroy AdPhase", new Object[0]);
        this.f70228d.a(e());
        final io.bidmachine.rendering.internal.d dVarE = e();
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.n() { // from class: lk.o
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                dVarE.a();
            }
        });
    }

    public final io.bidmachine.rendering.internal.adform.b h() {
        return (io.bidmachine.rendering.internal.adform.b) this.f70242r.getValue();
    }

    public final List i() {
        return this.f70239o;
    }

    public final List j() {
        return this.f70240p;
    }

    public final List l() {
        return this.f70241q;
    }

    public io.bidmachine.rendering.internal.controller.g m() {
        return this.f70232h;
    }

    public final boolean o() {
        Error error;
        List<AdElementParams> adsList = e().b().getAdsList();
        if (adsList.isEmpty()) {
            error = new Error("AdPhase does not contain any ads part");
        } else {
            if (b()) {
                r();
                return false;
            }
            if (!this.f70226b.c()) {
                return false;
            }
            this.f70239o.addAll(a(adsList, new a()));
            if (!this.f70239o.isEmpty()) {
                return true;
            }
            error = new Error("No supported ads found for the given parameters");
        }
        a(error);
        return false;
    }

    @Override // io.bidmachine.rendering.internal.controller.e
    public void onShown() {
        if (this.f70226b.i()) {
            io.bidmachine.rendering.internal.o.b(this.f70225a, "AdPhase - onShown", new Object[0]);
            b(this.f70239o, true);
            b(this.f70240p, true);
            k().q().m();
        }
    }

    public final void p() {
        this.f70240p.addAll(a(e().b().getControlsList(), new e()));
    }

    public final void q() {
        List<MethodParams> methodParamsList = e().b().getMethodParamsList();
        List list = this.f70241q;
        ArrayList arrayList = new ArrayList(cn.x.x(methodParamsList, 10));
        for (MethodParams methodParams : methodParamsList) {
            arrayList.add(new io.bidmachine.rendering.internal.p(methodParams, a(methodParams.getName())));
        }
        list.addAll(arrayList);
    }

    public final void r() {
        if (this.f70226b.a(true)) {
            this.f70227c.a(this);
        }
    }

    public String toString() {
        String string = this.f70225a.toString();
        tn.p.j(string, "tag.toString()");
        return string;
    }
}
