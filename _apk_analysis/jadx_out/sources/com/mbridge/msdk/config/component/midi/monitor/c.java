package com.mbridge.msdk.config.component.midi.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;

/* JADX INFO: compiled from: MonitorPlayerTimeout.java */
/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f36256c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f36260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HandlerThread f36261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f36262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f36263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f36264k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f36266m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36257d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36258e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36259f = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36265l = 0;

    /* JADX INFO: compiled from: MonitorPlayerTimeout.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: MonitorPlayerTimeout.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f36264k != null) {
                c.this.f36264k.a("播放超时：从创建到第一帧播放超过 " + c.this.f36255b + "ms");
            }
            c.this.g();
        }
    }

    public c(int i10, String str) {
        this.f36254a = 3;
        this.f36266m = str;
        this.f36255b = i10 > 0 ? i10 : 3000L;
        this.f36254a = i10 / 1000;
        try {
            HandlerThread handlerThread = new HandlerThread("PlayerComponentThread");
            this.f36261h = handlerThread;
            handlerThread.start();
            this.f36260g = new Handler(this.f36261h.getLooper());
            d();
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f36260g = new Handler(Looper.getMainLooper());
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (!this.f36257d || this.f36258e || TextUtils.isEmpty(this.f36266m)) {
            q0.b("MonitorPlayerTimeout", "check 条件 不满足");
            return;
        }
        try {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                this.f36265l++;
                q0.d("MonitorPlayerTimeout", "检查本地地址次数 " + this.f36265l);
                if (this.f36265l >= this.f36254a) {
                    q0.d("MonitorPlayerTimeout", "检查本地地址次数已达上限，停止检查");
                    return;
                }
                Handler handler = this.f36260g;
                if (handler == null || (runnable2 = this.f36262i) == null) {
                    return;
                }
                handler.postDelayed(runnable2, 1000L);
                return;
            }
            this.f36258e = true;
            q0.c("MonitorPlayerTimeout", "本地视频地址准备完成：" + strC);
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f36264k;
            if (aVar != null) {
                aVar.b(strC);
            }
            Handler handler2 = this.f36260g;
            if (handler2 == null || (runnable3 = this.f36262i) == null) {
                return;
            }
            handler2.removeCallbacks(runnable3);
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "检查本地地址异常：" + e10.getMessage());
            Handler handler3 = this.f36260g;
            if (handler3 == null || (runnable = this.f36262i) == null) {
                return;
            }
            handler3.postDelayed(runnable, 1000L);
        }
    }

    private String c() {
        try {
            if (this.f36266m.startsWith(AdPayload.FILE_SCHEME) || this.f36266m.startsWith("/")) {
                File file = new File(this.f36266m.replace(AdPayload.FILE_SCHEME, ""));
                if (file.exists() && file.isFile()) {
                    return this.f36266m;
                }
            }
            if (this.f36266m.startsWith("http")) {
                com.mbridge.msdk.config.component.common.file.b bVarE = com.mbridge.msdk.config.component.common.file.a.e(this.f36266m);
                String strA = bVarE != null ? bVarE.a() : "";
                File file2 = new File(strA.replace(AdPayload.FILE_SCHEME, ""));
                if (file2.exists() && file2.isFile()) {
                    return strA;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "获取本地视频地址异常：" + e10.getMessage());
            return null;
        }
    }

    private void d() {
        this.f36262i = new a();
        this.f36263j = new b();
    }

    public void a(com.mbridge.msdk.config.component.midi.monitor.a aVar) {
        this.f36264k = aVar;
    }

    public void b() {
        try {
            g();
            Handler handler = this.f36260g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f36260g = null;
            }
            HandlerThread handlerThread = this.f36261h;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f36261h.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorPlayerTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorPlayerTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f36261h = null;
                }
                this.f36262i = null;
                this.f36263j = null;
                this.f36264k = null;
                this.f36257d = false;
                this.f36258e = false;
                this.f36259f = false;
                this.f36265l = 0;
                q0.c("MonitorPlayerTimeout", "MonitorPlayerTimeout资源已完全清理");
            } catch (Throwable th2) {
                this.f36261h = null;
                throw th2;
            }
        } catch (Exception e12) {
            q0.b("MonitorPlayerTimeout", "销毁MonitorPlayerTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void e() {
        Runnable runnable;
        if (!this.f36257d || this.f36259f) {
            return;
        }
        this.f36259f = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f36256c;
        q0.c("MonitorPlayerTimeout", "第一帧播放完成，耗时：" + jCurrentTimeMillis + "ms");
        Handler handler = this.f36260g;
        if (handler != null && (runnable = this.f36263j) != null) {
            handler.removeCallbacks(runnable);
        }
        if (jCurrentTimeMillis > this.f36255b) {
            q0.d("MonitorPlayerTimeout", "播放超时，但第一帧已播放，耗时：" + jCurrentTimeMillis + "ms");
        }
        g();
    }

    public void f() {
        Runnable runnable;
        if (this.f36260g == null) {
            g();
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f36264k;
            if (aVar != null) {
                aVar.a(" playerHandler 异常 ");
            }
        }
        if (this.f36257d) {
            q0.d("MonitorPlayerTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f36257d = true;
        this.f36258e = false;
        this.f36259f = false;
        this.f36265l = 0;
        this.f36256c = System.currentTimeMillis();
        q0.c("MonitorPlayerTimeout", "开始播放超时监控，超时时间：" + this.f36255b + "ms");
        Handler handler = this.f36260g;
        if (handler != null && (runnable = this.f36263j) != null) {
            handler.postDelayed(runnable, this.f36255b);
        }
        a();
    }

    public void g() {
        if (this.f36257d) {
            this.f36257d = false;
            Handler handler = this.f36260g;
            if (handler != null) {
                Runnable runnable = this.f36262i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.f36263j;
                if (runnable2 != null) {
                    this.f36260g.removeCallbacks(runnable2);
                }
            }
            q0.c("MonitorPlayerTimeout", "停止播放超时监控");
        }
    }
}
