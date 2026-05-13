package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.C4095je;
import com.ironsource.C4228r4;
import com.ironsource.V9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class IronSourceThreadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f31625a;

    @NotNull
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final bn.g f31626b = kotlin.b.b(g.f31639a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final bn.g f31627c = kotlin.b.b(c.f31635a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final bn.g f31628d = kotlin.b.b(f.f31638a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final bn.g f31629e = kotlin.b.b(d.f31636a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final bn.g f31630f = kotlin.b.b(a.f31633a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final bn.g f31631g = kotlin.b.b(e.f31637a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final bn.g f31632h = kotlin.b.b(b.f31634a);

    public static final class a extends Lambda implements sn.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31633a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v92 = new V9("adapterBackground");
            v92.start();
            v92.a();
            return v92;
        }
    }

    public static final class b extends Lambda implements sn.a<C4095je> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31634a = new b();

        public b() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4095je invoke() {
            return new C4095je(0, null, null, 7, null);
        }
    }

    public static final class c extends Lambda implements sn.a<Handler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f31635a = new c();

        public c() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            V9 v92 = new V9("IronSourceInitiatorHandler");
            v92.start();
            v92.a();
            return new Handler(v92.getLooper());
        }
    }

    public static final class d extends Lambda implements sn.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f31636a = new d();

        public d() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v92 = new V9("mediationBackground");
            v92.start();
            v92.a();
            return v92;
        }
    }

    public static final class e extends Lambda implements sn.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f31637a = new e();

        public e() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v92 = new V9("publisher-callbacks");
            v92.start();
            v92.a();
            return v92;
        }
    }

    public static final class f extends Lambda implements sn.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f31638a = new f();

        public f() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v92 = new V9("managersThread");
            v92.start();
            v92.a();
            return v92;
        }
    }

    public static final class g extends Lambda implements sn.a<Handler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f31639a = new g();

        public g() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    private IronSourceThreadManager() {
    }

    private final V9 a() {
        return (V9) f31630f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable runnable, final CountDownLatch countDownLatch) {
        p.k(runnable, "$it");
        p.k(countDownLatch, "$latch");
        runnable.run();
        new Runnable() { // from class: com.ironsource.environment.thread.a
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(countDownLatch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CountDownLatch countDownLatch) {
        p.k(countDownLatch, "$latch");
        countDownLatch.countDown();
    }

    private final boolean a(Runnable runnable) {
        return f31625a && b().getQueue().contains(runnable);
    }

    private final C4095je b() {
        return (C4095je) f31632h.getValue();
    }

    private final V9 c() {
        return (V9) f31629e.getValue();
    }

    private final V9 d() {
        return (V9) f31631g.getValue();
    }

    private final Handler e() {
        return (Handler) f31626b.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j10);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j10);
    }

    public final void executeTasks(boolean z10, boolean z11, @NotNull List<? extends Runnable> list) {
        p.k(list, "tasks");
        if (!z10) {
            Iterator<? extends Runnable> it = list.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z11) {
            Iterator<? extends Runnable> it2 = list.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        for (final Runnable runnable : list) {
            postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.b
                @Override // java.lang.Runnable
                public final void run() {
                    IronSourceThreadManager.a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            C4228r4.d().a(e10);
        }
    }

    @NotNull
    public final Handler getInitHandler() {
        return (Handler) f31627c.getValue();
    }

    @NotNull
    public final V9 getSharedManagersThread() {
        return (V9) f31628d.getValue();
    }

    @NotNull
    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f31625a;
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable runnable) {
        p.k(runnable, "action");
        postAdapterBackgroundTask$default(this, runnable, 0L, 2, null);
    }

    public final void postAdapterBackgroundTask(@NotNull Runnable runnable, long j10) {
        p.k(runnable, "action");
        if (f31625a) {
            b().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } else {
            a().a(runnable, j10);
        }
    }

    public final void postMediationBackgroundTask(@NotNull Runnable runnable) {
        p.k(runnable, "action");
        postMediationBackgroundTask$default(this, runnable, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(@NotNull Runnable runnable, long j10) {
        p.k(runnable, "action");
        if (f31625a) {
            b().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } else {
            c().a(runnable, j10);
        }
    }

    public final void postOnUiThreadTask(@NotNull Runnable runnable) {
        p.k(runnable, "action");
        postOnUiThreadTask$default(this, runnable, 0L, 2, null);
    }

    public final void postOnUiThreadTask(@NotNull Runnable runnable, long j10) {
        p.k(runnable, "action");
        e().postDelayed(runnable, j10);
    }

    public final void postPublisherCallback(@NotNull Runnable runnable) {
        p.k(runnable, "action");
        postPublisherCallback$default(this, runnable, 0L, 2, null);
    }

    public final void postPublisherCallback(@NotNull Runnable runnable, long j10) {
        p.k(runnable, "action");
        d().a(runnable, j10);
    }

    public final void removeAdapterBackgroundTask(@NotNull Runnable runnable) {
        p.k(runnable, "action");
        if (a(runnable)) {
            b().remove(runnable);
        } else {
            a().b(runnable);
        }
    }

    public final void removeMediationBackgroundTask(@NotNull Runnable runnable) {
        p.k(runnable, "action");
        if (a(runnable)) {
            b().remove(runnable);
        } else {
            c().b(runnable);
        }
    }

    public final void removeUiThreadTask(@NotNull Runnable runnable) {
        p.k(runnable, "action");
        e().removeCallbacks(runnable);
    }

    public final void setUseSharedExecutorService(boolean z10) {
        f31625a = z10;
    }
}
