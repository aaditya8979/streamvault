package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.cache.a;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: RewardVideoController.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static String f39446b0 = "";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static String f39447c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f39448d0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f39449e0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static ConcurrentHashMap<String, i> f39450f0 = new ConcurrentHashMap<>();
    private Queue<Integer> I;
    private String J;
    private CopyOnWriteArrayList<CampaignEx> S;
    private List<CampaignEx> T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.reward.adapter.c f39453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f39454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f39455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile InterVideoOutListener f39456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile h f39457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f39458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f39459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBridgeIds f39460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f39461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f39462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile String f39463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f39464m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f39468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f39469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f39470s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f39475x;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39465n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f39467p = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f39471t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f39472u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f39473v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f39474w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f39476y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f39477z = "";
    private String A = "";
    private ArrayList<Integer> B = new ArrayList<>(7);
    private boolean C = false;
    private final Object D = new Object();
    public boolean E = false;
    public int F = 25;
    public int G = 1;
    private List<CampaignEx> H = new ArrayList();
    private com.mbridge.msdk.foundation.db.g K = null;
    private volatile boolean L = true;
    private volatile boolean M = false;
    private volatile boolean N = false;
    private volatile boolean O = false;
    private volatile boolean P = false;
    private volatile boolean Q = false;
    private volatile boolean R = false;
    public volatile boolean U = false;
    public volatile boolean V = false;
    public volatile boolean W = false;
    public volatile boolean X = false;
    public volatile boolean Y = false;
    private JSONArray Z = new JSONArray();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f39452a0 = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f39466o = new com.mbridge.msdk.reward.controller.b(this);

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RewardVideoController.java */
    public class C0484a implements com.mbridge.msdk.videocommon.net.c {
        public C0484a() {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void onFailed(String str) {
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class b implements b.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f39479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f39481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.reward.adapter.c f39482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f39483e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardVideoController.java */
        public class RunnableC0485a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CampaignEx f39485a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f39486b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f39487c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f39488d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f39489e;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardVideoController.java */
            public class C0486a implements b.o {
                public C0486a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0529a c0529a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0485a runnableC0485a = RunnableC0485a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0485a.f39488d, (List<CampaignEx>) aVar.T);
                    if (a.this.f39457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    bVar.c("errorCode: 3301 errorMessage: temp preload failed");
                    b bVar2 = b.this;
                    if (bVar2.f39479a == null) {
                        bVar2.f39479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b bVar3 = b.this;
                    bVar3.f39479a.b(a.this.S);
                    b.this.f39479a.a(bVar);
                    a.this.f39457f.b(bVar, b.this.f39479a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0529a c0529a) {
                    RunnableC0485a runnableC0485a = RunnableC0485a.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f39482d;
                    if (cVar != null && cVar.a(runnableC0485a.f39486b, bVar.f39481c, bVar.f39483e)) {
                        if (a.this.f39457f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        RunnableC0485a runnableC0485a2 = RunnableC0485a.this;
                        a.this.a(runnableC0485a2.f39486b);
                        a.this.f39457f.d(str2, str3, b.this.f39479a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f39457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f39479a == null) {
                        bVar2.f39479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0485a runnableC0485a3 = RunnableC0485a.this;
                    b.this.f39479a.b(runnableC0485a3.f39486b);
                    b.this.f39479a.a(bVarA);
                    a.this.f39457f.b(bVarA, b.this.f39479a);
                }
            }

            public RunnableC0485a(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, String str2, String str3) {
                this.f39485a = campaignEx;
                this.f39486b = copyOnWriteArrayList;
                this.f39487c = str;
                this.f39488d = str2;
                this.f39489e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f39476y, a.this.f39466o, a.this.f39471t, a.this.f39472u, null, this.f39485a.getRewardTemplateMode().j(), a.this.f39467p, b.this.f39480b, this.f39486b, H5DownLoadManager.getInstance().getH5ResAddress(this.f39485a.getRewardTemplateMode().j()), this.f39487c, this.f39488d, this.f39489e, this.f39485a.getRequestIdNotice(), a.this.f39454c, new C0486a());
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardVideoController.java */
        public class RunnableC0487b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f39492a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f39493b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f39494c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CopyOnWriteArrayList f39495d;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardVideoController.java */
            public class C0488a implements b.o {
                public C0488a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0529a c0529a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0487b runnableC0487b = RunnableC0487b.this;
                    a aVar = a.this;
                    aVar.c(runnableC0487b.f39494c, (List<CampaignEx>) aVar.T);
                    if (a.this.f39457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3302 errorMessage: tpl preload failed");
                    }
                    b bVar2 = b.this;
                    if (bVar2.f39479a == null) {
                        bVar2.f39479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0487b runnableC0487b2 = RunnableC0487b.this;
                    b.this.f39479a.b(runnableC0487b2.f39495d);
                    b.this.f39479a.a(bVar);
                    a.this.f39457f.b(bVar, b.this.f39479a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0529a c0529a) {
                    RunnableC0487b runnableC0487b = RunnableC0487b.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f39482d;
                    if (cVar != null && cVar.a(runnableC0487b.f39495d, bVar.f39481c, bVar.f39483e)) {
                        if (a.this.f39457f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        RunnableC0487b runnableC0487b2 = RunnableC0487b.this;
                        a.this.a(runnableC0487b2.f39495d);
                        RunnableC0487b runnableC0487b3 = RunnableC0487b.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = b.this.f39479a;
                        if (cVar2 != null) {
                            cVar2.b(runnableC0487b3.f39495d);
                        }
                        a.this.f39457f.d(str2, str3, b.this.f39479a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f39457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f39479a == null) {
                        bVar2.f39479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b.this.f39479a.a(bVarA);
                    RunnableC0487b runnableC0487b4 = RunnableC0487b.this;
                    b.this.f39479a.b(runnableC0487b4.f39495d);
                    a.this.f39457f.b(bVarA, b.this.f39479a);
                }
            }

            public RunnableC0487b(String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f39492a = str;
                this.f39493b = str2;
                this.f39494c = str3;
                this.f39495d = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f39476y, a.this.f39466o, a.this.f39471t, a.this.f39472u, this.f39492a, b.this.f39480b.getRequestIdNotice(), this.f39493b, this.f39494c, b.this.f39480b.getCMPTEntryUrl(), a.this.f39467p, b.this.f39480b, this.f39495d, H5DownLoadManager.getInstance().getH5ResAddress(b.this.f39480b.getCMPTEntryUrl()), this.f39494c, a.this.f39454c, new C0488a(), true);
            }
        }

        public b(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.reward.adapter.c cVar, int i10) {
            this.f39480b = campaignEx;
            this.f39481c = z10;
            this.f39482d = cVar;
            this.f39483e = i10;
            this.f39479a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.U = true;
            if (this.f39481c) {
                if (!a.this.V || a.this.W || a.this.f39466o == null) {
                    return;
                }
                a.this.W = true;
                a.this.f39466o.post(new RunnableC0487b(str3, str, str2, copyOnWriteArrayList));
                return;
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) || campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a.this.f39466o == null) {
                    com.mbridge.msdk.reward.adapter.c cVar = this.f39482d;
                    if (cVar == null || !cVar.a(copyOnWriteArrayList, this.f39481c, this.f39483e)) {
                        a aVar = a.this;
                        aVar.c(str2, (List<CampaignEx>) aVar.T);
                        if (a.this.f39457f != null && !a.this.X) {
                            a.this.X = true;
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f39479a == null) {
                                this.f39479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            this.f39479a.b(a.this.S);
                            this.f39479a.a(bVarA);
                            a.this.f39457f.b(bVarA, this.f39479a);
                        }
                    } else if (a.this.f39457f != null && !a.this.Y) {
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        a.this.a(copyOnWriteArrayList);
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.f39479a;
                        if (cVar2 != null) {
                            cVar2.b(copyOnWriteArrayList);
                        }
                        a.this.f39457f.d(str, str2, this.f39479a);
                    }
                } else {
                    a.this.f39466o.post(new RunnableC0485a(campaignEx, copyOnWriteArrayList, str, str2, str3));
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            a.this.U = false;
            a aVar = a.this;
            aVar.c(aVar.f39459h, (List<CampaignEx>) a.this.T);
            if (a.this.f39457f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            if (this.f39479a == null) {
                this.f39479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f39479a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f39479a.a(bVar);
            a.this.f39457f.b(bVar, this.f39479a);
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class c implements b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f39498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f39500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f39501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f39502e;

        public c(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z10, int i10) {
            this.f39499b = campaignEx;
            this.f39500c = copyOnWriteArrayList;
            this.f39501d = z10;
            this.f39502e = i10;
            this.f39498a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId = bVar == null ? "" : bVar.j().getUnitId();
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (this.f39498a == null) {
                this.f39498a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f39498a.b(this.f39500c);
            this.f39498a.a(bVar);
            if (!this.f39501d && a.this.f39457f != null) {
                if (a.this.X) {
                    return;
                }
                a.this.X = true;
                a.this.f39457f.b(bVar, this.f39498a);
                return;
            }
            if (this.f39502e != 1 || a.this.X || a.this.f39457f == null) {
                return;
            }
            a.this.X = true;
            a.this.f39457f.b(bVar, this.f39498a);
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class d implements b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.mbridge.msdk.foundation.same.report.metrics.c f39504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f39506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.reward.adapter.c f39507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f39508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f39509f;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardVideoController.java */
        public class RunnableC0489a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f39511a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f39512b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f39513c;

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RewardVideoController.java */
            public class C0490a implements b.o {
                public C0490a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0529a c0529a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0489a runnableC0489a = RunnableC0489a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0489a.f39513c, (List<CampaignEx>) aVar.T);
                    if (a.this.f39457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    d dVar = d.this;
                    if (dVar.f39504a == null) {
                        dVar.f39504a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar2 = d.this;
                    dVar2.f39504a.b(dVar2.f39506c);
                    d.this.f39504a.a(bVar);
                    a.this.f39457f.b(bVar, d.this.f39504a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0529a c0529a) {
                    d dVar = d.this;
                    com.mbridge.msdk.reward.adapter.c cVar = dVar.f39507d;
                    if (cVar != null && cVar.a(dVar.f39506c, dVar.f39508e, dVar.f39509f)) {
                        if (a.this.f39457f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccess");
                        d dVar2 = d.this;
                        a.this.a(dVar2.f39506c);
                        d dVar3 = d.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = dVar3.f39504a;
                        if (cVar2 != null) {
                            cVar2.b(dVar3.f39506c);
                        }
                        a.this.f39457f.d(str2, str3, d.this.f39504a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f39457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    d dVar4 = d.this;
                    if (dVar4.f39504a == null) {
                        dVar4.f39504a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar5 = d.this;
                    dVar5.f39504a.b(dVar5.f39506c);
                    d.this.f39504a.a(bVarA);
                    a.this.f39457f.b(bVarA, d.this.f39504a);
                }
            }

            public RunnableC0489a(String str, String str2, String str3) {
                this.f39511a = str;
                this.f39512b = str2;
                this.f39513c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = a.this.f39476y;
                Handler handler = a.this.f39466o;
                boolean z11 = a.this.f39471t;
                boolean z12 = a.this.f39472u;
                String str = this.f39511a;
                String requestIdNotice = d.this.f39505b.getRequestIdNotice();
                String str2 = this.f39512b;
                String str3 = this.f39513c;
                String cMPTEntryUrl = d.this.f39505b.getCMPTEntryUrl();
                int i10 = a.this.f39467p;
                d dVar = d.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, dVar.f39505b, dVar.f39506c, H5DownLoadManager.getInstance().getH5ResAddress(d.this.f39505b.getCMPTEntryUrl()), this.f39513c, a.this.f39454c, new C0490a(), true);
            }
        }

        public d(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z10, int i10) {
            this.f39505b = campaignEx;
            this.f39506c = copyOnWriteArrayList;
            this.f39507d = cVar;
            this.f39508e = z10;
            this.f39509f = i10;
            this.f39504a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId;
            if (bVar != null) {
                unitId = bVar.j().getUnitId();
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                unitId = "";
            }
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (this.f39504a == null) {
                this.f39504a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f39504a.a(bVar);
            this.f39504a.b(this.f39506c);
            a.this.V = false;
            if (a.this.f39457f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            a.this.f39457f.b(bVar, this.f39504a);
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            a.this.V = true;
            if (!a.this.U || a.this.W || a.this.f39466o == null) {
                return;
            }
            a.this.W = true;
            a.this.f39466o.post(new RunnableC0489a(str3, str, str2));
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.K == null) {
                    a.this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(a.this.K);
                if (hVarA != null) {
                    hVarA.b(a.this.f39459h);
                }
            } catch (Throwable unused) {
                q0.b("RewardVideoController", "can't find DailyPlayCapDao");
            }
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.reward.adapter.c f39517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f39518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f39519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f39520d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f39521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f39522f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f39523g;

        public f(com.mbridge.msdk.reward.adapter.c cVar, int i10, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar2) {
            this.f39517a = cVar;
            this.f39518b = i10;
            this.f39519c = z10;
            if (cVar != null) {
                cVar.c(false);
            }
            this.f39522f = str;
            this.f39523g = cVar2;
        }

        public void a() {
            this.f39520d = true;
        }

        public void a(int i10) {
            this.f39521e = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39520d) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f39517a;
            if (cVar != null) {
                cVar.c(true);
            }
            q0.b("RewardVideoController", "adSource=" + this.f39518b + " CommonCancelTimeTask mIsDevCall：" + this.f39519c);
            a.this.a(com.mbridge.msdk.foundation.error.a.a(880023, "v3 is timeout"), this.f39523g);
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class g implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.reward.adapter.c f39525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f39526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f39527c;

        public g(com.mbridge.msdk.reward.adapter.c cVar, boolean z10) {
            this.f39525a = cVar;
            this.f39526b = z10;
        }

        public void a(f fVar) {
            this.f39527c = fVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f39527c;
            if (fVar != null) {
                fVar.a();
                a.this.f39466o.removeCallbacks(this.f39527c);
            }
            if (a.this.f39457f != null) {
                a.this.f39457f.a(a.this.f39463l, a.this.f39459h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f39527c;
            if (fVar != null) {
                fVar.a();
                a.this.f39466o.removeCallbacks(this.f39527c);
            }
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f39525a;
            if (cVar2 != null) {
                cVar2.a((com.mbridge.msdk.reward.adapter.a) null);
                this.f39525a = null;
            }
            a.this.a(list);
            if (a.this.f39457f != null) {
                a.this.f39457f.a(bVar, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f39527c;
            if (fVar != null) {
                fVar.a();
                a.this.f39466o.removeCallbacks(this.f39527c);
            }
            a.this.a(list);
            if (a.this.f39457f != null) {
                if (list != null && list.size() == 1) {
                    CampaignEx campaignEx = list.get(0);
                    if (!com.mbridge.msdk.foundation.same.c.a(a.this.f39451a, campaignEx) && campaignEx.getFilterAdsVideoCallState() == 0) {
                        if (a.this.f39452a0 > 1) {
                            a.m(a.this);
                            return;
                        }
                        com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception second");
                        if (cVar != null) {
                            cVar.a(bVarA);
                            cVar.b(true);
                        }
                        a.this.f39457f.a(bVarA, cVar);
                        return;
                    }
                }
                a.this.f39457f.c(a.this.f39463l, a.this.f39459h, cVar);
            }
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<InterVideoOutListener> f39529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f39530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f39531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f39532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f39533e;

        private h(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f39529a = new WeakReference<>(interVideoOutListener);
            this.f39530b = new AtomicInteger(0);
            this.f39531c = handler;
            this.f39532d = str;
        }

        public /* synthetic */ h(a aVar, InterVideoOutListener interVideoOutListener, Handler handler, String str, C0484a c0484a) {
            this(interVideoOutListener, handler, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.f39530b.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10) {
            this.f39530b.set(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f39530b.set(2);
            b(str, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f39529a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((this.f39530b.get() != 1 && this.f39530b.get() != 3) || this.f39531c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f39531c.sendMessage(messageObtain);
                if (s0.a().a("l_s_i_l_v_s", false)) {
                    c(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f39529a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f39530b.get() == 2 || this.f39531c == null) {
                return;
            }
            a.this.Q = true;
            String strL = bVar != null ? bVar.l() : "";
            if (strL.contains("resource load timeout")) {
                a.this.P = true;
            }
            if (a.this.Q && a.this.P && !a.this.O) {
                this.f39530b.set(2);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strL;
                    messageObtain.what = 16;
                    if (cVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", cVar.t());
                        messageObtain.setData(bundle);
                    }
                    this.f39531c.sendMessage(messageObtain);
                }
                if (cVar == null) {
                    cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                cVar.a(true);
                a.this.a("2000047", cVar, interVideoOutListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f39529a;
            a.this.a("2000047", cVar, weakReference != null ? weakReference.get() : null);
            if (this.f39531c != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                if (cVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVar.t());
                    messageObtain.setData(bundle);
                }
                this.f39531c.sendMessage(messageObtain);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f39529a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f39531c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f39531c.sendMessage(messageObtain);
                if (s0.a().a("l_s_i_l_v_s", false)) {
                    d(str, str2, cVar);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(com.mbridge.msdk.foundation.error.b r12, com.mbridge.msdk.foundation.same.report.metrics.c r13) {
            /*
                Method dump skipped, instruction units count: 339
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.h.a(com.mbridge.msdk.foundation.error.b, com.mbridge.msdk.foundation.same.report.metrics.c):void");
        }

        public void a(boolean z10) {
            this.f39533e = z10;
        }

        public void c(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f39531c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f39529a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f39530b.get() == 2 || this.f39531c == null) {
                return;
            }
            a.m(a.this);
            this.f39530b.set(2);
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f39531c.sendMessage(messageObtain);
            }
        }

        public void d(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f39531c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f39529a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f39530b.get() == 2 || this.f39531c == null) {
                return;
            }
            if (this.f39530b.get() == 1) {
                this.f39530b.set(3);
            }
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.a(true);
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f39531c.sendMessage(messageObtain);
            }
            if (a.this.P) {
                this.f39530b.set(2);
            }
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public final class i extends com.mbridge.msdk.video.bt.module.orglistener.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f39535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Handler f39536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f39537e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$i$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardVideoController.java */
        public class RunnableC0491a implements Runnable {
            public RunnableC0491a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f39535c != null) {
                    i.this.f39535c.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, a.this.f39471t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, a.this.f39459h, true, 1));
                }
            }
        }

        private i(a aVar, Handler handler) {
            this.f39537e = 0;
            this.f39535c = aVar;
            this.f39536d = handler;
        }

        public /* synthetic */ i(a aVar, a aVar2, Handler handler, C0484a c0484a) {
            this(aVar2, handler);
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(int i10, String str, String str2) {
            this.f39537e = i10;
            a aVar = this.f39535c;
            if (aVar == null || aVar.f39472u || this.f39535c.f39471t || this.f39535c.f39454c == null || !this.f39535c.f39454c.a(this.f39537e) || this.f39535c.f39457f == null || this.f39535c.f39457f.a() == 1 || this.f39535c.f39457f.a() == 3 || a.this.B.contains(Integer.valueOf(this.f39537e))) {
                return;
            }
            a.this.B.add(Integer.valueOf(this.f39537e));
            int iF = this.f39535c.f39454c.f() * 1000;
            if (this.f39537e == 4) {
                iF = 3000;
            }
            Handler handler = this.f39536d;
            if (handler == null) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0491a(), iF);
            } else {
                handler.removeMessages(1001001);
                this.f39536d.sendEmptyMessageDelayed(1001001, iF);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.E = false;
            try {
                com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(a.this.f39459h, a.this.f39471t);
                a aVar2 = this.f39535c;
                aVar.a(cVar.t(), (aVar2 == null || aVar2.f39453b == null) ? "" : this.f39535c.f39453b.H, 3, a.f39446b0);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
            try {
                a aVar3 = this.f39535c;
                if (aVar3 != null) {
                    aVar3.C = true;
                    if (this.f39535c.f39453b != null) {
                        this.f39535c.f39453b.H = "";
                    }
                    this.f39535c.q();
                    if (a.this.f39472u) {
                        a.this.a();
                    }
                    a aVar4 = a.this;
                    aVar4.a("2000130", cVar, aVar4.f39456e, "");
                    b();
                    if (this.f39535c.f39456e != null) {
                        this.f39535c.f39456e.onAdShow(a.this.f39460i);
                        this.f39537e = 2;
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
            try {
                a aVar = a.this;
                aVar.E = false;
                if (this.f39535c != null) {
                    if (aVar.f39472u) {
                        a.this.a();
                    }
                    this.f39535c.C = false;
                    a.this.a("2000131", cVar, this.f39535c.f39456e, str);
                    a();
                    if (this.f39535c.f39456e != null) {
                        try {
                            this.f39535c.f39456e.onShowFail(cVar, a.this.f39460i, str);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f39537e = 4;
                    }
                }
            } catch (Exception e11) {
                this.f39537e = 0;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
            try {
                a aVar = this.f39535c;
                if (aVar != null && aVar.f39456e != null) {
                    if (cVar2 == null) {
                        cVar2 = com.mbridge.msdk.videocommon.entity.c.a(this.f39535c.f39464m);
                    }
                    if (a.this.f39472u) {
                        a.this.a();
                        a.this.v();
                        com.mbridge.msdk.foundation.same.buffer.b.d(a.this.f39459h, a.this.m());
                    }
                    this.f39535c.f39456e.onAdClose(a.this.f39460i, new RewardInfo(z10, cVar2.c(), String.valueOf(cVar2.a())));
                    this.f39537e = 7;
                    this.f39535c.C = false;
                    e();
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().b("2000152", cVar, null);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(String str, String str2) {
            try {
                a aVar = this.f39535c;
                if (aVar == null || aVar.f39456e == null) {
                    return;
                }
                try {
                    this.f39535c.f39456e.onEndcardShow(a.this.f39460i);
                    com.mbridge.msdk.foundation.feedback.b.b().a(str2 + "_2", 2);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f39537e = 6;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, int i10) {
            try {
                a aVar = this.f39535c;
                if (aVar != null && aVar.f39456e != null) {
                    try {
                        this.f39535c.f39456e.onAdCloseWithIVReward(a.this.f39460i, new RewardInfo(z10, i10));
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoController", e10.getMessage());
                        }
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, String str, String str2) {
            try {
                a aVar = this.f39535c;
                if (aVar == null || aVar.f39456e == null) {
                    return;
                }
                if (a.this.f39472u) {
                    a.this.a();
                }
                this.f39535c.C = false;
                try {
                    this.f39535c.f39456e.onVideoAdClicked(z10, a.this.f39460i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void b(String str, String str2) {
            try {
                a aVar = this.f39535c;
                if (aVar == null || aVar.f39456e == null) {
                    return;
                }
                try {
                    this.f39535c.f39456e.onVideoComplete(a.this.f39460i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f39537e = 5;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        public void e() {
            a.this.B.clear();
            this.f39535c = null;
        }
    }

    /* JADX INFO: compiled from: RewardVideoController.java */
    public class j {
        public j() {
        }

        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f39452a0++;
            a aVar = a.this;
            aVar.b(aVar.f39475x, str, cVar);
        }
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c a(com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB;
        String currentLocalRid;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2;
        CampaignEx campaignEx;
        try {
            copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f39459h);
            currentLocalRid = "";
            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            }
            cVar2 = TextUtils.isEmpty(currentLocalRid) ? null : com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(currentLocalRid);
        } catch (Exception e10) {
            e = e10;
            cVar = null;
        }
        if (cVar2 != null) {
            cVar2.b(copyOnWriteArrayListB);
            cVar2.a("2000128", eVar);
            cVar2.i(currentLocalRid);
            cVar2.n(this.f39459h);
            com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar2);
            return cVar2;
        }
        cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        try {
            cVar.n(this.f39459h);
            eVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
            cVar.a("2000128", eVar);
            if (TextUtils.isEmpty(currentLocalRid)) {
                cVar.i(SameMD5.getMD5(v0.d()));
            } else {
                cVar.i(currentLocalRid);
                cVar.b(copyOnWriteArrayListB);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(currentLocalRid, cVar);
            }
            com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar);
        } catch (Exception e11) {
            e = e11;
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e.getMessage());
            }
        }
        return cVar;
    }

    private String a(String str) {
        try {
            String md5 = TextUtils.isEmpty(str) ? SameMD5.getMD5(v0.d()) : "";
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(v0.d()) : md5;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return "";
            }
            e10.printStackTrace();
            return "";
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null && str.equals(campaignEx.getBidToken())) {
                    copyOnWriteArrayList.add(campaignEx);
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f39457f != null) {
            this.Q = true;
            this.f39457f.a(bVar, cVar);
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f39457f != null) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880035, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f39457f.a("bidToken is empty", cVar);
        }
    }

    public static void a(String str, int i10) {
        try {
            if (f39448d0 == null || !a1.b(str)) {
                return;
            }
            f39448d0.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.videocommon.setting.c cVar2;
        com.mbridge.msdk.videocommon.setting.c cVar3;
        try {
            if (this.f39453b == null) {
                f();
            }
            if (this.f39453b != null) {
                q0.b("RewardVideoController", "controller 819");
                C0484a c0484a = null;
                if (this.f39472u ? a(false) : this.f39453b.l()) {
                    q0.c("RewardVideoController", "invoke adapter show isReady");
                    i iVar = new i(this, this, this.f39466o, c0484a);
                    f39450f0.put(this.f39459h, iVar);
                    this.f39453b.a(iVar, str, this.f39458g, this.f39467p, this.f39462k, cVar);
                    this.E = false;
                    return;
                }
                if (this.f39472u ? b() : this.f39453b.m()) {
                    q0.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    i iVar2 = new i(this, this, this.f39466o, c0484a);
                    f39450f0.put(this.f39459h, iVar2);
                    this.f39453b.a(iVar2, str, this.f39458g, this.f39467p, this.f39462k, cVar);
                    this.E = false;
                    return;
                }
            }
            this.E = false;
            a("2000131", cVar, this.f39456e, "can't show because load is failed");
            if (this.f39456e != null) {
                try {
                    this.f39456e.onShowFail(cVar, this.f39460i, "can't show because load is failed");
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            }
            if (this.f39471t || this.f39472u || (cVar3 = this.f39454c) == null || !cVar3.a(4) || this.f39457f == null || this.f39457f.a() == 1 || this.f39457f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f39459h, true, 1));
        } catch (Exception e11) {
            this.E = false;
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getLocalizedMessage());
            }
            a("2000131", cVar, this.f39456e, "show exception");
            if (this.f39456e != null) {
                try {
                    this.f39456e.onShowFail(cVar, this.f39460i, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e11.getMessage());
                    }
                }
            }
            if (this.f39471t || this.f39472u || (cVar2 = this.f39454c) == null || !cVar2.a(4) || this.f39457f == null || this.f39457f.a() == 1 || this.f39457f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f39459h, true, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener) {
        if (this.f39475x) {
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (interVideoOutListener != null) {
                    eVar.a("listener_state", 1);
                } else {
                    eVar.a("listener_state", 2);
                }
                cVar.a(str, eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (cVar == null) {
            try {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (!TextUtils.isEmpty(str2)) {
            eVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            eVar.a("listener_state", 1);
        } else {
            eVar.a("listener_state", 2);
        }
        cVar.a(str, eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f39449e0) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f39449e0.put(str, str2);
    }

    private void a(Queue<Integer> queue, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        Integer numPoll;
        try {
            this.F = 25;
            this.G = 1;
            if (queue != null && queue.size() > 0 && (numPoll = queue.poll()) != null) {
                this.F = numPoll.intValue();
            }
            try {
                a(this.G, this.F, z10, str, cVar);
            } catch (Exception e10) {
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load mv api error:" + e10.getMessage());
                if (cVar != null) {
                    cVar.a(bVarA);
                    cVar.b(true);
                }
                a(bVarA, cVar);
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        } catch (Exception e11) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880020, "load mv api error:" + e11.getMessage());
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.b(true);
            }
            a(bVarA2, cVar);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getMessage());
            }
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean z10 = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        com.mbridge.msdk.reward.adapter.b.b().a(this.f39451a, z10, nscpt, this.f39472u, this.f39471t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f39463l, this.f39459h, campaignEx.getRequestId(), copyOnWriteArrayList, new b(campaignEx, z10, cVar, nscpt), new c(campaignEx, copyOnWriteArrayList, z10, nscpt));
        if (z10) {
            com.mbridge.msdk.reward.adapter.b.b().a(this.f39451a, campaignEx, this.f39463l, this.f39459h, campaignEx.getRequestId(), new d(campaignEx, copyOnWriteArrayList, cVar, z10, nscpt));
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            cVar.a("2000127", eVar);
            cVar.a("2000048", eVar);
            cVar.a(copyOnWriteArrayList);
        } catch (Exception e10) {
            q0.b("RewardVideoController", e10.getMessage());
        }
        this.R = true;
        this.f39457f.a(this.f39472u);
        this.f39457f.b(this.f39463l, this.f39459h, cVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar2 = this.f39453b;
        if (cVar2 == null || !cVar2.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList, this.f39453b);
        } else {
            a(copyOnWriteArrayList);
            this.f39457f.d(this.f39463l, this.f39459h, cVar);
        }
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (!this.f39475x) {
            if (z10) {
                this.f39475x = z10;
            }
        } else if (z10) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f39457f.b(strB, cVar);
        }
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.f39459h);
        cVar.a(this.f39471t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        eVar.a("result", Integer.valueOf(z10 ? 1 : 2));
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f39472u ? 1 : 0));
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
                cVar.g(campaignEx.getBidToken());
            }
            cVar.b(list);
        }
        a(z10, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    private void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.reward.candidate.a aVar;
        com.mbridge.msdk.reward.candidate.a aVar2;
        if (this.f39457f != null) {
            if (!this.f39472u) {
                this.R = b(this.f39459h, cVar.t());
                if (!this.R) {
                    if (!c()) {
                        this.R = false;
                        com.mbridge.msdk.reward.adapter.c cVar2 = this.f39453b;
                        if (cVar2 != null) {
                            cVar2.c(this.S);
                        }
                        this.f39457f.a(this.f39472u);
                        a(this.I, z10, str, cVar);
                        return;
                    }
                    if (z10) {
                        if (this.f39457f != null) {
                            String strB = com.mbridge.msdk.foundation.error.a.b(880019, "");
                            cVar.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                            cVar.b(true);
                            this.f39457f.a(strB, cVar);
                            return;
                        }
                        return;
                    }
                    this.R = false;
                    com.mbridge.msdk.reward.adapter.c cVar3 = this.f39453b;
                    if (cVar3 != null) {
                        cVar3.c(this.S);
                    }
                    this.f39457f.a(this.f39472u);
                    a(this.I, z10, str, cVar);
                    return;
                }
                if (c()) {
                    q0.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                        Iterator<CampaignEx> it = this.S.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.cache.a.a().a(it.next(), this.f39459h);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar4 = this.f39453b;
                    if (cVar4 != null) {
                        cVar4.c(this.S);
                    }
                    if (!z10) {
                        this.R = false;
                        this.f39457f.a(this.f39472u);
                        a(this.I, z10, str, cVar);
                        return;
                    } else {
                        if (this.f39457f != null) {
                            String strB2 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                            cVar.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                            cVar.b(true);
                            this.f39457f.a(strB2, cVar);
                            return;
                        }
                        return;
                    }
                }
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
                if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("cache", 1);
                    cVar.a("2000127", eVar);
                    cVar.a("2000048", eVar);
                    cVar.a(copyOnWriteArrayList2);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f39457f.b(this.f39463l, this.f39459h, cVar);
                CampaignEx campaignEx = copyOnWriteArrayList2.get(0);
                this.f39457f.a(this.f39472u);
                com.mbridge.msdk.reward.adapter.c cVar5 = this.f39453b;
                if (cVar5 == null || !cVar5.a(copyOnWriteArrayList2, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                    a(copyOnWriteArrayList2, this.f39453b);
                } else {
                    a(copyOnWriteArrayList2);
                    this.f39457f.d(this.f39463l, this.f39459h, cVar);
                }
                if (this.L) {
                    com.mbridge.msdk.reward.adapter.c cVar6 = this.f39453b;
                    if (cVar6 != null) {
                        cVar6.c(this.S);
                    }
                    a(this.I, z10, str, cVar);
                    return;
                }
                return;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f39459h, 1, this.f39472u, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB2 = null;
            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                if (c()) {
                    com.mbridge.msdk.videocommon.cache.a.a().b(this.f39459h, str);
                    if (!z10 || this.f39457f == null) {
                        return;
                    }
                    String strB3 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880019, "");
                    if (cVar != null) {
                        cVar.a(bVarA);
                        cVar.b(true);
                    }
                    this.f39457f.a(strB3, cVar);
                    return;
                }
                if (this.f39453b == null) {
                    f();
                }
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = a(str, copyOnWriteArrayListB);
                if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0) {
                    a(copyOnWriteArrayListA, str, cVar);
                    return;
                }
                try {
                    com.mbridge.msdk.reward.candidate.a aVar3 = new com.mbridge.msdk.reward.candidate.a(this.f39459h, this.f39471t);
                    com.mbridge.msdk.foundation.cache.c cVar7 = new com.mbridge.msdk.foundation.cache.c();
                    if (aVar3.a(str)) {
                        aVar2 = aVar3;
                        cVar7 = aVar3.a(str, cVar, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f39453b);
                        if (cVar7 != null && cVar7.g() == com.mbridge.msdk.foundation.cache.c.f37345l && cVar7.c() != null && cVar7.c().size() > 0 && this.f39453b != null) {
                            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC = cVar7.c();
                            ArrayList arrayList = new ArrayList();
                            Iterator<CampaignEx> it2 = copyOnWriteArrayListB.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                CampaignEx next = it2.next();
                                if (next != null) {
                                    String requestId = next.getRequestId();
                                    if (!TextUtils.isEmpty(requestId)) {
                                        for (int i10 = 0; i10 < copyOnWriteArrayListC.size(); i10++) {
                                            CampaignEx campaignEx2 = copyOnWriteArrayListC.get(i10);
                                            if (campaignEx2 != null) {
                                                if (requestId.equals(campaignEx2.getRequestId())) {
                                                    break;
                                                } else if (i10 == copyOnWriteArrayListC.size() - 1) {
                                                    arrayList.add(next);
                                                }
                                            }
                                        }
                                        if (copyOnWriteArrayListC.size() == 0) {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                            }
                            this.f39453b.c(arrayList);
                            this.f39453b.a(cVar7.c(), false, true, true);
                            copyOnWriteArrayListB2 = new CopyOnWriteArrayList<>(cVar7.c());
                        }
                    } else {
                        aVar2 = aVar3;
                        copyOnWriteArrayListB2 = b(str, copyOnWriteArrayListB);
                        if (copyOnWriteArrayListB2.size() > 0) {
                            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, copyOnWriteArrayListB2);
                        }
                        cVar7.d("cb is closed");
                        cVar7.a(com.mbridge.msdk.foundation.cache.c.f37344k);
                    }
                    aVar2.a(cVar, str, cVar7, (List<a.b>) null, (JSONObject) null, 1);
                    if (copyOnWriteArrayListB2 != null && copyOnWriteArrayListB2.size() > 0) {
                        a(copyOnWriteArrayListB2, str, cVar);
                        if (this.f39453b != null && !aVar2.a(str)) {
                            this.f39453b.c(copyOnWriteArrayListB2);
                        }
                    }
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e11.getMessage());
                    }
                }
                this.R = false;
                this.f39457f.a(this.f39472u);
                a(this.I, z10, str, cVar);
                return;
            }
            if (c()) {
                com.mbridge.msdk.videocommon.cache.a.a().b(this.f39459h, str);
                if (!z10 || this.f39457f == null) {
                    return;
                }
                String strB4 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880019, "");
                if (cVar != null) {
                    cVar.a(bVarA2);
                    cVar.b(true);
                }
                this.f39457f.a(strB4, cVar);
                return;
            }
            try {
                com.mbridge.msdk.reward.candidate.a aVar4 = new com.mbridge.msdk.reward.candidate.a(this.f39459h, this.f39471t);
                com.mbridge.msdk.foundation.cache.c cVar8 = new com.mbridge.msdk.foundation.cache.c();
                if (aVar4.a(str)) {
                    if (this.f39453b == null) {
                        com.mbridge.msdk.reward.adapter.c cVar9 = new com.mbridge.msdk.reward.adapter.c(this.f39451a, this.f39463l, this.f39459h);
                        this.f39453b = cVar9;
                        cVar9.d(this.f39471t);
                        this.f39453b.e(this.f39472u);
                        if (this.f39471t) {
                            this.f39453b.a(this.f39468q, this.f39469r, this.f39470s);
                        }
                        this.f39453b.a(this.f39467p);
                        this.f39453b.a(this.f39454c);
                    }
                    aVar = aVar4;
                    cVar8 = aVar4.a(str, cVar, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f39453b);
                    if (cVar8 != null && cVar8.g() == com.mbridge.msdk.foundation.cache.c.f37345l && cVar8.c() != null && cVar8.c().size() > 0 && this.f39453b != null) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC2 = cVar8.c();
                        if (copyOnWriteArrayListB != null) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<CampaignEx> it3 = copyOnWriteArrayListB.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                CampaignEx next2 = it3.next();
                                if (next2 != null) {
                                    String requestId2 = next2.getRequestId();
                                    if (!TextUtils.isEmpty(requestId2)) {
                                        for (int i11 = 0; i11 < copyOnWriteArrayListC2.size(); i11++) {
                                            CampaignEx campaignEx3 = copyOnWriteArrayListC2.get(i11);
                                            if (campaignEx3 != null) {
                                                if (requestId2.equals(campaignEx3.getRequestId())) {
                                                    break;
                                                } else if (i11 == copyOnWriteArrayListC2.size() - 1) {
                                                    arrayList2.add(next2);
                                                }
                                            }
                                        }
                                        if (copyOnWriteArrayListC2.size() == 0) {
                                            arrayList2.add(next2);
                                        }
                                    }
                                }
                            }
                            this.f39453b.c(arrayList2);
                        }
                        this.f39453b.a(cVar8.c(), false, true, true);
                        copyOnWriteArrayListB2 = new CopyOnWriteArrayList<>(cVar8.c());
                    }
                } else {
                    aVar = aVar4;
                    copyOnWriteArrayListB2 = b(str, copyOnWriteArrayListB);
                    if (copyOnWriteArrayListB2.size() > 0) {
                        com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, copyOnWriteArrayListB2);
                    }
                    cVar8.d("cb is closed 2");
                    cVar8.a(com.mbridge.msdk.foundation.cache.c.f37344k);
                }
                aVar.a(cVar, str, cVar8, (List<a.b>) null, (JSONObject) null, 1);
                if (copyOnWriteArrayListB2 != null && copyOnWriteArrayListB2.size() > 0) {
                    a(copyOnWriteArrayListB2, str, cVar);
                    if (this.f39453b != null && !aVar.a(str)) {
                        this.f39453b.c(copyOnWriteArrayListB2);
                    }
                }
            } catch (Exception e12) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e12.getMessage());
                }
            }
            this.R = false;
            this.f39457f.a(this.f39472u);
            a(this.I, z10, str, cVar);
        }
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str, boolean z10) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.f39453b.c(cVar.a());
                this.f39453b.b(cVar.d());
                if (this.f39453b.l()) {
                    if (z10) {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        cVar2.i(cVar.d());
                        a(false, cVar2, (List<CampaignEx>) this.f39453b.h());
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(boolean z10) {
        if (this.f39453b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f39459h);
        String str = this.A;
        if (listA == null || listA.size() <= 0) {
            if (!z10) {
                return false;
            }
            d("is_ready_ctir_false", "no effective campaign list");
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.i(str);
            cVar.g(this.f39477z);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 8);
            cVar.a("m_offer_ready", eVar);
            a(false, cVar, (List<CampaignEx>) this.f39453b.h());
            return false;
        }
        String strD = com.mbridge.msdk.foundation.same.buffer.b.d(this.f39459h);
        boolean zA = TextUtils.isEmpty(strD) ? false : a(listA, strD, z10);
        if (z10) {
            d("is_ready_ctir_" + zA, "");
        }
        if (zA) {
            if (!z10) {
                return zA;
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(str);
            a(zA, cVar2, this.f39453b.h());
            return zA;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar3 : listA) {
            if (cVar3 != null) {
                this.f39453b.c(cVar3.a());
                this.f39453b.b(cVar3.d());
                if (this.f39453b.b(z10)) {
                    cVar3.d();
                    return true;
                }
            }
        }
        return zA;
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c b(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
        try {
            b(z10);
            String md5 = TextUtils.isEmpty(str) ? SameMD5.getMD5(v0.d()) : a(str);
            this.A = md5;
            cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(md5);
            if (cVar2 == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(md5, cVar);
                    cVar.d(true);
                    cVar2 = cVar;
                } catch (Exception e10) {
                    e = e10;
                }
            }
            cVar2.i(md5);
            cVar2.n(this.f39459h);
            if (eVar != null) {
                if (eVar.a("adtp")) {
                    cVar2.a(Integer.parseInt((String) eVar.b("adtp")));
                }
                if (eVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str2 = (String) eVar.b(CampaignEx.JSON_KEY_HB);
                    cVar2.h(str2);
                    if (str2.equals("1")) {
                        cVar2.g(str);
                    }
                }
            }
            cVar2.f(z10 ? "2" : "1");
            if (!z10) {
                return cVar2;
            }
            com.mbridge.msdk.reward.report.metrics.a.a().a("2000123", cVar2);
            return cVar2;
        } catch (Exception e11) {
            e = e11;
            cVar = cVar2;
        }
        if (MBridgeConstans.DEBUG) {
            q0.b("RewardVideoController", e.getMessage());
        }
        return cVar;
    }

    private CopyOnWriteArrayList<CampaignEx> b(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int vcn = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > vcn) {
                                vcn = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= vcn && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f39459h, str, vcn);
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f39457f != null) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880001, "");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f39457f.a(strB, cVar);
        }
    }

    private void b(boolean z10) {
        List<String> listE;
        if (z10) {
            try {
                com.mbridge.msdk.foundation.db.e eVarA = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f39451a));
                if (eVarA != null && (listE = eVarA.e(this.f39459h)) != null && listE.size() > 0) {
                    Iterator<String> it = listE.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().d(it.next());
                    }
                }
                LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC = com.mbridge.msdk.foundation.same.report.metrics.d.b().c();
                if (linkedHashMapC == null || linkedHashMapC.size() <= 0) {
                    return;
                }
                Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it2 = linkedHashMapC.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it2.next();
                    if (next != null && next.getValue().E()) {
                        it2.remove();
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private boolean b() {
        if (this.f39453b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f39459h);
        if (listA == null || listA.size() <= 0) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : listA) {
            if (cVar != null) {
                this.f39453b.c(cVar.a());
                this.f39453b.b(cVar.d());
                if (this.f39453b.m()) {
                    return true;
                }
                com.mbridge.msdk.videocommon.cache.a.a().d(this.f39459h, cVar.a());
            }
        }
        return false;
    }

    private boolean b(String str, String str2) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.f39453b;
            if (cVar == null || !str.equals(cVar.j())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.f39451a, this.f39463l, str);
                this.f39453b = cVar2;
                cVar2.d(this.f39471t);
                this.f39453b.e(this.f39472u);
            }
            this.f39453b.a(this.f39467p);
            this.f39453b.a(this.f39454c);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
        List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(str, 1, this.f39472u);
        this.T = com.mbridge.msdk.videocommon.cache.a.a().a(str, 1, this.f39472u);
        if (listB == null || listB.size() <= 0) {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
            if (copyOnWriteArrayList == null) {
                return false;
            }
            copyOnWriteArrayList.clear();
            return false;
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(str, listB, str2);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
        if (copyOnWriteArrayList2 == null) {
            this.S = new CopyOnWriteArrayList<>();
        } else {
            copyOnWriteArrayList2.clear();
        }
        for (CampaignEx campaignEx : listB) {
            campaignEx.setLocalRequestId(str2);
            this.S.add(campaignEx);
        }
        a(this.S);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || this.O) {
                    return;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(list, str);
            } catch (Throwable th2) {
                q0.b("RewardVideoController", th2.getMessage());
            }
        }
    }

    private boolean c() {
        try {
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
            com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(this.K);
            if (this.f39454c == null) {
                this.f39454c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39459h, this.f39471t);
            }
            int iK = this.f39454c.k();
            if (hVarA != null) {
                if (hVarA.a(this.f39459h, iK)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
            q0.b("RewardVideoController", "cap check error");
        }
        return false;
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.n(this.f39459h);
            cVar.a(this.f39471t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("event_name", str);
            eVar.a("reason", str2);
            cVar.a("m_temp_is_ready_check", eVar);
            com.mbridge.msdk.reward.report.metrics.a.a().a("m_temp_is_ready_check", cVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private boolean d() {
        if (this.f39453b == null) {
            f();
        }
        com.mbridge.msdk.reward.adapter.c cVar = this.f39453b;
        if (cVar != null) {
            return cVar.b(true);
        }
        return false;
    }

    private void f() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.f39451a, this.f39463l, this.f39459h);
        this.f39453b = cVar;
        cVar.d(this.f39471t);
        this.f39453b.e(this.f39472u);
        if (this.f39471t) {
            this.f39453b.a(this.f39468q, this.f39469r, this.f39470s);
        }
        this.f39453b.a(this.f39454c);
    }

    public static /* synthetic */ int m(a aVar) {
        int i10 = aVar.f39452a0;
        aVar.f39452a0 = i10 - 1;
        return i10;
    }

    private void w() {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f39451a)).b(this.f39459h);
    }

    private void x() {
        try {
            List<CampaignEx> listC = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f39451a)).c(this.f39459h);
            if (listC == null || listC.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : listC) {
                if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                } else {
                    com.mbridge.msdk.videocommon.a.e(this.f39459h + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        com.mbridge.msdk.videocommon.a.e(this.f39459h + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j());
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(android.os.Message r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1f
            android.os.Bundle r3 = r3.getData()     // Catch: java.lang.Exception -> L17
            if (r3 == 0) goto L1f
            com.mbridge.msdk.foundation.same.report.metrics.d r0 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L17
            java.lang.String r1 = "metrics_data_lrid"
            java.lang.String r3 = r3.getString(r1)     // Catch: java.lang.Exception -> L17
            com.mbridge.msdk.foundation.same.report.metrics.c r3 = r0.b(r3)     // Catch: java.lang.Exception -> L17
            goto L20
        L17:
            r3 = move-exception
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto L1f
            r3.printStackTrace()
        L1f:
            r3 = 0
        L20:
            if (r3 != 0) goto L27
            com.mbridge.msdk.foundation.same.report.metrics.c r3 = new com.mbridge.msdk.foundation.same.report.metrics.c
            r3.<init>()
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(android.os.Message):com.mbridge.msdk.foundation.same.report.metrics.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r5, com.mbridge.msdk.foundation.same.report.metrics.c r6) {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.same.report.metrics.c r0 = new com.mbridge.msdk.foundation.same.report.metrics.c
            r0.<init>()
            java.lang.String r1 = ""
            if (r5 == 0) goto L35
            int r2 = r5.size()     // Catch: java.lang.Exception -> L9f
            if (r2 <= 0) goto L35
            r2 = 0
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Exception -> L9f
            if (r3 == 0) goto L2b
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = r1.getLocalRequestId()     // Catch: java.lang.Exception -> L9f
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = r2.getNLRid()     // Catch: java.lang.Exception -> L9f
            goto L2c
        L2b:
            r2 = r1
        L2c:
            r0.i(r1)     // Catch: java.lang.Exception -> L9f
            r0.b(r5)     // Catch: java.lang.Exception -> L9f
            r5 = r1
            r1 = r2
            goto L36
        L35:
            r5 = r1
        L36:
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L9f
            if (r1 == 0) goto L3d
            return r6
        L3d:
            com.mbridge.msdk.foundation.same.report.metrics.e r6 = new com.mbridge.msdk.foundation.same.report.metrics.e     // Catch: java.lang.Exception -> L9f
            r6.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "cache"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            r6.a(r1, r3)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "hb"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "auto_load"
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "2000127"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "2000048"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L9f
            boolean r6 = r4.f39471t     // Catch: java.lang.Exception -> L9f
            if (r6 == 0) goto L70
            r6 = 287(0x11f, float:4.02E-43)
            goto L72
        L70:
            r6 = 94
        L72:
            r0.a(r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = "1"
            r0.h(r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = "2"
            r0.f(r6)     // Catch: java.lang.Exception -> L9f
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L9f
            if (r6 != 0) goto La7
            com.mbridge.msdk.foundation.same.report.metrics.d r6 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L9f
            java.util.LinkedHashMap r6 = r6.c()     // Catch: java.lang.Exception -> L9f
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Exception -> L9f
            if (r6 != 0) goto La7
            com.mbridge.msdk.foundation.same.report.metrics.d r6 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L9f
            java.util.LinkedHashMap r6 = r6.c()     // Catch: java.lang.Exception -> L9f
            r6.put(r5, r0)     // Catch: java.lang.Exception -> L9f
            goto La7
        L9f:
            r5 = move-exception
            boolean r6 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r6 == 0) goto La7
            r5.printStackTrace()
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.util.List, com.mbridge.msdk.foundation.same.report.metrics.c):com.mbridge.msdk.foundation.same.report.metrics.c");
    }

    public void a() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f39460i;
            if (mBridgeIds != null) {
                if (!this.C) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String strM = m();
                if (TextUtils.isEmpty(strM)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = f39449e0;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(strM) && !TextUtils.isEmpty(f39449e0.get(strM))) {
                    str = f39449e0.get(strM);
                }
                this.f39460i.setBidToken(str);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(int i10) {
        this.f39467p = i10;
    }

    public void a(int i10, int i11, int i12) {
        this.f39468q = i10;
        this.f39469r = i11;
        if (i11 == com.mbridge.msdk.foundation.same.a.K) {
            this.f39470s = i12 < 0 ? 5 : i12;
        }
        if (i11 == com.mbridge.msdk.foundation.same.a.J) {
            this.f39470s = i12 < 0 ? 80 : i12;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i10 == com.mbridge.msdk.foundation.same.a.H ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i11 == com.mbridge.msdk.foundation.same.a.J ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i12);
            com.mbridge.msdk.setting.h.b().i(this.f39459h, jSONObject.toString());
        } catch (Exception unused) {
            q0.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    public void a(int i10, int i11, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f39453b;
            if (cVar2 == null || !this.f39459h.equals(cVar2.j())) {
                com.mbridge.msdk.reward.adapter.c cVar3 = new com.mbridge.msdk.reward.adapter.c(this.f39451a, this.f39463l, this.f39459h);
                this.f39453b = cVar3;
                cVar3.d(this.f39471t);
                this.f39453b.e(this.f39472u);
            }
            if (this.f39471t) {
                this.f39453b.a(this.f39468q, this.f39469r, this.f39470s);
            }
            this.H = new ArrayList();
            this.f39453b.a(this.f39467p);
            this.f39453b.a(this.f39454c);
            f fVar = new f(this.f39453b, i10, z10, str, cVar);
            fVar.a(i11);
            g gVar = new g(this.f39453b, z10);
            this.f39461j = gVar;
            gVar.a(fVar);
            this.f39453b.a(this.f39461j);
            this.f39453b.a(0, "");
            this.f39453b.a(new j());
            this.f39453b.a(i10, i11, z10, str, this.f39476y, cVar);
            this.f39466o.postDelayed(fVar, i11 * 1000);
        } catch (Exception e10) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, e10.getMessage());
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            a(bVarA, cVar);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    public void a(InterVideoOutListener interVideoOutListener) {
        this.f39456e = interVideoOutListener;
        this.f39457f = new h(this, interVideoOutListener, this.f39466o, this.f39459h, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r11, java.lang.String r12, java.lang.String r13, com.mbridge.msdk.foundation.same.report.metrics.e r14) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.e):void");
    }

    public void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            y0.b(this.f39451a, "MBridge_ConfirmTitle" + this.f39459h, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            y0.b(this.f39451a, "MBridge_ConfirmContent" + this.f39459h, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            y0.b(this.f39451a, "MBridge_CancelText" + this.f39459h, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        y0.b(this.f39451a, "MBridge_ConfirmText" + this.f39459h, str3.trim());
    }

    public void a(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            this.H = new ArrayList();
        } else {
            this.H = list;
        }
    }

    public void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a(z10, "", eVar);
    }

    public void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = b(z10, str, eVar);
        this.f39477z = str;
        if (this.f39457f == null) {
            this.f39457f = new h(this, null, this.f39466o, this.f39459h, null);
        }
        if (this.f39457f != null && this.f39457f.a() == 1) {
            a(z10, cVarB);
            return;
        }
        this.f39452a0 = 1;
        if (this.f39457f == null || this.f39457f.a() != 3) {
            this.L = true;
            if (this.f39457f != null) {
                this.f39457f.a(1);
            }
        } else {
            this.L = false;
        }
        this.f39475x = z10;
        this.f39466o.removeMessages(1001001);
        this.O = false;
        this.N = false;
        this.P = false;
        this.Q = false;
        x();
        w();
        com.mbridge.msdk.reward.adapter.b.b().c();
        try {
            if (TextUtils.isEmpty(str)) {
                if (this.f39471t) {
                    com.mbridge.msdk.timer.b.getInstance().addInterstitialList(this.f39463l, this.f39459h);
                } else {
                    com.mbridge.msdk.timer.b.getInstance().addRewardList(this.f39463l, this.f39459h);
                }
            }
            if (this.f39472u && TextUtils.isEmpty(str)) {
                a(cVarB);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                b(cVarB);
                return;
            }
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39459h);
            this.f39454c = cVarC;
            if (cVarC == null) {
                this.J = com.mbridge.msdk.foundation.controller.c.n().b();
                com.mbridge.msdk.videocommon.setting.b.b().a(this.J, com.mbridge.msdk.foundation.controller.c.n().c(), this.f39459h, new C0484a());
                this.f39454c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39459h, this.f39471t);
            }
            if (!TextUtils.isEmpty(this.f39463l)) {
                this.f39454c.f(this.f39463l);
            }
            int iN = this.f39454c.n() * 1000;
            if (this.f39466o != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001002;
                if (cVarB != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVarB.t());
                    messageObtain.setData(bundle);
                }
                this.f39466o.sendMessageDelayed(messageObtain, iN);
            }
            this.I = this.f39454c.z();
            try {
                a(z10, str, cVarB);
            } catch (Exception e10) {
                if (this.f39457f != null) {
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception");
                    if (cVarB != null) {
                        cVarB.a(bVarA);
                        cVarB.b(true);
                    }
                    this.f39457f.a(bVarA, cVarB);
                }
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        } catch (Exception e11) {
            if (this.f39457f != null) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "");
                if (cVarB != null) {
                    cVarB.a(bVarA2);
                    cVarB.b(true);
                }
                this.f39457f.a(bVarA2, cVarB);
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getMessage());
            }
        }
    }

    public void b(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(cVar);
        String str2 = cVarA.t() + "label_second";
        cVarA.i(str2);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(str2, cVarA);
        try {
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f39453b;
            if (cVar2 == null || !this.f39459h.equals(cVar2.j())) {
                com.mbridge.msdk.reward.adapter.c cVar3 = new com.mbridge.msdk.reward.adapter.c(this.f39451a, this.f39463l, this.f39459h);
                this.f39453b = cVar3;
                cVar3.d(this.f39471t);
                this.f39453b.e(this.f39472u);
            }
            if (this.f39471t) {
                this.f39453b.a(this.f39468q, this.f39469r, this.f39470s);
            }
            if (cVarA.o() != null && !cVarA.o().isEmpty()) {
                this.Z.put(cVarA.o().get(0).getId());
            }
            this.f39453b.a(this.f39467p);
            this.f39453b.a(this.f39454c);
            f fVar = new f(this.f39453b, this.G, z10, str, cVarA);
            fVar.a(this.F);
            this.f39461j.a(fVar);
            this.f39453b.a(this.f39461j);
            this.f39453b.a(1, this.Z.toString());
            this.f39453b.a(this.G, this.F, z10, str, this.f39476y, cVarA);
            this.f39466o.postDelayed(fVar, this.F * 1000);
        } catch (Exception e10) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, e10.getMessage());
            cVarA.a(bVarA);
            cVarA.b(true);
            a(bVarA, cVarA);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    public void c(String str, String str2) {
        try {
            this.f39451a = com.mbridge.msdk.foundation.controller.c.n().d();
            this.f39459h = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f39463l = str;
            this.f39460i = new MBridgeIds(this.f39463l, this.f39459h);
            this.f39455d = com.mbridge.msdk.videocommon.setting.b.b().c();
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new com.mbridge.msdk.reward.controller.c(this.f39451a, this.f39459h));
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th2) {
            q0.b("RewardVideoController", th2.getMessage(), th2);
        }
    }

    public boolean c(boolean z10) {
        boolean zA;
        try {
            if (c()) {
                if (!z10) {
                    return false;
                }
                d("is_ready_start", "over cap check error");
                com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 10);
                cVar.a("m_offer_ready", eVar);
                a(false, cVar, (List<CampaignEx>) this.f39453b.h());
                return false;
            }
            if (this.f39472u) {
                try {
                    zA = a(z10);
                } catch (Exception e10) {
                    if (!MBridgeConstans.DEBUG) {
                        return false;
                    }
                    q0.b("RewardVideoController", e10.getMessage());
                    return false;
                }
            } else {
                zA = d();
            }
            return zA;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            q0.b("RewardVideoController", th2.getMessage());
            return false;
        }
    }

    public void d(boolean z10) {
        this.f39471t = z10;
        if (z10) {
            this.f39467p = com.mbridge.msdk.foundation.same.a.X;
        } else {
            this.f39467p = com.mbridge.msdk.foundation.same.a.W;
        }
    }

    public void e() {
        o0.b();
    }

    public void e(boolean z10) {
        this.f39472u = z10;
    }

    public void f(boolean z10) {
        this.f39476y = z10;
    }

    public MBridgeIds g() {
        return this.f39460i;
    }

    public List<CampaignEx> h() {
        return this.T;
    }

    public CopyOnWriteArrayList<CampaignEx> i() {
        return this.S;
    }

    public String j() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f39453b;
        return cVar != null ? cVar.g() : "";
    }

    public h k() {
        return this.f39457f;
    }

    public String l() {
        return this.f39463l;
    }

    public String m() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f39453b;
        return cVar != null ? cVar.a(this.C) : "";
    }

    public com.mbridge.msdk.reward.adapter.c n() {
        return this.f39453b;
    }

    public InterVideoOutListener o() {
        return this.f39456e;
    }

    public String p() {
        return this.f39459h;
    }

    public void q() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e());
    }

    public boolean r() {
        return this.f39472u;
    }

    public boolean s() {
        return this.f39475x;
    }

    public boolean t() {
        return this.f39471t;
    }

    public boolean u() {
        return (this.f39456e == null || this.f39457f == null) ? false : true;
    }

    public void v() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.C || (concurrentHashMap = f39449e0) == null || concurrentHashMap.containsKey(m())) {
            return;
        }
        f39449e0.remove(m());
    }
}
