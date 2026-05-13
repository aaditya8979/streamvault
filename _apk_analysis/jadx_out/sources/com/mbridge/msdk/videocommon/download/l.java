package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: UnitCacheCtroller.java */
/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f42344c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f42346e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f42349h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f42351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f42352k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f42354m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k f42357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f42358q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<CampaignEx> f42342a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42343b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f42345d = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f42347f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> f42348g = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f42350i = 3600;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f42353l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.mbridge.msdk.setting.l f42355n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.mbridge.msdk.setting.l f42356o = null;

    /* JADX INFO: compiled from: UnitCacheCtroller.java */
    public class a implements c {
        public a() {
        }

        @Override // com.mbridge.msdk.videocommon.download.c
        public void onProgress(long j10, int i10) {
            if (i10 == 5 || i10 == 4) {
                l.this.f42343b = true;
                l.this.d();
            }
            if (i10 == 2) {
                l.this.f42343b = true;
            }
        }
    }

    /* JADX INFO: compiled from: UnitCacheCtroller.java */
    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f42360a;

        public b(CampaignEx campaignEx) {
            this.f42360a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            if (l.this.f42344c != null) {
                l.this.f42344c.a(str);
            }
            if (l.this.f42346e == null || l.this.f42346e.size() <= 0 || this.f42360a == null) {
                return;
            }
            com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f42346e.get(this.f42360a.getRequestId() + "_" + this.f42360a.getSecondRequestIndex());
            if (aVar != null) {
                aVar.a(str);
                l.this.f42346e.remove(this.f42360a.getRequestId() + "_" + this.f42360a.getSecondRequestIndex());
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            if (l.this.f42344c != null) {
                l.this.f42344c.a(str, str2);
            }
            CampaignEx campaignEx = this.f42360a;
            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f42360a.getRsIgnoreCheckRule().size() > 0 && this.f42360a.getRsIgnoreCheckRule().contains(0)) {
                q0.c("UnitCacheCtroller", "Is not check video download status");
                return;
            }
            if (l.this.f42346e == null || l.this.f42346e.size() <= 0 || this.f42360a == null) {
                return;
            }
            com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f42346e.get(this.f42360a.getRequestId() + "_" + this.f42360a.getSecondRequestIndex());
            if (aVar != null) {
                aVar.a(str, str2);
                l.this.f42346e.remove(this.f42360a.getRequestId() + "_" + this.f42360a.getSecondRequestIndex());
            }
        }
    }

    public l(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f42354m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f42358q = zB;
            if (zB) {
                this.f42351j = str;
                this.f42354m = i10;
                this.f42357p = new k(campaignEx, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f42357p = null;
            this.f42358q = false;
        }
        this.f42349h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list = this.f42342a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.f42351j = str;
        this.f42354m = i10;
        a(this.f42342a);
    }

    public l(Context context, List<CampaignEx> list, String str, int i10) {
        this.f42354m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f42358q = zB;
            if (zB) {
                this.f42351j = str;
                this.f42354m = i10;
                this.f42357p = new k(list, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f42357p = null;
            this.f42358q = false;
        }
        this.f42349h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list2 = this.f42342a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f42351j = str;
        this.f42354m = i10;
        a(this.f42342a);
    }

    private int a(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.f42355n;
            if (lVar != null) {
                return lVar.C();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitCacheCtroller", e10.getMessage());
            }
        }
        return 100;
    }

    private void a() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f42348g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i10 = 0;
                    while (i10 < this.f42348g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f42348g.get(i10);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value != null && value.h() != null && value.t()) {
                                value.y();
                                this.f42348g.remove(map);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused) {
                q0.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.a(java.util.List):void");
    }

    private boolean a(int i10, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            q0.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            q0.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    private boolean a(CampaignEx.c cVar) {
        return true;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        long jM = aVar.m();
        long j10 = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i10 == 0) {
            if (aVar.h() != null && !TextUtils.isEmpty(aVar.h().getVideoUrlEncode())) {
                return true;
            }
        } else if (j10 > 0 && jM * 100 >= j10 * ((long) i10)) {
            if (i10 != 100 || aVar.o() == 5) {
                return true;
            }
            aVar.g();
            return false;
        }
        return false;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10, boolean z10) {
        long jM = aVar.m();
        long j10 = aVar.j();
        if (TextUtils.isEmpty(aVar.i())) {
            q0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx campaignExH = aVar.h();
        if (campaignExH != null) {
            if (campaignExH.getRsIgnoreCheckRule() != null && campaignExH.getRsIgnoreCheckRule().size() > 0 && campaignExH.getRsIgnoreCheckRule().contains(0)) {
                q0.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (campaignExH.getIsTimeoutCheckVideoStatus() == 1 && campaignExH.getVideoCheckType() == 1) {
                return true;
            }
            if (z10 && campaignExH.getVideoCheckType() == 1) {
                if (i10 == 0) {
                    return true;
                }
                if ((j10 != 0 || jM != 0) && jM >= ((long) (i10 / 100)) * j10) {
                    campaignExH.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i10);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !v0.l(str)) || a1.a(str) || b(str, campaignEx);
            }
            q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return false;
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList) {
        try {
            for (Map<String, com.mbridge.msdk.videocommon.download.a> map : copyOnWriteArrayList) {
                if (map != null) {
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().o() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            return campaignEx.getReady_rate() != -1 ? campaignEx.getReady_rate() : c(campaignEx);
        }
        return -1;
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !d(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return a1.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || a1.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        q0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    private int c(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f42356o == null) {
                    this.f42356o = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f42351j);
                }
                return this.f42356o.C();
            }
            if (campaignEx.getAdType() == 42) {
                return a((CampaignEx) null);
            }
            if (this.f42352k == null) {
                this.f42352k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f42351j, false);
            }
            return this.f42352k.w();
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return 100;
        }
    }

    private boolean d(CampaignEx campaignEx) {
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

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    eVar.a("resumed_breakpoint", "2");
                } else {
                    eVar.a("resumed_breakpoint", "1");
                }
                eVar.a("resource_type", 4);
                eVar.a("scenes", "1");
                eVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public com.mbridge.msdk.videocommon.download.a a(int i10, boolean z10) {
        k kVar;
        if (this.f42358q && (kVar = this.f42357p) != null) {
            return kVar.d();
        }
        try {
            return b(i10, z10);
        } catch (Throwable th2) {
            q0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return null;
        }
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        k kVar;
        if (this.f42358q && (kVar = this.f42357p) != null) {
            return kVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f42348g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
            } catch (Throwable unused) {
                q0.b("UnitCacheCtroller", "failed to get campaignTast by cid");
            }
            for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f42348g) {
                if (map != null && map.containsKey(str)) {
                    return map.get(str);
                }
                return null;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017f A[Catch: Exception -> 0x0295, all -> 0x02c5, TryCatch #4 {, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x005e, B:23:0x0068, B:25:0x006e, B:28:0x0078, B:30:0x0082, B:32:0x008c, B:34:0x009a, B:36:0x00a8, B:38:0x00b2, B:44:0x00cf, B:47:0x00d7, B:50:0x00e1, B:52:0x00f1, B:54:0x00fd, B:87:0x0170, B:89:0x017f, B:91:0x0185, B:93:0x0194, B:95:0x019c, B:97:0x01a5, B:99:0x01ac, B:101:0x01b2, B:104:0x01b7, B:107:0x01ba, B:109:0x01c3, B:111:0x01c9, B:113:0x01d3, B:115:0x01e1, B:135:0x022a, B:139:0x0238, B:141:0x023c, B:143:0x0246, B:145:0x024c, B:148:0x0254, B:183:0x02c9, B:184:0x02cc, B:157:0x0272, B:159:0x027c, B:161:0x0282, B:163:0x0288, B:129:0x0210, B:57:0x010b, B:59:0x0111, B:61:0x011b, B:64:0x0124, B:66:0x012a, B:68:0x0130, B:71:0x013b, B:73:0x0141, B:75:0x0147, B:77:0x014e, B:79:0x0158, B:81:0x015e), top: B:206:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.mbridge.msdk.videocommon.download.a> a(java.lang.String r26, int r27, boolean r28, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r29, boolean r30, com.mbridge.msdk.foundation.same.report.metrics.e r31) {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.a(java.lang.String, int, boolean, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.metrics.e):java.util.List");
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (!this.f42358q || (kVar = this.f42357p) == null) {
            this.f42344c = aVar;
        } else {
            kVar.a(aVar);
        }
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f42358q && (kVar = this.f42357p) != null) {
            kVar.a(str, aVar);
            return;
        }
        if (this.f42346e == null) {
            this.f42346e = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f42346e.put(str, aVar);
    }

    public boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx == null || !a(new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str, this.f42353l), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0161 A[Catch: all -> 0x02a7, Exception -> 0x02a9, TRY_ENTER, TryCatch #0 {Exception -> 0x02a9, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0226, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c1, B:118:0x01cb, B:120:0x01d9, B:126:0x01f4, B:128:0x01fa, B:130:0x0200, B:134:0x020b, B:140:0x021e, B:145:0x0239, B:148:0x0241, B:150:0x0245, B:152:0x024f, B:154:0x0255, B:158:0x025d, B:161:0x0267, B:163:0x0271, B:165:0x0277, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029d, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184 A[Catch: all -> 0x02a7, Exception -> 0x02a9, TRY_ENTER, TryCatch #0 {Exception -> 0x02a9, blocks: (B:11:0x0019, B:15:0x0025, B:28:0x006f, B:29:0x0074, B:31:0x007c, B:32:0x008c, B:34:0x0092, B:36:0x00a0, B:39:0x00a8, B:40:0x00b2, B:42:0x00b8, B:49:0x00db, B:52:0x00e3, B:55:0x00ea, B:57:0x00fa, B:58:0x0102, B:88:0x0161, B:90:0x0173, B:96:0x0184, B:98:0x018a, B:141:0x0226, B:100:0x0198, B:104:0x01a2, B:106:0x01a8, B:114:0x01b4, B:116:0x01c1, B:118:0x01cb, B:120:0x01d9, B:126:0x01f4, B:128:0x01fa, B:130:0x0200, B:134:0x020b, B:140:0x021e, B:145:0x0239, B:148:0x0241, B:150:0x0245, B:152:0x024f, B:154:0x0255, B:158:0x025d, B:161:0x0267, B:163:0x0271, B:165:0x0277, B:62:0x0110, B:64:0x0116, B:66:0x0120, B:69:0x0129, B:71:0x012f, B:73:0x0135, B:76:0x0141, B:78:0x0147, B:82:0x014f, B:84:0x0159, B:19:0x0033, B:21:0x003f, B:27:0x0055, B:173:0x029d, B:25:0x0049), top: B:187:0x0019, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.videocommon.download.a b(int r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.b(int, boolean):com.mbridge.msdk.videocommon.download.a");
    }

    public void b() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f42358q && (kVar = this.f42357p) != null) {
            kVar.a();
            return;
        }
        if (s0.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.f42348g) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i10 = 0;
                while (i10 < this.f42348g.size()) {
                    Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f42348g.get(i10);
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                        if (value != null) {
                            if (jCurrentTimeMillis - value.n() > this.f42350i * 1000 && value.o() == 1) {
                                value.c("download timeout");
                                value.c(this.f42353l);
                                value.g();
                                this.f42348g.remove(map);
                                i10--;
                            }
                            if (value.o() != 1 && value.o() != 5 && value.o() != 0) {
                                value.g();
                                this.f42348g.remove(map);
                                i10--;
                            }
                        }
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void b(String str) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f42358q && (kVar = this.f42357p) != null) {
            kVar.c(str);
            return;
        }
        try {
            synchronized (this.f42348g) {
                if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f42348g) != null && copyOnWriteArrayList.size() > 0) {
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f42348g) {
                        if (map != null) {
                            for (Map.Entry<String, com.mbridge.msdk.videocommon.download.a> entry : map.entrySet()) {
                                if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                    this.f42348g.remove(map);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("UnitCacheCtroller", e10.getMessage());
            }
        }
    }

    public void b(List<CampaignEx> list) {
        k kVar;
        if (this.f42358q && (kVar = this.f42357p) != null) {
            kVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.f42342a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        a(this.f42342a);
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> c() {
        k kVar;
        return (!this.f42358q || (kVar = this.f42357p) == null) ? this.f42348g : kVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0199 A[Catch: all -> 0x0225, TryCatch #1 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:93:0x017e, B:95:0x0182, B:96:0x018b, B:98:0x018f, B:102:0x0199, B:103:0x019d, B:105:0x01bf, B:109:0x01c5, B:111:0x01c9, B:115:0x01d7, B:119:0x01e0, B:121:0x01eb, B:123:0x01ef, B:126:0x01f3, B:129:0x01f9, B:131:0x0204, B:135:0x020c, B:136:0x0211, B:142:0x021e, B:141:0x021b, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:143:0x0223), top: B:151:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db A[Catch: all -> 0x0225, TryCatch #1 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:93:0x017e, B:95:0x0182, B:96:0x018b, B:98:0x018f, B:102:0x0199, B:103:0x019d, B:105:0x01bf, B:109:0x01c5, B:111:0x01c9, B:115:0x01d7, B:119:0x01e0, B:121:0x01eb, B:123:0x01ef, B:126:0x01f3, B:129:0x01f9, B:131:0x0204, B:135:0x020c, B:136:0x0211, B:142:0x021e, B:141:0x021b, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:143:0x0223), top: B:151:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b A[Catch: all -> 0x0225, TryCatch #1 {, blocks: (B:11:0x0016, B:13:0x001f, B:14:0x0021, B:15:0x0027, B:17:0x002d, B:20:0x0036, B:21:0x003e, B:23:0x0044, B:26:0x0054, B:29:0x005b, B:31:0x0061, B:32:0x0063, B:35:0x006f, B:36:0x007f, B:38:0x0090, B:40:0x0094, B:41:0x009c, B:42:0x00a0, B:48:0x00b5, B:50:0x00b9, B:51:0x00cd, B:53:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:74:0x0125, B:76:0x012a, B:78:0x0130, B:82:0x0167, B:83:0x016b, B:85:0x0170, B:89:0x0178, B:93:0x017e, B:95:0x0182, B:96:0x018b, B:98:0x018f, B:102:0x0199, B:103:0x019d, B:105:0x01bf, B:109:0x01c5, B:111:0x01c9, B:115:0x01d7, B:119:0x01e0, B:121:0x01eb, B:123:0x01ef, B:126:0x01f3, B:129:0x01f9, B:131:0x0204, B:135:0x020c, B:136:0x0211, B:142:0x021e, B:141:0x021b, B:63:0x00fc, B:65:0x0100, B:69:0x0115, B:70:0x011b, B:72:0x011f, B:143:0x0223), top: B:151:0x0016, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.d():void");
    }

    public void e() {
        k kVar;
        if (this.f42358q && (kVar = this.f42357p) != null) {
            kVar.k();
            return;
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f42348g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.f42348g) {
                        if (map != null) {
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && value.o() == 1) {
                                    value.c("playing and stop download");
                                    value.g();
                                    this.f42348g.remove(map);
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("UnitCacheCtroller", th2.getMessage());
                }
            }
        }
    }

    public void f(CampaignEx campaignEx) {
        k kVar;
        if (this.f42358q && (kVar = this.f42357p) != null) {
            kVar.h(campaignEx);
            return;
        }
        List<CampaignEx> list = this.f42342a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        a(this.f42342a);
    }
}
