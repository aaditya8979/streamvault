package ar;

import com.ironsource.C3978d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sq.h;

/* JADX INFO: compiled from: QueuedThreadPool.java */
/* JADX INFO: loaded from: classes12.dex */
public class b extends uq.a implements d, Executor, uq.e {
    public static final vq.c A = vq.b.a(b.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BlockingQueue<Runnable> f5268p;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f5263k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f5264l = new AtomicInteger();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicLong f5265m = new AtomicLong();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h<Thread> f5266n = new h<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f5267o = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5270r = 60000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5271s = 254;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5272t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5273u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5274v = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5275w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5276x = 100;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5277y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Runnable f5278z = new c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f5269q = "qtp" + super.hashCode();

    /* JADX INFO: compiled from: QueuedThreadPool.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: ar.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: QueuedThreadPool.java */
    public class C0119b implements uq.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Thread f5280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f5281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ StackTraceElement[] f5282d;

        public C0119b(Thread thread, boolean z10, StackTraceElement[] stackTraceElementArr) {
            this.f5280b = thread;
            this.f5281c = z10;
            this.f5282d = stackTraceElementArr;
        }

        @Override // uq.e
        public void w(Appendable appendable, String str) throws IOException {
            appendable.append(String.valueOf(this.f5280b.getId())).append(' ').append(this.f5280b.getName()).append(' ').append(this.f5280b.getState().toString()).append(this.f5281c ? " IDLE" : "").append('\n');
            if (this.f5281c) {
                return;
            }
            uq.b.p0(appendable, str, Arrays.asList(this.f5282d));
        }
    }

    /* JADX INFO: compiled from: QueuedThreadPool.java */
    public class c implements Runnable {
        public c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 332
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ar.b.c.run():void");
        }
    }

    public Thread A0(Runnable runnable) {
        return new Thread(runnable);
    }

    @Override // ar.d
    public boolean B() {
        return this.f5263k.get() == this.f5271s && this.f5268p.size() >= this.f5264l.get();
    }

    public void B0(Runnable runnable) {
        runnable.run();
    }

    public void C0(boolean z10) {
        this.f5275w = z10;
    }

    public void D0(int i10) {
        this.f5271s = i10;
        if (this.f5272t > i10) {
            this.f5272t = i10;
        }
    }

    public void E0(String str) {
        if (isRunning()) {
            throw new IllegalStateException(C3978d4.i.f31332d0);
        }
        this.f5269q = str;
    }

    public final boolean F0(int i10) {
        if (!this.f5263k.compareAndSet(i10, i10 + 1)) {
            return false;
        }
        try {
            Thread threadA0 = A0(this.f5278z);
            threadA0.setDaemon(this.f5275w);
            threadA0.setPriority(this.f5274v);
            threadA0.setName(this.f5269q + "-" + threadA0.getId());
            this.f5266n.add(threadA0);
            threadA0.start();
            return true;
        } catch (Throwable th2) {
            this.f5263k.decrementAndGet();
            throw th2;
        }
    }

    @Override // ar.d
    public boolean Z(Runnable runnable) {
        int i10;
        if (isRunning()) {
            int size = this.f5268p.size();
            int iV0 = v0();
            if (this.f5268p.offer(runnable)) {
                if ((iV0 == 0 || size > iV0) && (i10 = this.f5263k.get()) < this.f5271s) {
                    F0(i10);
                }
                return true;
            }
        }
        A.h("Dispatched {} to stopped {}", runnable, this);
        return false;
    }

    @Override // uq.a
    public void d0() throws Exception {
        BlockingQueue<Runnable> eVar;
        super.d0();
        this.f5263k.set(0);
        if (this.f5268p == null) {
            if (this.f5273u > 0) {
                eVar = new ArrayBlockingQueue<>(this.f5273u);
            } else {
                int i10 = this.f5272t;
                eVar = new sq.e<>(i10, i10);
            }
            this.f5268p = eVar;
        }
        int i11 = this.f5263k.get();
        while (isRunning() && i11 < this.f5272t) {
            F0(i11);
            i11 = this.f5263k.get();
        }
    }

    @Override // uq.a
    public void e0() throws Exception {
        super.e0();
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (this.f5263k.get() > 0 && System.currentTimeMillis() - jCurrentTimeMillis < this.f5276x / 2) {
            Thread.sleep(1L);
        }
        this.f5268p.clear();
        a aVar = new a();
        int i10 = this.f5264l.get();
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            this.f5268p.offer(aVar);
            i10 = i11;
        }
        Thread.yield();
        if (this.f5263k.get() > 0) {
            Iterator<Thread> it = this.f5266n.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        while (this.f5263k.get() > 0 && System.currentTimeMillis() - jCurrentTimeMillis < this.f5276x) {
            Thread.sleep(1L);
        }
        Thread.yield();
        int size = this.f5266n.size();
        if (size > 0) {
            vq.c cVar = A;
            cVar.f(size + " threads could not be stopped", new Object[0]);
            if (size == 1 || cVar.isDebugEnabled()) {
                for (Thread thread : this.f5266n) {
                    A.i("Couldn't stop " + thread, new Object[0]);
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    int length = stackTrace.length;
                    for (int i12 = 0; i12 < length; i12++) {
                        StackTraceElement stackTraceElement = stackTrace[i12];
                        A.i(" at " + stackTraceElement, new Object[0]);
                    }
                }
            }
        }
        synchronized (this.f5267o) {
            this.f5267o.notifyAll();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!Z(runnable)) {
            throw new RejectedExecutionException();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5269q);
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d);
        sb2.append(x0());
        sb2.append("<=");
        sb2.append(v0());
        sb2.append("<=");
        sb2.append(y0());
        sb2.append("/");
        sb2.append(w0());
        sb2.append(StringUtils.COMMA);
        BlockingQueue<Runnable> blockingQueue = this.f5268p;
        sb2.append(blockingQueue == null ? -1 : blockingQueue.size());
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e);
        return sb2.toString();
    }

    public int v0() {
        return this.f5264l.get();
    }

    @Override // uq.e
    public void w(Appendable appendable, String str) throws IOException {
        ArrayList arrayList = new ArrayList(w0());
        Iterator<Thread> it = this.f5266n.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                uq.b.q0(appendable, this);
                uq.b.p0(appendable, str, arrayList);
                return;
            }
            Thread next = it.next();
            StackTraceElement[] stackTrace = next.getStackTrace();
            if (stackTrace != null) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if ("idleJobPoll".equals(stackTraceElement.getMethodName())) {
                        break;
                    }
                }
                z10 = false;
            } else {
                z10 = false;
            }
            if (this.f5277y) {
                arrayList.add(new C0119b(next, z10, stackTrace));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(next.getId());
                sb2.append(Z7.f30794r);
                sb2.append(next.getName());
                sb2.append(Z7.f30794r);
                sb2.append(next.getState());
                sb2.append(" @ ");
                sb2.append(stackTrace.length > 0 ? stackTrace[0] : "???");
                sb2.append(z10 ? " IDLE" : "");
                arrayList.add(sb2.toString());
            }
        }
    }

    public int w0() {
        return this.f5271s;
    }

    public int x0() {
        return this.f5272t;
    }

    public int y0() {
        return this.f5263k.get();
    }

    public final Runnable z0() throws InterruptedException {
        return this.f5268p.poll(this.f5270r, TimeUnit.MILLISECONDS);
    }
}
