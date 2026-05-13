package sg.bigo.ads.common.n;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<sg.bigo.ads.common.n.a> f82249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HandlerThread f82250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f82251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static HandlerThread f82252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f82253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static HandlerThread f82254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static b f82255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static b f82256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static b f82257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final WeakHashMap<Object, a> f82258j = new WeakHashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f82259k = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f82273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f82274b;

        public a(Runnable runnable, Integer num) {
            this.f82273a = runnable;
            this.f82274b = num;
        }
    }

    static {
        t.a();
    }

    public static void a(int i10, Runnable runnable) {
        b(i10, runnable, 0L);
    }

    public static void a(int i10, Runnable runnable, long j10) {
        b(i10, runnable, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void a(java.lang.Runnable r5) {
        /*
            java.lang.Class<sg.bigo.ads.common.n.d> r0 = sg.bigo.ads.common.n.d.class
            monitor-enter(r0)
            if (r5 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            java.util.WeakHashMap<java.lang.Object, sg.bigo.ads.common.n.d$a> r1 = sg.bigo.ads.common.n.d.f82258j     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L54
            sg.bigo.ads.common.n.d$a r2 = (sg.bigo.ads.common.n.d.a) r2     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L13
            monitor-exit(r0)
            return
        L13:
            java.lang.Runnable r3 = r2.f82273a     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L52
            java.lang.Integer r2 = r2.f82274b     // Catch: java.lang.Throwable -> L54
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L43
            r4 = 1
            if (r2 == r4) goto L3e
            r4 = 2
            if (r2 == r4) goto L39
            r4 = 3
            if (r2 == r4) goto L31
            r4 = 1024(0x400, float:1.435E-42)
            if (r2 == r4) goto L2d
            goto L48
        L2d:
            r3.run()     // Catch: java.lang.Throwable -> L54
            goto L48
        L31:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.n.d.f82255g     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
        L35:
            r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L54
            goto L48
        L39:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.n.d.f82256h     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
            goto L35
        L3e:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.n.d.f82253e     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
            goto L35
        L43:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.n.d.f82251c     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
            goto L35
        L48:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L54
            r1.remove(r5)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L4f:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r5     // Catch: java.lang.Throwable -> L54
        L52:
            monitor-exit(r0)
            return
        L54:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.n.d.a(java.lang.Runnable):void");
    }

    public static synchronized void a(@NonNull sg.bigo.ads.common.n.a aVar) {
        if (f82249a == null) {
            f82249a = new ArrayList();
        }
        f82249a.add(aVar);
    }

    public static boolean a() {
        return f82252d == Thread.currentThread();
    }

    private static synchronized void b(int i10, final Runnable runnable, long j10) {
        final b bVar;
        if (runnable == null) {
            return;
        }
        if (f82256h == null) {
            j();
        }
        if (i10 == 0) {
            if (f82250b == null) {
                g();
            }
            bVar = f82251c;
        } else if (i10 == 1) {
            if (f82252d == null) {
                h();
            }
            bVar = f82253e;
        } else if (i10 != 3) {
            bVar = f82256h;
        } else {
            if (f82254f == null) {
                i();
            }
            bVar = f82255g;
        }
        if (bVar == null) {
            return;
        }
        final Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = f82256h.getLooper();
        }
        final Runnable runnable2 = new Runnable() { // from class: sg.bigo.ads.common.n.d.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Runnable f82261b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f82262c = false;

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable3 = d.f82257i != null ? new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.f82256h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.common.t.a.a(0, "ThreadManager", "这里使用了ThreadManager.post函数运行了一个超过30s的任务");
                            }
                        });
                    }
                } : null;
                if (d.f82257i != null) {
                    d.f82257i.postDelayed(runnable3, 30000L);
                }
                synchronized (d.f82258j) {
                    d.f82258j.remove(runnable);
                }
                if (d.f82259k) {
                    runnable.run();
                } else {
                    try {
                        runnable.run();
                    } catch (Throwable th2) {
                        sg.bigo.ads.common.t.a.a(2, "ThreadManager", "An error occurred while running a task: \n" + Log.getStackTraceString(th2));
                        List<sg.bigo.ads.common.n.a> list = d.f82249a;
                        if (list != null) {
                            Iterator<sg.bigo.ads.common.n.a> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().a(th2);
                            }
                        }
                    }
                }
                if (d.f82257i != null) {
                    d.f82257i.removeCallbacks(runnable3);
                }
                if (this.f82261b != null) {
                    if (this.f82262c || looperMyLooper == d.f82256h.getLooper()) {
                        d.f82256h.post(this.f82261b);
                    } else {
                        new Handler(looperMyLooper).post(this.f82261b);
                    }
                }
            }
        };
        Runnable runnable3 = new Runnable() { // from class: sg.bigo.ads.common.n.d.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f82266a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f82267b = false;

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f82266a == null) {
                    runnable2.run();
                } else if (this.f82267b || looperMyLooper == d.f82256h.getLooper()) {
                    d.f82256h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass2.this.f82266a.run();
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            bVar.post(runnable2);
                        }
                    });
                } else {
                    new Handler(looperMyLooper).post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass2.this.f82266a.run();
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            bVar.post(runnable2);
                        }
                    });
                }
            }
        };
        WeakHashMap<Object, a> weakHashMap = f82258j;
        synchronized (weakHashMap) {
            weakHashMap.put(runnable, new a(runnable3, Integer.valueOf(i10)));
        }
        bVar.postDelayed(runnable3, j10);
    }

    public static void b(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            b(2, runnable, 0L);
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static synchronized void g() {
        if (f82250b == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Background", 10);
            f82250b = handlerThread;
            handlerThread.start();
            f82251c = new b("BGAd-Background", f82250b.getLooper());
        }
    }

    private static synchronized void h() {
        if (f82252d == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Work", 5);
            f82252d = handlerThread;
            handlerThread.start();
            f82253e = new b("BGAd-Work", f82252d.getLooper());
        }
    }

    private static synchronized void i() {
        if (f82254f == null) {
            HandlerThread handlerThread = new HandlerThread("BGAd-Normal", 0);
            f82254f = handlerThread;
            handlerThread.start();
            f82255g = new b("BGAd-Normal", f82254f.getLooper());
        }
    }

    private static synchronized void j() {
        if (f82256h == null) {
            f82256h = new b("BGAd-Background.Main + 38", Looper.getMainLooper());
        }
    }
}
