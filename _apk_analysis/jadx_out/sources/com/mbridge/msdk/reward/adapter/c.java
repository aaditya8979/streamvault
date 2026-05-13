package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.cache.a;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.reward.controller.a;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.videocommon.a;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: RewardMVVideoAdapter.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {
    private String C;
    private h D;
    public String K;
    private List<CampaignEx> V;
    private CopyOnWriteArrayList<CampaignEx> W;
    private List<CampaignEx> X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f39356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f39357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.orglistener.h f39358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile com.mbridge.msdk.reward.adapter.a f39359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile a.j f39360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f39361l;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f39367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f39368s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f39370u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f39371v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f39372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f39373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CampaignUnit f39374y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f39375z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f39362m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f39363n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f39364o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f39365p = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f39366q = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f39369t = "";
    private boolean A = false;
    private long B = 0;
    private boolean E = false;
    private boolean F = false;
    public String G = "";
    public String H = "";
    public String I = "";
    public int J = 0;
    private Handler L = new a(Looper.getMainLooper());
    private boolean M = false;
    private long N = 0;
    public volatile boolean O = false;
    public volatile boolean P = false;
    public volatile boolean Q = false;
    public volatile boolean R = false;
    public volatile boolean S = false;
    public volatile boolean T = false;
    private String U = "";

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x022c  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(android.os.Message r19) {
            /*
                Method dump skipped, instruction units count: 1230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class b extends com.mbridge.msdk.reward.request.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.same.report.metrics.c f39377e;

        public b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f39377e = cVar;
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void a(CampaignUnit campaignUnit) throws Throwable {
            CampaignEx campaignEx;
            try {
                c.this.c(campaignUnit);
                c.this.a(campaignUnit);
                if (campaignUnit != null) {
                    c.this.G = campaignUnit.getRequestId();
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
                if (c.this.f39375z != null && c.this.f39375z.size() > 0 && (campaignEx = (CampaignEx) c.this.f39375z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                    c.this.f39375z.clear();
                }
                if (c.this.V != null) {
                    c.this.V.clear();
                }
                c.this.O = false;
                c.this.P = false;
                synchronized (c.this.f39364o) {
                    if (c.this.Q) {
                        c.this.Q = false;
                    }
                    c.this.S = false;
                    c.this.R = false;
                    c.this.b("exception after load success", this.f39377e);
                    c.this.n();
                }
            }
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void b(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            CampaignEx campaignEx;
            if (i10 == -1) {
                c.this.B = System.currentTimeMillis();
            }
            if (c.this.f39375z != null && c.this.f39375z.size() > 0 && (campaignEx = (CampaignEx) c.this.f39375z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                c.this.f39375z.clear();
            }
            if (c.this.V != null) {
                c.this.V.clear();
            }
            c.this.O = false;
            c.this.P = false;
            synchronized (c.this.f39364o) {
                if (c.this.Q) {
                    c.this.Q = false;
                }
            }
            c.this.a(cVar, i10);
            c.this.S = false;
            c.this.R = false;
            if (!c.this.M) {
                c.this.a(i10, str, cVar);
            }
            c.this.n();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class C0480c implements b.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f39379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f39381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f39382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f39383e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignEx f39385a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f39386b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f39387c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f39388d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f39389e;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
            public class C0481a implements b.o {
                public C0481a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0529a c0529a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "preload template failed is tpl :" + C0480c.this.f39381c);
                    }
                    if (C0480c.this.f39380b.getRsIgnoreCheckRule() != null && C0480c.this.f39380b.getRsIgnoreCheckRule().size() > 0 && C0480c.this.f39380b.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.f39387c, (List<CampaignEx>) cVar.V, c.this.f39368s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f39359j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    C0480c c0480c = C0480c.this;
                    if (c0480c.f39379a == null) {
                        c0480c.f39379a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0480c c0480c2 = C0480c.this;
                    c0480c2.f39379a.b(c0480c2.f39382d);
                    C0480c.this.f39379a.a(bVar);
                    c.this.f39359j.a(c.this.V, bVar, C0480c.this.f39379a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0529a c0529a) {
                    C0480c c0480c = C0480c.this;
                    if (c.this.a(c0480c.f39382d, c0480c.f39381c, c0480c.f39383e)) {
                        c cVar = c.this;
                        String str6 = cVar.f39351b;
                        a aVar = a.this;
                        cVar.a(str6, aVar.f39389e, (List<CampaignEx>) c.this.X, c.this.f39368s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f39359j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        C0480c c0480c2 = C0480c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c0480c2.f39379a;
                        if (cVar2 != null) {
                            cVar2.b(c0480c2.f39382d);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar2 = c.this.f39359j;
                        C0480c c0480c3 = C0480c.this;
                        aVar2.a(c0480c3.f39382d, c0480c3.f39379a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f39368s, str4);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f39359j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    C0480c c0480c4 = C0480c.this;
                    if (c0480c4.f39379a == null) {
                        c0480c4.f39379a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0480c c0480c5 = C0480c.this;
                    c0480c5.f39379a.b(c0480c5.f39382d);
                    C0480c.this.f39379a.a(bVarA);
                    com.mbridge.msdk.reward.adapter.a aVar3 = c.this.f39359j;
                    C0480c c0480c6 = C0480c.this;
                    aVar3.a(c0480c6.f39382d, bVarA, c0480c6.f39379a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                }
            }

            public a(CampaignEx campaignEx, String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f39385a = campaignEx;
                this.f39386b = str;
                this.f39387c = str2;
                this.f39388d = str3;
                this.f39389e = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f39367r;
                boolean z12 = c.this.f39368s;
                String strJ = this.f39385a.getRewardTemplateMode().j();
                int i10 = c.this.f39366q;
                C0480c c0480c = C0480c.this;
                bVarB.a(z10, handler, z11, z12, null, strJ, i10, c0480c.f39380b, c0480c.f39382d, H5DownLoadManager.getInstance().getH5ResAddress(this.f39385a.getRewardTemplateMode().j()), this.f39386b, this.f39387c, this.f39388d, this.f39385a.getRequestIdNotice(), c.this.f39361l, new C0481a());
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f39392a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f39393b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f39394c;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b$a */
            /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
            public class a implements b.o {
                public a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0529a c0529a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    if (C0480c.this.f39380b.getRsIgnoreCheckRule() != null && C0480c.this.f39380b.getRsIgnoreCheckRule().size() > 0 && C0480c.this.f39380b.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    b bVar2 = b.this;
                    c cVar = c.this;
                    cVar.a(bVar2.f39393b, (List<CampaignEx>) cVar.V, c.this.f39368s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f39359j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    C0480c c0480c = C0480c.this;
                    if (c0480c.f39379a == null) {
                        c0480c.f39379a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0480c c0480c2 = C0480c.this;
                    c0480c2.f39379a.b(c0480c2.f39382d);
                    C0480c.this.f39379a.a(bVar);
                    c.this.f39359j.a(c.this.V, bVar, C0480c.this.f39379a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0529a c0529a) {
                    C0480c c0480c = C0480c.this;
                    if (c.this.a(c0480c.f39382d, c0480c.f39381c, c0480c.f39383e)) {
                        c cVar = c.this;
                        String str6 = cVar.f39351b;
                        b bVar = b.this;
                        cVar.a(str6, bVar.f39394c, (List<CampaignEx>) c.this.X, c.this.f39368s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f39359j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        C0480c c0480c2 = C0480c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = c0480c2.f39379a;
                        if (cVar2 != null) {
                            cVar2.b(c0480c2.f39382d);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar = c.this.f39359j;
                        C0480c c0480c3 = C0480c.this;
                        aVar.a(c0480c3.f39382d, c0480c3.f39379a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f39368s, str4);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f39359j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    C0480c c0480c4 = C0480c.this;
                    if (c0480c4.f39379a == null) {
                        c0480c4.f39379a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0480c c0480c5 = C0480c.this;
                    c0480c5.f39379a.b(c0480c5.f39382d);
                    C0480c.this.f39379a.a(bVarA);
                    c.this.f39359j.a(c.this.V, bVarA, C0480c.this.f39379a);
                    q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                }
            }

            public b(String str, String str2, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f39392a = str;
                this.f39393b = str2;
                this.f39394c = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f39367r;
                boolean z12 = c.this.f39368s;
                String str = this.f39392a;
                String requestIdNotice = C0480c.this.f39380b.getRequestIdNotice();
                String str2 = c.this.f39352c;
                String str3 = this.f39393b;
                String cMPTEntryUrl = C0480c.this.f39380b.getCMPTEntryUrl();
                int i10 = c.this.f39366q;
                C0480c c0480c = C0480c.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, c0480c.f39380b, c0480c.f39382d, H5DownLoadManager.getInstance().getH5ResAddress(C0480c.this.f39380b.getCMPTEntryUrl()), this.f39393b, c.this.f39361l, new a(), false);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class RunnableC0482c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f39397a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.foundation.error.b f39398b;

            public RunnableC0482c(CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
                this.f39397a = copyOnWriteArrayList;
                this.f39398b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f39351b, this.f39397a, c.this.f39368s, "");
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f39359j == null) {
                    return;
                }
                c.this.S = false;
                C0480c c0480c = C0480c.this;
                if (c0480c.f39379a == null) {
                    c0480c.f39379a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                C0480c c0480c2 = C0480c.this;
                c0480c2.f39379a.b(c0480c2.f39382d);
                com.mbridge.msdk.foundation.error.b bVar = this.f39398b;
                if (bVar != null) {
                    bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
                }
                C0480c.this.f39379a.a(this.f39398b);
                c.this.f39359j.a(this.f39397a, this.f39398b, C0480c.this.f39379a);
                q0.a("RewardMVVideoAdapter", "Campaign 下载失败：onVideoLoadFail");
            }
        }

        public C0480c(CampaignEx campaignEx, boolean z10, CopyOnWriteArrayList copyOnWriteArrayList, int i10) {
            this.f39380b = campaignEx;
            this.f39381c = z10;
            this.f39382d = copyOnWriteArrayList;
            this.f39383e = i10;
            this.f39379a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            c.this.O = true;
            if (this.f39381c) {
                if (!c.this.P || c.this.Q || c.this.L == null) {
                    return;
                }
                synchronized (c.this.f39364o) {
                    if (c.this.Q) {
                        return;
                    }
                    c.this.Q = true;
                    c.this.L.post(new b(str3, str2, copyOnWriteArrayList));
                    return;
                }
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) && !campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && c.this.L != null) {
                    c.this.L.post(new a(campaignEx, str, str2, str3, copyOnWriteArrayList));
                } else if (c.this.a(this.f39382d, this.f39381c, this.f39383e)) {
                    c cVar = c.this;
                    cVar.a(cVar.f39351b, copyOnWriteArrayList, (List<CampaignEx>) c.this.X, c.this.f39368s);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f39359j != null && !c.this.R) {
                        c.this.R = true;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.f39379a;
                        if (cVar2 != null) {
                            cVar2.b(this.f39382d);
                        }
                        c.this.f39359j.a(this.f39382d, this.f39379a);
                    }
                } else {
                    c cVar3 = c.this;
                    cVar3.a(str2, (List<CampaignEx>) cVar3.V, c.this.f39368s, str3);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f39359j != null && !c.this.S) {
                        c.this.S = false;
                        com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                        if (this.f39379a == null) {
                            this.f39379a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        }
                        this.f39379a.b(this.f39382d);
                        this.f39379a.a(bVarA);
                        c.this.f39359j.a(this.f39382d, bVarA, this.f39379a);
                        q0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            c.this.O = false;
            if (c.this.f39359j == null || c.this.L == null) {
                return;
            }
            c.this.L.post(new RunnableC0482c(copyOnWriteArrayList, bVar));
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class d implements b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f39400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f39402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f39403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f39404e;

        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f39406a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.foundation.error.b f39407b;

            public a(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.f39406a = str;
                this.f39407b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f39351b, (List<CampaignEx>) c.this.V, c.this.f39368s, this.f39406a);
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f39359j == null) {
                    return;
                }
                c.this.S = false;
                com.mbridge.msdk.foundation.error.b bVar = this.f39407b;
                if (bVar != null) {
                    bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f39400a == null) {
                    dVar.f39400a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.f39400a.b(dVar2.f39403d);
                d.this.f39400a.a(this.f39407b);
                c.this.f39359j.a(c.this.V, this.f39407b, d.this.f39400a);
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板 onVideoLoadFail");
            }
        }

        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f39409a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.foundation.error.b f39410b;

            public b(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.f39409a = str;
                this.f39410b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.f39351b, (List<CampaignEx>) c.this.V, c.this.f39368s, this.f39409a);
                if (c.this.L != null) {
                    c.this.L.removeMessages(5);
                }
                if (c.this.S || c.this.f39359j == null) {
                    return;
                }
                c.this.S = false;
                com.mbridge.msdk.foundation.error.b bVar = this.f39410b;
                if (bVar != null) {
                    bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f39400a == null) {
                    dVar.f39400a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.f39400a.b(dVar2.f39403d);
                d.this.f39400a.a(this.f39410b);
                c.this.f39359j.a(c.this.V, this.f39410b, d.this.f39400a);
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
            }
        }

        public d(CampaignEx campaignEx, boolean z10, CopyOnWriteArrayList copyOnWriteArrayList, int i10) {
            this.f39401b = campaignEx;
            this.f39402c = z10;
            this.f39403d = copyOnWriteArrayList;
            this.f39404e = i10;
            this.f39400a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            q0.a("RewardMVVideoAdapter", "template 下载失败： ");
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.f39402c && c.this.f39359j != null && c.this.L != null) {
                q0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板");
                if (this.f39401b.getRsIgnoreCheckRule() == null || this.f39401b.getRsIgnoreCheckRule().size() <= 0 || !this.f39401b.getRsIgnoreCheckRule().contains(1)) {
                    c.this.L.post(new a(str2, bVar));
                    return;
                } else {
                    q0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                    return;
                }
            }
            if (this.f39404e == 1) {
                if (this.f39401b.getRsIgnoreCheckRule() != null && this.f39401b.getRsIgnoreCheckRule().size() > 0) {
                    if (this.f39401b.getRsIgnoreCheckRule().contains(3)) {
                        q0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                        return;
                    } else if (this.f39401b.getCMPTEntryUrl().equals(this.f39401b.getendcard_url()) && this.f39401b.getRsIgnoreCheckRule().contains(2)) {
                        q0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                        return;
                    }
                }
                if (c.this.f39359j == null || c.this.L == null) {
                    return;
                }
                c.this.L.post(new b(str2, bVar));
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class e implements b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f39412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f39414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f39415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f39416e;

        /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f39418a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f39419b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f39420c;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
            public class C0483a implements b.o {
                public C0483a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0529a c0529a, com.mbridge.msdk.foundation.error.b bVar) {
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败");
                    q0.b("HBOPTIMIZE", "模板加载失败 requestId " + str2);
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.f39420c, (List<CampaignEx>) cVar.V, c.this.f39368s, str2);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f39359j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    e eVar = e.this;
                    if (eVar.f39412a == null) {
                        eVar.f39412a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar2 = e.this;
                    eVar2.f39412a.b(eVar2.f39414c);
                    e.this.f39412a.a(bVar);
                    c.this.f39359j.a(c.this.V, bVar, e.this.f39412a);
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败 onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0529a c0529a) {
                    q0.a("HBOPTIMIZE", "模板加载成功 requestId " + str4);
                    e eVar = e.this;
                    if (c.this.a(eVar.f39414c, eVar.f39415d, eVar.f39416e)) {
                        c cVar = c.this;
                        cVar.a(cVar.f39351b, (List<CampaignEx>) c.this.V, (List<CampaignEx>) c.this.X, c.this.f39368s);
                        if (c.this.L != null) {
                            c.this.L.removeMessages(5);
                        }
                        if (c.this.f39359j == null || c.this.R) {
                            return;
                        }
                        c.this.R = true;
                        e eVar2 = e.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = eVar2.f39412a;
                        if (cVar2 != null) {
                            cVar2.b(eVar2.f39414c);
                        }
                        com.mbridge.msdk.reward.adapter.a aVar = c.this.f39359j;
                        e eVar3 = e.this;
                        aVar.a(eVar3.f39414c, eVar3.f39412a);
                        return;
                    }
                    c cVar3 = c.this;
                    cVar3.a(str3, (List<CampaignEx>) cVar3.V, c.this.f39368s, a.this.f39418a);
                    if (c.this.L != null) {
                        c.this.L.removeMessages(5);
                    }
                    if (c.this.f39359j == null || c.this.S) {
                        return;
                    }
                    c.this.S = false;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880008, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    e eVar4 = e.this;
                    if (eVar4.f39412a == null) {
                        eVar4.f39412a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar5 = e.this;
                    eVar5.f39412a.b(eVar5.f39414c);
                    e.this.f39412a.a(bVarA);
                    c.this.f39359j.a(c.this.V, bVarA, e.this.f39412a);
                    q0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                }
            }

            public a(String str, String str2, String str3) {
                this.f39418a = str;
                this.f39419b = str2;
                this.f39420c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = c.this.A;
                Handler handler = c.this.L;
                boolean z11 = c.this.f39367r;
                boolean z12 = c.this.f39368s;
                String str = this.f39418a;
                String requestIdNotice = e.this.f39413b.getRequestIdNotice();
                String str2 = this.f39419b;
                String str3 = this.f39420c;
                String cMPTEntryUrl = e.this.f39413b.getCMPTEntryUrl();
                int i10 = c.this.f39366q;
                e eVar = e.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, eVar.f39413b, eVar.f39414c, H5DownLoadManager.getInstance().getH5ResAddress(e.this.f39413b.getCMPTEntryUrl()), this.f39420c, c.this.f39361l, new C0483a(), false);
            }
        }

        public e(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z10, int i10) {
            this.f39413b = campaignEx;
            this.f39414c = copyOnWriteArrayList;
            this.f39415d = z10;
            this.f39416e = i10;
            this.f39412a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败");
            if (this.f39413b.getRsIgnoreCheckRule() != null && this.f39413b.getRsIgnoreCheckRule().size() > 0) {
                if (this.f39413b.getRsIgnoreCheckRule().contains(3)) {
                    q0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.f39413b.getCMPTEntryUrl().equals(this.f39413b.getendcard_url()) && this.f39413b.getRsIgnoreCheckRule().contains(2)) {
                    q0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            c cVar = c.this;
            cVar.a(cVar.f39351b, (List<CampaignEx>) c.this.V, c.this.f39368s, str2);
            c.this.P = false;
            if (c.this.L != null) {
                c.this.L.removeMessages(5);
            }
            if (c.this.f39359j == null || c.this.S) {
                return;
            }
            c.this.S = false;
            if (bVar != null) {
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            if (this.f39412a == null) {
                this.f39412a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f39412a.b(this.f39414c);
            this.f39412a.a(bVar);
            c.this.f39359j.a(c.this.V, bVar, this.f39412a);
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败 onVideoLoadFail");
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            q0.a("RewardMVVideoAdapter", "大模板业务，大模板下载成功");
            c.this.P = true;
            if (!c.this.O || c.this.Q || c.this.L == null) {
                return;
            }
            synchronized (c.this.f39364o) {
                if (c.this.Q) {
                    return;
                }
                c.this.Q = true;
                c.this.L.post(new a(str3, str, str2));
            }
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class f extends c.a {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignUnit f39424a;

        public g(CampaignUnit campaignUnit) {
            this.f39424a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.a(com.mbridge.msdk.foundation.db.g.a(c.this.f39350a)).d();
            CampaignUnit campaignUnit = this.f39424a;
            if (campaignUnit == null || campaignUnit.getAds() == null || this.f39424a.getAds().size() <= 0) {
                return;
            }
            c.this.d(this.f39424a.getAds());
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f39426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f39427b;

        public h(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f39426a = str;
            this.f39427b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.E) {
                    return;
                }
                c.this.F = true;
                if (c.this.L != null) {
                    Message messageObtainMessage = c.this.L.obtainMessage();
                    messageObtainMessage.obj = this.f39426a;
                    messageObtainMessage.what = 2;
                    if (this.f39427b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f39427b.t());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.L.sendMessage(messageObtainMessage);
                }
            } catch (Exception e10) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: RewardMVVideoAdapter.java */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f39429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f39430b;

        public i(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f39429a = str;
            this.f39430b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    c cVar = c.this;
                    cVar.f39370u = com.mbridge.msdk.b.a(cVar.f39351b, c.this.f39350a);
                }
                c cVar2 = c.this;
                cVar2.f39357h = v0.a(cVar2.f39350a, c.this.f39351b);
                if (c.this.F) {
                    return;
                }
                if (c.this.D != null && c.this.L != null) {
                    c.this.L.removeCallbacks(c.this.D);
                }
                c.this.E = true;
                if (c.this.L != null) {
                    Message messageObtainMessage = c.this.L.obtainMessage();
                    messageObtainMessage.obj = this.f39429a;
                    messageObtainMessage.what = 1;
                    if (this.f39430b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f39430b.t());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.L.sendMessage(messageObtainMessage);
                }
                if (TextUtils.isEmpty(c.this.f39357h)) {
                    return;
                }
                q0.b("RewardMVVideoAdapter", "excludeId : " + c.this.f39357h);
            } catch (Exception e10) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    public c(Context context, String str, String str2) {
        try {
            this.f39350a = context.getApplicationContext();
            this.f39351b = str2;
            this.f39352c = str;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(Message message) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        if (message == null) {
            return cVar;
        }
        try {
            Bundle data = message.getData();
            return data != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(data.getString("metrics_data_lrid")) : cVar;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return cVar;
            }
            e10.printStackTrace();
            return cVar;
        }
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c a(List<CampaignEx> list) {
        String localRequestId;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        localRequestId = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    localRequestId = list.get(0) != null ? list.get(0).getLocalRequestId() : "";
                    if (com.mbridge.msdk.foundation.same.report.metrics.d.b().c().containsKey(localRequestId)) {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(localRequestId);
                        if (cVar2 == null) {
                            try {
                                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            } catch (Exception e10) {
                                e = e10;
                                cVar = cVar2;
                                if (MBridgeConstans.DEBUG) {
                                    e.printStackTrace();
                                }
                            }
                        } else {
                            cVar = cVar2;
                        }
                    }
                    cVar.i(localRequestId);
                    cVar.b(list);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("cache", 1);
        eVar.a(CampaignEx.JSON_KEY_HB, 1);
        eVar.a("auto_load", 2);
        cVar.a("2000127", eVar);
        cVar.a("2000048", eVar);
        cVar.a(this.f39367r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        cVar.h("1");
        cVar.f("2");
        if (!TextUtils.isEmpty(localRequestId)) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(localRequestId, cVar);
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.reward.adapter.d a(com.mbridge.msdk.foundation.entity.CampaignUnit r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.f39374y = r6
            com.mbridge.msdk.reward.adapter.d r0 = r5.b(r6)
            com.mbridge.msdk.reward.candidate.a r1 = new com.mbridge.msdk.reward.candidate.a
            java.lang.String r2 = r5.f39351b
            boolean r3 = r5.f39367r
            r1.<init>(r2, r3)
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.b()
            java.lang.String r3 = r5.C
            java.lang.String r4 = r5.f39351b
            r1.a(r2, r3, r5, r4)
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.b()
            boolean r2 = r0.e()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L46
            int r2 = r0.d()
            if (r2 != 0) goto L30
            r1.clear()
            goto L3d
        L30:
            boolean r2 = r0.a()
            if (r2 == 0) goto L3d
            com.mbridge.msdk.foundation.same.report.metrics.c r6 = r6.getMetricsData()
            r5.b(r6)
        L3d:
            int r6 = r0.c()
            if (r6 == 0) goto L44
            goto L46
        L44:
            r6 = r3
            goto L47
        L46:
            r6 = r4
        L47:
            r5.a(r1, r4, r3, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(com.mbridge.msdk.foundation.entity.CampaignUnit):com.mbridge.msdk.reward.adapter.d");
    }

    private void a() {
        String strD;
        String strB;
        String str;
        List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f39351b, this.H);
        if (listA != null) {
            int size = listA.size();
            String strD2 = com.mbridge.msdk.foundation.same.buffer.b.d(this.f39351b);
            if (size == 0) {
                return;
            }
            String str2 = "";
            try {
                if (size == 1) {
                    if (listA.get(0) != null) {
                        String strD3 = listA.get(0).d();
                        strB = listA.get(0).b();
                        strD = strD3;
                        String str3 = strB;
                        str2 = strD;
                        str = str3;
                        break;
                    }
                    str = "";
                } else {
                    if (!TextUtils.isEmpty(strD2)) {
                        for (com.mbridge.msdk.foundation.entity.d dVar : listA) {
                            if (dVar != null && strD2.equals(dVar.a())) {
                                strD = dVar.d();
                                strB = dVar.b();
                                String str32 = strB;
                                str2 = strD;
                                str = str32;
                                break;
                            }
                        }
                    }
                    str = "";
                }
                if (TextUtils.isEmpty(str2) || !str2.equals(this.H)) {
                    return;
                }
                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(strD2, this.f39351b);
                com.mbridge.msdk.foundation.same.buffer.b.a(this.f39351b, this.H, str);
                com.mbridge.msdk.foundation.same.buffer.b.e(this.f39351b);
            } catch (Exception e10) {
                q0.a("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            messageObtain.arg1 = i10;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.L.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.L.sendMessage(messageObtain);
            }
        }
    }

    private void a(j jVar, CampaignEx campaignEx) {
        if (jVar == null || jVar.a(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        jVar.b(gVar);
    }

    private void a(CampaignEx campaignEx) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>(this.f39375z);
        boolean z10 = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.O = false;
        this.P = false;
        synchronized (this.f39364o) {
            if (this.Q) {
                this.Q = false;
            }
        }
        this.S = false;
        this.R = false;
        if (this.f39368s) {
            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getBidToken(), campaignEx.getCampaignUnitId(), campaignEx.getEncryptPrice());
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f39350a, z10, nscpt, this.f39368s, this.f39367r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f39352c, this.f39351b, campaignEx.getRequestId(), copyOnWriteArrayList, new C0480c(campaignEx, z10, copyOnWriteArrayList, nscpt), new d(campaignEx, z10, copyOnWriteArrayList, nscpt));
        if (z10) {
            com.mbridge.msdk.reward.adapter.b.b().a(this.f39350a, campaignEx, this.f39352c, this.f39351b, campaignEx.getRequestId(), new e(campaignEx, copyOnWriteArrayList, z10, nscpt));
        }
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f39350a, cVar, new f());
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(CampaignUnit campaignUnit, List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new g(campaignUnit));
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            this.L.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:16:0x002c, B:18:0x004a, B:20:0x0052, B:22:0x0056, B:25:0x005f, B:27:0x0078, B:26:0x006d, B:28:0x008e, B:15:0x0027), top: B:35:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "2000126"
            if (r6 == 0) goto Lb4
            boolean r1 = r6.F()     // Catch: java.lang.Exception -> Lac
            if (r1 != 0) goto Lb4
            com.mbridge.msdk.foundation.same.report.metrics.e r1 = new com.mbridge.msdk.foundation.same.report.metrics.e     // Catch: java.lang.Exception -> Lac
            r1.<init>()     // Catch: java.lang.Exception -> Lac
            r2 = 3
            java.lang.String r3 = "result"
            if (r7 == r2) goto L27
            r2 = 880023(0xd6d97, float:1.233175E-39)
            if (r7 == r2) goto L27
            r2 = 880041(0xd6da9, float:1.2332E-39)
            if (r7 == r2) goto L27
            switch(r7) {
                case 10: goto L27;
                case 11: goto L27;
                case 12: goto L27;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "1"
            r1.a(r3, r7)     // Catch: java.lang.Exception -> Lac
            goto L2c
        L27:
            java.lang.String r7 = "2"
            r1.a(r3, r7)     // Catch: java.lang.Exception -> Lac
        L2c:
            java.lang.String r7 = "timeout"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lac
            r2.<init>()     // Catch: java.lang.Exception -> Lac
            int r3 = r5.f39355f     // Catch: java.lang.Exception -> Lac
            r2.append(r3)     // Catch: java.lang.Exception -> Lac
            java.lang.String r3 = ""
            r2.append(r3)     // Catch: java.lang.Exception -> Lac
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lac
            r1.a(r7, r2)     // Catch: java.lang.Exception -> Lac
            com.mbridge.msdk.foundation.error.b r7 = r6.u()     // Catch: java.lang.Exception -> Lac
            if (r7 == 0) goto L8e
            java.lang.String r2 = "campaign_request_error"
            java.lang.Object r2 = r7.a(r2)     // Catch: java.lang.Exception -> Lac
            if (r2 == 0) goto L8e
            boolean r3 = r2 instanceof com.mbridge.msdk.foundation.same.net.exception.a     // Catch: java.lang.Exception -> Lac
            if (r3 == 0) goto L8e
            r3 = r2
            com.mbridge.msdk.foundation.same.net.exception.a r3 = (com.mbridge.msdk.foundation.same.net.exception.a) r3     // Catch: java.lang.Exception -> Lac
            com.mbridge.msdk.foundation.same.net.toolbox.a r3 = r3.f37794c     // Catch: java.lang.Exception -> Lac
            java.lang.String r4 = "code"
            if (r3 == 0) goto L6d
            com.mbridge.msdk.foundation.same.net.exception.a r2 = (com.mbridge.msdk.foundation.same.net.exception.a) r2     // Catch: java.lang.Exception -> Lac
            com.mbridge.msdk.foundation.same.net.toolbox.a r2 = r2.f37794c     // Catch: java.lang.Exception -> Lac
            int r2 = r2.f37815d     // Catch: java.lang.Exception -> Lac
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lac
            r1.a(r4, r2)     // Catch: java.lang.Exception -> Lac
            goto L78
        L6d:
            int r2 = r7.g()     // Catch: java.lang.Exception -> Lac
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lac
            r1.a(r4, r2)     // Catch: java.lang.Exception -> Lac
        L78:
            java.lang.String r2 = "reason"
            java.lang.String r3 = r7.l()     // Catch: java.lang.Exception -> Lac
            r1.a(r2, r3)     // Catch: java.lang.Exception -> Lac
            java.lang.String r2 = "err_desc"
            java.lang.String r7 = r7.i()     // Catch: java.lang.Exception -> Lac
            r1.a(r2, r7)     // Catch: java.lang.Exception -> Lac
            r7 = 0
            r6.a(r7)     // Catch: java.lang.Exception -> Lac
        L8e:
            java.lang.String r7 = "hst"
            java.lang.String r2 = r5.k()     // Catch: java.lang.Exception -> Lac
            r1.a(r7, r2)     // Catch: java.lang.Exception -> Lac
            java.lang.String r7 = "126_exclude"
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lac
            r1.a(r7, r2)     // Catch: java.lang.Exception -> Lac
            r6.a(r0, r1)     // Catch: java.lang.Exception -> Lac
            com.mbridge.msdk.reward.report.metrics.a r7 = com.mbridge.msdk.reward.report.metrics.a.a()     // Catch: java.lang.Exception -> Lac
            r7.a(r0, r6)     // Catch: java.lang.Exception -> Lac
            goto Lb4
        Lac:
            r6 = move-exception
            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r7 == 0) goto Lb4
            r6.printStackTrace()
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(com.mbridge.msdk.foundation.same.report.metrics.c, int):void");
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar, List<CampaignEx> list) {
        if (cVar != null) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        cVar.b(list);
                        CampaignEx campaignEx = list.get(0);
                        if (campaignEx != null) {
                            cVar.i(campaignEx.getLocalRequestId());
                        }
                        cVar.b(list);
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            a(false, cVar, eVar);
        }
    }

    private void a(String str) {
        if (a1.b(str)) {
            com.mbridge.msdk.reward.controller.a.f39447c0 = str;
        }
    }

    private void a(String str, String str2, List<CampaignEx> list) {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, str2, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r12, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r14) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z10) {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, list2, z10);
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx : list2) {
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    com.mbridge.msdk.videocommon.a.e(str + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j());
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z10) {
            a(str, list, list2);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            CampaignEx campaignEx2 = list.get(0);
            com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(str, this.f39367r);
            if (campaignEx2 == null || !TextUtils.isEmpty(campaignEx2.getNLRid())) {
                return;
            }
            aVar.a(campaignEx2.getLocalRequestId(), campaignEx2.getRequestId(), 1, campaignEx2.getEcppv());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, boolean z10, String str2) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z10, str2);
            return;
        }
        CampaignEx campaignEx = list.get(0);
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getEcppv()) || TextUtils.isEmpty(str2)) {
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, z10);
        } else {
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z10, str2);
        }
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.f39351b);
        cVar.a(this.f39367r ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        eVar.a("result", Integer.valueOf(z10 ? 1 : 2));
        eVar.a("bid_tk", this.C);
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f39368s ? 1 : 0));
        cVar.a("m_offer_ready", eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a("m_offer_ready", cVar);
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, List<CampaignEx> list) {
        if (cVar == null) {
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                cVar.i(campaignEx.getLocalRequestId());
            }
            cVar.b(list);
        }
        a(z10, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:38|39|(1:41)(2:42|(1:44)(2:45|(1:47)(12:49|144|50|(1:52)|53|157|54|155|55|56|71|(2:77|164)(0))))|48|144|50|(0)|53|157|54|155|55|56|71|(1:73)|77|164) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(8:(1:41)(2:42|(1:44)(2:45|(1:47)(12:49|144|50|(1:52)|53|157|54|155|55|56|71|(2:77|164)(0))))|155|55|56|71|(1:73)|77|164)|144|50|(0)|53|157|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0145, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0148, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014d, code lost:
    
        r0.printStackTrace();
        r12.setMraid("");
        com.mbridge.msdk.foundation.same.report.g.a("m_download_end", r12, r0.getMessage(), r17.f39351b, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015c, code lost:
    
        if (r6 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015e, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        if (r6 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0185, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0188, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023b A[PHI: r0
      0x023b: PHI (r0v6 'e' java.io.IOException) = (r0v9 'e' java.io.IOException), (r0v10 'e' java.io.IOException) binds: [B:132:0x0239, B:121:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5 A[Catch: all -> 0x014a, Exception -> 0x014c, TryCatch #2 {Exception -> 0x014c, blocks: (B:50:0x00ca, B:52:0x00e5, B:53:0x00ed), top: B:144:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189 A[Catch: all -> 0x022a, Exception -> 0x022c, PHI: r6
      0x0189: PHI (r6v7 java.io.FileOutputStream) = (r6v6 java.io.FileOutputStream), (r6v11 java.io.FileOutputStream) binds: [B:35:0x0095, B:76:0x017a] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x022c, blocks: (B:8:0x001f, B:10:0x0023, B:13:0x002b, B:15:0x0031, B:17:0x003b, B:19:0x0048, B:21:0x0052, B:22:0x0057, B:24:0x005d, B:25:0x006e, B:27:0x0074, B:28:0x007c, B:31:0x0082, B:34:0x008a, B:36:0x0097, B:38:0x00a5, B:71:0x0161, B:73:0x0170, B:75:0x0176, B:77:0x017c, B:79:0x0185, B:80:0x0188, B:70:0x015e, B:42:0x00b2, B:45:0x00bd, B:81:0x0189, B:83:0x0191, B:85:0x0198, B:87:0x01a2, B:95:0x01bc, B:97:0x01c2, B:99:0x01c8, B:103:0x01d7, B:104:0x01da, B:106:0x01e2, B:113:0x020f, B:107:0x01e6, B:109:0x01ef, B:111:0x01f5, B:112:0x0204, B:114:0x0213, B:90:0x01ad), top: B:146:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.reward.adapter.d b(com.mbridge.msdk.foundation.entity.CampaignUnit r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.b(com.mbridge.msdk.foundation.entity.CampaignUnit):com.mbridge.msdk.reward.adapter.d");
    }

    private void b() {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            try {
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                com.mbridge.msdk.videocommon.cache.a.a().a(gVarD.b0() * 1000, this.f39351b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 18;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            this.L.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.L != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.L.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.L.sendMessage(messageObtain);
            }
        }
    }

    private void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f39353d += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar = this.f39361l;
        if (cVar == null || this.f39353d > cVar.r()) {
            this.f39353d = 0;
        }
        if (a1.b(this.f39351b)) {
            com.mbridge.msdk.reward.controller.a.a(this.f39351b, this.f39353d);
        }
    }

    private boolean b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private void c() {
        try {
            com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(this.f39350a)).a(this.f39351b);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c metricsData = campaignUnit.getMetricsData();
            if (metricsData != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 1);
                eVar.a("timeout", Integer.valueOf(this.f39355f));
                eVar.a("hst", k());
                metricsData.b(campaignUnit.getAds());
                metricsData.a("2000126", eVar);
                campaignUnit.setLocalRequestId(metricsData.t());
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", metricsData);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
    }

    private void d() {
        try {
            Map<String, Long> map = com.mbridge.msdk.foundation.same.buffer.b.f37734l;
            if (map == null || map.size() <= 0) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.f37734l.clear();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (this.f39350a == null || list == null || list.size() == 0) {
            return;
        }
        j jVarA = j.a(com.mbridge.msdk.foundation.db.g.a(this.f39350a));
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx != null) {
                if (!com.mbridge.msdk.util.b.a()) {
                    a(jVarA, campaignEx);
                } else if (v0.c(this.f39350a, campaignEx.getPackageName())) {
                    com.mbridge.msdk.b.a(campaignEx);
                } else {
                    a(jVarA, campaignEx);
                }
            }
        }
    }

    private String e() {
        return com.mbridge.msdk.b.a();
    }

    private String i() {
        try {
            if (a1.b(com.mbridge.msdk.reward.controller.a.f39447c0)) {
                return com.mbridge.msdk.reward.controller.a.f39447c0;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return "";
    }

    private String k() {
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(this.C, TextUtils.isEmpty(this.C) ? gVarB.q0() : gVarB.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            if (a1.b(this.f39351b)) {
                com.mbridge.msdk.reward.controller.a.a(this.f39351b, 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity activity, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53141o);
        activity.startActivity(intent);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53141o);
        context.startActivity(intent);
    }

    public String a(boolean z10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB;
        CampaignEx campaignEx;
        if (!z10) {
            return this.G;
        }
        if (TextUtils.isEmpty(this.H) && (copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f39351b)) != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
            this.H = campaignEx.getRequestId();
        }
        return this.H;
    }

    public void a(int i10) {
        this.f39366q = i10;
    }

    public void a(int i10, int i11, int i12) {
        this.f39371v = i10;
        this.f39372w = i11;
        this.f39373x = i12;
    }

    public void a(int i10, int i11, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        a(i10, i11, z10, "", this.A, cVar);
    }

    public void a(int i10, int i11, boolean z10, String str, boolean z11, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        CampaignEx campaignEx;
        this.f39354e = i10;
        this.f39355f = i11;
        this.f39356g = z10;
        this.C = str;
        this.A = z11;
        boolean zB = false;
        this.T = false;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f39375z;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && (campaignEx = this.f39375z.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
            this.f39375z.clear();
        }
        List<CampaignEx> list = this.V;
        if (list != null) {
            list.clear();
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.W;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.O = false;
        this.P = false;
        synchronized (this.f39364o) {
            if (this.Q) {
                this.Q = false;
            }
        }
        this.S = false;
        this.R = false;
        try {
            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(this.f39350a);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
        }
        if (!zB) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available");
            if (cVar != null) {
                cVar.a(bVarA);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available", cVar);
            return;
        }
        if (this.f39350a == null) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
            if (cVar != null) {
                cVar.a(bVarA2);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
            return;
        }
        if (a1.a(this.f39351b)) {
            com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
            if (cVar != null) {
                cVar.a(bVarA3);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
            return;
        }
        if (this.f39361l != null) {
            d();
            c();
            q0.c("RewardMVVideoAdapter", "load 开始清除过期数据");
            b();
            a(str, z11, cVar);
            return;
        }
        com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
        if (cVar != null) {
            cVar.a(bVarA4);
        }
        b("RewardUnitSetting is null", cVar);
    }

    public void a(int i10, String str) {
        this.J = i10;
        this.K = str;
    }

    public void a(com.mbridge.msdk.reward.adapter.a aVar) {
        this.f39359j = aVar;
    }

    public void a(a.j jVar) {
        this.f39360k = jVar;
    }

    public void a(com.mbridge.msdk.video.bt.module.orglistener.h hVar, String str, String str2, int i10, String str3, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            this.f39358i = hVar;
            if (this.f39350a != null && !a1.a(this.f39351b)) {
                Intent intent = new Intent(this.f39350a, (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra(MBridgeConstans.UNIT_ID, this.f39351b);
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f39352c);
                intent.putExtra(MBridgeConstans.REWARD_ID, str);
                intent.putExtra(MBridgeConstans.MUTE_STATE, i10);
                intent.putExtra(MBridgeConstans.IS_IV, this.f39367r);
                intent.putExtra(MBridgeConstans.IS_BID, this.f39368s);
                intent.putExtra(MBridgeConstans.EXTRA_DATA, str3);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f39351b);
                boolean z10 = false;
                if (copyOnWriteArrayListB == null || copyOnWriteArrayListB.size() <= 0) {
                    com.mbridge.msdk.video.bt.module.orglistener.h hVar2 = this.f39358i;
                    if (hVar2 != null) {
                        hVar2.a(cVar, "load failed");
                        return;
                    }
                } else {
                    CampaignEx campaignEx = copyOnWriteArrayListB.get(0);
                    if (copyOnWriteArrayListB.size() == 1 && !com.mbridge.msdk.foundation.same.c.a(this.f39350a, campaignEx) && campaignEx.getFilterAdsShowCallState() == 1) {
                        com.mbridge.msdk.videocommon.cache.a.a().b(this.f39351b, campaignEx);
                        com.mbridge.msdk.video.bt.module.orglistener.h hVar3 = this.f39358i;
                        if (hVar3 != null) {
                            hVar3.a(cVar, "show_campaign_filtered");
                            return;
                        }
                    }
                    if (campaignEx != null) {
                        this.H = campaignEx.getRequestId();
                    }
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                        z10 = true;
                    }
                    a();
                }
                intent.putExtra(MBridgeConstans.IS_BIG_OFFER, z10);
                if (this.f39367r) {
                    intent.putExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, this.f39371v);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, this.f39372w);
                    intent.putExtra(MBridgeConstans.IV_REWARD_VALUE, this.f39373x);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(MBridgeConstans.USER_ID, str2);
                }
                RewardUnitCacheManager.getInstance().add(this.f39352c, this.f39351b, this.f39361l);
                try {
                    if (com.mbridge.msdk.foundation.controller.c.n() != null && com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533((Activity) com.mbridge.msdk.foundation.controller.c.n().f(), intent);
                        return;
                    }
                } catch (Throwable th2) {
                    q0.b("RewardMVVideoAdapter", th2.getMessage());
                }
                intent.addFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f39350a, intent);
                return;
            }
            com.mbridge.msdk.video.bt.module.orglistener.h hVar4 = this.f39358i;
            if (hVar4 != null) {
                hVar4.a(cVar, "context or unitid is null");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            com.mbridge.msdk.video.bt.module.orglistener.h hVar5 = this.f39358i;
            if (hVar5 != null) {
                hVar5.a(cVar, "show failed, exception is " + e10.getMessage());
            }
        }
    }

    public void a(com.mbridge.msdk.videocommon.setting.c cVar) {
        try {
            this.f39361l = cVar;
            if (cVar == null || cVar.o() * 1000 == com.mbridge.msdk.foundation.same.a.L) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.L = this.f39361l.o() * 1000;
        } catch (Throwable th2) {
            q0.b("RewardMVVideoAdapter", th2.getMessage(), th2);
        }
    }

    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f39361l != null && TextUtils.isEmpty(str)) {
            int iQ = this.f39361l.q() * 1000;
            List<CampaignEx> list = this.X;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.X.get(0).getTimestamp() < iQ) {
                    b("hit ltorwc", cVar);
                    return;
                }
            }
        }
        b(str, this.A, cVar);
    }

    public void a(String str, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.f().execute(new i(str, cVar));
        if (this.L == null) {
            b(str, z10, cVar);
            return;
        }
        h hVar = new h(str, cVar);
        this.D = hVar;
        this.L.postDelayed(hVar, 90000L);
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        CampaignUnit campaignUnit = this.f39374y;
        if (campaignUnit != null) {
            a(campaignUnit.getSessionId());
        }
        b(copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            q0.c("RewardMVVideoAdapter", "#######onload 把广告存在本地 size:" + copyOnWriteArrayList.size());
            a(this.f39352c, this.f39351b, copyOnWriteArrayList);
        }
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        this.f39375z = copyOnWriteArrayList;
        a(campaignEx);
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, boolean z10, boolean z11, boolean z12) {
        com.mbridge.msdk.foundation.same.report.metrics.c metricsData;
        try {
            if (z11) {
                this.V = copyOnWriteArrayList;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
                this.W = copyOnWriteArrayList2;
                metricsData = a((List<CampaignEx>) copyOnWriteArrayList2);
            } else {
                metricsData = this.f39374y.getMetricsData();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardMVVideoAdapter", e10.getMessage());
            }
            metricsData = null;
        }
        a(this.f39374y, copyOnWriteArrayList);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            q0.c("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
            if (TextUtils.isEmpty(this.U)) {
                this.U = "APP ALREADY INSTALLED";
            }
            a(this.U.contains("INSTALL") ? 880021 : 880003, this.U, metricsData);
            return;
        }
        q0.c("RewardMVVideoAdapter", "onload load success size:" + copyOnWriteArrayList.size());
        if (z10) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            if (z11) {
                eVar.a("cache", 1);
            } else {
                eVar.a("cache", 2);
            }
            if (metricsData != null) {
                metricsData.a("2000127", eVar);
                metricsData.a("2000048", eVar);
            }
            a(metricsData);
        }
        List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f39351b, 1, this.f39368s);
        if (listB != null && listB.size() > 0 && metricsData != null) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            CampaignEx campaignEx = copyOnWriteArrayList.get(0);
            eVar2.a("cid", campaignEx.getId());
            eVar2.a("price", "");
            eVar2.a("bid_tk", this.C);
            eVar2.a("lrid", campaignEx.getLocalRequestId());
            CampaignEx campaignEx2 = listB.get(0);
            eVar2.a("cid_old", com.mbridge.msdk.foundation.same.c.a(listB));
            eVar2.a("price_old", "");
            eVar2.a("bid_tk_old", campaignEx2.getBidToken());
            eVar2.a("lrid_old", campaignEx2.getLocalRequestId());
            metricsData.a("m_load_overwrite", eVar2);
            com.mbridge.msdk.reward.report.metrics.a.a().a("m_load_overwrite", metricsData);
        }
        if (z12) {
            a(copyOnWriteArrayList);
        } else {
            this.U = "campaign filtered";
            a(880021, "campaign filtered", metricsData);
        }
    }

    public boolean a(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.foundation.error.b bVar, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.cache.c cVar2;
        com.mbridge.msdk.foundation.cache.c cVar3 = new com.mbridge.msdk.foundation.cache.c();
        com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(this.f39351b, this.f39367r);
        boolean z11 = false;
        if (aVar.a(this.C)) {
            return false;
        }
        if (!this.T) {
            this.T = true;
            cVar3 = aVar.a(this.C, cVar, campaignEx, bVar, i10, this);
            if (cVar3 != null && cVar3.g() > com.mbridge.msdk.foundation.cache.c.f37342i) {
                if (cVar3.c() != null && cVar3.c().size() > 0) {
                    a(cVar3.c(), true, true, true);
                } else if (cVar3.g() == com.mbridge.msdk.foundation.cache.c.f37344k && bVar != null) {
                    bVar.a(com.mbridge.msdk.foundation.error.a.b(880038));
                    bVar.d(cVar3.e());
                }
            }
            cVar2 = cVar3;
            aVar.a(cVar, this.C, cVar2, (List<a.b>) null, (JSONObject) null, 3);
            return z11;
        }
        cVar3.d("isCandidate:false");
        cVar3.a(com.mbridge.msdk.foundation.cache.c.f37344k);
        cVar2 = cVar3;
        z11 = true;
        aVar.a(cVar, this.C, cVar2, (List<a.b>) null, (JSONObject) null, 3);
        return z11;
    }

    public boolean a(List<CampaignEx> list, boolean z10) {
        if (list == null || list.size() <= 0) {
            q0.a("RewardVideoController", "数据为空");
        } else {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.f39351b, list)) {
                if (z10) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            q0.c("RewardMVVideoAdapter", "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f39351b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        q0.a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        q0.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        q0.a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f39351b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j())) {
                        q0.a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean a(List<CampaignEx> list, boolean z10, int i10) {
        return a(list, z10, i10, false, false);
    }

    public boolean a(List<CampaignEx> list, boolean z10, int i10, boolean z11) {
        return a(list, z10, i10, false, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r18, boolean r19, int r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(java.util.List, boolean, int, boolean, boolean):boolean");
    }

    public void b(String str) {
        this.I = str;
    }

    public void b(String str, boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            if (this.f39350a == null) {
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
                if (cVar != null) {
                    cVar.a(bVarA);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
                return;
            }
            if (a1.a(this.f39351b)) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
                if (cVar != null) {
                    cVar.a(bVarA2);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
                return;
            }
            if (this.f39361l == null) {
                com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
                if (cVar != null) {
                    cVar.a(bVarA3);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null", cVar);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() - this.B < this.f39361l.p() * 1000) {
                    com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880018, "errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY");
                    if (cVar != null) {
                        cVar.a(bVarA4);
                        cVar.b(true);
                    }
                    b("errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY", cVar);
                    return;
                }
            }
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = new com.mbridge.msdk.reward.adapter.e(this.f39352c, this.f39351b, this.f39367r, this.f39361l, cVar != null ? cVar.t() : "").a(this.f39356g, this.f39357h, this.f39353d, i(), e(), this.f39370u, str, z10, this.f39371v);
            if (eVarA == null) {
                com.mbridge.msdk.foundation.error.b bVarA5 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null");
                if (cVar != null) {
                    cVar.a(bVarA5);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null", cVar);
                return;
            }
            if (this.J != 0) {
                eVarA.a("r_index", this.J + "");
            }
            if (!TextUtils.isEmpty(this.K)) {
                eVarA.a("invalid_ad_ids", this.K);
            }
            this.N = System.currentTimeMillis();
            com.mbridge.msdk.reward.request.b bVar = new com.mbridge.msdk.reward.request.b(this.f39350a);
            b bVar2 = new b(cVar);
            bVar2.a(str);
            bVar2.setUnitId(this.f39351b);
            bVar2.setPlacementId(this.f39352c);
            boolean z11 = this.f39367r;
            int i10 = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            bVar2.setAdType(z11 ? 287 : 94);
            bVar2.a(cVar);
            boolean zA = false;
            try {
                com.mbridge.msdk.videocommon.download.j jVarA = com.mbridge.msdk.videocommon.download.j.a();
                if (!this.f39367r) {
                    i10 = 94;
                }
                zA = jVarA.a(i10);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardMVVideoAdapter", "isRewardVideoRefactorForCampaignRequest exception " + e10.getMessage());
                }
            }
            try {
                if (com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVarA) == null) {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("hst", k());
                    if (this.J != 0) {
                        eVar.a("r_index", this.J + "");
                    }
                    cVar.a("2000125", eVar);
                    com.mbridge.msdk.reward.report.metrics.a.a().a("2000125", cVar);
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            }
            if (zA) {
                bVar.getCampaign(1, str, eVarA, bVar2, com.mbridge.msdk.foundation.same.c.a(this.f39355f * 1000, 30000L));
            } else {
                bVar.choiceV3OrV5BySetting(1, eVarA, bVar2, str, com.mbridge.msdk.foundation.same.c.a(this.f39355f * 1000, 30000L));
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            b("Load exception", cVar);
            n();
        }
    }

    public boolean b(boolean z10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f39351b, 1, this.f39368s, this.f39369t);
        if (copyOnWriteArrayListB == null || copyOnWriteArrayListB.size() <= 0) {
            q0.a("RewardVideoController", "database has not can use data");
            if (z10) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("event_name", "is_ready_cse");
                eVar.a("reason", "no effective campaign list");
                eVar.a("type", 8);
                a(cVar, eVar, copyOnWriteArrayListB);
            }
            return false;
        }
        CampaignEx campaignEx = copyOnWriteArrayListB.get(0);
        cVar.i(campaignEx.getCurrentLocalRid());
        int iA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f39351b, 1, this.f39368s, this.f39369t);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || copyOnWriteArrayListB.size() >= iA) {
            boolean zA = a(copyOnWriteArrayListB, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt(), z10);
            if (z10) {
                a(zA, cVar, copyOnWriteArrayListB);
            }
            return zA;
        }
        if (z10) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("event_name", "is_ready_cltr");
            eVar2.a("reason", "nscpt error");
            eVar2.a("type", 8);
            a(cVar, eVar2, copyOnWriteArrayListB);
        }
        return false;
    }

    public void c(String str) {
        this.f39369t = str;
    }

    public void c(List<CampaignEx> list) {
        this.X = list;
    }

    public void c(boolean z10) {
        this.M = z10;
    }

    public void d(boolean z10) {
        this.f39367r = z10;
    }

    public void e(boolean z10) {
        this.f39368s = z10;
    }

    public CopyOnWriteArrayList<CampaignEx> f() {
        return this.W;
    }

    public void f(boolean z10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (z10 || (copyOnWriteArrayList = this.f39375z) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f39351b, this.f39375z);
    }

    public String g() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f39375z;
        return (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) ? com.mbridge.msdk.foundation.same.c.b(this.X) : com.mbridge.msdk.foundation.same.c.b(this.f39375z);
    }

    public boolean g(boolean z10) {
        if (z10) {
            List<CampaignEx> list = this.X;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx campaignEx : this.X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(1);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39351b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j(), true);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.f39351b, this.X, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f39375z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        for (CampaignEx campaignEx2 : this.f39375z) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(1);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39351b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().j(), true);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f39351b, this.f39375z, "load_timeout", 1);
        return true;
    }

    public CopyOnWriteArrayList<CampaignEx> h() {
        return this.f39375z;
    }

    public void h(boolean z10) {
        if (z10) {
            List<CampaignEx> list = this.X;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : this.X) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(0);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39351b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j(), false);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.f39351b, this.X, "load_timeout", 0);
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f39375z;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx2 : this.f39375z) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(0);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().j())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39351b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().j(), false);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.f39351b, this.f39375z, "load_timeout", 0);
    }

    public String j() {
        return this.f39351b;
    }

    public boolean l() {
        return b(false);
    }

    public boolean m() {
        List<CampaignEx> listC = com.mbridge.msdk.videocommon.cache.a.a().c(this.f39351b, 1, this.f39368s, this.f39369t);
        if (listC == null || listC.size() <= 0) {
            q0.a("test_isReay_db", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = listC.get(0);
        int iA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f39351b, 1, this.f39368s, this.f39369t);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || listC.size() >= iA) {
            return a(listC, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }
}
