package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.p;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LooperDispatchMonitor.java */
/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f7087r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f7088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f7090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f7093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f7094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f7095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7096i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f7097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f7098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f7099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f7100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f7101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f7103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f7104q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f7105s;

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public StackTraceElement[] f7119f;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f7120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7121b;

        public final void a(a aVar) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public interface c {
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class d {
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7126e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f7127f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f7128g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f7129h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f7130i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f7131j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private d f7132k;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, g.a(this.f7129h));
                jSONObject.put("cpuDuration", this.f7128g);
                jSONObject.put("duration", this.f7127f);
                jSONObject.put("type", this.f7125d);
                jSONObject.put("count", this.f7126e);
                jSONObject.put("messageCount", this.f7126e);
                jSONObject.put("lastDuration", this.f7123b - this.f7124c);
                jSONObject.put("start", this.f7122a);
                jSONObject.put("end", this.f7123b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return jSONObject;
        }

        public final void b() {
            this.f7125d = -1;
            this.f7126e = -1;
            this.f7127f = -1L;
            this.f7129h = null;
            this.f7131j = null;
            this.f7132k = null;
            this.f7130i = null;
        }
    }

    /* JADX INFO: compiled from: LooperDispatchMonitor.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f7135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<e> f7136d = new ArrayList();

        public f(int i10) {
            this.f7133a = i10;
        }

        public final e a(int i10) {
            e eVar = this.f7135c;
            if (eVar != null) {
                eVar.f7125d = i10;
                this.f7135c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f7125d = i10;
            return eVar2;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f7136d.size() == this.f7133a) {
                for (int i11 = this.f7134b; i11 < this.f7136d.size(); i11++) {
                    arrayList.add(this.f7136d.get(i11));
                }
                while (i10 < this.f7134b - 1) {
                    arrayList.add(this.f7136d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f7136d.size()) {
                    arrayList.add(this.f7136d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }

        public final void a(e eVar) {
            int size = this.f7136d.size();
            int i10 = this.f7133a;
            if (size < i10) {
                this.f7136d.add(eVar);
                this.f7134b = this.f7136d.size();
                return;
            }
            int i11 = this.f7134b % i10;
            this.f7134b = i11;
            e eVar2 = this.f7136d.set(i11, eVar);
            eVar2.b();
            this.f7135c = eVar2;
            this.f7134b++;
        }
    }

    public g() {
        this((byte) 0);
    }

    private g(byte b10) {
        this.f7089b = 0;
        this.f7090c = 0;
        this.f7091d = 100;
        this.f7092e = 200;
        this.f7094g = -1L;
        this.f7095h = -1L;
        this.f7096i = -1;
        this.f7097j = -1L;
        this.f7101n = false;
        this.f7102o = false;
        this.f7104q = false;
        this.f7105s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f7108b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f7107a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f7109c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f7110d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f7111e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f7120a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f7109c == g.this.f7090c) {
                    this.f7110d++;
                } else {
                    this.f7110d = 0;
                    this.f7111e = 0;
                    this.f7108b = jUptimeMillis;
                }
                this.f7109c = g.this.f7090c;
                int i10 = this.f7110d;
                if (i10 > 0 && i10 - this.f7111e >= g.f7087r && this.f7107a != 0 && jUptimeMillis - this.f7108b > 700 && g.this.f7104q) {
                    aVar.f7119f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f7111e = this.f7110d;
                }
                aVar.f7117d = g.this.f7104q;
                aVar.f7116c = (jUptimeMillis - this.f7107a) - 300;
                aVar.f7114a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f7107a = jUptimeMillis2;
                aVar.f7115b = jUptimeMillis2 - jUptimeMillis;
                aVar.f7118e = g.this.f7090c;
                g.e().a(g.this.f7105s, 300L);
                g.c().a(aVar);
            }
        };
        this.f7088a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f7103p = null;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d) && str.contains(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e)) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(Z7.f30794r)) {
                str = str.replace(Z7.f30794r, "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z10) {
        this.f7102o = true;
        e eVarA = this.f7093f.a(i10);
        eVarA.f7127f = j10 - this.f7094g;
        if (z10) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f7128g = jCurrentThreadTimeMillis - this.f7097j;
            this.f7097j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f7128g = -1L;
        }
        eVarA.f7126e = this.f7089b;
        eVarA.f7129h = str;
        eVarA.f7130i = this.f7098k;
        eVarA.f7122a = this.f7094g;
        eVarA.f7123b = j10;
        eVarA.f7124c = this.f7095h;
        this.f7093f.a(eVarA);
        this.f7089b = 0;
        this.f7094g = j10;
    }

    public static /* synthetic */ void a(g gVar, boolean z10, long j10) {
        int i10 = gVar.f7090c + 1;
        gVar.f7090c = i10;
        gVar.f7090c = i10 & 65535;
        gVar.f7102o = false;
        if (gVar.f7094g < 0) {
            gVar.f7094g = j10;
        }
        if (gVar.f7095h < 0) {
            gVar.f7095h = j10;
        }
        if (gVar.f7096i < 0) {
            gVar.f7096i = Process.myTid();
            gVar.f7097j = SystemClock.currentThreadTimeMillis();
        }
        long j11 = j10 - gVar.f7094g;
        int i11 = gVar.f7092e;
        if (j11 > i11) {
            long j12 = gVar.f7095h;
            if (j10 - j12 <= i11) {
                gVar.a(9, j10, gVar.f7099l);
            } else if (z10) {
                if (gVar.f7089b == 0) {
                    gVar.a(1, j10, "no message running");
                } else {
                    gVar.a(9, j12, gVar.f7098k);
                    gVar.a(1, j10, "no message running", false);
                }
            } else if (gVar.f7089b == 0) {
                gVar.a(8, j10, gVar.f7099l, true);
            } else {
                gVar.a(9, j12, gVar.f7098k, false);
                gVar.a(8, j10, gVar.f7099l, true);
            }
        }
        gVar.f7095h = j10;
    }

    public static /* synthetic */ b c() {
        return null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i10 = gVar.f7089b;
        gVar.f7089b = i10 + 1;
        return i10;
    }

    public static /* synthetic */ p e() {
        return null;
    }

    public final e a(long j10) {
        e eVar = new e();
        eVar.f7129h = this.f7099l;
        eVar.f7130i = this.f7098k;
        eVar.f7127f = j10 - this.f7095h;
        eVar.f7128g = 0 - this.f7097j;
        eVar.f7126e = this.f7089b;
        return eVar;
    }

    public final void a() {
        if (this.f7101n) {
            return;
        }
        this.f7101n = true;
        this.f7091d = 100;
        this.f7092e = 300;
        this.f7093f = new f(100);
        this.f7100m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f7104q = true;
                g.this.f7099l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f7081a);
            }

            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f7081a);
                g gVar = g.this;
                gVar.f7098k = gVar.f7099l;
                g.this.f7099l = "no message running";
                g.this.f7104q = false;
            }
        };
        h.a();
        h.a(this.f7100m);
        j.a(j.a());
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i10 = 0;
            for (e eVar : this.f7093f.a()) {
                if (eVar != null) {
                    i10++;
                    jSONArray.put(eVar.a().put("id", i10));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
