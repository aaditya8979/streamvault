package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.common.c;
import com.mbridge.msdk.splash.manager.g;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: SplashLoadManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    private static String A = "SplashLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f39855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.b f39856e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MBSplashView f39858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f39859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f39860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f39862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f39864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39865n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f39866o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f39867p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f39868q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f39869r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f39870s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f39871t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f39873v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<CampaignEx> f39874w;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f39872u = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f39875x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Handler f39876y = new c(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Runnable f39877z = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f39857f = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class a implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f39879b;

        public a(CampaignEx campaignEx, int i10) {
            this.f39878a = campaignEx;
            this.f39879b = i10;
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a() {
            if (this.f39878a.isHasMBTplMark()) {
                return;
            }
            e.this.g(this.f39878a, this.f39879b);
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void a(int i10) throws Throwable {
            if (i10 == 1) {
                e.this.g(this.f39878a, this.f39879b);
            } else {
                e.this.a("readyState 2", this.f39879b, this.f39878a);
            }
        }

        @Override // com.mbridge.msdk.splash.manager.g.c
        public void onError(String str) throws Throwable {
            e.this.a(str, this.f39879b, this.f39878a);
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39881a;

        public b(CampaignEx campaignEx) {
            this.f39881a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            e.this.f39858g.setVideoReady(true);
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f39881a;
            messageObtain.what = 3;
            e.this.f39876y.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) throws Throwable {
            e.this.f39858g.setVideoReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880004);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f39864m, e.this.f39865n, this.f39881a);
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f39881a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            e.this.f39876y.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) throws Throwable {
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 == 1) {
                Object obj = message.obj;
                int i11 = message.arg1;
                if (obj instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) obj;
                    e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip()), campaignEx, i11);
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof CampaignEx) {
                    e eVar = e.this;
                    eVar.h((CampaignEx) obj2, eVar.f39865n);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            try {
                if (obj3 instanceof Bundle) {
                    int i12 = ((Bundle) obj3).getInt("type");
                    String string = ((Bundle) obj3).getString(NotificationCompat.CATEGORY_MESSAGE);
                    CampaignEx campaignEx2 = (CampaignEx) ((Bundle) obj3).getSerializable("campaignex");
                    com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i12 == 1 ? 880004 : i12 == 2 ? 880006 : 880027);
                    bVar.c(string);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.f39864m, e.this.f39865n, campaignEx2);
                }
            } catch (Exception e10) {
                com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880024);
                bVar2.a((Throwable) e10);
                e eVar3 = e.this;
                eVar3.a(bVar2, eVar3.f39864m, e.this.f39865n, (CampaignEx) null);
            }
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.f39864m, e.this.f39865n, (CampaignEx) null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class C0500e extends com.mbridge.msdk.splash.request.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f39885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f39886f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0500e(int i10, String str, int i11) {
            super(i10);
            this.f39885e = str;
            this.f39886f = i11;
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void a(CampaignUnit campaignUnit, int i10) throws Throwable {
            try {
                e eVar = e.this;
                eVar.a(campaignUnit, i10, eVar.f39852a, this.f39885e);
                e.this.f39872u = campaignUnit.getRequestId();
                e.this.f39874w = campaignUnit.getAds();
            } catch (Exception e10) {
                e10.printStackTrace();
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
                bVar.a((Throwable) e10);
                e.this.a(bVar, this.f39885e, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                e.this.f();
            }
        }

        @Override // com.mbridge.msdk.splash.request.b
        public void b(int i10, String str) throws Throwable {
            q0.b(e.A, str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.c(str);
            e.this.a(bVar, this.f39885e, this.f39886f, (CampaignEx) null);
            e.this.f();
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class f extends c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39888a;

        public f(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f39888a = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.splash.report.a.a(str, cVar, this.f39888a, e.this.f39857f, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39890a;

        public g(CampaignEx campaignEx) {
            this.f39890a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(e.this.f39857f)).d();
            y.a(e.this.f39857f, this.f39890a);
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class h implements com.mbridge.msdk.splash.view.nativeview.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f39893b;

        public h(CampaignEx campaignEx, int i10) {
            this.f39892a = campaignEx;
            this.f39893b = i10;
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void a() {
            if (this.f39892a.isDynamicView() && e.this.f39858g != null) {
                e.this.f39858g.setImageReady(true);
                e.this.f(this.f39892a, this.f39893b);
            }
            e.this.h(this.f39892a, this.f39893b);
        }

        @Override // com.mbridge.msdk.splash.view.nativeview.a
        public void b() throws Throwable {
            if (!this.f39892a.isDynamicView() || e.this.f39858g == null) {
                return;
            }
            e.this.f39858g.setImageReady(false);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
            e eVar = e.this;
            eVar.a(bVar, eVar.f39864m, this.f39893b, this.f39892a);
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class i implements z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39895a;

        public i(CampaignEx campaignEx) {
            this.f39895a = campaignEx;
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
            e.this.a(this.f39895a, str, false, message);
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            e.this.a(this.f39895a, str, true, "");
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class j implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f39898b;

        public j(CampaignEx campaignEx, int i10) {
            this.f39897a = campaignEx;
            this.f39898b = i10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880006);
            e eVar = e.this;
            eVar.a(bVar, eVar.f39864m, this.f39898b, this.f39897a);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f39897a);
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            e.this.f39876y.sendMessage(messageObtain);
            e.this.a(this.f39897a, str2, false, str);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f39897a;
            messageObtain.arg1 = this.f39898b;
            e.this.f39876y.sendMessage(messageObtain);
            if (z10) {
                return;
            }
            CampaignEx campaignEx = this.f39897a;
            e.this.a(this.f39897a, campaignEx != null ? campaignEx.getAdZip() : "", true, "");
        }
    }

    /* JADX INFO: compiled from: SplashLoadManager.java */
    public class k implements com.mbridge.msdk.splash.inter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f39900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f39901b;

        public k(CampaignEx campaignEx, int i10) {
            this.f39900a = campaignEx;
            this.f39901b = i10;
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void a(View view) {
            if (e.this.f39858g != null) {
                e.this.f39858g.setDynamicView(true);
                e.this.f39858g.setSplashNativeView(view);
                e.this.h(this.f39900a, this.f39901b);
            }
        }

        @Override // com.mbridge.msdk.splash.inter.a
        public void onError(String str) throws Throwable {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880034);
            bVar.c(str);
            e eVar = e.this;
            eVar.a(bVar, eVar.f39864m, this.f39901b, this.f39900a);
        }
    }

    public e(String str, String str2, long j10) {
        this.f39853b = str;
        this.f39852a = str2;
        this.f39855d = j10;
    }

    private List<CampaignEx> a(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = campaignUnit.getAds().get(0);
        campaignEx.setCampaignUnitId(this.f39852a);
        a(campaignEx);
        this.f39870s = campaignUnit.getSessionId();
        if (campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getAdZip()) || !TextUtils.isEmpty(campaignEx.getAdHtml()))) {
            if (v0.c(campaignEx)) {
                campaignEx.setRtinsType(v0.c(this.f39857f, campaignEx.getPackageName()) ? 1 : 2);
            }
            if (com.mbridge.msdk.foundation.same.c.b(this.f39857f, campaignEx)) {
                arrayList.add(campaignEx);
            } else {
                v0.a(this.f39852a, campaignEx, com.mbridge.msdk.foundation.same.a.f37715x);
                this.f39875x = "APP ALREADY INSTALLED";
            }
            a(campaignEx, (com.mbridge.msdk.foundation.same.report.metrics.c) null, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
        return arrayList;
    }

    private void a(long j10) {
        this.f39876y.postDelayed(this.f39877z, j10);
    }

    private void a(Context context, String str, int i10) throws Throwable {
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.error.b(880025), str, i10, (CampaignEx) null);
                return;
            }
            if (a1.a(this.f39852a)) {
                a(new com.mbridge.msdk.foundation.error.b(880032), str, i10, (CampaignEx) null);
                return;
            }
            MBridgeIds mBridgeIds = new MBridgeIds(this.f39853b, this.f39852a);
            com.mbridge.msdk.splash.request.f fVar = new com.mbridge.msdk.splash.request.f();
            fVar.d(i10);
            fVar.c(this.f39871t);
            fVar.a(this.f39870s);
            fVar.b(this.f39863l);
            fVar.a(this.f39862k);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarB = com.mbridge.msdk.splash.request.e.b(context, mBridgeIds, fVar);
            if (eVarB == null) {
                a(new com.mbridge.msdk.foundation.error.b(880001), str, i10, (CampaignEx) null);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                eVarB.a("token", str);
            }
            String strD = v0.d(this.f39852a);
            if (!TextUtils.isEmpty(strD)) {
                eVarB.a("j", strD);
            }
            com.mbridge.msdk.splash.request.c cVar = new com.mbridge.msdk.splash.request.c(context);
            C0500e c0500e = new C0500e(i10, str, i10);
            c0500e.a(str);
            c0500e.setUnitId(this.f39852a);
            c0500e.setPlacementId(this.f39853b);
            c0500e.setAdType(297);
            cVar.choiceV3OrV5BySetting(1, eVarB, c0500e, str, com.mbridge.msdk.foundation.same.c.a(this.f39854c, 30000L));
        } catch (Exception e10) {
            q0.b(A, e10.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880020);
            bVar.a((Throwable) e10);
            a(bVar, str, i10, (CampaignEx) null);
            f();
        }
    }

    private void a(CampaignEx campaignEx) {
        new Thread(new g(campaignEx)).start();
    }

    private void a(CampaignEx campaignEx, int i10) throws Throwable {
        this.f39858g.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            e(campaignEx, i10);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            d(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            b(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        c(campaignEx, i10);
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f39857f, cVar, new f(campaignEx, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, String str, boolean z10, String str2) {
        try {
            n nVar = new n();
            nVar.e(2);
            nVar.j("m_download_end");
            if (campaignEx != null) {
                nVar.b(campaignEx.isMraid() ? n.N : n.O);
                nVar.o(campaignEx.getRequestIdNotice());
            }
            nVar.b("url", str);
            nVar.b("scenes", "1");
            if (z10) {
                nVar.d(1);
            } else {
                nVar.d(3);
                nVar.m(str2);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(A, e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit, int i10, String str, String str2) throws Throwable {
        List<CampaignEx> listA = a(campaignUnit);
        if (listA == null || listA.size() <= 0) {
            a(this.f39875x.contains("INSTALLED") ? new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED") : new com.mbridge.msdk.foundation.error.b(880003), str2, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
            return;
        }
        g();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(str2)) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        CampaignEx campaignEx = listA.get(0);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, str2, eVar, campaignEx, str);
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) || (!TextUtils.isEmpty(campaignEx.getAdHtml()) && campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(true);
            campaignEx.setIsMraid(false);
        } else {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
        }
        i(campaignEx, i10);
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f39867p) {
            return;
        }
        b();
        this.f39867p = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.middle.b bVar2 = this.f39856e;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    private void a(com.mbridge.msdk.foundation.error.b bVar, int i10, String str, CampaignEx campaignEx) throws Throwable {
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f39858g, this.f39853b, this.f39852a, str, this.f39860i, this.f39861j, true, false);
        if (campaignExA != null) {
            i(campaignExA, i10);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, String str, int i10, CampaignEx campaignEx) throws Throwable {
        if (!this.f39866o) {
            a(bVar, i10, campaignEx);
        } else {
            this.f39866o = false;
            a(bVar, i10, str, campaignEx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, CampaignEx campaignEx) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880009);
        bVar.c(str);
        a(bVar, this.f39864m, i10, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, CampaignEx campaignEx, int i10) {
        g.d dVar = new g.d();
        dVar.c(this.f39852a);
        dVar.b(this.f39853b);
        dVar.a(campaignEx);
        dVar.a(str);
        dVar.a(this.f39860i);
        dVar.a(this.f39861j);
        com.mbridge.msdk.splash.manager.g.a().a(this.f39858g, dVar, new a(campaignEx, i10));
    }

    private void b() {
        this.f39876y.removeCallbacks(this.f39877z);
    }

    private void b(CampaignEx campaignEx, int i10) {
        this.f39868q = new b(campaignEx);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f39857f, this.f39852a, copyOnWriteArrayList, 297, this.f39868q);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(297, this.f39852a, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f39852a);
        } else {
            this.f39858g.setVideoReady(true);
            h(campaignEx, i10);
        }
    }

    private void c(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.splash.manager.d.a(this.f39858g, campaignEx, new h(campaignEx, i10));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:63|(4:58|3|56|4)|(8:6|(1:8)|9|59|10|(6:12|65|13|(1:15)|16|17)|42|(2:49|68)(2:48|67))(1:24)|61|25|(1:27)|42|(1:44)|49|68) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        r5 = r4;
        r4 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc A[Catch: Exception -> 0x0114, TRY_ENTER, TryCatch #6 {Exception -> 0x0114, blocks: (B:52:0x0110, B:53:0x0113, B:40:0x00cc, B:42:0x00d0, B:44:0x00d6, B:46:0x00dc, B:48:0x00e2, B:49:0x0102, B:27:0x00a6), top: B:63:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6 A[Catch: Exception -> 0x0114, TryCatch #6 {Exception -> 0x0114, blocks: (B:52:0x0110, B:53:0x0113, B:40:0x00cc, B:42:0x00d0, B:44:0x00d6, B:46:0x00dc, B:48:0x00e2, B:49:0x0102, B:27:0x00a6), top: B:63:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(com.mbridge.msdk.foundation.entity.CampaignEx r11, int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.manager.e.d(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    private void e(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            z.a(5, "", campaignEx.getAdZip(), new i(campaignEx), campaignEx);
            return;
        }
        this.f39869r = new j(campaignEx, i10);
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a(297);
        cVar.e(2);
        cVar.a(campaignEx);
        cVar.f(campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0);
        H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getAdZip(), this.f39869r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f39871t = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CampaignEx campaignEx, int i10) {
        if (campaignEx.isDynamicView()) {
            c.a aVar = new c.a();
            aVar.b(this.f39852a).a(this.f39853b).a(this.f39860i).a(campaignEx).c(this.f39861j).f(this.f39873v);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri uri = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = uri.getQueryParameter("hdbtn");
                    String queryParameter2 = uri.getQueryParameter("alecfc");
                    String queryParameter3 = uri.getQueryParameter("hdinfo");
                    String queryParameter4 = uri.getQueryParameter("shake_show");
                    String queryParameter5 = uri.getQueryParameter("shake_strength");
                    String queryParameter6 = uri.getQueryParameter("shake_time");
                    String queryParameter7 = uri.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.e(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.a(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.g(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.h(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.i(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.d(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th2) {
                q0.b(A, th2.getMessage());
            }
            com.mbridge.msdk.splash.manager.c.a().a(this.f39858g, aVar.a(), new k(campaignEx, i10));
        }
    }

    private void g() {
        try {
            int i10 = this.f39871t + 1;
            this.f39871t = i10;
            l lVar = this.f39859h;
            if (lVar == null || i10 > lVar.y()) {
                this.f39871t = 0;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(CampaignEx campaignEx, int i10) {
        if (this.f39858g.isH5Ready()) {
            return;
        }
        this.f39858g.setH5Ready(true);
        h(campaignEx, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(CampaignEx campaignEx, int i10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f39858g, campaignEx) || this.f39867p) {
            return;
        }
        b();
        if (this.f39866o) {
            com.mbridge.msdk.splash.manager.d.a(campaignEx, this.f39852a);
        }
        this.f39867p = true;
        com.mbridge.msdk.splash.middle.b bVar = this.f39856e;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    private void i(CampaignEx campaignEx, int i10) throws Throwable {
        MBSplashView mBSplashView = this.f39858g;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            c(campaignEx, i10);
        } else {
            MBSplashView mBSplashView2 = this.f39858g;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (com.mbridge.msdk.splash.manager.d.a(this.f39858g, campaignEx)) {
            h(campaignEx, i10);
        } else {
            a(campaignEx, i10);
        }
    }

    public void a(int i10) {
        this.f39861j = i10;
    }

    public void a(int i10, int i11) {
        this.f39863l = i10;
        this.f39862k = i11;
    }

    public void a(l lVar) {
        this.f39859h = lVar;
    }

    public void a(com.mbridge.msdk.splash.middle.b bVar) {
        this.f39856e = bVar;
    }

    public void a(MBSplashView mBSplashView) {
        this.f39858g = mBSplashView;
    }

    public void a(String str, int i10) {
        this.f39867p = false;
        this.f39864m = str;
        this.f39865n = i10;
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f39858g, this.f39853b, this.f39852a, str, this.f39860i, this.f39861j, false, false);
        long timestamp = campaignExA != null ? campaignExA.getTimestamp() : 0L;
        if (this.f39859h.t() == 1 && i10 != 1 && campaignExA != null) {
            i(campaignExA, i10);
            return;
        }
        this.f39866o = true;
        if (i10 == 1) {
            List<Integer> listC = this.f39859h.c();
            if (listC == null || listC.size() <= 0) {
                this.f39854c = 30000L;
            } else {
                this.f39854c = listC.get(0).intValue() * 1000;
            }
        } else {
            long j10 = this.f39855d;
            if (j10 <= 0) {
                this.f39854c = this.f39859h.E();
            } else {
                this.f39854c = j10;
            }
        }
        if (this.f39859h == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f39854c);
            a(this.f39857f, str, i10);
            return;
        }
        if (System.currentTimeMillis() - timestamp <= this.f39859h.v() * 1000) {
            i(campaignExA, i10);
        } else {
            a(this.f39854c);
            a(this.f39857f, str, i10);
        }
    }

    public void a(boolean z10) {
        this.f39860i = z10;
    }

    public void b(int i10) {
        this.f39873v = i10;
    }

    public String c() {
        return com.mbridge.msdk.foundation.same.c.b(this.f39874w);
    }

    public String d() {
        return this.f39872u;
    }

    public void e() {
        if (this.f39856e != null) {
            this.f39856e = null;
        }
        if (this.f39868q != null) {
            this.f39868q = null;
        }
        if (this.f39869r != null) {
            this.f39869r = null;
        }
    }
}
