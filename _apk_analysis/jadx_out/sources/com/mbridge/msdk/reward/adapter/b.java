package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.exifinterface.media.ExifInterface;
import androidx.multidex.MultiDexExtractor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.videocommon.a;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, f> f39181g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f39182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f39184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f39185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f39186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile List<WindVaneWebView> f39187f;

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f39188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f39189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f39190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f39191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f39192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f39193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f39194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ n f39195h;

        public a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i10, String str2, String str3, String str4, n nVar) {
            this.f39188a = copyOnWriteArrayList;
            this.f39189b = context;
            this.f39190c = str;
            this.f39191d = i10;
            this.f39192e = str2;
            this.f39193f = str3;
            this.f39194g = str4;
            this.f39195h = nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x02d3  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0273 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:185:0x02a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0251  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 1000
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a.run():void");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public class C0477b implements z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f39197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39198b;

        public C0477b(int i10, CampaignEx campaignEx) {
            this.f39197a = i10;
            this.f39198b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i10 = this.f39197a;
            if (i10 == 0) {
                nVar.e(1);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 1) {
                nVar.e(2);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 2) {
                nVar.e(3);
                nVar.d(3);
                nVar.j("m_download_end");
                nVar.b(this.f39198b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                nVar.f("1");
            }
            b.b(nVar, this.f39198b);
            nVar.o(this.f39198b.getRequestIdNotice());
            nVar.m(message);
            nVar.b("scenes", "1");
            nVar.b("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f39198b);
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i10 = this.f39197a;
                if (i10 == 0) {
                    nVar.e(1);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 1) {
                    nVar.e(2);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 2) {
                    nVar.e(3);
                    nVar.d(1);
                    nVar.j("m_download_end");
                    nVar.b(this.f39198b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                    nVar.f("1");
                }
                nVar.o(this.f39198b.getRequestIdNotice());
                nVar.b("url", str);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f39198b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public class c implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f39200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f39201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f39202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n f39204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f39205f;

        public c(String str, String str2, String str3, CampaignEx campaignEx, n nVar, Context context) {
            this.f39200a = str;
            this.f39201b = str2;
            this.f39202c = str3;
            this.f39203d = campaignEx;
            this.f39204e = nVar;
            this.f39205f = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFailed(java.lang.String r21, java.lang.String r22) {
            /*
                Method dump skipped, instruction units count: 364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.c.onFailed(java.lang.String, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            String str3;
            String str4;
            String str5;
            try {
                q0.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39200a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f39201b);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f39202c);
                bundle.putString("key", this.f39200a + "_" + this.f39202c + "_" + this.f39203d.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                b.this.f39182a.sendMessage(messageObtain);
                n nVar = this.f39204e;
                if (nVar != null) {
                    nVar.a(this.f39201b, this.f39200a, this.f39202c, str);
                }
                if (z10) {
                    return;
                }
                str3 = "RewardCampaignsResourceManager";
                str4 = "_";
                try {
                    b.this.a(this.f39205f, 1, this.f39203d, str, "", this.f39200a, str2);
                    return;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                str3 = "RewardCampaignsResourceManager";
                str4 = "_";
            }
            Exception exc = e;
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 205;
            Bundle bundle2 = new Bundle();
            bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39200a);
            bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f39201b);
            bundle2.putString(CommonUrlParts.REQUEST_ID, this.f39202c);
            bundle2.putString("key", this.f39200a + str4 + this.f39202c + str4 + this.f39203d.getSecondRequestIndex());
            bundle2.putString("url", str);
            messageObtain2.setData(bundle2);
            b.this.f39182a.sendMessage(messageObtain2);
            if (this.f39204e != null) {
                try {
                    this.f39204e.a(str, this.f39202c, b.b(880005, new MBridgeIds(this.f39201b, this.f39200a, this.f39202c), "", exc, null));
                    str5 = str3;
                } catch (Exception e12) {
                    str5 = str3;
                    q0.b(str5, e12.getMessage());
                }
            } else {
                str5 = str3;
            }
            b.this.a(this.f39205f, 3, this.f39203d, str, exc.getLocalizedMessage(), this.f39200a, str2);
            if (MBridgeConstans.DEBUG) {
                q0.b(str5, exc.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f39208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f39209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f39210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f39211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f39212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f39213g;

        public d(CampaignEx campaignEx, Context context, int i10, String str, String str2, String str3, String str4) {
            this.f39207a = campaignEx;
            this.f39208b = context;
            this.f39209c = i10;
            this.f39210d = str;
            this.f39211e = str2;
            this.f39212f = str3;
            this.f39213g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39207a == null || this.f39208b == null) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("m_download_end");
                Context context = this.f39208b;
                if (context != null) {
                    nVar.c(m0.s(context.getApplicationContext()));
                }
                nVar.d(this.f39209c);
                CampaignEx campaignEx = this.f39207a;
                if (campaignEx != null) {
                    nVar.b(campaignEx.getId());
                    nVar.n(this.f39207a.getRequestId());
                    nVar.k(this.f39207a.getCurrentLocalRid());
                    nVar.o(this.f39207a.getRequestIdNotice());
                }
                nVar.b("url", this.f39210d);
                nVar.t(this.f39210d);
                nVar.m(this.f39211e);
                nVar.u(this.f39212f);
                if (!TextUtils.isEmpty(this.f39213g)) {
                    nVar.q(this.f39213g);
                }
                nVar.e(1);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f39207a);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f39215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WindVaneWebView f39216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f39218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f39219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.videocommon.setting.c f39220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f39221g;

        public e(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.setting.c cVar, String str2) {
            this.f39215a = z10;
            this.f39216b = windVaneWebView;
            this.f39217c = campaignEx;
            this.f39218d = copyOnWriteArrayList;
            this.f39219e = str;
            this.f39220f = cVar;
            this.f39221g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f39215a, this.f39216b, this.f39217c.getRewardTemplateMode().j(), 0, this.f39217c, (CopyOnWriteArrayList<CampaignEx>) this.f39218d, H5DownLoadManager.getInstance().getH5ResAddress(this.f39217c.getRewardTemplateMode().j()), this.f39219e, this.f39220f, this.f39221g, b.this.f39183b);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f39223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f39224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f39226d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f39227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f39228f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f39229g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CopyOnWriteArrayList<CampaignEx> f39230h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CopyOnWriteArrayList<CampaignEx> f39231i;

        public f(boolean z10, boolean z11, int i10, int i11, String str, String str2, int i12, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f39223a = z10;
            this.f39224b = z11;
            this.f39225c = i10;
            this.f39226d = i11;
            this.f39227e = str;
            this.f39228f = str2;
            this.f39229g = i12;
            this.f39230h = copyOnWriteArrayList;
            this.f39231i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static class g extends com.mbridge.msdk.mbsignalcommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f39232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f39233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f39234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f39235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f39236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f39237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f39238g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f39239h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f39240i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private a.C0529a f39241j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CampaignEx f39242k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f39243l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private com.mbridge.msdk.videocommon.setting.c f39244m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final o f39245n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f39246o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f39247p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f39248q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f39249r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f39250s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f39251t;

        public g(boolean z10, Handler handler, Runnable runnable, boolean z11, boolean z12, int i10, String str, String str2, String str3, String str4, a.C0529a c0529a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13, long j10) {
            this.f39232a = handler;
            this.f39233b = runnable;
            this.f39234c = z11;
            this.f39235d = z12;
            this.f39236e = i10;
            this.f39237f = str;
            this.f39239h = str2;
            this.f39238g = str3;
            this.f39240i = str4;
            this.f39241j = c0529a;
            this.f39242k = campaignEx;
            this.f39243l = copyOnWriteArrayList;
            this.f39244m = cVar;
            this.f39245n = oVar;
            this.f39246o = z13;
            this.f39250s = z10;
            this.f39251t = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f39242k, eVar);
            } catch (Throwable th2) {
                q0.b("RVWindVaneWebView", th2.getMessage());
            }
            if (this.f39248q) {
                return;
            }
            String str = this.f39238g + "_" + this.f39237f;
            if (i10 == 1) {
                if (this.f39246o) {
                    com.mbridge.msdk.videocommon.a.d(this.f39238g + "_" + this.f39240i);
                } else {
                    com.mbridge.msdk.videocommon.a.c(this.f39238g + "_" + this.f39240i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f39238g + "_" + this.f39240i + "_" + this.f39237f, this.f39241j, true, this.f39246o);
                Handler handler = this.f39232a;
                if (handler != null && (runnable = this.f39233b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39238g + "_" + this.f39240i + "_" + this.f39237f, true);
                a.C0529a c0529a = this.f39241j;
                if (c0529a != null) {
                    c0529a.a(true);
                }
                o oVar = this.f39245n;
                if (oVar != null) {
                    oVar.a(str, this.f39239h, this.f39238g, this.f39240i, this.f39237f, this.f39241j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39238g + "_" + this.f39240i + "_" + this.f39237f, false);
                a.C0529a c0529a2 = this.f39241j;
                if (c0529a2 != null) {
                    c0529a2.a(false);
                }
                if (this.f39245n != null) {
                    this.f39245n.a(str, this.f39240i, this.f39237f, this.f39241j, b.b(880008, new MBridgeIds(this.f39239h, this.f39238g, this.f39240i), "readyState:" + i10, null, this.f39242k));
                }
            }
            this.f39248q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(WebView webView, String str, String str2, int i10, int i11) {
            boolean z10 = true;
            if (i10 == 1) {
                try {
                    com.mbridge.msdk.reward.controller.a aVar = new com.mbridge.msdk.reward.controller.a();
                    aVar.e(false);
                    if (i11 != 2) {
                        z10 = false;
                    }
                    aVar.d(z10);
                    aVar.c(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.orglistener.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, i11, str2, true, 1));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RVWindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String strOptString = new JSONObject(str).optString("id");
                    com.mbridge.msdk.video.bt.component.d.c().b(obj, strOptString);
                    String strF = com.mbridge.msdk.video.bt.component.d.c().f(strOptString);
                    CampaignEx campaignExC = com.mbridge.msdk.video.bt.component.d.c().c(strOptString);
                    com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.video.bt.component.d.c().d(strOptString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(campaignExC);
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f38913b;
                    if (windVaneWebView != null) {
                        b.b().a(this.f39250s, windVaneWebView, campaignExC, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, cVarD, strF, strOptString, this.f39249r == 0 ? 3 : 6);
                        this.f39249r++;
                    }
                } catch (Throwable th2) {
                    q0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.f39247p) {
                return;
            }
            String str2 = this.f39238g + "_" + this.f39237f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39238g + "_" + this.f39240i + "_" + this.f39237f, true);
                Handler handler = this.f39232a;
                if (handler != null && (runnable = this.f39233b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C0529a c0529a = this.f39241j;
                if (c0529a != null) {
                    c0529a.a(true);
                }
                o oVar = this.f39245n;
                if (oVar != null) {
                    oVar.a(str2, this.f39239h, this.f39238g, this.f39240i, this.f39237f, this.f39241j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f39247p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39238g + "_" + this.f39240i + "_" + this.f39237f, false);
            if (this.f39245n != null) {
                String str3 = this.f39238g + "_" + this.f39237f;
                a.C0529a c0529a = this.f39241j;
                if (c0529a != null) {
                    c0529a.a(false);
                }
                this.f39245n.a(str3, this.f39240i, this.f39237f, this.f39241j, b.b(880008, new MBridgeIds(this.f39239h, this.f39238g, this.f39240i), "onReceivedError： " + i10 + "  " + str, null, this.f39242k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    com.mbridge.msdk.video.bt.component.d.c().c(this.f39238g, this.f39240i);
                } catch (Throwable th2) {
                    q0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public interface h {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar);
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class i implements H5DownLoadManager.IH5SourceDownloadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f39254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f39255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f39256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f39257f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private n f39258g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f39259h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f39260i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f39252a = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f39261j = System.currentTimeMillis();

        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f39262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f39263b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f39264c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f39265d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f39266e;

            public a(int i10, long j10, String str, String str2, String str3) {
                this.f39262a = i10;
                this.f39263b = j10;
                this.f39264c = str;
                this.f39265d = str2;
                this.f39266e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f39257f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f39262a, this.f39263b + "", this.f39264c, i.this.f39257f.getId(), i.this.f39255d, this.f39265d, "2");
                    nVar.n(i.this.f39257f.getRequestId());
                    nVar.k(i.this.f39257f.getCurrentLocalRid());
                    nVar.o(i.this.f39257f.getRequestIdNotice());
                    nVar.b(i.this.f39257f.getId());
                    nVar.a(i.this.f39257f.getAdSpaceT());
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f39264c);
                    if (i.this.f39257f.getAdType() == 287) {
                        nVar.a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (i.this.f39257f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    if (!TextUtils.isEmpty(this.f39266e)) {
                        nVar.q(this.f39266e);
                    }
                    b.b(nVar, i.this.f39257f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, i.this.f39255d, i.this.f39257f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public i(int i10, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f39253b = i10;
            this.f39254c = str;
            this.f39255d = str2;
            this.f39256e = str3;
            this.f39257f = campaignEx;
            this.f39258g = nVar;
            this.f39259h = handler;
            this.f39260i = copyOnWriteArrayList;
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, j10, str, str2, str3));
        }

        public void a(boolean z10) {
            this.f39252a = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i10 = this.f39253b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39255d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f39254c);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f39256e);
                bundle.putString("key", this.f39255d + "_" + this.f39256e + "_" + this.f39257f.getSecondRequestIndex());
                bundle.putString("url", str);
                bundle.putString("message", str2);
                messageObtain.setData(bundle);
                this.f39259h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39255d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f39254c);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f39256e);
                bundle2.putString("key", this.f39255d + "_" + this.f39256e + "_" + this.f39257f.getSecondRequestIndex());
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                messageObtain2.setData(bundle2);
                this.f39259h.sendMessage(messageObtain2);
                if (this.f39252a) {
                    a(3, System.currentTimeMillis() - this.f39261j, str, "url download failed", "");
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 205;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39255d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f39254c);
            bundle3.putString(CommonUrlParts.REQUEST_ID, this.f39256e);
            bundle3.putString("key", this.f39255d + "_" + this.f39256e + "_" + this.f39257f.getSecondRequestIndex());
            bundle3.putString("message", str2);
            messageObtain3.setData(bundle3);
            this.f39259h.sendMessage(messageObtain3);
            if (this.f39258g != null) {
                try {
                    this.f39258g.a(str, this.f39256e, b.b(880006, new MBridgeIds(this.f39254c, this.f39255d, this.f39256e), str2, null, null));
                } catch (Exception e10) {
                    q0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i10 = this.f39253b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39255d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f39254c);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f39256e);
                bundle.putString("key", this.f39255d + "_" + this.f39256e + "_" + this.f39257f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f39259h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39255d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f39254c);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f39256e);
                bundle2.putString("key", this.f39255d + "_" + this.f39256e + "_" + this.f39257f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f39259h.sendMessage(messageObtain2);
                if (this.f39252a) {
                    a(1, System.currentTimeMillis() - this.f39261j, str, "", str2);
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 105;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39255d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f39254c);
            bundle3.putString(CommonUrlParts.REQUEST_ID, this.f39256e);
            bundle3.putString("key", this.f39255d + "_" + this.f39256e + "_" + this.f39257f.getSecondRequestIndex());
            messageObtain3.setData(bundle3);
            this.f39259h.sendMessage(messageObtain3);
            n nVar = this.f39258g;
            if (nVar != null) {
                nVar.a(this.f39254c, this.f39255d, this.f39256e, str);
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f39268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f39270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f39271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f39272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f39273f;

        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f39274a;

            public a(String str) {
                this.f39274a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f39273f != null) {
                    try {
                        com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                        q0.a("RewardCampaignsResourceManager", "campaign is null");
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.j("2000044");
                        nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                        nVar.b(j.this.f39273f.getId());
                        nVar.i(j.this.f39273f.getImageUrl());
                        nVar.n(j.this.f39273f.getRequestId());
                        nVar.k(j.this.f39273f.getCurrentLocalRid());
                        nVar.o(j.this.f39273f.getRequestIdNotice());
                        nVar.u(j.this.f39270c);
                        nVar.m(this.f39274a);
                        nVar.b("scenes", "1");
                        nVarA.a(nVar);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i10, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f39268a = handler;
            this.f39269b = i10;
            this.f39271d = str;
            this.f39270c = str2;
            this.f39272e = str3;
            this.f39273f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f39269b == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39270c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f39271d);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f39272e);
            bundle.putString("key", this.f39270c + "_" + this.f39272e + "_" + this.f39273f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f39268a.sendMessage(messageObtain);
            a aVar = new a(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f39269b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39270c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f39271d);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f39272e);
            bundle.putString("key", this.f39270c + "_" + this.f39272e + "_" + this.f39273f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f39268a.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class k implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f39276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f39277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f39278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f39279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f39280e;

        public k(Handler handler, String str, String str2, String str3, String str4) {
            this.f39276a = handler;
            this.f39278c = str;
            this.f39277b = str2;
            this.f39279d = str3;
            this.f39280e = str4;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39277b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f39278c);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f39279d);
            bundle.putString("key", this.f39280e);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f39276a.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39277b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f39278c);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f39279d);
            bundle.putString("url", str2);
            bundle.putString("key", this.f39280e);
            bundle.putString("message", str);
            messageObtain.setData(bundle);
            this.f39276a.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class l implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f39282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f39283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f39284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f39285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f39286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f39287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f39288h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private n f39289i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f39290j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f39281a = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f39291k = System.currentTimeMillis();

        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f39292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f39293b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f39294c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f39295d;

            public a(int i10, String str, String str2, String str3) {
                this.f39292a = i10;
                this.f39293b = str;
                this.f39294c = str2;
                this.f39295d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f39286f == null || l.this.f39282b == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.j("m_download_end");
                    if (l.this.f39282b != null) {
                        nVar.c(m0.s(l.this.f39282b.getApplicationContext()));
                    }
                    nVar.d(this.f39292a);
                    if (l.this.f39286f != null) {
                        nVar.b(l.this.f39286f.getId());
                        nVar.n(l.this.f39286f.getRequestId());
                        nVar.k(l.this.f39286f.getCurrentLocalRid());
                        nVar.o(l.this.f39286f.getRequestIdNotice());
                    }
                    nVar.t(this.f39293b);
                    nVar.m(this.f39294c);
                    nVar.u(l.this.f39283c);
                    if (!TextUtils.isEmpty(this.f39295d)) {
                        nVar.q(this.f39295d);
                    }
                    nVar.e(2);
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f39293b);
                    b.b(nVar, l.this.f39286f);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, l.this.f39286f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$l$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class RunnableC0478b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f39297a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f39298b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f39299c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f39300d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f39301e;

            public RunnableC0478b(int i10, long j10, String str, String str2, String str3) {
                this.f39297a = i10;
                this.f39298b = j10;
                this.f39299c = str;
                this.f39300d = str2;
                this.f39301e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f39286f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f39297a, this.f39298b + "", this.f39299c, l.this.f39286f.getId(), l.this.f39283c, this.f39300d, "1");
                    nVar.n(l.this.f39286f.getRequestId());
                    nVar.k(l.this.f39286f.getCurrentLocalRid());
                    nVar.o(l.this.f39286f.getRequestIdNotice());
                    nVar.b(l.this.f39286f.getId());
                    nVar.a(l.this.f39286f.getAdSpaceT());
                    nVar.q(this.f39301e);
                    nVar.b("scenes", "1");
                    if (l.this.f39286f.getAdType() == 287) {
                        nVar.a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (l.this.f39286f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    nVar.b("url", this.f39299c);
                    nVar.e(3);
                    b.b(nVar, l.this.f39286f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, l.this.f39283c, l.this.f39286f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i10, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f39282b = context;
            this.f39284d = str;
            this.f39283c = str2;
            this.f39285e = str3;
            this.f39286f = campaignEx;
            this.f39287g = i10;
            this.f39288h = handler;
            this.f39289i = nVar;
            this.f39290j = copyOnWriteArrayList;
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC0478b(i10, j10, str, str2, str3));
        }

        private void a(int i10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, str, str2, str3));
        }

        public void a(boolean z10) {
            this.f39281a = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f39291k;
            int i10 = this.f39287g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39283c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f39284d);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f39285e);
                bundle.putString("key", this.f39283c + "_" + this.f39285e + "_" + this.f39286f.getSecondRequestIndex());
                bundle.putString("url", str2);
                bundle.putString("message", str);
                messageObtain.setData(bundle);
                this.f39288h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39283c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f39284d);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f39285e);
                bundle2.putString("url", str2);
                bundle2.putString("key", this.f39283c + "_" + this.f39285e + "_" + this.f39286f.getSecondRequestIndex());
                bundle2.putString("message", str);
                messageObtain2.setData(bundle2);
                this.f39288h.sendMessage(messageObtain2);
                if (this.f39281a) {
                    a(3, jCurrentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 203;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39283c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f39284d);
            bundle3.putString(CommonUrlParts.REQUEST_ID, this.f39285e);
            bundle3.putString("url", str2);
            bundle3.putString("key", this.f39283c + "_" + this.f39285e + "_" + this.f39286f.getSecondRequestIndex());
            bundle3.putString("message", str);
            messageObtain3.setData(bundle3);
            this.f39288h.sendMessage(messageObtain3);
            if (this.f39289i != null) {
                try {
                    this.f39289i.a(str2, this.f39285e, b.b(880006, new MBridgeIds(this.f39284d, this.f39283c, this.f39285e), "", null, null));
                } catch (Exception e10) {
                    q0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
            a(3, str2, str, "");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f39291k;
            int i10 = this.f39287g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39283c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f39284d);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f39285e);
                bundle.putString("key", this.f39283c + "_" + this.f39285e + "_" + this.f39286f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f39288h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39283c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f39284d);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f39285e);
                bundle2.putString("key", this.f39283c + "_" + this.f39285e + "_" + this.f39286f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f39288h.sendMessage(messageObtain2);
                if (this.f39281a) {
                    a(1, jCurrentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f39283c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f39284d);
            bundle3.putString(CommonUrlParts.REQUEST_ID, this.f39285e);
            bundle3.putString("key", this.f39283c + "_" + this.f39285e + "_" + this.f39286f.getSecondRequestIndex());
            messageObtain3.setData(bundle3);
            this.f39288h.sendMessage(messageObtain3);
            n nVar = this.f39289i;
            if (nVar != null) {
                nVar.a(this.f39284d, this.f39283c, this.f39285e, str);
            }
            if (z10) {
                return;
            }
            a(1, str, "", str2);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class m extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f39303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConcurrentHashMap<String, h> f39304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f39305c;

        public m(Looper looper) {
            super(looper);
            this.f39304b = new ConcurrentHashMap<>();
            this.f39305c = new ConcurrentHashMap<>();
        }

        public void a(Context context) {
            this.f39303a = context;
        }

        public void a(String str, h hVar) {
            this.f39304b.put(str, hVar);
        }

        public void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f39305c.put(str, copyOnWriteArrayList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:185:0x03b7 A[Catch: Exception -> 0x0489, TRY_LEAVE, TryCatch #5 {Exception -> 0x0489, blocks: (B:176:0x0388, B:185:0x03b7), top: B:246:0x00ef }] */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v27 */
        /* JADX WARN: Type inference failed for: r10v32 */
        /* JADX WARN: Type inference failed for: r10v36 */
        /* JADX WARN: Type inference failed for: r10v37 */
        /* JADX WARN: Type inference failed for: r10v38 */
        /* JADX WARN: Type inference failed for: r10v44 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r14v13 */
        /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r14v9 */
        /* JADX WARN: Type inference failed for: r15v10 */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13 */
        /* JADX WARN: Type inference failed for: r15v2, types: [int] */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v18 */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v13 */
        /* JADX WARN: Type inference failed for: r9v23 */
        /* JADX WARN: Type inference failed for: r9v24 */
        /* JADX WARN: Type inference failed for: r9v25 */
        /* JADX WARN: Type inference failed for: r9v44 */
        /* JADX WARN: Type inference failed for: r9v45 */
        /* JADX WARN: Type inference failed for: r9v46 */
        /* JADX WARN: Type inference failed for: r9v47, types: [int] */
        /* JADX WARN: Type inference failed for: r9v49 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v50 */
        /* JADX WARN: Type inference failed for: r9v51 */
        /* JADX WARN: Type inference failed for: r9v52 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8, types: [int] */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(android.os.Message r29) {
            /*
                Method dump skipped, instruction units count: 1218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.m.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public interface n {
        void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public interface o {
        void a(String str, String str2, String str3, a.C0529a c0529a, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C0529a c0529a);
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static class p extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f39306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f39307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f39308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f39309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f39310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o f39311f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WindVaneWebView f39312g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f39313h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f39314i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f39315j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final a.C0529a f39316k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final CampaignEx f39317l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f39318m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f39319n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f39320o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f39321p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Runnable f39322q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Runnable f39323r;

        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f39324a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.C0529a f39325b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f39326c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f39327d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f39328e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f39329f;

            public a(o oVar, a.C0529a c0529a, String str, String str2, String str3, String str4) {
                this.f39324a = oVar;
                this.f39325b = c0529a;
                this.f39326c = str;
                this.f39327d = str2;
                this.f39328e = str3;
                this.f39329f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                a.C0529a c0529a;
                if (this.f39324a != null && (c0529a = this.f39325b) != null) {
                    c0529a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39326c + "_" + this.f39327d + "_" + this.f39328e, true);
                    o oVar = this.f39324a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f39326c);
                    sb2.append("_");
                    sb2.append(this.f39328e);
                    oVar.a(sb2.toString(), this.f39329f, this.f39326c, this.f39327d, this.f39328e, this.f39325b);
                }
                a.C0529a c0529a2 = this.f39325b;
                if (c0529a2 == null || (windVaneWebViewB = c0529a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$p$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class RunnableC0479b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f39331a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.C0529a f39332b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f39333c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f39334d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f39335e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f39336f;

            public RunnableC0479b(o oVar, a.C0529a c0529a, String str, String str2, String str3, String str4) {
                this.f39331a = oVar;
                this.f39332b = c0529a;
                this.f39333c = str;
                this.f39334d = str2;
                this.f39335e = str3;
                this.f39336f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                a.C0529a c0529a;
                if (this.f39331a != null && (c0529a = this.f39332b) != null) {
                    c0529a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39333c + "_" + this.f39334d + "_" + this.f39335e, true);
                    o oVar = this.f39331a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f39333c);
                    sb2.append("_");
                    sb2.append(this.f39335e);
                    oVar.a(sb2.toString(), this.f39336f, this.f39333c, this.f39334d, this.f39335e, this.f39332b);
                }
                a.C0529a c0529a2 = this.f39332b;
                if (c0529a2 == null || (windVaneWebViewB = c0529a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z10, boolean z11, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, a.C0529a c0529a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j10) {
            this.f39306a = handler;
            this.f39307b = runnable;
            this.f39308c = z10;
            this.f39309d = z11;
            this.f39310e = str;
            this.f39311f = oVar;
            this.f39312g = windVaneWebView;
            this.f39313h = str2;
            this.f39314i = str4;
            this.f39315j = str3;
            this.f39316k = c0529a;
            this.f39317l = campaignEx;
            this.f39318m = copyOnWriteArrayList;
            this.f39319n = j10;
            a aVar = new a(oVar, c0529a, str4, str, str2, str3);
            this.f39323r = aVar;
            this.f39322q = new RunnableC0479b(oVar, c0529a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i10);
            Handler handler2 = this.f39306a;
            if (handler2 != null && (runnable2 = this.f39322q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f39306a;
            if (handler3 != null && (runnable = this.f39323r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f39317l, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f39321p) {
                return;
            }
            String str = this.f39314i + "_" + this.f39313h;
            if (i10 == 1) {
                Runnable runnable3 = this.f39307b;
                if (runnable3 != null && (handler = this.f39306a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39314i + "_" + this.f39310e + "_" + this.f39313h, true);
                a.C0529a c0529a = this.f39316k;
                if (c0529a != null) {
                    c0529a.a(true);
                }
                if (this.f39308c) {
                    if (this.f39309d) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f39317l.getRequestIdNotice(), this.f39316k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f39317l.getRequestIdNotice(), this.f39316k);
                    }
                } else if (this.f39309d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f39317l.getRequestIdNotice(), this.f39316k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f39317l.getRequestIdNotice(), this.f39316k);
                }
                o oVar = this.f39311f;
                if (oVar != null) {
                    oVar.a(str, this.f39315j, this.f39314i, this.f39310e, this.f39313h, this.f39316k);
                }
            } else if (this.f39311f != null) {
                this.f39311f.a(str, this.f39310e, this.f39313h, this.f39316k, b.b(880009, new MBridgeIds(this.f39315j, this.f39314i, this.f39310e), "readyState:" + i10, null, this.f39317l));
            }
            this.f39321p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f39306a;
            if (handler2 != null && (runnable2 = this.f39323r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f39320o) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.f39306a;
                if (handler3 != null && (runnable = this.f39322q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            } else {
                String str2 = this.f39314i + "_" + this.f39313h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39314i + "_" + this.f39310e + "_" + this.f39313h, true);
                Runnable runnable3 = this.f39307b;
                if (runnable3 != null && (handler = this.f39306a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C0529a c0529a = this.f39316k;
                if (c0529a != null) {
                    c0529a.a(true);
                }
                if (this.f39308c) {
                    if (this.f39317l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f39317l.getRequestIdNotice(), this.f39316k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f39317l.getRequestIdNotice(), this.f39316k);
                    }
                } else if (this.f39317l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f39317l.getRequestIdNotice(), this.f39316k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f39317l.getRequestIdNotice(), this.f39316k);
                }
                o oVar = this.f39311f;
                if (oVar != null) {
                    oVar.a(str2, this.f39315j, this.f39314i, this.f39310e, this.f39313h, this.f39316k);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f39320o = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39314i + "_" + this.f39310e + "_" + this.f39313h, false);
            Handler handler = this.f39306a;
            if (handler != null) {
                if (this.f39322q != null) {
                    handler.removeCallbacks(this.f39323r);
                }
                Runnable runnable = this.f39322q;
                if (runnable != null) {
                    this.f39306a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f39314i + "_" + this.f39313h;
                a.C0529a c0529a = this.f39316k;
                if (c0529a != null) {
                    c0529a.a(false);
                }
                if (this.f39311f != null) {
                    this.f39311f.a(str3, this.f39310e, str2, this.f39316k, b.b(880009, new MBridgeIds(this.f39315j, this.f39314i, this.f39310e), i10 + "#" + str, null, this.f39317l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39314i + "_" + this.f39310e + "_" + this.f39313h, false);
            Handler handler = this.f39306a;
            if (handler != null) {
                if (this.f39322q != null) {
                    handler.removeCallbacks(this.f39323r);
                }
                Runnable runnable = this.f39322q;
                if (runnable != null) {
                    this.f39306a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f39314i + "_" + this.f39313h;
                a.C0529a c0529a = this.f39316k;
                if (c0529a != null) {
                    c0529a.a(false);
                }
                if (this.f39311f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f39315j, this.f39314i, this.f39310e);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onReceivedSslError:");
                    sb2.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f39311f.a(str, this.f39310e, this.f39313h, this.f39316k, b.b(880009, mBridgeIds, sb2.toString(), null, this.f39317l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static class q extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f39338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f39339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WindVaneWebView f39340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f39341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f39342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a.C0529a f39343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final CampaignEx f39344g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f39345h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f39346i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f39347j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f39348k;

        public q(String str, boolean z10, WindVaneWebView windVaneWebView, String str2, String str3, a.C0529a c0529a, CampaignEx campaignEx, boolean z11, String str4) {
            this.f39339b = z10;
            this.f39340c = windVaneWebView;
            this.f39341d = str2;
            this.f39342e = str3;
            this.f39343f = c0529a;
            this.f39344g = campaignEx;
            this.f39338a = str;
            this.f39345h = z11;
            this.f39346i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f39344g, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f39348k) {
                return;
            }
            if (this.f39340c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f39338a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f39340c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
            String str = this.f39342e + "_" + this.f39344g.getId() + "_" + this.f39344g.getRequestId() + "_" + this.f39341d;
            if (i10 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39342e + "_" + this.f39346i + "_" + this.f39341d, true);
                a.C0529a c0529a = this.f39343f;
                if (c0529a != null) {
                    c0529a.a(true);
                }
                if (this.f39339b) {
                    if (this.f39344g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f39343f, false, this.f39345h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f39343f, false, this.f39345h);
                    }
                } else if (this.f39344g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f39343f, false, this.f39345h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f39343f, false, this.f39345h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39342e + "_" + this.f39346i + "_" + this.f39341d, false);
                a.C0529a c0529a2 = this.f39343f;
                if (c0529a2 != null) {
                    c0529a2.a(false);
                }
            }
            this.f39348k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            if (this.f39347j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f39340c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f39338a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f39340c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("WindVaneWebView", e10.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39342e + "_" + this.f39346i + "_" + this.f39341d, true);
                a.C0529a c0529a = this.f39343f;
                if (c0529a != null) {
                    c0529a.a(true);
                }
                String str2 = this.f39342e + "_" + this.f39344g.getId() + "_" + this.f39344g.getRequestId() + "_" + this.f39341d;
                if (this.f39339b) {
                    if (this.f39344g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f39344g.getRequestIdNotice(), this.f39343f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f39343f, false, this.f39345h);
                    }
                } else if (this.f39344g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f39344g.getRequestIdNotice(), this.f39343f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f39343f, false, this.f39345h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f39347j = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f39342e + "_" + this.f39346i + "_" + this.f39341d, false);
            a.C0529a c0529a = this.f39343f;
            if (c0529a != null) {
                c0529a.a(false);
            }
            if (this.f39340c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f39338a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f39340c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f39349a = new b(null);
    }

    private b() {
        this.f39184c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f39185d = "down_type";
        this.f39186e = "h3c";
        this.f39187f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f39181g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f39182a = new m(handlerThread.getLooper());
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAabEntity() != null) {
                    return campaignEx.getAabEntity().h3c;
                }
            } catch (Throwable th2) {
                q0.b("RewardCampaignsResourceManager", th2.getMessage());
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = campaignEx != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid()) : null;
        if (cVarB == null) {
            cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        cVarB.a(campaignEx);
        cVarB.f(a(campaignEx));
        cVarB.e(i10);
        return cVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, CampaignEx campaignEx, String str, String str2) {
        z.a(i10, str, str2, new C0477b(i10, campaignEx), campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i10, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(campaignEx, context, i10, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(campaignEx, 3);
        if (str4.contains(MultiDexExtractor.EXTRACTED_SUFFIX) && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean zIsEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.f39182a, nVar, copyOnWriteArrayList);
                lVar.a(zIsEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, lVar);
                return;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.f39182a, copyOnWriteArrayList);
            iVar.a(zIsEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, iVar);
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, String str, String str2, int i10) {
        if (windVaneWebView != null) {
            if (campaignEx == null || cVar == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", "data is null");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    return;
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                        return;
                    }
                    return;
                }
            }
            if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) || !campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z10, windVaneWebView, campaignEx, copyOnWriteArrayList, str, cVar, str2), i10 * 1000);
                    return;
                } else {
                    q0.a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 1);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, com.mbridge.msdk.videocommon.setting.c cVar, String str4, boolean z11) {
        com.mbridge.msdk.video.signal.impl.k kVar;
        String requestId;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            a.C0529a c0529a = new a.C0529a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0529a.a(windVaneWebView2);
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                requestId = campaignEx != null ? campaignEx.getRequestId() : "";
            } else {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str3);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i11, campaignEx2);
                            }
                        }
                    }
                }
                com.mbridge.msdk.video.signal.impl.k kVar2 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                requestId = copyOnWriteArrayList.get(0).getRequestId();
                kVar = kVar2;
            }
            kVar.g(i10);
            kVar.setUnitId(str3);
            kVar.c(str4);
            kVar.setRewardUnitSetting(cVar);
            kVar.d(z10);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, c0529a, campaignEx, z11, requestId));
            windVaneWebView2.setObject(kVar);
            MintegralNetworkBridge.webviewLoadUrl(windVaneWebView2, str2);
            windVaneWebView2.setRid(requestId);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.error.b b(int i10, MBridgeIds mBridgeIds, String str, Throwable th2, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
        bVar.a(mBridgeIds);
        bVar.a(th2);
        bVar.c(str);
        bVar.a(campaignEx);
        return bVar;
    }

    public static b b() {
        return r.f39349a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b("RewardCampaignsResourceManager", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i10) {
        if (i10 == 200) {
            return 880004;
        }
        if (i10 == 201) {
            return 880007;
        }
        if (i10 != 203) {
            return i10 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized String d(int i10) {
        return i10 != 200 ? i10 != 201 ? i10 != 203 ? i10 != 205 ? "unknown" : "tpl" : "temp" : "zip/html" : "video";
    }

    public synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        this.f39182a.a(context);
        if (campaignEx != null) {
            String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
            if (campaignEx.isDynamicView()) {
                if (v0.b(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                    a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                }
                ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(CommonUrlParts.REQUEST_ID, str3);
                bundle.putString("key", str2 + "_" + str3 + "_" + campaignEx.getSecondRequestIndex());
                bundle.putString("url", cMPTEntryUrl);
                messageObtain.setData(bundle);
                this.f39182a.sendMessage(messageObtain);
                if (nVar != null) {
                    nVar.a(str, str2, str3, cMPTEntryUrl);
                }
                return;
            }
        }
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
                if (cVarB == null) {
                    cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                com.mbridge.msdk.foundation.same.report.metrics.c cVar = cVarB;
                cVar.a(campaignEx);
                cVar.e(1);
                cVar.f(a(campaignEx));
                H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, campaignEx, nVar, context));
            } catch (Exception e10) {
                q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(Context context, boolean z10, int i10, boolean z11, int i11, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        String str4 = str2 + "_" + str3 + "_" + copyOnWriteArrayList2.get(0).getSecondRequestIndex();
        f39181g.put(str4, new f(z10, z11, i10, copyOnWriteArrayList2.size(), str2, str3, i11, copyOnWriteArrayList2));
        this.f39182a.a(str4, hVar);
        this.f39182a.a(context);
        this.f39182a.a(str4, copyOnWriteArrayList2);
        this.f39182a.post(new a(copyOnWriteArrayList2, context, str2, i11, str, str3, str4, nVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab A[Catch: all -> 0x01da, TryCatch #5 {, blocks: (B:4:0x000b, B:5:0x0023, B:8:0x002b, B:11:0x003d, B:18:0x0074, B:21:0x007a, B:23:0x0080, B:26:0x008b, B:28:0x00c4, B:30:0x00da, B:60:0x01a7, B:62:0x01ab, B:64:0x01b6, B:25:0x0086, B:52:0x0156, B:38:0x00f4, B:40:0x0104, B:42:0x0116), top: B:77:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b6 A[Catch: all -> 0x01da, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x000b, B:5:0x0023, B:8:0x002b, B:11:0x003d, B:18:0x0074, B:21:0x007a, B:23:0x0080, B:26:0x008b, B:28:0x00c4, B:30:0x00da, B:60:0x01a7, B:62:0x01ab, B:64:0x01b6, B:25:0x0086, B:52:0x0156, B:38:0x00f4, B:40:0x0104, B:42:0x0116), top: B:77:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(boolean r24, android.os.Handler r25, boolean r26, boolean r27, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r28, java.lang.String r29, int r30, com.mbridge.msdk.foundation.entity.CampaignEx r31, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, com.mbridge.msdk.videocommon.setting.c r38, com.mbridge.msdk.reward.adapter.b.o r39) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.setting.c, com.mbridge.msdk.reward.adapter.b$o):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01d4 A[Catch: all -> 0x0205, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:10:0x0047, B:12:0x007b, B:13:0x0082, B:15:0x009d, B:17:0x00a3, B:19:0x00ad, B:22:0x00b4, B:24:0x00ba, B:25:0x00c4, B:27:0x00ca, B:29:0x00de, B:31:0x00ec, B:33:0x00f5, B:34:0x00f9, B:36:0x0106, B:38:0x0157, B:40:0x016b, B:42:0x018b, B:54:0x01d4, B:55:0x01f6, B:57:0x01fa, B:35:0x0100), top: B:65:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fa A[Catch: all -> 0x0205, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:10:0x0047, B:12:0x007b, B:13:0x0082, B:15:0x009d, B:17:0x00a3, B:19:0x00ad, B:22:0x00b4, B:24:0x00ba, B:25:0x00c4, B:27:0x00ca, B:29:0x00de, B:31:0x00ec, B:33:0x00f5, B:34:0x00f9, B:36:0x0106, B:38:0x0157, B:40:0x016b, B:42:0x018b, B:54:0x01d4, B:55:0x01f6, B:57:0x01fa, B:35:0x0100), top: B:65:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(boolean r27, android.os.Handler r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, com.mbridge.msdk.foundation.entity.CampaignEx r37, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r38, java.lang.String r39, java.lang.String r40, com.mbridge.msdk.videocommon.setting.c r41, com.mbridge.msdk.reward.adapter.b.o r42, boolean r43) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.setting.c, com.mbridge.msdk.reward.adapter.b$o, boolean):void");
    }

    public void c() {
    }
}
