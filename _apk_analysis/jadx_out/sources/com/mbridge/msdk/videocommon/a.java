package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: TemplateWebviewCache.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0529a> f42263a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0529a> f42264b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0529a> f42265c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0529a> f42266d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0529a> f42267e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0529a> f42268f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0529a> f42269g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0529a> f42270h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0529a> f42271i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0529a> f42272j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TemplateWebviewCache.java */
    public static class C0529a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WindVaneWebView f42273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f42274b;

        public String a() {
            WindVaneWebView windVaneWebView = this.f42273a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        public void a(WindVaneWebView windVaneWebView) {
            this.f42273a = windVaneWebView;
        }

        public void a(String str) {
            WindVaneWebView windVaneWebView = this.f42273a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public void a(boolean z10) {
            this.f42274b = z10;
        }

        public WindVaneWebView b() {
            return this.f42273a;
        }

        public boolean c() {
            return this.f42274b;
        }
    }

    public static C0529a a(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 != 94) {
                if (i10 != 287) {
                    if (i10 != 288) {
                        ConcurrentHashMap<String, C0529a> concurrentHashMap = f42263a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f42263a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0529a> concurrentHashMap2 = f42266d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f42266d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0529a> concurrentHashMap3 = f42265c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f42265c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0529a> concurrentHashMap4 = f42268f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f42268f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0529a> concurrentHashMap5 = f42264b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f42264b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0529a> concurrentHashMap6 = f42267e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f42267e.get(requestIdNotice);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void a() {
        f42271i.clear();
        f42272j.clear();
    }

    public static void a(int i10, String str, C0529a c0529a) {
        try {
            if (i10 == 94) {
                if (f42264b == null) {
                    f42264b = new ConcurrentHashMap<>();
                }
                f42264b.put(str, c0529a);
            } else {
                if (i10 != 287) {
                    return;
                }
                if (f42265c == null) {
                    f42265c = new ConcurrentHashMap<>();
                }
                f42265c.put(str, c0529a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            f42269g.clear();
        } else {
            for (String str2 : f42269g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f42269g.remove(str2);
                }
            }
        }
        f42270h.clear();
    }

    public static void a(String str, C0529a c0529a, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                f42270h.put(str, c0529a);
                return;
            } else {
                f42269g.put(str, c0529a);
                return;
            }
        }
        if (z11) {
            f42272j.put(str, c0529a);
        } else {
            f42271i.put(str, c0529a);
        }
    }

    public static C0529a b(String str) {
        if (f42269g.containsKey(str)) {
            return f42269g.get(str);
        }
        if (f42270h.containsKey(str)) {
            return f42270h.get(str);
        }
        if (f42271i.containsKey(str)) {
            return f42271i.get(str);
        }
        if (f42272j.containsKey(str)) {
            return f42272j.get(str);
        }
        return null;
    }

    public static void b(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0529a> concurrentHashMap = f42264b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0529a> concurrentHashMap2 = f42267e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i10 != 287) {
                if (i10 != 288) {
                    ConcurrentHashMap<String, C0529a> concurrentHashMap3 = f42263a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0529a> concurrentHashMap4 = f42266d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0529a> concurrentHashMap5 = f42265c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0529a> concurrentHashMap6 = f42268f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void b(int i10, String str, C0529a c0529a) {
        try {
            if (i10 == 94) {
                if (f42267e == null) {
                    f42267e = new ConcurrentHashMap<>();
                }
                f42267e.put(str, c0529a);
            } else if (i10 == 287) {
                if (f42268f == null) {
                    f42268f = new ConcurrentHashMap<>();
                }
                f42268f.put(str, c0529a);
            } else if (i10 != 288) {
                if (f42263a == null) {
                    f42263a = new ConcurrentHashMap<>();
                }
                f42263a.put(str, c0529a);
            } else {
                if (f42266d == null) {
                    f42266d = new ConcurrentHashMap<>();
                }
                f42266d.put(str, c0529a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void c(String str) {
        for (Map.Entry<String, C0529a> entry : f42269g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f42269g.remove(entry.getKey());
            }
        }
    }

    public static void d(String str) {
        for (Map.Entry<String, C0529a> entry : f42270h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f42270h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        if (f42269g.containsKey(str)) {
            f42269g.remove(str);
        }
        if (f42271i.containsKey(str)) {
            f42271i.remove(str);
        }
        if (f42270h.containsKey(str)) {
            f42270h.remove(str);
        }
        if (f42272j.containsKey(str)) {
            f42272j.remove(str);
        }
    }
}
