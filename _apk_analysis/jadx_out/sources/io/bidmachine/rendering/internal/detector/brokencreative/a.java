package io.bidmachine.rendering.internal.detector.brokencreative;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import bn.g;
import bn.r;
import cn.x;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmResult;
import io.bidmachine.rendering.model.BrokenCreativeDetectorParams;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.StopDetectorAfter;
import io.bidmachine.util.ImageUtilsKt;
import io.bidmachine.util.taskmanager.CancelableTask;
import io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager;
import io.bidmachine.util.taskmanager.handler.HandlerTaskManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import p000do.j2;
import p000do.k0;
import p000do.w0;
import sn.l;
import sn.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f70383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f70384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BrokenCreativeDetectorParams f70385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.detector.brokencreative.b f70386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f70387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f70388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f70389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f70390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f70391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f70392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f70393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f70394l;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.detector.brokencreative.a$a, reason: collision with other inner class name */
    public static final class C0830a extends CancelableTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a f70395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f70396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p f70397c;

        public C0830a(io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a aVar, Bitmap bitmap, p pVar) {
            tn.p.k(aVar, "algorithm");
            tn.p.k(bitmap, "image");
            tn.p.k(pVar, "callback");
            this.f70395a = aVar;
            this.f70396b = bitmap;
            this.f70397c = pVar;
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask
        public void runTask() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Boolean boolB = this.f70395a.b(this.f70396b);
            if (boolB != null) {
                this.f70397c.mo2invoke(this, new BrokenCreativeAlgorithmResult(boolB.booleanValue(), this.f70395a.a(), System.currentTimeMillis() - jCurrentTimeMillis));
            } else {
                this.f70397c.mo2invoke(this, null);
            }
        }
    }

    public static final class b extends CancelableTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f70398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f70399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f70400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final l f70401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final CoroutineTaskManager f70402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final WeakReference f70403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f70404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List f70405h;

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.detector.brokencreative.a$b$a, reason: collision with other inner class name */
        public final class C0831a implements io.bidmachine.rendering.internal.screenshot.b {
            public C0831a() {
            }

            @Override // io.bidmachine.rendering.internal.screenshot.b
            public void a() {
                b.this.c();
            }

            @Override // io.bidmachine.rendering.internal.screenshot.b
            public void a(Bitmap bitmap) {
                tn.p.k(bitmap, "bitmap");
                b.this.a(bitmap);
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.detector.brokencreative.a$b$b, reason: collision with other inner class name */
        public static final class C0832b extends Lambda implements p {
            public C0832b() {
                super(2);
            }

            public final void a(C0830a c0830a, BrokenCreativeAlgorithmResult brokenCreativeAlgorithmResult) {
                tn.p.k(c0830a, "algorithmTask");
                b.this.a(c0830a, brokenCreativeAlgorithmResult);
            }

            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo2invoke(Object obj, Object obj2) {
                a((C0830a) obj, (BrokenCreativeAlgorithmResult) obj2);
                return r.f5635a;
            }
        }

        public b(View view, Handler handler, double d10, List list, l lVar) {
            tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            tn.p.k(handler, "screenshotCallbackHandler");
            tn.p.k(list, "algorithms");
            tn.p.k(lVar, "callback");
            this.f70398a = handler;
            this.f70399b = d10;
            this.f70400c = list;
            this.f70401d = lVar;
            this.f70402e = new CoroutineTaskManager(kotlinx.coroutines.d.a(new k0("DetectorTaskManager").plus(j2.b(null, 1, null)).plus(w0.a())));
            this.f70403f = new WeakReference(view);
            this.f70404g = new CopyOnWriteArrayList();
            this.f70405h = new CopyOnWriteArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(Bitmap bitmap) {
            if (!a()) {
                ImageUtilsKt.recycleSafely(bitmap);
                return;
            }
            Bitmap bitmapCreateDownscaledBitmapSafely = ImageUtilsKt.createDownscaledBitmapSafely(bitmap, this.f70399b);
            if (!tn.p.f(bitmapCreateDownscaledBitmapSafely, bitmap)) {
                ImageUtilsKt.recycleSafely(bitmap);
            }
            if (!a()) {
                ImageUtilsKt.recycleSafely(bitmap);
                return;
            }
            List list = this.f70400c;
            ArrayList<C0830a> arrayList = new ArrayList(x.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C0830a((io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a) it.next(), bitmapCreateDownscaledBitmapSafely, new C0832b()));
            }
            this.f70404g.addAll(arrayList);
            for (C0830a c0830a : arrayList) {
                if (!this.f70402e.executeSafely(c0830a)) {
                    a(c0830a);
                }
            }
        }

        private final void a(C0830a c0830a) {
            this.f70404g.remove(c0830a);
            if (!this.f70404g.isEmpty()) {
                return;
            }
            b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(C0830a c0830a, BrokenCreativeAlgorithmResult brokenCreativeAlgorithmResult) {
            if (brokenCreativeAlgorithmResult != null) {
                this.f70405h.add(brokenCreativeAlgorithmResult);
            }
            a(c0830a);
        }

        private final boolean a() {
            return !isCanceled();
        }

        private final void b() {
            if (a()) {
                this.f70401d.invoke(this.f70405h);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c() {
            b();
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask
        public void runTask() {
            View view = (View) this.f70403f.get();
            if (view == null) {
                return;
            }
            io.bidmachine.rendering.internal.screenshot.a.f70565a.a(view, this.f70398a, new C0831a());
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask, io.bidmachine.util.Cancelable
        public void setCancel(boolean z10) {
            super.setCancel(z10);
            if (z10) {
                Iterator it = this.f70404g.iterator();
                while (it.hasNext()) {
                    this.f70402e.cancel((C0830a) it.next());
                }
                this.f70404g.clear();
            }
        }
    }

    public static final class c extends Lambda implements sn.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f70408a = new c();

        public c() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerTaskManager invoke() {
            HandlerThread handlerThread = new HandlerThread("BrokenCreativeDetectorTaskManager");
            handlerThread.start();
            return new HandlerTaskManager(new Handler(handlerThread.getLooper()));
        }
    }

    public static final class d extends Lambda implements l {
        public d() {
            super(1);
        }

        public final void a(List list) {
            tn.p.k(list, "it");
            a.this.a(list);
        }

        @Override // sn.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return r.f5635a;
        }
    }

    public a(int i10, String str, BrokenCreativeDetectorParams brokenCreativeDetectorParams, io.bidmachine.rendering.internal.detector.brokencreative.b bVar) {
        tn.p.k(str, "adElementName");
        tn.p.k(brokenCreativeDetectorParams, "brokenCreativeDetectorParams");
        tn.p.k(bVar, "brokenCreativeDetectorListener");
        this.f70383a = i10;
        this.f70384b = str;
        this.f70385c = brokenCreativeDetectorParams;
        this.f70386d = bVar;
        this.f70387e = kotlin.b.b(c.f70408a);
        this.f70388f = new CopyOnWriteArrayList();
        this.f70389g = new AtomicBoolean(false);
        this.f70390h = new AtomicBoolean(false);
        this.f70391i = new AtomicBoolean(false);
        this.f70392j = new Object();
    }

    private final void a(BrokenCreativeEvent brokenCreativeEvent) {
        if (a()) {
            o.b("BrokenCreativeDetector", "Notify detector result: %s", brokenCreativeEvent);
            this.f70386d.a(brokenCreativeEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List list) {
        if (a()) {
            Iterator it = list.iterator();
            double d10 = 0.0d;
            double d11 = 0.0d;
            while (it.hasNext()) {
                BrokenCreativeAlgorithmResult brokenCreativeAlgorithmResult = (BrokenCreativeAlgorithmResult) it.next();
                float f10 = brokenCreativeAlgorithmResult.getAlgorithmParams().getAndroidx.appcompat.widget.ActivityChooserModel.ATTRIBUTE_WEIGHT java.lang.String();
                if (brokenCreativeAlgorithmResult.getIsBroken()) {
                    d11 += (double) f10;
                }
                d10 += (double) f10;
            }
            boolean z10 = (d10 != 0.0d ? d11 / d10 : 0.0d) >= this.f70385c.getWeightThreshold();
            if (!this.f70385c.getIsErrorOnly() || z10) {
                BrokenCreativeEvent brokenCreativeEvent = new BrokenCreativeEvent(io.bidmachine.rendering.internal.detector.brokencreative.c.f70413a.a(z10), this.f70383a, this.f70384b, System.currentTimeMillis() - this.f70393k, list);
                if (this.f70385c.getIsAllowDuplicate() || !this.f70388f.contains(brokenCreativeEvent)) {
                    this.f70388f.add(brokenCreativeEvent);
                    a(brokenCreativeEvent);
                }
            }
            StopDetectorAfter stopAfter = this.f70385c.getStopAfter();
            if (!(stopAfter == StopDetectorAfter.ValidCreative && z10) && ((stopAfter != StopDetectorAfter.BrokenCreative || z10) && stopAfter != StopDetectorAfter.Never)) {
                this.f70391i.set(true);
            } else {
                h();
            }
        }
    }

    private final boolean a() {
        return (!f() || g() || e()) ? false : true;
    }

    private final void b() {
        synchronized (this.f70392j) {
            b bVar = this.f70394l;
            if (bVar != null) {
                d().cancel(bVar);
            }
        }
    }

    private final HandlerTaskManager d() {
        return (HandlerTaskManager) this.f70387e.getValue();
    }

    private final boolean e() {
        return this.f70390h.get();
    }

    private final boolean f() {
        return this.f70389g.get();
    }

    private final boolean g() {
        return this.f70391i.get();
    }

    private final void h() {
        synchronized (this.f70392j) {
            b();
            if (a()) {
                b bVar = this.f70394l;
                if (bVar != null) {
                    d().scheduleSafely(bVar, this.f70385c.getTimeout());
                }
            }
        }
    }

    public final void a(View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (g() || e()) {
            return;
        }
        synchronized (this.f70392j) {
            if (this.f70389g.compareAndSet(false, true)) {
                List<BrokenCreativeAlgorithmParams> algorithms = this.f70385c.getAlgorithms();
                ArrayList arrayList = new ArrayList(x.x(algorithms, 10));
                Iterator<T> it = algorithms.iterator();
                while (it.hasNext()) {
                    arrayList.add(io.bidmachine.rendering.internal.detector.brokencreative.algorithm.b.f70411a.a((BrokenCreativeAlgorithmParams) it.next()));
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f70393k = System.currentTimeMillis();
                this.f70394l = new b(view, d().getHandler(), this.f70385c.getDownscaleFactor(), arrayList, new d());
                h();
                r rVar = r.f5635a;
            }
        }
    }

    public final void c() {
        this.f70390h.set(true);
        i();
    }

    public final void i() {
        synchronized (this.f70392j) {
            this.f70389g.set(false);
            b();
            this.f70394l = null;
            r rVar = r.f5635a;
        }
    }
}
