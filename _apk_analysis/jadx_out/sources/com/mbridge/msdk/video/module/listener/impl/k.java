package com.mbridge.msdk.video.module.listener.impl;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
/* JADX INFO: loaded from: classes12.dex */
public class k extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CampaignEx f41868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<CampaignEx> f41869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.mbridge.msdk.videocommon.download.a f41871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.mbridge.msdk.videocommon.entity.c f41872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f41873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f41874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.mbridge.msdk.video.module.listener.a f41875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41877k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41878l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41879m = false;

    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (!kVar.f41867a || kVar.f41868b == null || !a1.b(kVar.f41873g) || com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                    return;
                }
                com.mbridge.msdk.foundation.db.i iVarA = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
                fVar.a(System.currentTimeMillis());
                fVar.b(k.this.f41873g);
                fVar.a(k.this.f41868b.getId());
                iVarA.a(fVar);
            } catch (Throwable th2) {
                q0.b("NotifyListener", th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                k kVar = k.this;
                if (kVar.f41867a && kVar.f41868b != null && a1.b(kVar.f41873g)) {
                    com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                    k kVar2 = k.this;
                    aVarA.a(kVar2.f41868b, kVar2.f41873g);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.videocommon.cache.a aVarA2 = com.mbridge.msdk.videocommon.cache.a.a();
                k kVar3 = k.this;
                aVarA2.b(kVar3.f41874h, kVar3.f41868b.getAdType());
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                q0.a("NotifyListener", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(k.this.f41868b.getId());
            } catch (Throwable th2) {
                q0.b("NotifyListener", th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: compiled from: StatisticsOnNotifyListener.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.videocommon.download.a aVar;
            try {
                if (s0.a().a("c_r_v_f_w_s_e", false)) {
                    return;
                }
                k kVar = k.this;
                if (!kVar.f41867a || (aVar = kVar.f41871e) == null) {
                    return;
                }
                if (aVar.h() != null && !TextUtils.isEmpty(k.this.f41871e.h().getVideoUrlEncode())) {
                    com.mbridge.msdk.foundation.db.m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(k.this.f41871e.h().getVideoUrlEncode());
                }
                if (TextUtils.isEmpty(k.this.f41871e.p())) {
                    return;
                }
                File file = new File(k.this.f41871e.p());
                if (file.exists() && file.isFile() && file.delete()) {
                    q0.a("NotifyListener", "DEL File :" + file.getAbsolutePath());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public k(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        this.f41870d = false;
        this.f41875i = new f();
        this.f41876j = 1;
        if (!z10 && campaignEx != null && a1.b(str2) && aVar != null && aVar2 != null) {
            this.f41868b = campaignEx;
            this.f41874h = str;
            this.f41873g = str2;
            this.f41871e = aVar;
            this.f41872f = cVar;
            this.f41875i = aVar2;
            this.f41867a = true;
            this.f41876j = i10;
            this.f41870d = false;
            return;
        }
        if (!z10 || campaignEx == null || !a1.b(str2) || aVar2 == null) {
            return;
        }
        this.f41868b = campaignEx;
        this.f41874h = str;
        this.f41873g = str2;
        this.f41871e = aVar;
        this.f41872f = cVar;
        this.f41875i = aVar2;
        this.f41867a = true;
        this.f41876j = i10;
        this.f41870d = true;
    }

    private void d() {
        if (!this.f41867a || com.mbridge.msdk.foundation.same.buffer.b.f37733k == null || TextUtils.isEmpty(this.f41868b.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f41873g, this.f41868b, "reward");
    }

    private void f() {
        if (this.f41868b != null) {
            try {
                HashMap map = new HashMap();
                List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f41868b.getCampaignUnitId(), this.f41868b.getRequestId());
                if (listA == null || listA.size() <= 0 || listA.get(0) == null) {
                    return;
                }
                if (listA.get(0).c() == 1) {
                    map.put("encrypt_p=", "encrypt_p=" + listA.get(0).b());
                    map.put("irlfa=", "irlfa=1");
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        CampaignEx campaignEx = this.f41868b;
                        campaignEx.setImpressionURL(campaignEx.getImpressionURL().replaceAll(str, str2));
                        CampaignEx campaignEx2 = this.f41868b;
                        campaignEx2.setOnlyImpressionURL(campaignEx2.getOnlyImpressionURL().replaceAll(str, str2));
                    }
                }
                q0.a("BidReplaceCampignDao", "removeReplace count " + com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f41868b.getRequestId()));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void m() {
        new Thread(new c()).start();
    }

    public void a() {
        com.mbridge.msdk.videocommon.download.b.getInstance().a(false);
    }

    public void a(int i10) {
        CampaignEx campaignEx = this.f41868b;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (i10 == 1 || i10 == 2) {
                if (!noticeUrl.contains("endscreen_type")) {
                    StringBuilder sb2 = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb2.append("&endscreen_type=");
                        sb2.append(i10);
                    } else {
                        sb2.append("?endscreen_type=");
                        sb2.append(i10);
                    }
                    noticeUrl = sb2.toString();
                } else if (i10 == 2) {
                    if (noticeUrl.contains("endscreen_type=1")) {
                        noticeUrl = noticeUrl.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (noticeUrl.contains("endscreen_type=2")) {
                    noticeUrl = noticeUrl.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f41868b.setNoticeUrl(noticeUrl);
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        this.f41875i.a(i10, obj);
    }

    public void a(int i10, String str) {
        if (this.f41868b != null) {
            com.mbridge.msdk.foundation.same.report.g.c(new com.mbridge.msdk.foundation.entity.n("2000062", this.f41868b.getId(), this.f41868b.getRequestId(), this.f41868b.getRequestIdNotice(), this.f41873g, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()), i10, str), com.mbridge.msdk.foundation.controller.c.n().d(), this.f41873g);
        }
    }

    public void a(CampaignEx campaignEx) {
        this.f41868b = campaignEx;
    }

    public void a(String str) {
        List<CampaignEx> list;
        if (this.f41868b == null || (list = this.f41869c) == null || list.size() == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f41868b = this.f41869c.get(jSONObject.getInt("camp_position"));
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NotifyListener", e10.getMessage());
            }
        }
    }

    public void a(List<CampaignEx> list) {
        this.f41869c = list;
    }

    public void b() {
        try {
            b bVar = new b();
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
            } else {
                bVar.run();
            }
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public void b(int i10) {
        if (this.f41868b != null) {
            if (i10 == 1 || i10 == 2) {
                com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f41868b, i10, this.f41876j);
            }
        }
    }

    public void b(String str) {
        try {
            if (this.f41868b != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("url", this.f41868b.getVideoUrlEncode());
                eVar.a("reason", str);
                String noticeUrl = this.f41868b.getNoticeUrl();
                String clickURL = this.f41868b.getClickURL();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    eVar.a("offer_url", noticeUrl);
                } else if (!TextUtils.isEmpty(clickURL)) {
                    eVar.a("offer_url", clickURL);
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000021", this.f41868b, eVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void c() {
        a aVar = new a();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    public void e() {
        d dVar = new d();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(dVar);
        } else {
            dVar.run();
        }
    }

    public void g() {
        if (!this.f41867a || this.f41868b == null) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000061", this.f41868b.getId(), this.f41868b.getRequestId(), this.f41868b.getRequestIdNotice(), this.f41873g, m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
        nVar.b(this.f41868b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.g.b(nVar, com.mbridge.msdk.foundation.controller.c.n().d(), this.f41873g);
    }

    public void h() {
        String str;
        try {
            if (!this.f41867a || this.f41877k || TextUtils.isEmpty(this.f41868b.getImpressionURL())) {
                return;
            }
            this.f41877k = true;
            if (this.f41868b.isBidCampaign()) {
                f();
            }
            String impressionURL = this.f41868b.getImpressionURL();
            if (this.f41868b.getSpareOfferFlag() == 1) {
                str = impressionURL + "&to=1&cbt=" + this.f41868b.getCbt() + "&tmorl=" + this.f41876j;
            } else {
                str = impressionURL + "&to=0&cbt=" + this.f41868b.getCbt() + "&tmorl=" + this.f41876j;
            }
            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f41868b, this.f41873g, str, false, true, com.mbridge.msdk.click.retry.a.f35715m);
            com.mbridge.msdk.video.module.report.b.d(com.mbridge.msdk.foundation.controller.c.n().d(), this.f41868b);
            m();
            d();
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }

    public void i() {
        CampaignEx campaignEx;
        Map<String, Long> map;
        String str;
        try {
            CampaignEx campaignEx2 = this.f41868b;
            if (campaignEx2 != null && campaignEx2.isDynamicView() && this.f41870d && !this.f41868b.isCampaignIsFiltered()) {
                this.f41878l = true;
                return;
            }
            if (!this.f41867a || (campaignEx = this.f41868b) == null || TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) || (map = com.mbridge.msdk.foundation.same.buffer.b.f37734l) == null || map.containsKey(this.f41868b.getOnlyImpressionURL()) || this.f41878l) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.f37734l.put(this.f41868b.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            String onlyImpressionURL = this.f41868b.getOnlyImpressionURL();
            if (this.f41868b.getSpareOfferFlag() == 1) {
                str = onlyImpressionURL + "&to=1&cbt=" + this.f41868b.getCbt() + "&tmorl=" + this.f41876j;
            } else {
                str = onlyImpressionURL + "&to=0&cbt=" + this.f41868b.getCbt() + "&tmorl=" + this.f41876j;
            }
            String str2 = str;
            if (!this.f41870d || this.f41868b.isCampaignIsFiltered()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f41868b, this.f41873g, str2, false, true, com.mbridge.msdk.click.retry.a.f35716n);
                b();
            }
            this.f41878l = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        CampaignEx campaignEx;
        List<String> pv_urls;
        try {
            if (!this.f41867a || this.f41879m || (campaignEx = this.f41868b) == null) {
                return;
            }
            this.f41879m = true;
            if ((campaignEx.isDynamicView() && this.f41870d && !this.f41868b.isCampaignIsFiltered()) || (pv_urls = this.f41868b.getPv_urls()) == null || pv_urls.size() <= 0) {
                return;
            }
            Iterator<String> it = pv_urls.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f41868b, this.f41873g, it.next(), false, true);
            }
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage());
        }
    }

    public void k() {
        CampaignEx campaignEx = this.f41868b;
        if (campaignEx == null || TextUtils.isEmpty(campaignEx.getCampaignUnitId()) || this.f41868b.getNativeVideoTracking() == null || this.f41868b.getNativeVideoTracking().n() == null) {
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        CampaignEx campaignEx2 = this.f41868b;
        com.mbridge.msdk.click.a.a(contextD, campaignEx2, campaignEx2.getCampaignUnitId(), this.f41868b.getNativeVideoTracking().n(), false, false);
    }

    public void l() {
        com.mbridge.msdk.videocommon.download.a aVar = this.f41871e;
        if (aVar != null) {
            aVar.d(true);
        }
    }
}
