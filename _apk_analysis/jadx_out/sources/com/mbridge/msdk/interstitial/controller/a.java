package com.mbridge.msdk.interstitial.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: InterstitialController.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f38289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Map<String, Integer> f38290p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Map<String, Integer> f38291q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Map<String, d> f38292r = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f38298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f38299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f38300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterstitialListener f38301i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38293a = "InterstitialController";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38302j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f38303k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f38304l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f38305m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f38306n = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InterstitialController.java */
    public class HandlerC0455a extends Handler {
        public HandlerC0455a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                if (a.this.f38301i != null) {
                    a.this.f38301i.onInterstitialLoadSuccess(a.this.f38298f);
                    return;
                }
                return;
            }
            String str = "";
            if (i10 == 2) {
                if (a.this.f38301i != null) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof String)) {
                        str = (String) obj;
                    }
                    a.this.f38301i.onInterstitialLoadFail(a.this.f38298f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 3) {
                a aVar = a.this;
                aVar.f38302j = true;
                if (aVar.f38301i != null) {
                    a.this.f38301i.onInterstitialShowSuccess(a.this.f38298f);
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (a.this.f38301i != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null && (obj2 instanceof String)) {
                        str = (String) obj2;
                    }
                    a.this.f38301i.onInterstitialShowFail(a.this.f38298f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 6) {
                if (a.this.f38301i != null) {
                    a.this.f38301i.onInterstitialAdClick(a.this.f38298f);
                }
            } else {
                if (i10 != 7) {
                    return;
                }
                a aVar2 = a.this;
                aVar2.f38302j = false;
                if (aVar2.f38301i != null) {
                    a.this.f38301i.onInterstitialClosed(a.this.f38298f);
                }
            }
        }
    }

    /* JADX INFO: compiled from: InterstitialController.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f38308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f38309b;

        public b(com.mbridge.msdk.interstitial.adapter.a aVar, c cVar) {
            this.f38308a = aVar;
            this.f38309b = cVar;
        }

        public void a(boolean z10, String str) {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f38308a;
                if (aVar != null) {
                    aVar.a((b) null);
                    this.f38308a = null;
                }
                if (this.f38309b != null) {
                    if (a.this.f38299g != null) {
                        a.this.f38299g.removeCallbacks(this.f38309b);
                    }
                    if (z10) {
                        if (a.this.f38301i != null) {
                            a.this.c(str);
                        }
                    } else if (a.this.f38301i != null) {
                        a.this.b(str);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b(boolean z10, String str) {
            try {
                a.this.f38303k = str;
                try {
                    ArrayList arrayList = new ArrayList();
                    com.mbridge.msdk.interstitial.adapter.a aVar = this.f38308a;
                    if (aVar != null && aVar.d() != null) {
                        arrayList.add(this.f38308a.d());
                    }
                    a.this.f38304l = com.mbridge.msdk.foundation.same.c.b(arrayList);
                } catch (Exception e10) {
                    q0.b(a.this.f38293a, e10.getMessage());
                }
                if (this.f38309b != null) {
                    if (a.this.f38299g != null) {
                        a.this.f38299g.removeCallbacks(this.f38309b);
                    }
                    if (z10) {
                        a.this.b(false);
                    } else if (a.this.f38301i != null) {
                        a.this.h();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: InterstitialController.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f38311a;

        public c(com.mbridge.msdk.interstitial.adapter.a aVar) {
            this.f38311a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f38311a;
                if (aVar != null) {
                    if (aVar.f()) {
                        a.this.c("load timeout");
                    } else if (a.this.f38301i != null) {
                        a.this.b("load timeout");
                    }
                    this.f38311a.a((b) null);
                    this.f38311a = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: InterstitialController.java */
    public class d {
        public d() {
        }

        public void a() {
            try {
                if (a.this.f38299g != null) {
                    a.this.f38299g.sendEmptyMessage(6);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void a(String str) {
            try {
                a.this.c(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b() {
            try {
                if (a.this.f38299g != null) {
                    a.this.f38299g.sendEmptyMessage(7);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void c() {
            try {
                a.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public a() {
        try {
            c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static int a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || (map = f38290p) == null || !map.containsKey(str) || (num = f38290p.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private void a(CampaignEx campaignEx) {
        d dVar = new d();
        if (f38292r != null && !TextUtils.isEmpty(this.f38295c)) {
            f38292r.put(this.f38295c, dVar);
        }
        Intent intent = new Intent(this.f38294b, (Class<?>) MBInterstitialActivity.class);
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f38295c)) {
            intent.putExtra("unitId", this.f38295c);
        }
        if (campaignEx != null) {
            this.f38305m = campaignEx.getRequestId();
            intent.putExtra(MBInterstitialActivity.INTENT_CAMAPIGN, campaignEx);
        }
        Context context = this.f38294b;
        if (context != null) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }

    public static void a(String str, int i10) {
        try {
            if (f38290p == null || TextUtils.isEmpty(str)) {
                return;
            }
            f38290p.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.f38299g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 2;
                this.f38299g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        try {
            CampaignEx campaignExD = new com.mbridge.msdk.interstitial.adapter.a(this.f38294b, this.f38295c, this.f38296d, this.f38297e, true).d();
            if (campaignExD != null) {
                a(campaignExD);
            } else if (z10) {
                a(true);
            } else {
                c("no ads available can show");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (this.f38301i != null) {
                c("can't show because unknow error");
            }
        }
    }

    private void c() {
        try {
            this.f38299g = new HandlerC0455a(Looper.getMainLooper());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            if (this.f38299g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f38299g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        try {
            l lVar = this.f38300h;
            if (lVar != null) {
                int iE = lVar.e();
                int iY = this.f38300h.y();
                if (iE <= 0) {
                    iE = 1;
                }
                if (iY <= 0) {
                    iY = 1;
                }
                int i10 = iY * iE;
                if (f38291q == null || TextUtils.isEmpty(this.f38295c)) {
                    return;
                }
                f38291q.put(this.f38295c, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void e() {
        try {
            g();
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38295c);
            this.f38300h = lVarE;
            if (lVarE == null) {
                this.f38300h = l.h(this.f38295c);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Handler handler = this.f38299g;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Handler handler = this.f38299g;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, g.f53141o);
        context.startActivity(intent);
    }

    public String a() {
        return this.f38304l;
    }

    public void a(InterstitialListener interstitialListener) {
        this.f38301i = interstitialListener;
    }

    public void a(boolean z10) {
        try {
            com.mbridge.msdk.interstitial.adapter.a aVar = new com.mbridge.msdk.interstitial.adapter.a(this.f38294b, this.f38295c, this.f38296d, this.f38297e, z10);
            c cVar = new c(aVar);
            aVar.a(new b(aVar, cVar));
            Handler handler = this.f38299g;
            if (handler != null) {
                handler.postDelayed(cVar, 30000L);
            }
            aVar.j();
        } catch (Exception e10) {
            e10.printStackTrace();
            if (z10) {
                return;
            }
            b("can't show because unknow error");
        }
    }

    public boolean a(Context context, Map<String, Object> map) {
        try {
            this.f38306n = false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f38306n = false;
        }
        if (map != null && context != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String)) {
            if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                this.f38297e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
            }
            this.f38295c = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            this.f38294b = context;
            if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                this.f38296d = (String) map.get(MBridgeConstans.PLACEMENT_ID);
            }
            this.f38298f = new MBridgeIds(this.f38296d, this.f38295c);
            this.f38306n = true;
            return this.f38306n;
        }
        return false;
    }

    public String b() {
        return this.f38302j ? this.f38305m : this.f38303k;
    }

    public void f() {
        try {
            if (this.f38294b == null) {
                b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f38295c)) {
                b("unitid is null");
            } else {
                if (!this.f38306n) {
                    b("init error");
                    return;
                }
                e();
                d();
                a(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            b("can't show because unknow error");
        }
    }

    public void g() {
        try {
            new j().a(this.f38294b, (String) null, (String) null, this.f38295c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        try {
            if (this.f38294b == null) {
                c("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f38295c)) {
                c("unitid is null");
            } else if (!this.f38306n) {
                c("init error");
            } else {
                e();
                b(true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c("can't show because unknow error");
        }
    }
}
