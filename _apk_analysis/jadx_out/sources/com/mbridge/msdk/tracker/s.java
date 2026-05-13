package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.ironsource.Z7;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: ReportManager.java */
/* JADX INFO: loaded from: classes9.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f41117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f41121e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f41125i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicInteger f41122f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicInteger f41123g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f41124h = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41126j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f41127k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f41128l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f41129m = false;

    /* JADX INFO: compiled from: ReportManager.java */
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f41130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s f41131b;

        public a(Handler handler, s sVar) {
            this.f41130a = handler;
            this.f41131b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.f41131b.b(tVar.a());
            this.f41131b.i();
            this.f41131b.f41127k = 0L;
            if (this.f41131b.f()) {
                Handler handler = this.f41130a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.f40902a) {
                Log.d("TrackManager", this.f41131b.f41121e.v() + " report success " + tVar.a().size() + " 剩余事件数：" + this.f41131b.f41123g.addAndGet(0) + " 个，数据库记录数：" + this.f41131b.f41117a.b() + " 个");
            }
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i10, String str) {
            this.f41131b.a(tVar.a(), str);
            this.f41131b.f41127k = System.currentTimeMillis();
            int iD = this.f41131b.d();
            if (iD <= 10) {
                this.f41130a.removeMessages(3);
                Handler handler = this.f41130a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), ((long) iD) * 1000);
            }
            if (com.mbridge.msdk.tracker.a.f40902a) {
                Log.d("TrackManager", this.f41131b.f41121e.v() + " report failed " + tVar.a().size() + " 剩余事件数：" + this.f41131b.f41123g.addAndGet(0) + " 个，数据库记录数：" + this.f41131b.f41117a.b() + " 个 连续失败次数： " + iD);
            }
        }
    }

    /* JADX INFO: compiled from: ReportManager.java */
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f41132a;

        public b(Looper looper, s sVar) {
            super(looper);
            this.f41132a = sVar;
        }

        private synchronized void a() {
            try {
                this.f41132a.h();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f40902a) {
                    Log.e("TrackManager", this.f41132a.f41121e.v() + " report failed ", e10);
                }
            }
        }

        private void a(String str) {
            Log.d("TrackManager", this.f41132a.f41121e.v() + Z7.f30794r + str + this.f41132a.f41123g.addAndGet(0) + " 数据库记录数：" + this.f41132a.f41117a.b());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f40902a) {
                    Log.e("TrackManager", this.f41132a.f41121e.v() + " removeMessages failed ", e10);
                }
            }
            if (this.f41132a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.f41132a.f41122f.get(), this.f41132a.f41127k, this.f41132a.f41119c));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f40902a) {
                    Log.e("TrackManager", this.f41132a.f41121e.v() + " sendMessageDelayed failed ", e11);
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i10 = message.what;
            if (i10 == 2 || i10 == 3) {
                b();
                if (com.mbridge.msdk.tracker.a.f40902a) {
                    a("触发上报（report result）当前 Event 数量：");
                }
                a();
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.tracker.a.f40902a) {
                    a("触发删除 当前 Event 数量：");
                }
                this.f41132a.a();
                sendMessageDelayed(Message.obtain(this, 5), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                return;
            }
            if (i10 != 6) {
                if (i10 != 7) {
                    b();
                    if (com.mbridge.msdk.tracker.a.f40902a) {
                        a("触发上报（timer）当前 Event 数量：");
                    }
                    a();
                    return;
                }
                this.f41132a.k();
                b();
                if (com.mbridge.msdk.tracker.a.f40902a) {
                    a("触发上报（flush）当前 Event 数量：");
                }
                a();
                return;
            }
            Object obj = message.obj;
            e eVar = obj instanceof e ? (e) obj : null;
            if (com.mbridge.msdk.tracker.a.f40902a && !y.b(eVar)) {
                a(String.format("收到 Event( %s )，当前 Event 数量：", eVar.g()));
            }
            if (y.a(eVar) || this.f41132a.f()) {
                b();
                if (com.mbridge.msdk.tracker.a.f40902a) {
                    a("触发上报（notice check）当前 Event 数量：");
                }
                a();
            }
        }
    }

    public s(k kVar) {
        this.f41117a = kVar.d();
        this.f41118b = kVar.i();
        this.f41119c = kVar.l();
        this.f41120d = kVar.j();
        this.f41121e = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.mbridge.msdk.tracker.a.f40902a) {
            return;
        }
        int iA = this.f41117a.a();
        if (com.mbridge.msdk.tracker.a.f40902a) {
            Log.d("TrackManager", this.f41121e.v() + " 删除无效数据的数量 = " + iA + " 当前剩余事件数 = " + this.f41123g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f41117a.b());
        }
    }

    private void a(List<i> list) {
        this.f41117a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i> list, String str) {
        if (y.b((List<?>) list)) {
            return;
        }
        int i10 = 0;
        for (i iVar : list) {
            if (!y.b(iVar)) {
                boolean z10 = !iVar.l() && iVar.h() >= this.f41120d;
                boolean z11 = !iVar.m() && iVar.g() < System.currentTimeMillis();
                if (z10 || z11) {
                    iVar.b(-1);
                } else {
                    iVar.a(iVar.h() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i10++;
                }
            }
        }
        this.f41117a.a(list);
        this.f41123g.addAndGet(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.f41117a.c(list);
    }

    private List<i> c() {
        return this.f41117a.a(this.f41118b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return this.f41122f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<i> listC = c();
        if (y.b((List<?>) listC)) {
            if (com.mbridge.msdk.tracker.a.f40902a) {
                Log.d("TrackManager", this.f41121e.v() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        a(listC);
        int size = listC.size();
        this.f41123g.addAndGet(-size);
        boolean zA = false;
        if (com.mbridge.msdk.tracker.a.f40902a) {
            Log.d("TrackManager", this.f41121e.v() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + this.f41123g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f41117a.b());
        }
        try {
            zA = this.f41121e.a();
        } catch (IllegalStateException e10) {
            if (com.mbridge.msdk.tracker.a.f40902a) {
                Log.e("TrackManager", this.f41121e.v() + " report environment check failed ", e10);
            }
        }
        if (!zA) {
            if (com.mbridge.msdk.tracker.a.f40902a) {
                Log.e("TrackManager", this.f41121e.v() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        o oVarM = this.f41121e.m();
        oVarM.a(new a(this.f41125i, this));
        Map<String, String> map = new HashMap<>();
        try {
            map = this.f41121e.f().a(this.f41121e.u(), listC, this.f41121e.o());
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f40902a) {
                Log.e("TrackManager", this.f41121e.v() + " report decorate request params failed ", e11);
            }
        }
        oVarM.b(new t(listC), map, y.a(listC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f41122f.set(0);
    }

    private void l() {
        this.f41117a.c();
    }

    public void a(e eVar) {
        if (this.f41125i.hasMessages(6)) {
            return;
        }
        long jA = y.a(this.f41122f.get(), this.f41127k, this.f41119c);
        if (jA > this.f41119c) {
            Handler handler = this.f41125i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (jA * 0.1f));
        } else {
            Handler handler2 = this.f41125i;
            handler2.sendMessage(Message.obtain(handler2, 6, eVar));
        }
    }

    public void b() {
        this.f41125i.removeMessages(1);
        Handler handler = this.f41125i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public void e() {
        this.f41123g.incrementAndGet();
    }

    public boolean f() {
        return this.f41123g.addAndGet(0) >= this.f41118b;
    }

    public boolean g() {
        return this.f41126j;
    }

    public void j() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f41125i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f41125i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f41119c);
        this.f41126j = false;
    }

    public void k() {
        synchronized (this.f41124h) {
            if (!this.f41128l) {
                this.f41128l = true;
                l();
            }
            if (!this.f41129m) {
                this.f41129m = true;
                this.f41123g.addAndGet(this.f41117a.b());
            }
        }
    }
}
