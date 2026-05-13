package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: BannerLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f38442n = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38443a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.data.b f38445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f38446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f38447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.d f38448f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38444b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f38449g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Timer f38450h = new Timer();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile List<String> f38451i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f38452j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f38453k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f38454l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f38455m = "";

    /* JADX INFO: compiled from: BannerLoader.java */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38457b;

        public a(String str, CampaignEx campaignEx) {
            this.f38456a = str;
            this.f38457b = campaignEx;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (b.this.f38449g) {
                return;
            }
            b.this.f38449g = true;
            b.this.a(this.f38456a, -1, "", false, this.f38457b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerLoader.java */
    public class C0457b extends com.mbridge.msdk.mbbanner.common.response.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f38459c;

        public C0457b(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f38459c = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.a
        public void a(int i10, String str) {
            q0.c(b.f38442n, "requestCampaign--> Fail errorCode:" + i10 + " msg:" + str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
            bVar.c(i10 + "#" + str);
            bVar.a(new MBridgeIds(this.placementId, this.unitId));
            bVar.b(this.f38459c.b());
            b.this.f38446d.a(b.this.f38447e, bVar);
            b.this.f38448f.a(this.unitId);
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.a
        public void a(CampaignUnit campaignUnit) throws Throwable {
            try {
                q0.c(b.f38442n, "requestCampaign--> Succeed");
                campaignUnit.setLocalRequestId(this.f38459c.b());
                b.this.f38446d.a(b.this.f38447e, campaignUnit, this.unitId);
                b.this.a(this.unitId, this.f38459c.b(), campaignUnit);
            } catch (Exception e10) {
                q0.c(b.f38442n, "requestCampaign--> Fail with exception = " + e10.getMessage());
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
                bVar.a(new MBridgeIds(this.placementId, this.unitId));
                bVar.b(this.f38459c.b());
                bVar.a((campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().isEmpty()) ? null : campaignUnit.getAds().get(0));
                bVar.a((Throwable) e10);
                b.this.f38446d.a(b.this.f38447e, bVar);
                b.this.f38448f.a(this.unitId);
            }
        }
    }

    /* JADX INFO: compiled from: BannerLoader.java */
    public class c extends c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f38463c;

        public c(String str, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f38461a = str;
            this.f38462b = campaignEx;
            this.f38463c = context;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f38461a);
            cVar.a(str, eVar);
            com.mbridge.msdk.mbbanner.common.report.a.a(str, cVar, this.f38462b, this.f38463c, null);
        }
    }

    /* JADX INFO: compiled from: BannerLoader.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignUnit f38465a;

        public d(CampaignUnit campaignUnit) {
            this.f38465a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.c(b.f38442n, "在单独子线程保存数据库 开始");
            j.a(g.a(b.this.f38443a)).d();
            CampaignUnit campaignUnit = this.f38465a;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f38465a.getAds().size() > 0) {
                BannerUtils.uisList(b.this.f38443a, this.f38465a.getAds());
            }
            q0.c(b.f38442n, "在单独子线程保存数据库 完成");
        }
    }

    /* JADX INFO: compiled from: BannerLoader.java */
    public static class e implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f38467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f38468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f38469c;

        public e(b bVar, String str, CampaignEx campaignEx) {
            this.f38467a = bVar;
            this.f38468b = str;
            this.f38469c = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                q0.c(b.f38442n, "DownloadImageListener campaign image fail");
            }
            b bVar = this.f38467a;
            if (bVar != null) {
                bVar.a(this.f38468b, 1, str2, false, this.f38469c);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f38468b, this.f38469c.getCurrentLocalRid());
                cVarA.a(this.f38469c);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                cVarA.e(10);
                eVar.a("resource_type", 10);
                eVar.a("result", 3);
                eVar.a("url", str2);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_end", cVarA, eVar);
            } catch (Throwable th2) {
                q0.b(b.f38442n, th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (MBridgeConstans.DEBUG) {
                q0.c(b.f38442n, "DownloadImageListener campaign image success");
            }
            b bVar = this.f38467a;
            if (bVar != null) {
                bVar.a(this.f38468b, 1, str, true, this.f38469c);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f38468b, this.f38469c.getCurrentLocalRid());
                cVarA.a(this.f38469c);
                cVarA.e(10);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("resource_type", 10);
                eVar.a("result", 1);
                eVar.a("url", str);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_end", cVarA, eVar);
            } catch (Throwable th2) {
                q0.b(b.f38442n, th2.getMessage());
            }
        }
    }

    public b(Context context, com.mbridge.msdk.mbbanner.common.data.b bVar, com.mbridge.msdk.mbbanner.common.listener.b bVar2, com.mbridge.msdk.mbbanner.common.util.a aVar) {
        this.f38443a = context.getApplicationContext();
        this.f38445c = bVar;
        this.f38447e = bVar2;
        this.f38446d = aVar;
    }

    private int a(String str) {
        try {
            int iC = this.f38445c.c();
            if (iC > this.f38445c.b()) {
                return 0;
            }
            return iC;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.String r14, java.lang.String r15, com.mbridge.msdk.foundation.entity.CampaignEx r16) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb1
            r2 = 0
            com.mbridge.msdk.foundation.same.directory.c r0 = com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r0 = com.mbridge.msdk.foundation.same.directory.e.b(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.c1.b(r15)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            if (r4 == 0) goto L25
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
        L25:
            java.lang.String r4 = ".html"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.net.Uri r0 = android.net.Uri.parse(r15)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            r0.getPath()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            java.io.FileOutputStream r3 = com.safedk.android.internal.partials.MintegralFilesBridge.fileOutputStreamCtor(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            byte[] r0 = r15.getBytes()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r3.write(r0)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r3.flush()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r3.close()     // Catch: java.lang.Exception -> L65
            goto L6f
        L4d:
            r0 = move-exception
            r1 = r0
            goto L9f
        L50:
            r0 = move-exception
            r2 = r3
            goto L56
        L53:
            r0 = move-exception
            goto L9d
        L55:
            r0 = move-exception
        L56:
            java.lang.String r3 = com.mbridge.msdk.mbbanner.common.manager.b.f38442n     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L53
            com.mbridge.msdk.foundation.tools.q0.b(r3, r0)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L6f
            r2.close()     // Catch: java.lang.Exception -> L65
            goto L6f
        L65:
            r0 = move-exception
            java.lang.String r2 = com.mbridge.msdk.mbbanner.common.manager.b.f38442n
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r2, r0)
        L6f:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L92
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L92
            boolean r0 = r0.canRead()
            if (r0 != 0) goto L87
            goto L92
        L87:
            r4 = 2
            r6 = 1
            r2 = r13
            r3 = r14
            r5 = r15
            r7 = r16
            r2.a(r3, r4, r5, r6, r7)
            goto Lb1
        L92:
            r9 = 2
            r11 = 0
            r7 = r13
            r8 = r14
            r10 = r15
            r12 = r16
            r7.a(r8, r9, r10, r11, r12)
            goto Lb1
        L9d:
            r1 = r0
            r3 = r2
        L9f:
            if (r3 == 0) goto Lb0
            r3.close()     // Catch: java.lang.Exception -> La5
            goto Lb0
        La5:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = com.mbridge.msdk.mbbanner.common.manager.b.f38442n
            java.lang.String r2 = r2.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r0, r2)
        Lb0:
            throw r1
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.manager.b.a(java.lang.String, java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx):java.lang.String");
    }

    private List<CampaignEx> a(String str, CampaignUnit campaignUnit) {
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    q0.c(f38442n, "getNeedShowList 总共返回的campaign有：" + ads.size());
                    y.a(ads);
                    for (int i10 = 0; i10 < ads.size(); i10++) {
                        CampaignEx campaignEx = ads.get(i10);
                        if (campaignEx != null && campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getBannerUrl()) || !TextUtils.isEmpty(campaignEx.getBannerHtml()) || !TextUtils.isEmpty(campaignEx.getImageUrl()))) {
                            if (v0.c(campaignEx)) {
                                campaignEx.setRtinsType(v0.c(this.f38443a, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (com.mbridge.msdk.foundation.same.c.b(this.f38443a, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                v0.a(str, campaignEx, com.mbridge.msdk.foundation.same.a.f37715x);
                                this.f38455m = "APP ALREADY INSTALLED";
                            }
                            a(campaignEx, this.f38443a, (com.mbridge.msdk.foundation.same.report.metrics.c) null, str, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
                        }
                    }
                    q0.c(f38442n, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                }
            } catch (Exception e10) {
                q0.b(f38442n, e10.getMessage());
            }
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, context, cVar, new c(str, campaignEx, context, aVar));
        } catch (Exception e10) {
            q0.b(f38442n, e10.getMessage());
        }
    }

    private void a(CampaignUnit campaignUnit) {
        new Thread(new d(campaignUnit)).start();
    }

    private void a(String str, int i10) {
        if (this.f38454l) {
            return;
        }
        if ((this.f38452j || this.f38453k) && this.f38451i.size() == 0) {
            q0.c(f38442n, "在子线程处理业务逻辑 完成");
            this.f38449g = true;
            this.f38454l = true;
            this.f38450h.cancel();
            this.f38446d.a(this.f38447e, str, i10);
            this.f38448f.a(str);
        }
    }

    private void a(String str, int i10, CampaignEx campaignEx) {
        this.f38450h.schedule(new a(str, campaignEx), i10);
    }

    private void a(String str, CampaignEx campaignEx) {
        String str2 = f38442n;
        q0.c(str2, "在子线程处理业务逻辑 完成");
        q0.c(str2, "downloadResource--> Fail");
        this.f38449g = true;
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
        MBridgeIds mBridgeIds = new MBridgeIds();
        mBridgeIds.setUnitId(str);
        bVar.a(mBridgeIds);
        bVar.b(this.f38445c.a());
        bVar.a(campaignEx);
        this.f38446d.b(this.f38447e, bVar);
        this.f38448f.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, CampaignUnit campaignUnit) throws Throwable {
        CampaignEx campaignEx;
        if (campaignUnit == null) {
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
            MBridgeIds mBridgeIds = new MBridgeIds();
            mBridgeIds.setUnitId(str);
            bVar.a(mBridgeIds);
            bVar.b(str2);
            this.f38446d.a(this.f38447e, bVar);
            this.f38448f.a(str);
            return;
        }
        List<CampaignEx> listA = a(str, campaignUnit);
        a(campaignUnit);
        int i10 = 0;
        if (listA == null || listA.size() == 0) {
            q0.c(f38442n, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
            com.mbridge.msdk.foundation.error.b bVar2 = this.f38455m.contains("INSTALLED") ? new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED") : new com.mbridge.msdk.foundation.error.b(880003);
            MBridgeIds mBridgeIds2 = new MBridgeIds();
            mBridgeIds2.setUnitId(str);
            bVar2.a(mBridgeIds2);
            bVar2.b(str2);
            if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && (campaignEx = campaignUnit.getAds().get(0)) != null) {
                bVar2.a(campaignEx);
            }
            this.f38446d.a(this.f38447e, bVar2);
            this.f38448f.a(str);
            return;
        }
        q0.c(f38442n, "在子线程处理业务逻辑 开始");
        CampaignEx campaignEx2 = listA.get(0);
        a(str, 60000, campaignEx2);
        b(campaignUnit.getSessionId());
        a(str, listA);
        String strTrim = campaignEx2.getBannerUrl().trim();
        if (TextUtils.isEmpty(strTrim)) {
            String strTrim2 = campaignEx2.getBannerHtml().trim();
            if (TextUtils.isEmpty(strTrim2)) {
                this.f38453k = true;
                this.f38452j = true;
            } else {
                String strA = a(str, strTrim2, campaignEx2);
                if (listA.size() > 0) {
                    while (i10 < listA.size()) {
                        listA.get(i10).setBannerHtml(strA);
                        listA.get(i10).setHasMBTplMark(strTrim2.contains("<MBTPLMARK>"));
                        i10++;
                    }
                }
            }
        } else {
            b(str, strTrim, campaignEx2);
            if (listA.size() > 0) {
                while (i10 < listA.size()) {
                    listA.get(i10).setBannerUrl(campaignEx2.getBannerUrl());
                    listA.get(i10).setHasMBTplMark(true);
                    i10++;
                }
            }
        }
        b(str, listA);
    }

    private void a(String str, List<CampaignEx> list) {
        int size = this.f38444b;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    size += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (size > this.f38445c.b()) {
            q0.c(f38442n, "saveNextOffset 重置offset为0");
            size = 0;
        }
        q0.c(f38442n, "saveNextOffset 算出 下次的offset是:" + size);
        if (a1.b(str)) {
            this.f38445c.a(size);
        }
    }

    private String b() {
        return this.f38445c.d();
    }

    private void b(String str) {
        this.f38445c.b(str);
    }

    private void b(String str, String str2, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a(str, 3, str2, true, campaignEx);
    }

    private void b(String str, List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                this.f38451i.add(campaignEx.getImageUrl());
                com.mbridge.msdk.foundation.same.image.b.a(this.f38443a).a(campaignEx.getImageUrl(), new e(this, str, campaignEx));
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str, campaignEx.getCurrentLocalRid());
                cVarA.a(campaignEx);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("resource_type", 10);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_start", cVarA, eVar);
            }
        }
    }

    public void a(String str, int i10, String str2, boolean z10, CampaignEx campaignEx) {
        if (!z10) {
            if (i10 == -1) {
                q0.b(f38442n, " unitId =" + str + " --> time out!");
            }
            this.f38450h.cancel();
            a(str, campaignEx);
            return;
        }
        if (i10 == 1) {
            q0.c(f38442n, "downloadResource--> Success Image");
            synchronized (this) {
                this.f38451i.remove(str2);
                if (this.f38451i.size() == 0) {
                    a(str, i10);
                }
            }
            return;
        }
        if (i10 == 2) {
            q0.c(f38442n, "downloadResource--> Success banner_html");
            this.f38453k = true;
            a(str, i10);
        } else if (i10 == 3) {
            q0.c(f38442n, "downloadResource--> Success banner_url");
            this.f38452j = true;
            a(str, i10);
        }
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.d dVar) {
        boolean z10;
        try {
            q0.c(f38442n, "requestCampaign--> started");
            this.f38448f = dVar;
            C0457b c0457b = new C0457b(aVar);
            c0457b.setUnitId(str2);
            c0457b.setPlacementId(str);
            c0457b.setAdType(296);
            com.mbridge.msdk.mbbanner.common.request.a aVar2 = new com.mbridge.msdk.mbbanner.common.request.a(this.f38443a);
            this.f38444b = a(str2);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = com.mbridge.msdk.mbbanner.common.data.c.a(false, this.f38443a, str2, b(), this.f38444b, aVar);
            String strD = v0.d(str2);
            if (!TextUtils.isEmpty(strD)) {
                eVarA.a("j", strD);
            }
            String strA = aVar.a();
            if (TextUtils.isEmpty(strA)) {
                z10 = false;
            } else {
                c0457b.a(strA);
                z10 = true;
            }
            this.f38446d.a(z10);
            aVar2.choiceV3OrV5BySetting(1, eVarA, c0457b, strA, 30000L);
        } catch (Exception e10) {
            q0.b(f38442n, e10.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.a(new MBridgeIds(str, str2));
            this.f38446d.a(this.f38447e, bVar);
            this.f38448f.a(str2);
        }
    }
}
