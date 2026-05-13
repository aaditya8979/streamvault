package com.mbridge.msdk.config.component.nori.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: MonitorNetworkRequestTimeout.java */
/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36319b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f36320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HandlerThread f36321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f36322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f36323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f36324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.b f36325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.b f36326i;

    /* JADX INFO: compiled from: MonitorNetworkRequestTimeout.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("MonitorNetworkTimeout", "超时结束触发");
            if (b.this.f36323f != null && !b.this.f36324g.h()) {
                b.this.a();
                b.this.f36323f.d(b.this.f36324g);
            }
            b.this.e();
        }
    }

    public b(long j10) {
        if (this.f36318a < 0) {
            this.f36318a = 30L;
        } else {
            this.f36318a = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (this.f36325h != null) {
                q0.c("MonitorNetworkTimeout", "取消网络请求");
                this.f36325h.a();
            }
            if (this.f36326i != null) {
                q0.c("MonitorNetworkTimeout", "取消重试任务");
                this.f36326i.a();
            }
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "取消任务时发生异常：" + e10.getMessage());
        }
    }

    private void c() {
        this.f36322e = new a();
    }

    public void a(com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f36323f = aVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.b bVar) {
        this.f36325h = bVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        this.f36324g = aVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.b bVar) {
        this.f36326i = bVar;
    }

    public void b() {
        try {
            e();
            Handler handler = this.f36320c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f36320c = null;
            }
            HandlerThread handlerThread = this.f36321d;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f36321d.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorNetworkTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorNetworkTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f36321d = null;
                }
                this.f36322e = null;
                this.f36319b = false;
                q0.c("MonitorNetworkTimeout", "MonitorNetworkTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f36321d = null;
                throw th2;
            }
        } catch (Exception e12) {
            q0.b("MonitorNetworkTimeout", "销毁MonitorNetworkTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void d() {
        Runnable runnable;
        if (this.f36319b) {
            q0.d("MonitorNetworkTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f36319b = true;
        try {
            HandlerThread handlerThread = new HandlerThread("NetComponentThread");
            this.f36321d = handlerThread;
            handlerThread.start();
            this.f36320c = new Handler(this.f36321d.getLooper());
            c();
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f36320c = new Handler(Looper.getMainLooper());
            c();
        }
        if (this.f36320c == null) {
            e();
            com.mbridge.msdk.config.component.common.network.a aVar = this.f36323f;
            if (aVar != null) {
                aVar.d(this.f36324g);
            }
        }
        q0.c("MonitorNetworkTimeout", "开始网络请求，超时时间：" + this.f36318a + "ms");
        Handler handler = this.f36320c;
        if (handler == null || (runnable = this.f36322e) == null) {
            return;
        }
        handler.postDelayed(runnable, this.f36318a * 1000);
    }

    public void e() {
        Runnable runnable;
        if (this.f36319b) {
            this.f36319b = false;
            Handler handler = this.f36320c;
            if (handler != null && (runnable = this.f36322e) != null) {
                handler.removeCallbacks(runnable);
            }
            q0.c("MonitorNetworkTimeout", "停止net超时监控");
        }
    }
}
