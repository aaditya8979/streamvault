package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: RetryReportControl.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f35707e = "mtg_retry_report=1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f35708f = 10000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f35709g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f35710h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f35711i = 600000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f35712j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f35713k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f35714l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f35715m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f35716n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f35717o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f35718p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f35719q = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> f35720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.click.retry.c f35721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f35722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f35723d;

    /* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RetryReportControl.java */
    public class C0422a extends BroadcastReceiver {
        public C0422a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.f35723d.sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: compiled from: RetryReportControl.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f35725a = new a(null);
    }

    /* JADX INFO: compiled from: RetryReportControl.java */
    public static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.mbridge.msdk.click.retry.b.f35726k);
                }
            }
        }
    }

    private a() {
        this.f35720a = new ConcurrentHashMap<>();
        this.f35721b = new com.mbridge.msdk.click.retry.c(f35710h);
        this.f35723d = new c(Looper.getMainLooper());
        g gVarB = h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        f35709g = gVarB.e0();
        f35708f = gVarB.g0() * 1000;
        f35711i = gVarB.h0() * 1000;
        f35712j = gVarB.d0();
        f35713k = gVarB.f0();
        a();
    }

    public /* synthetic */ a(C0422a c0422a) {
        this();
    }

    private void a() {
        try {
            if (this.f35722c == null) {
                this.f35722c = new C0422a();
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.registerReceiver(this.f35722c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i10) {
        f.a().a(context, str, str2, str3, str4, i10);
    }

    private void a(com.mbridge.msdk.click.retry.b bVar) {
        String str;
        String requestIdNotice;
        try {
            CampaignEx campaignExA = bVar.a();
            if (campaignExA != null) {
                String requestId = campaignExA.getRequestId();
                requestIdNotice = campaignExA.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                requestIdNotice = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.n().d(), bVar.b().toString(), bVar.g(), str, requestIdNotice, bVar.h());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(String str) {
        Message messageObtainMessage = this.f35723d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.f35723d.sendMessageDelayed(messageObtainMessage, f35708f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        String str2;
        com.mbridge.msdk.click.retry.c cVar = this.f35721b;
        if (cVar != null) {
            com.mbridge.msdk.click.retry.b bVarA = cVar.a(str);
            this.f35721b.b(str);
            if (bVarA == null) {
                com.mbridge.msdk.click.retry.b bVar = this.f35720a.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.c() + ((long) f35711i) || bVar.e() >= f35709g || i10 == com.mbridge.msdk.click.retry.b.f35727l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() > bVarA.c() + ((long) f35711i)) {
                if (i10 != com.mbridge.msdk.click.retry.b.f35727l) {
                    a(bVarA);
                    return;
                }
                return;
            }
            bVarA.a(i10);
            this.f35720a.put(str, bVarA);
            if (c1.c(str) == 0) {
                str2 = str + "?" + f35707e;
            } else {
                str2 = str + C3978d4.j.f31381c + f35707e;
            }
            com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), bVarA.a(), bVarA.f(), str2, bVarA.i(), bVarA.j(), bVarA.h());
        }
    }

    private void a(String str, com.mbridge.msdk.click.retry.b bVar) {
        if (this.f35721b == null) {
            this.f35721b = new com.mbridge.msdk.click.retry.c(f35710h);
        }
        this.f35721b.a(str, bVar);
    }

    private boolean a(int i10) {
        return i10 == f35718p || i10 == f35717o;
    }

    public static a b() {
        return b.f35725a;
    }

    private boolean b(int i10) {
        return i10 == f35715m || i10 == f35716n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.mbridge.msdk.click.retry.c cVar = this.f35721b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.mbridge.msdk.click.retry.b.f35727l);
            }
        }
    }

    private boolean c(int i10) {
        return a(i10) || b(i10) || i10 == f35719q;
    }

    public void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z10, boolean z11, int i10) {
        if (!c(i10) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f35707e, "").replace(C3978d4.j.f31381c + f35707e, "");
        if (this.f35720a == null) {
            this.f35720a = new ConcurrentHashMap<>();
        }
        com.mbridge.msdk.click.retry.b bVarRemove = this.f35720a.remove(strReplace);
        if (bVarRemove == null) {
            bVarRemove = new com.mbridge.msdk.click.retry.b(str, str2);
            bVarRemove.b(i10);
            bVarRemove.a(z10);
            bVarRemove.b(z11);
            bVarRemove.a(campaignEx);
            bVarRemove.b(str3);
        } else if (bVarRemove.d() != com.mbridge.msdk.click.retry.b.f35727l) {
            bVarRemove.a(str2);
        }
        if (!((a(i10) && f35712j != 0) || (b(i10) && f35713k != 0) || i10 == f35719q)) {
            a(bVarRemove);
            return;
        }
        if (System.currentTimeMillis() >= bVarRemove.c() + ((long) f35711i)) {
            if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f35726k) {
                a(bVarRemove);
                return;
            }
            return;
        }
        a(strReplace, bVarRemove);
        if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f35726k) {
            if (bVarRemove.e() <= f35709g) {
                a(strReplace);
            } else {
                a(bVarRemove);
            }
        }
    }
}
