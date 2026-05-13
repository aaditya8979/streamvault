package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.m;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: CampaignDownLoadTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements Serializable {
    private int A;
    private File B;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private com.mbridge.msdk.setting.l H;
    private com.mbridge.msdk.videocommon.setting.c I;
    private com.mbridge.msdk.setting.l J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42283c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f42287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f42288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CampaignEx f42289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f42290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f42291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f42292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f42293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42294n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f42296p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f42298r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private m f42301u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f42303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private DownloadRequest f42304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f42305y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f42306z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42281a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42284d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f42285e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> f42286f = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f42295o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f42297q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f42299s = 100;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f42300t = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f42302v = false;
    private int C = 1;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private OnDownloadStateListener R = new b();
    private OnProgressStateListener S = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CampaignDownLoadTask.java */
    public class RunnableC0531a implements Runnable {
        public RunnableC0531a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f42301u == null) {
                a.this.f42301u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            try {
                try {
                    a.this.f42301u.a(a.this.f42293m);
                    if (!s0.a().a("r_d_v_b_l", true)) {
                        File file = new File(a.this.f42296p);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                } finally {
                    a.this.f42285e = 0;
                }
            } catch (Throwable unused) {
                q0.b("CampaignDownLoadTask", "del DB or file failed");
            }
        }
    }

    /* JADX INFO: compiled from: CampaignDownLoadTask.java */
    public class b implements OnDownloadStateListener {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                q0.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f42295o + "    " + a.this.f42292l);
                if (a.this.f42301u == null) {
                    a.this.f42301u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                }
                a.this.f42301u.a(a.this.f42293m, a.this.f42295o, 5, a.this.f42292l);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th2) {
                        q0.b("CampaignDownLoadTask", th2.getMessage());
                        str = "";
                    }
                } else {
                    str = "";
                }
                a aVar = a.this;
                aVar.a(aVar.f42295o, true, str);
                a.this.a(1, true, "");
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            if (a.this.f42304x == null || a.this.f42304x.getStatus() == DownloadStatus.CANCELLED) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", a.this.f42304x.get("cache", "2"));
            a aVar = a.this;
            aVar.a(aVar.f42289i, eVar);
            String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
            a.this.r();
            a.this.a(3, message, "");
            a.this.b(message);
            a aVar2 = a.this;
            aVar2.a(3, aVar2.f42306z, message);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f42285e = 1;
            if (a.this.f42301u == null) {
                a.this.f42301u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            a.this.f42301u.a(a.this.f42289i, a.this.f42292l, a.this.f42296p, a.this.f42285e);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    /* JADX INFO: compiled from: CampaignDownLoadTask.java */
    public class c implements OnProgressStateListener {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", a.this.f42304x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f42289i, eVar);
                a.this.f42295o = downloadProgress.getCurrent();
                a.this.f42292l = downloadProgress.getTotal();
                a.this.f42305y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f42299s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f42299s) {
                    q0.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f42299s + Z7.f30794r + a.this.f42283c);
                    if (a.this.f42284d) {
                        return;
                    }
                    a.this.f42284d = true;
                    if (!a.this.f42306z) {
                        a.this.a(1, true, "");
                        a.this.a(downloadProgress.getCurrent(), false, "");
                    }
                    if (a.this.f42304x == null || a.this.C != 2 || a.this.f42306z) {
                        return;
                    }
                    a.this.f42304x.cancel(downloadMessage);
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }
    }

    public a(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f42282b = 1;
        this.G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarB != null) {
            this.G = gVarB.E0();
        }
        this.D = com.mbridge.msdk.foundation.same.a.f37712u;
        this.E = com.mbridge.msdk.foundation.same.a.f37713v;
        this.F = com.mbridge.msdk.foundation.same.a.f37711t;
        this.f42298r = System.currentTimeMillis();
        this.f42291k = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f42289i = campaignEx;
        this.f42290j = str;
        this.f42282b = i10;
        if (campaignEx != null) {
            this.f42293m = campaignEx.getVideoUrlEncode();
        }
        this.f42303w = o0.d(this.f42293m);
        this.f42294n = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC) + File.separator;
        this.f42296p = this.f42294n + this.f42303w;
        q0.c("CampaignDownLoadTask", this.f42289i.getAppName() + " videoLocalPath:" + this.f42296p + " videoUrl: " + this.f42289i.getVideoUrlEncode() + Z7.f30794r + this.f42299s);
        q();
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAabEntity() != null) {
                    return campaignEx.getAabEntity().h3c;
                }
            } catch (Throwable th2) {
                q0.b("CampaignDownLoadTask", th2.getMessage());
            }
        }
        return 0;
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.D).withConnectTimeout(this.F).withWriteTimeout(this.E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f42294n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).withTimeout(60000L).with("do_us_fi_re", Boolean.toString(this.G)).with("download_scene", "download_video").with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f42299s)).with("scenes", str).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, String str2) {
        n nVar = new n(this.f42291k, this.f42289i, i10, Long.toString(this.f42298r != 0 ? System.currentTimeMillis() - this.f42298r : 0L), this.f42292l, this.A);
        nVar.b(this.f42289i.getId());
        nVar.v(this.f42289i.getVideoUrlEncode());
        nVar.m(str);
        nVar.n(this.f42289i.getRequestId());
        nVar.k(this.f42289i.getCurrentLocalRid());
        nVar.o(this.f42289i.getRequestIdNotice());
        nVar.u(this.f42290j);
        nVar.q(str2);
        nVar.b(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f42299s));
        nVar.b("url", this.f42289i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f42304x;
        if (downloadRequest != null) {
            nVar.b("scenes", downloadRequest.get("scenes", ""));
            nVar.b("resumed_breakpoint", this.f42304x.get("resumed_breakpoint", ""));
        }
        int i11 = this.A;
        if (i11 == 94 || i11 == 287) {
            return;
        }
        com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, boolean z10, String str) {
        if (this.P) {
            return;
        }
        try {
            this.P = true;
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            DownloadRequest downloadRequest = this.f42304x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", ""));
                eVar.a("url", this.f42293m);
                eVar.a("resumed_breakpoint", this.f42304x.get("resumed_breakpoint", ""));
                eVar.a("h3c", "");
            }
            eVar.a("resource_type", 4);
            eVar.a("file_size", Long.valueOf(this.f42292l));
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f42299s));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("reason", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_end", this.f42289i, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(long j10, int i10) {
        this.f42295o = j10;
        int i11 = this.f42299s;
        if (100 * j10 >= ((long) i11) * this.f42292l && !this.f42300t && i10 != 4) {
            if (i11 == 100 && i10 != 5) {
                this.f42285e = 5;
                return;
            }
            this.f42300t = true;
            q0.b("CampaignDownLoadTask", "UpdateListener : state: " + i10 + " progress : " + j10);
            String strK = k();
            if (TextUtils.isEmpty(strK)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f42287g;
                if (aVar != null) {
                    aVar.a(this.f42293m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f42288h;
                if (aVar2 != null) {
                    aVar2.a(this.f42293m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f42287g;
                if (aVar3 != null) {
                    aVar3.a("file is not effective " + strK, this.f42293m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f42288h;
                if (aVar4 != null) {
                    aVar4.a("file is not effective " + strK, this.f42293m);
                }
            }
        }
        if (!this.f42281a && j10 > 0) {
            this.f42281a = true;
            if (this.f42301u == null) {
                this.f42301u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            this.f42301u.a(this.f42293m, j10, this.f42285e, this.f42292l);
        }
        CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> copyOnWriteArrayList = this.f42286f;
        if (copyOnWriteArrayList != null) {
            for (com.mbridge.msdk.videocommon.download.c cVar : copyOnWriteArrayList) {
                if (cVar != null) {
                    cVar.onProgress(j10, i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (this.O || campaignEx == null || eVar == null) {
            return;
        }
        this.O = true;
        try {
            eVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f42304x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", "1"));
                eVar.a("resumed_breakpoint", this.f42304x.get("resumed_breakpoint", "2"));
            } else {
                eVar.a("scenes", "1");
                eVar.a("resumed_breakpoint", "1");
            }
            eVar.a("url", campaignEx.getVideoUrlEncode());
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(c(campaignEx)));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    private int b(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.J;
            if (lVar != null) {
                return lVar.C();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }
        return 100;
    }

    private int c(CampaignEx campaignEx) {
        int iD;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            iD = campaignEx.getReady_rate();
            q0.a("CampaignDownLoadTask", "ready_rate(campaign): " + iD);
        } else {
            iD = d(campaignEx);
            q0.a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + iD);
        }
        try {
            return Math.max(iD, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.H == null) {
                    this.H = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f42290j);
                }
                return this.H.C();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.J == null) {
                    this.J = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f42290j);
                }
                return b((CampaignEx) null);
            }
            if (this.I == null) {
                this.I = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f42290j, false);
            }
            return this.I.w();
        } catch (Throwable th2) {
            q0.b("CampaignDownLoadTask", th2.getMessage(), th2);
            return 100;
        }
    }

    private void d() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0531a());
    }

    private void q() {
        File file;
        try {
            if (TextUtils.isEmpty(this.f42293m)) {
                return;
            }
            File file2 = null;
            if (!TextUtils.isEmpty(this.f42294n)) {
                file2 = new File(this.f42294n);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
            if (file2 != null && file2.exists() && ((file = this.B) == null || !file.exists())) {
                File file3 = new File(file2 + "/.nomedia");
                this.B = file3;
                if (!file3.exists()) {
                    this.B.createNewFile();
                }
            }
            z();
            a(this.f42293m);
        } catch (Exception e10) {
            q0.c("CampaignDownLoadTask", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            v0.a(this.f42290j, this.f42289i, com.mbridge.msdk.foundation.same.a.f37715x);
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    private void z() {
        if (this.f42301u == null) {
            this.f42301u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        com.mbridge.msdk.foundation.entity.m mVarB = this.f42301u.b(this.f42293m, "");
        if (mVarB != null) {
            this.f42295o = mVarB.c();
            if (this.f42285e != 2) {
                this.f42285e = mVarB.b();
            }
            if (this.f42285e == 1) {
                this.f42285e = 2;
            }
            this.f42292l = mVarB.d();
            if (mVarB.a() > 0) {
                this.f42298r = mVarB.a();
            }
            if (this.f42285e == 5) {
                if (Objects.exists(new File(this.f42294n + this.f42303w), this.f42294n, this.f42303w)) {
                    this.f42296p = this.f42294n + this.f42303w;
                } else {
                    d();
                }
            } else if (this.f42285e != 0) {
                this.f42296p = this.f42294n + this.f42303w;
            }
        } else {
            this.f42301u.a(this.f42293m, this.f42298r);
        }
        try {
            long j10 = this.f42292l;
            if (j10 <= 0 || this.f42295o * 100 < j10 * ((long) c(this.f42289i))) {
                return;
            }
            if (c(this.f42289i) == 100 || this.f42285e == 5) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                a(this.f42289i, eVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void A() {
        if (this.Q) {
            return;
        }
        try {
            this.f42306z = true;
            if (this.C == 1) {
                q0.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.C);
                return;
            }
            if (this.f42282b == 3) {
                q0.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f42282b);
                return;
            }
            q0.b("CampaignDownLoadTask", "resume()");
            this.O = false;
            this.P = false;
            DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f42293m, this.f42303w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(a(this.f42289i));
            DownloadRequest<?> downloadRequestA = a(downloadMessage, this.R, this.S, "2");
            this.f42304x = downloadRequestA;
            downloadRequestA.start();
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    public void B() {
        q0.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f42293m)) {
                return;
            }
            if (i() != null) {
                q0.b("CampaignDownLoadTask", new URL(i()).getPath());
            }
            if (this.f42299s == 0 && this.C == 2) {
                q0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f42304x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f42287g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f42288h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public void C() {
        q0.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f42293m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f42287g;
                if (aVar != null) {
                    aVar.a(this.f42293m);
                    return;
                }
                return;
            }
            if (i() != null) {
                q0.b("CampaignDownLoadTask", new URL(i()).getPath());
            }
            if (this.f42282b == 3) {
                q0.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f42287g;
                if (aVar2 != null) {
                    aVar2.a(this.f42293m);
                    return;
                }
                return;
            }
            if (this.f42299s == 0 && this.C == 2) {
                q0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f42287g;
                if (aVar3 != null) {
                    aVar3.a(this.f42293m);
                    return;
                }
                return;
            }
            try {
                if (this.f42285e == 5 && Utils.getDownloadRate(this.f42292l, this.f42295o) >= this.f42299s) {
                    if (Objects.exists(new File(this.f42294n + this.f42303w), this.f42294n, this.f42303w)) {
                        this.f42296p = this.f42294n + this.f42303w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f42287g;
                        if (aVar4 != null) {
                            aVar4.a(this.f42293m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", "startForLoadRefactor: " + e10.getMessage());
            }
            DownloadRequest downloadRequest = this.f42304x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f42287g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public void a(int i10) {
        this.A = i10;
    }

    public void a(int i10, int i11) {
        this.f42285e = i10;
        if (this.f42301u == null) {
            this.f42301u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        this.f42301u.a(this.f42293m, i11, i10, this.f42292l);
    }

    public void a(long j10, boolean z10, String str) {
        q0.b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.f42295o + "  progressSize " + j10 + "  " + this.f42305y + "%   FileSize : " + this.f42292l + "  " + this.f42289i.getAppName());
        if (this.f42299s != 100 || this.f42282b == 3 || j10 == this.f42292l || z10) {
            this.f42285e = 5;
            if (j10 == this.f42292l) {
                a(1, "", str);
            }
            this.f42281a = false;
            a(j10, this.f42285e);
            return;
        }
        File file = new File(this.f42296p);
        q0.b("CampaignDownLoadTask", "progressSize = " + j10 + " fileSize = " + this.f42292l + Z7.f30794r + z10 + " absFileSize = " + (Objects.exists(file, this.f42294n, this.f42303w) ? file.length() : 0L));
        b("File size is not match witch download size.");
    }

    public void a(com.mbridge.msdk.videocommon.download.c cVar) {
        CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> copyOnWriteArrayList = this.f42286f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f42287g = aVar;
    }

    public void a(String str) {
        int iC;
        if (TextUtils.isEmpty(str)) {
            this.f42288h.a("VideoUrl is NULL, Please check it.", "");
            return;
        }
        if (this.f42285e == 1) {
            q0.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
            return;
        }
        if (this.f42285e == 5 && Utils.getDownloadRate(this.f42292l, this.f42295o) >= this.f42299s) {
            q0.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
            com.mbridge.msdk.videocommon.listener.a aVar = this.f42287g;
            if (aVar != null) {
                aVar.a(this.f42293m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f42288h;
            if (aVar2 != null) {
                aVar2.a(this.f42293m);
            }
            try {
                File file = new File(this.f42296p);
                if (Objects.exists(file, this.f42294n, this.f42303w) && file.isFile()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            a(this.f42289i, eVar);
            return;
        }
        if (this.f42282b == 3) {
            q0.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
            a(0L, false, "");
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("cache", 1);
            a(this.f42289i, eVar2);
            return;
        }
        try {
            iC = c(this.f42289i);
        } catch (Exception unused) {
            iC = 100;
        }
        d(iC);
        if (iC == 0) {
            com.mbridge.msdk.videocommon.listener.a aVar3 = this.f42287g;
            if (aVar3 != null) {
                aVar3.a(this.f42293m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar4 = this.f42288h;
            if (aVar4 != null) {
                aVar4.a(this.f42293m);
            }
        }
        DownloadMessage downloadMessage = new DownloadMessage(this.f42289i, str, this.f42303w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        downloadMessage.setUseCronetDownload(a(this.f42289i));
        downloadMessage.addExtra("resource_type", 4);
        this.f42304x = a(downloadMessage, this.R, this.S, "1");
    }

    public void a(boolean z10) {
        this.K = z10;
    }

    public void b(int i10) {
        this.f42283c = i10;
    }

    public void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f42288h = aVar;
    }

    public void b(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f42287g;
        if (aVar != null) {
            aVar.a(str, this.f42293m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f42288h;
        if (aVar2 != null) {
            aVar2.a(str, this.f42293m);
        }
        q0.b("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f42285e == 4 || this.f42285e == 2 || this.f42285e == 5) {
            return;
        }
        this.f42285e = 4;
        CampaignEx campaignEx = this.f42289i;
        if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.f42289i.getRsIgnoreCheckRule().size() <= 0 || !this.f42289i.getRsIgnoreCheckRule().contains(0)) {
            a(this.f42295o, this.f42285e);
        } else {
            q0.c("CampaignDownLoadTask", "Is not check video download status");
        }
    }

    public void b(boolean z10) {
        this.f42302v = z10;
    }

    public void c(int i10) {
        this.f42282b = i10;
    }

    public void c(String str) {
        r();
        a(2, str, "");
        this.f42285e = 4;
    }

    public void c(boolean z10) {
        this.L = z10;
    }

    public void d(int i10) {
        q0.a("CampaignDownLoadTask", "set ready rate: " + i10);
        this.f42299s = i10;
    }

    public void d(boolean z10) {
        this.f42297q = z10;
    }

    public void e(int i10) {
        this.C = i10;
    }

    public void e(CampaignEx campaignEx) {
        this.f42289i = campaignEx;
    }

    public void e(boolean z10) {
        this.N = z10;
    }

    public void f(boolean z10) {
        this.M = z10;
    }

    public void g() {
        try {
            d();
            CampaignEx campaignEx = this.f42289i;
            if (campaignEx == null || campaignEx.getPlayable_ads_without_video() != 2) {
                com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                if (aVarA != null) {
                    aVarA.a(this.f42289i);
                }
            }
        } catch (Exception unused) {
            q0.b("CampaignDownLoadTask", "del file is failed");
        } finally {
            this.f42285e = 0;
        }
    }

    public CampaignEx h() {
        return this.f42289i;
    }

    public String i() {
        return this.f42293m;
    }

    public long j() {
        return this.f42292l;
    }

    public String k() {
        String message = "";
        if (this.f42282b == 3) {
            return "";
        }
        String str = this.f42294n + this.f42303w;
        File file = new File(str);
        try {
            if (!Objects.exists(file, this.f42294n, this.f42303w)) {
                message = "file is not exist ";
            } else if (!file.isFile()) {
                message = "file is not file ";
            } else if (!file.canRead()) {
                message = "file can not read ";
            } else if (file.length() > 0) {
                this.f42296p = str;
            } else {
                message = "file length is 0 ";
            }
        } catch (Throwable th2) {
            q0.b("CampaignDownLoadTask", th2.getMessage());
            message = th2.getMessage();
        }
        if (this.f42285e == 5 && !TextUtils.isEmpty(message)) {
            d();
        }
        return message;
    }

    public String l() {
        if (this.Q) {
            try {
                File file = new File(this.f42296p);
                return (file.exists() && file.isFile()) ? this.f42296p : this.f42293m;
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
                return this.f42293m;
            }
        }
        try {
            File file2 = new File(this.f42296p);
            if (Objects.exists(file2, this.f42294n, this.f42303w) && file2.isFile()) {
                return this.f42296p;
            }
        } catch (Exception e11) {
            q0.b("CampaignDownLoadTask", e11.getMessage());
        }
        return this.f42293m;
    }

    public long m() {
        return this.f42295o;
    }

    public long n() {
        return this.f42298r;
    }

    public int o() {
        return this.f42285e;
    }

    public String p() {
        return this.f42296p;
    }

    public boolean s() {
        return this.K;
    }

    public boolean t() {
        return this.f42302v;
    }

    public boolean u() {
        return this.L;
    }

    public boolean v() {
        return this.Q;
    }

    public boolean w() {
        return this.N;
    }

    public boolean x() {
        return this.M;
    }

    public void y() {
        if (this.f42286f != null) {
            this.f42286f = null;
        }
    }
}
