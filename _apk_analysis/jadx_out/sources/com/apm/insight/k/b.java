package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3978d4;
import com.ironsource.C4336xa;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: CrashFileCollector.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f7289b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7290a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0135b f7294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, C0135b> f7295g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<File> f7291c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<File> f7292d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7293e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f7296h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f7297i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.f();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f7298j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.d();
        }
    };

    /* JADX INFO: compiled from: CrashFileCollector.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f7308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public CrashType f7311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f7312e;

        public a(File file, long j10, @Nullable CrashType crashType) {
            this.f7310c = -1L;
            this.f7308a = file;
            this.f7309b = j10;
            this.f7311d = crashType;
            this.f7312e = file.getName();
        }

        public a(File file, @Nullable CrashType crashType) {
            this.f7309b = -1L;
            this.f7310c = -1L;
            this.f7308a = file;
            this.f7311d = crashType;
            this.f7312e = file.getName();
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CrashFileCollector.java */
    public static class C0135b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7313a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f7316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f7317e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<a> f7314b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<a> f7315c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7318f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7319g = 0;

        public C0135b(String str) {
            this.f7313a = str;
        }
    }

    private b(Context context) {
        this.f7290a = context;
    }

    @Nullable
    private com.apm.insight.f.b a(File file, CrashType crashType, String str, long j10, long j11) {
        com.apm.insight.f.b bVar;
        JSONObject jSONObjectB;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.f.a(file);
                    return null;
                }
                boolean z10 = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.f.b(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = null;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                }
                com.apm.insight.f.b bVarA = com.apm.insight.l.f.a(file, crashType);
                try {
                    jSONObjectB = bVarA.b();
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    if (bVarA.b() == null) {
                        com.apm.insight.l.f.a(file);
                    } else {
                        if (crashType == CrashType.ANR) {
                            return bVarA;
                        }
                        jSONObjectB.put("crash_time", j10);
                        jSONObjectB.put("app_start_time", j11);
                        JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = Header.a(j10).f();
                        } else if (z10) {
                            jSONObjectB.remove("header");
                        }
                        String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                        if (strOptString == null) {
                            strOptString = "2008-20250701130429";
                        }
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "sdk_version", strOptString);
                        JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("logcat");
                        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                            jSONObjectB.put("logcat", com.apm.insight.runtime.h.a(str));
                        }
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_dump", "true");
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_logcat", String.valueOf(!com.apm.insight.a.a(jSONObjectB, "logcat")));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.a(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_devices", String.valueOf(Header.a()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_runtime", String.valueOf(NativeImpl.f()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_x86_devices", String.valueOf(Header.b()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(str).exists()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.a.k()));
                        jSONObjectB.put("launch_did", com.apm.insight.i.a.a(this.f7290a));
                        jSONObjectB.put("crash_uuid", file.getName());
                        try {
                            long j12 = Long.parseLong(com.apm.insight.runtime.b.a(j10, str));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", Math.abs(j12 - j10) < 60000 ? "< 60s" : "> 60s");
                            jSONObjectB.put("lastAliveTime", String.valueOf(j12));
                        } catch (Throwable unused) {
                            jSONObjectB.put("lastAliveTime", "unknown");
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", "unknown");
                        }
                        jSONObjectB.put("has_dump", "true");
                        if (jSONObjectB.opt(C3978d4.a.f31215k) == null) {
                            com.apm.insight.e.g();
                            com.apm.insight.entity.a.a(jSONObjectB, n.a());
                        }
                        if (Header.b(jSONObjectOptJSONObject)) {
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "unauthentic_version", "unauthentic_version");
                        }
                        com.apm.insight.entity.d.b(jSONObjectB);
                        bVarA.b().put("upload_scene", "launch_scan");
                        if (z10) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObjectB.put(StatsEvent.f52830z, "start_crash");
                            jSONObjectB.put("stack", jSONObjectB.remove("data"));
                            jSONObject.put("data", new JSONArray().put(jSONObjectB));
                            jSONObject.put("header", jSONObjectOptJSONObject);
                            bVarA.a(jSONObject);
                        } else {
                            jSONObjectB.put("isJava", 1);
                        }
                    }
                    return bVarA;
                } catch (Throwable th4) {
                    th = th4;
                    bVar = bVarA;
                    com.apm.insight.l.f.a(file);
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                    return bVar;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            bVar = null;
        }
        com.apm.insight.l.f.a(file);
        com.apm.insight.c.a();
        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        return bVar;
    }

    public static b a() {
        if (f7289b == null) {
            synchronized (b.class) {
                if (f7289b == null) {
                    f7289b = new b(com.apm.insight.e.g());
                }
            }
        }
        return f7289b;
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject jSONObjectB = aVar.b();
        if (jSONObjectB != null && jSONObjectB.length() != 0) {
            return jSONObjectB;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    private void a(final C0135b c0135b, boolean z10, @Nullable com.apm.insight.runtime.f fVar) {
        Iterator<a> it;
        File file;
        CrashType crashType;
        final File file2;
        CrashType crashType2;
        if (c0135b.f7314b.isEmpty()) {
            return;
        }
        if (c0135b.f7317e == null) {
            c0135b.f7317e = c0135b.f7316d;
        }
        for (Iterator<a> it2 = c0135b.f7314b.iterator(); it2.hasNext(); it2 = it) {
            a next = it2.next();
            try {
                file = next.f7308a;
                crashType = next.f7311d;
                it = it2;
            } catch (Throwable th2) {
                th = th2;
                it = it2;
            }
            try {
                final com.apm.insight.f.b bVarA = a(file, crashType, c0135b.f7313a, next.f7309b, next.f7310c);
                if (bVarA == null) {
                    com.apm.insight.l.f.a(file);
                } else {
                    JSONObject jSONObjectB = bVarA.b();
                    if (jSONObjectB == null) {
                        com.apm.insight.l.f.a(file);
                    } else {
                        JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                        if (jSONObjectOptJSONObject == null) {
                            com.apm.insight.l.f.a(file);
                        } else {
                            if (crashType == null) {
                                file2 = file;
                                if (new File(file2, file.getName()).exists() || file2.getName().split("_").length < 5) {
                                    if (e.b(bVarA.a(), jSONObjectB.toString()).a()) {
                                        com.apm.insight.l.f.a(file2);
                                    }
                                }
                            } else {
                                file2 = file;
                            }
                            File fileA = com.apm.insight.entity.b.a(file2);
                            if (fileA.exists()) {
                                try {
                                    JSONArray jSONArray = new JSONArray(com.apm.insight.l.f.a(fileA, "\n"));
                                    JSONObject jSONObjectOptJSONObject2 = crashType == CrashType.LAUNCH ? ((JSONArray) jSONObjectB.opt("data")).optJSONObject(0) : jSONObjectB;
                                    if ((z10 || c0135b.f7317e == next) && !next.f7312e.contains("ignore")) {
                                        crashType2 = crashType;
                                        if (fVar != null && !fVar.a(jSONObjectOptJSONObject2.optString("crash_md5", "default"))) {
                                            com.apm.insight.l.f.a(next.f7308a);
                                        }
                                    } else {
                                        try {
                                            com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", C4336xa.f34377b, String.valueOf(jSONObjectOptJSONObject.opt(C4336xa.f34377b)));
                                            crashType2 = crashType;
                                            try {
                                                com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.f7312e.contains("ignore")));
                                                jSONObjectOptJSONObject.put(C4336xa.f34377b, 2010);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                com.apm.insight.c.a();
                                                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            crashType2 = crashType;
                                        }
                                    }
                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "start_uuid", c0135b.f7313a);
                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c0135b.f7319g));
                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                    try {
                                        com.apm.insight.entity.b.a(jSONObjectB, jSONArray, new b.a() { // from class: com.apm.insight.k.b.3
                                            @Override // com.apm.insight.entity.b.a
                                            public final void a(JSONObject jSONObject) {
                                                e.a(bVarA.a(), jSONObject.toString(), new File(file2, "logZip"), com.apm.insight.l.j.a(b.this.f7290a, c0135b.f7313a));
                                            }
                                        });
                                        if (!com.apm.insight.l.f.a(file2)) {
                                            com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file2.getAbsolutePath()));
                                        }
                                        c.a(crashType2, jSONObjectB);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        com.apm.insight.c.a();
                                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                        com.apm.insight.l.f.a(next.f7308a);
                                    }
                                } catch (Throwable unused) {
                                }
                            } else {
                                com.apm.insight.l.f.a(file2);
                            }
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(next.f7308a);
            }
        }
    }

    private void a(HashMap<String, C0135b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.f(this.f7290a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0135b c0135b = map.get(name);
                    if (c0135b == null) {
                        c0135b = new C0135b(name);
                        map.put(name, c0135b);
                    }
                    JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    int length = jSONArrayA.length();
                    c0135b.f7319g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), jSONArrayA);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:9:0x0023, B:11:0x0031, B:12:0x0036, B:15:0x003e, B:18:0x004e, B:20:0x0054, B:21:0x0059, B:23:0x0065, B:25:0x0070, B:29:0x008a, B:55:0x00d7, B:57:0x00df, B:58:0x00e7, B:60:0x00f2, B:68:0x010a, B:63:0x00fc, B:65:0x0100, B:67:0x0108, B:52:0x00cf, B:53:0x00d2, B:54:0x00d5, B:36:0x00a5, B:39:0x00af, B:42:0x00b9, B:69:0x0110, B:70:0x012d, B:27:0x007c), top: B:78:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:9:0x0023, B:11:0x0031, B:12:0x0036, B:15:0x003e, B:18:0x004e, B:20:0x0054, B:21:0x0059, B:23:0x0065, B:25:0x0070, B:29:0x008a, B:55:0x00d7, B:57:0x00df, B:58:0x00e7, B:60:0x00f2, B:68:0x010a, B:63:0x00fc, B:65:0x0100, B:67:0x0108, B:52:0x00cf, B:53:0x00d2, B:54:0x00d5, B:36:0x00a5, B:39:0x00af, B:42:0x00b9, B:69:0x0110, B:70:0x012d, B:27:0x007c), top: B:78:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:9:0x0023, B:11:0x0031, B:12:0x0036, B:15:0x003e, B:18:0x004e, B:20:0x0054, B:21:0x0059, B:23:0x0065, B:25:0x0070, B:29:0x008a, B:55:0x00d7, B:57:0x00df, B:58:0x00e7, B:60:0x00f2, B:68:0x010a, B:63:0x00fc, B:65:0x0100, B:67:0x0108, B:52:0x00cf, B:53:0x00d2, B:54:0x00d5, B:36:0x00a5, B:39:0x00af, B:42:0x00b9, B:69:0x0110, B:70:0x012d, B:27:0x007c), top: B:78:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0135b> r18, com.apm.insight.k.b.C0135b r19) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.util.HashMap, com.apm.insight.k.b$b):void");
    }

    private static boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    private void b(final C0135b c0135b, boolean z10, @Nullable com.apm.insight.runtime.f fVar) {
        Iterator<a> it;
        boolean z11;
        JSONObject jSONObjectA;
        if (c0135b.f7315c.size() <= 1 && c0135b.f7315c.isEmpty()) {
            c0135b.f7317e = c0135b.f7316d;
            return;
        }
        boolean zB = com.apm.insight.l.k.b(this.f7290a);
        c0135b.f7317e = c0135b.f7316d;
        com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(this.f7290a);
        Iterator<a> it2 = c0135b.f7315c.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            final File file = next.f7308a;
            try {
                aVar.a(file);
                jSONObjectA = a(aVar);
            } catch (Throwable th2) {
                th = th2;
                it = it2;
            }
            if (jSONObjectA == null || jSONObjectA.length() == 0) {
                it = it2;
                z11 = zB;
                aVar.i();
            } else if (jSONObjectA.length() != 0) {
                if (z10) {
                    it = it2;
                    z11 = zB;
                    if (fVar != null && !fVar.a("default")) {
                        aVar.i();
                    }
                } else {
                    long jOptLong = jSONObjectA.optLong("crash_time");
                    try {
                        a aVar2 = c0135b.f7317e;
                        if (aVar2 == null) {
                            c0135b.f7317e = next;
                            c0135b.f7318f = true;
                            if (fVar == null || fVar.a("default")) {
                                it = it2;
                                z11 = zB;
                            } else {
                                aVar.i();
                            }
                        } else {
                            it = it2;
                            try {
                                if (c0135b.f7318f) {
                                    z11 = zB;
                                } else {
                                    z11 = zB;
                                    try {
                                        if (jOptLong < aVar2.f7309b) {
                                            c0135b.f7317e = next;
                                            if (fVar == null || fVar.a("default")) {
                                                a(file);
                                                c0135b.f7318f = true;
                                            } else {
                                                aVar.i();
                                                zB = z11;
                                                it2 = it;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        com.apm.insight.c.a();
                                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                        com.apm.insight.l.f.a(file);
                                        zB = z11;
                                        it2 = it;
                                    }
                                }
                                com.apm.insight.entity.a.a(jSONObjectA, "filters", C4336xa.f34377b, String.valueOf(jSONObjectA.optJSONObject("header").opt(C4336xa.f34377b)));
                                jSONObjectA.optJSONObject("header").put(C4336xa.f34377b, 2010);
                            } catch (Throwable th4) {
                                th = th4;
                                z11 = zB;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        it = it2;
                        z11 = zB;
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        com.apm.insight.l.f.a(file);
                        zB = z11;
                        it2 = it;
                    }
                }
                com.apm.insight.entity.a.a(jSONObjectA, "filters", "start_uuid", c0135b.f7313a);
                com.apm.insight.entity.a.a(jSONObjectA, "filters", "crash_thread_name", jSONObjectA.optString("crash_thread_name", "unknown"));
                if (z11) {
                    try {
                        c.a aVar3 = new c.a(jSONObjectA, CrashType.NATIVE);
                        com.apm.insight.entity.b.a(jSONObjectA, com.apm.insight.entity.b.a(aVar3.c(), aVar3.a(), o.a().b(aVar3.b() == -1 ? System.currentTimeMillis() : aVar3.b())), new b.a() { // from class: com.apm.insight.k.b.4
                            @Override // com.apm.insight.entity.b.a
                            public final void a(JSONObject jSONObject) {
                                d.a();
                                d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.f7290a, c0135b.f7313a));
                            }
                        });
                        if (!aVar.i()) {
                            aVar.f();
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        com.apm.insight.l.f.a(file);
                    }
                }
                c.a(CrashType.NATIVE, jSONObjectA);
            } else {
                it = it2;
                z11 = zB;
            }
            zB = z11;
            it2 = it;
        }
    }

    private void b(HashMap<String, C0135b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.d(this.f7290a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0135b c0135b = map.get(name);
                    if (c0135b == null) {
                        c0135b = new C0135b(name);
                        map.put(name, c0135b);
                    }
                    c0135b.f7315c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws Throwable {
        if (this.f7296h || this.f7295g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f7290a)) {
            e();
        }
        if (this.f7293e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.f7293e = 1;
            } else {
                this.f7293e = 0;
            }
        }
        boolean z10 = this.f7293e == 1;
        com.apm.insight.runtime.f fVar = new com.apm.insight.runtime.f(this.f7290a);
        Iterator<C0135b> it = this.f7295g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z10, fVar);
        }
        Iterator<C0135b> it2 = this.f7295g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z10, fVar);
        }
        Iterator<C0135b> it3 = this.f7295g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.f7290a, it3.next().f7313a));
        }
        fVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.f7296h = true;
        this.f7295g = null;
        NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws Throwable {
        if (this.f7296h) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f7290a) || (System.currentTimeMillis() - com.apm.insight.e.j() <= 5000 && com.apm.insight.e.i().isApmExists() && !Npth.hasCrash())) {
            m.a().a(this.f7297i, 5000L);
        } else {
            d();
        }
    }

    private void g() {
        File[] fileArrListFiles = com.apm.insight.l.j.i(this.f7290a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b bVarC = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (bVarC != null) {
                        if (bVarC.b() != null) {
                            bVarC.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), bVarC.e(), bVarC.d(), bVarC.f(), bVarC.g())) {
                            com.apm.insight.l.f.a(file);
                            String strC = bVarC.c();
                            if (!TextUtils.isEmpty(strC)) {
                                com.apm.insight.l.f.a(new File(strC));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
            }
        }
    }

    public final void a(boolean z10) throws Throwable {
        if (!Npth.isStopUpload() && z10) {
            if (this.f7294f == null) {
                this.f7294f = new C0135b("old_uuid");
                HashMap<String, C0135b> map = new HashMap<>();
                this.f7295g = map;
                a(map);
                a(this.f7295g, this.f7294f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.f7290a));
                b(this.f7295g);
                b(this.f7294f, true, null);
                a(this.f7294f, true, null);
                this.f7294f = null;
                if (this.f7295g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    public final void b() {
        try {
            if (!this.f7296h && com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                m.a().a(this.f7298j);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        return this.f7296h;
    }
}
