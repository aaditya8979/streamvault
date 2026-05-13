package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.G5;
import com.ironsource.Z7;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class MIMManager {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile String f38017i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f38018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f38020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f38021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f38022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f38023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile g f38024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile MiOverseaMiniCardBroadcasterReceiver f38025h;

    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 0);
                int intExtra2 = intExtra < 0 ? intent.getIntExtra("reason", 0) : -1;
                q0.b("MIMManager", stringExtra + Z7.f30794r + intExtra + Z7.f30794r + intExtra2);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a("key", URLEncoder.encode("m_mini_card", G5.N));
                        CampaignEx campaignExA = MIMManager.b().a(stringExtra);
                        if (campaignExA != null) {
                            eVar.a(ImpressionLog.f51754x, campaignExA.getRequestId());
                            eVar.a("rid_n", campaignExA.getRequestIdNotice());
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignExA.getCampaignUnitId());
                            eVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.f37355r.get(campaignExA.getCampaignUnitId()));
                            cVar.a(campaignExA);
                        }
                        eVar.a("event", String.valueOf(intExtra));
                        eVar.a("pkg_name", stringExtra);
                        if (intExtra2 != -1) {
                            eVar.a("reasonCode", String.valueOf(intExtra2));
                        }
                        cVar.a("m_mini_card", eVar);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mini_card", cVar);
                    } catch (Exception e10) {
                        q0.b("MIMManager", e10.getMessage());
                    }
                }
            }
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38026a;

        public a(Context context) {
            this.f38026a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MIMManager.this.f38018a.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f38022e = mIMManager.a();
                } catch (Exception e10) {
                    q0.a("MIMManager", e10.getMessage());
                }
                if (MIMManager.this.f38022e == null || !MIMManager.this.f38022e.booleanValue() || this.f38026a == null) {
                    return;
                }
                try {
                    MIMManager.this.f38024g = new g(null);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                    intentFilter.addAction(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                    this.f38026a.registerReceiver(MIMManager.this.f38024g, intentFilter);
                } catch (Exception e11) {
                    q0.a("MIMManager", e11.getMessage());
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38029b;

        public b(Context context, CampaignEx campaignEx) {
            this.f38028a = context;
            this.f38029b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.e(this.f38028a, this.f38029b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38032b;

        public c(Context context, CampaignEx campaignEx) {
            this.f38031a = context;
            this.f38032b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.d(this.f38031a, this.f38032b);
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38035b;

        public d(Context context, CampaignEx campaignEx) {
            this.f38034a = context;
            this.f38035b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    MIMManager.this.f(this.f38034a, this.f38035b);
                } catch (Exception e10) {
                    q0.b("MIMManager", e10.getMessage());
                    if (MIMManager.this.f38020c != null && MIMManager.this.f38020c.contains(this.f38035b)) {
                    }
                }
                if (MIMManager.this.f38020c != null && MIMManager.this.f38020c.contains(this.f38035b)) {
                    MIMManager.this.f38020c.remove(this.f38035b);
                }
            } catch (Throwable th2) {
                if (MIMManager.this.f38020c != null && MIMManager.this.f38020c.contains(this.f38035b)) {
                    MIMManager.this.f38020c.remove(this.f38035b);
                }
                throw th2;
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f38039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38040d;

        public e(Context context, String str, CampaignEx campaignEx, int i10) {
            this.f38037a = context;
            this.f38038b = str;
            this.f38039c = campaignEx;
            this.f38040d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f38037a == null || TextUtils.isEmpty(this.f38038b) || this.f38039c == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000100");
                jSONObject.put("network_type", m0.s(this.f38037a));
                jSONObject.put(ImpressionLog.f51754x, this.f38039c.getRequestId());
                jSONObject.put("rid_n", this.f38039c.getRequestIdNotice());
                if (!TextUtils.isEmpty(this.f38039c.getCampaignUnitId())) {
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f38039c.getCampaignUnitId());
                    String str = com.mbridge.msdk.foundation.controller.a.f37355r.get(this.f38039c.getCampaignUnitId());
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                jSONObject.put("cid", this.f38039c.getId());
                jSONObject.put("status", this.f38038b);
                jSONObject.put("code", this.f38040d);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                q0.b("MIMManager", th2.getMessage());
            }
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final MIMManager f38042a = new MIMManager(null);
    }

    public static class g extends BroadcastReceiver {
        private g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CampaignEx campaignExA;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN=")) || action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN=")) || !action.equals(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"))) {
                return;
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                int i10 = extras.getInt("statusCode", -1);
                String string = extras.getString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "");
                if (i10 == -1 || TextUtils.isEmpty(string) || (campaignExA = MIMManager.b().a(string)) == null) {
                    return;
                }
                MIMManager.b().a(context, campaignExA, i10);
                MIMManager.b().a(context, "dm_page_status", i10, MIMManager.b().c());
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    private MIMManager() {
        this.f38019b = 0;
        this.f38020c = new CopyOnWriteArrayList<>();
        this.f38018a = new AtomicBoolean(false);
    }

    public /* synthetic */ MIMManager(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f38023f;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f38023f;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f38020c;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            for (CampaignEx campaignEx2 : this.f38020c) {
                if (campaignEx2 != null && TextUtils.equals(campaignEx2.getPackageName(), str)) {
                    return campaignEx2;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a() {
        Cursor cursorQuery;
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        Boolean boolValueOf = null;
        if (contextD != null) {
            try {
                if (contextD.getContentResolver() != null) {
                    try {
                        cursorQuery = contextD.getContentResolver().query(Uri.parse(k0.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f32683h) || string.equalsIgnoreCase("true"))) {
                                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e10) {
                                q0.a("MIMManager", e10.getMessage());
                            }
                            try {
                                f38017i = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                            } catch (Exception e11) {
                                q0.a("MIMManager", e11.getMessage());
                            }
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e12) {
                            q0.a("MIMManager", e12.getMessage());
                        }
                    }
                }
            } catch (Exception e13) {
                q0.b("MIMManager", e13.getMessage());
            }
        }
        return boolValueOf;
    }

    private Runnable a(Context context, CampaignEx campaignEx) {
        return new c(context, campaignEx);
    }

    public static MIMManager b() {
        return f.f38042a;
    }

    private Runnable b(Context context, CampaignEx campaignEx) {
        return new b(context, campaignEx);
    }

    private Runnable c(Context context, CampaignEx campaignEx) {
        return new d(context, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, CampaignEx campaignEx) {
        String[] strArrZ;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrZ = nativeVideoTracking.z()) == null) {
                    return;
                }
                for (String str : strArrZ) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, CampaignEx campaignEx) {
        String[] strArrA;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrA = nativeVideoTracking.A()) == null) {
                    return;
                }
                for (String str : strArrA) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, CampaignEx campaignEx) {
        String[] strArrB;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrB = nativeVideoTracking.B()) == null) {
                    return;
                }
                for (String str : strArrB) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                }
            } catch (Exception e10) {
                q0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[PHI: r4
      0x002e: PHI (r4v7 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>) = 
      (r4v6 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
      (r4v8 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
     binds: [B:19:0x002c, B:12:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "MIMManager"
            if (r4 == 0) goto L48
            r1 = 0
            com.mbridge.msdk.foundation.tools.MIMManager$g r2 = r3.f38024g     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            if (r2 == 0) goto Le
            com.mbridge.msdk.foundation.tools.MIMManager$g r2 = r3.f38024g     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r4.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
        Le:
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r2 = r3.f38025h     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            if (r2 == 0) goto L17
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r2 = r3.f38025h     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r4.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
        L17:
            r3.f38023f = r1
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r4 = r3.f38020c
            if (r4 == 0) goto L31
            goto L2e
        L1e:
            r4 = move-exception
            goto L38
        L20:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L1e
            com.mbridge.msdk.foundation.tools.q0.a(r0, r4)     // Catch: java.lang.Throwable -> L1e
            r3.f38023f = r1
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r4 = r3.f38020c
            if (r4 == 0) goto L31
        L2e:
            r4.clear()
        L31:
            r3.f38020c = r1
            r3.f38024g = r1
            r3.f38021d = r1
            goto L48
        L38:
            r3.f38023f = r1
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r3.f38020c
            if (r0 == 0) goto L41
            r0.clear()
        L41:
            r3.f38020c = r1
            r3.f38024g = r1
            r3.f38021d = r1
            throw r4
        L48:
            r3.i()     // Catch: java.lang.Throwable -> L4c
            goto L54
        L4c:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r0, r4)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.MIMManager.a(android.content.Context):void");
    }

    public void a(Context context, CampaignEx campaignEx, int i10) {
        Runnable runnableC = i10 != 3001 ? i10 != 3002 ? i10 != 3008 ? null : c(context, campaignEx) : a(context, campaignEx) : b(context, campaignEx);
        if (runnableC != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnableC);
        }
    }

    public void a(Context context, String str, int i10, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(context, str, campaignEx, i10));
    }

    public void a(CampaignEx campaignEx) {
        try {
            if (this.f38022e != null && campaignEx != null && this.f38022e.booleanValue()) {
                this.f38023f = campaignEx;
                this.f38020c.add(campaignEx);
            }
            if (com.mbridge.msdk.util.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f38025h == null) {
                    h();
                }
                this.f38023f = campaignEx;
                this.f38020c.add(campaignEx);
            }
        } catch (Exception e10) {
            q0.b("MIMManager", e10.getMessage());
        }
    }

    public void b(Context context) {
        this.f38021d = context;
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context));
    }

    public void b(CampaignEx campaignEx) {
        try {
            if (this.f38022e == null || campaignEx == null || !this.f38022e.booleanValue()) {
                return;
            }
            this.f38023f = null;
            try {
                this.f38020c.remove(campaignEx);
            } catch (Exception e10) {
                q0.a("MIMManager", e10.getMessage());
            }
        } catch (Exception e11) {
            q0.b("MIMManager", e11.getMessage());
        }
    }

    public CampaignEx c() {
        return this.f38023f;
    }

    public String d() {
        try {
            return f38017i == null ? "" : String.format("[%s]", f38017i);
        } catch (Exception unused) {
            return "";
        }
    }

    public Boolean e() {
        return this.f38022e;
    }

    public void f() {
        this.f38019b++;
    }

    public void g() {
        int i10 = this.f38019b - 1;
        this.f38019b = i10;
        if (i10 <= 0) {
            a(this.f38021d);
        }
    }

    public void h() {
        try {
            if (this.f38025h == null) {
                this.f38025h = new MiOverseaMiniCardBroadcasterReceiver();
            }
            IntentFilter intentFilter = new IntentFilter(k0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.registerReceiver(this.f38025h, intentFilter);
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }

    public void i() {
        try {
            if (this.f38025h != null) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.unregisterReceiver(this.f38025h);
                }
                this.f38023f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f38020c;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.f38020c = null;
                this.f38025h = null;
            }
        } catch (Exception e10) {
            q0.a("MIMManager", e10.getMessage());
        }
    }
}
