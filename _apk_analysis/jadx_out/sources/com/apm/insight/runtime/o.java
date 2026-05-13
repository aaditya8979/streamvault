package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: RuntimeContext.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f7547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f7548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f7549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f7550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f7551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f7552f = null;

    /* JADX INFO: compiled from: RuntimeContext.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f7555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f7556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f7557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f7558d;

        private a(File file) {
            this.f7558d = null;
            this.f7557c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f7555a = Long.parseLong(strArrSplit[0]);
                this.f7556b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j10 = Long.parseLong(strSubstring);
                this.f7555a = j10;
                this.f7556b = j10;
            }
        }

        public /* synthetic */ a(File file, byte b10) {
            this(file);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.f7558d == null) {
                try {
                    this.f7558d = new JSONObject(com.apm.insight.l.f.a(this.f7557c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f7558d == null) {
                    this.f7558d = new JSONObject();
                }
            }
            return this.f7558d;
        }

        public static /* synthetic */ boolean a(a aVar, long j10) {
            long j11 = aVar.f7555a;
            if (j11 > j10 && j11 - j10 > 604800000) {
                return true;
            }
            long j12 = aVar.f7556b;
            if (j12 >= j10 || j10 - j12 <= 604800000) {
                return aVar.f7557c.lastModified() < j10 && j10 - aVar.f7557c.lastModified() > 604800000;
            }
            return true;
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.f7557c.delete();
        }
    }

    private o(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f7548b = fileC;
        this.f7549c = new File(fileC, "did");
        this.f7550d = new File(fileC, "device_uuid");
        this.f7551e = context;
    }

    public static o a() {
        if (f7547a == null) {
            f7547a = new o(com.apm.insight.e.g());
        }
        return f7547a;
    }

    private void a(long j10, long j11, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f7548b, j10 + "-" + j11 + ".ctx");
        File file2 = new File(this.f7548b, j10 + "-" + j11 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f7552f = new a(file, (byte) 0);
        } catch (IOException e10) {
            com.apm.insight.c.a();
            j.a(e10, "NPTH_CATCH");
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.f7548b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
        a aVar = null;
        byte b10 = 0;
        for (File file : fileArrListFiles) {
            try {
                a aVar2 = new a(file, b10);
                arrayList.add(aVar2);
                if (this.f7552f == null && ".ctx".equals(str) && (aVar == null || aVar2.f7556b >= aVar.f7556b)) {
                    aVar = aVar2;
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
            }
        }
        if (this.f7552f == null && aVar != null) {
            this.f7552f = aVar;
        }
        return arrayList;
    }

    @Nullable
    public final JSONObject a(long j10) {
        JSONObject jSONObject;
        File file;
        boolean z10;
        String strA;
        Iterator<a> it = c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j10 >= next.f7555a && j10 <= next.f7556b) {
                file = next.f7557c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".ctx")) {
                if (aVar == null || Math.abs(aVar.f7556b - j10) > Math.abs(aVar2.f7556b - j10)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f7557c;
            z10 = true;
        } else {
            z10 = false;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new JSONObject(strA);
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                }
            } catch (Throwable th3) {
                th = th3;
                strA = null;
            }
        }
        if (jSONObject != null && z10) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e10) {
                com.apm.insight.c.a();
                j.a(e10, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.f7549c, str, false);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r11, org.json.JSONArray r12) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f7551e
            com.apm.insight.entity.Header r0 = com.apm.insight.entity.Header.a(r0)
            org.json.JSONObject r6 = r0.a(r11)
            boolean r11 = com.apm.insight.entity.Header.c(r6)
            if (r11 == 0) goto L11
            return
        L11:
            long r8 = java.lang.System.currentTimeMillis()
            com.apm.insight.runtime.o$a r11 = r10.f7552f
            if (r11 != 0) goto L1e
            java.lang.String r11 = ".ctx"
            r10.c(r11)
        L1e:
            com.apm.insight.runtime.o$a r11 = r10.f7552f
            if (r11 != 0) goto L2a
            r1 = r10
            r2 = r8
            r4 = r8
            r7 = r12
            r1.a(r2, r4, r6, r7)
            return
        L2a:
            org.json.JSONObject r0 = com.apm.insight.runtime.o.a.a(r11)
            boolean r1 = com.apm.insight.entity.Header.c(r0)
            r2 = 1
            r3 = 2
            if (r1 != 0) goto L5f
            boolean r1 = com.apm.insight.entity.Header.c(r6)
            if (r1 == 0) goto L3e
            r0 = 0
            goto L60
        L3e:
            java.lang.String r1 = "update_version_code"
            java.lang.Object r4 = r6.opt(r1)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.Object r1 = r0.opt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L5f
            boolean r0 = com.apm.insight.entity.Header.d(r0)
            if (r0 == 0) goto L5f
            r0 = r2
            goto L60
        L5f:
            r0 = r3
        L60:
            if (r0 == r2) goto L6d
            if (r0 == r3) goto L65
            goto L7e
        L65:
            r1 = r10
            r2 = r8
            r4 = r8
            r7 = r12
            r1.a(r2, r4, r6, r7)
            goto L7e
        L6d:
            long r2 = com.apm.insight.runtime.o.a.b(r11)
            r1 = r10
            r4 = r8
            r7 = r12
            r1.a(r2, r4, r6, r7)
            java.io.File r11 = com.apm.insight.runtime.o.a.c(r11)
            com.apm.insight.l.f.a(r11)
        L7e:
            java.lang.String r11 = ""
            java.util.ArrayList r11 = r10.c(r11)     // Catch: java.lang.Throwable -> La7
            int r12 = r11.size()     // Catch: java.lang.Throwable -> La7
            r0 = 6
            if (r12 > r0) goto L8c
            return
        L8c:
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> La7
        L90:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r12 == 0) goto La6
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> La7
            com.apm.insight.runtime.o$a r12 = (com.apm.insight.runtime.o.a) r12     // Catch: java.lang.Throwable -> La7
            boolean r0 = com.apm.insight.runtime.o.a.a(r12, r8)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L90
            com.apm.insight.runtime.o.a.d(r12)     // Catch: java.lang.Throwable -> La7
            goto L90
        La6:
            return
        La7:
            r11 = move-exception
            com.apm.insight.c.a()
            java.lang.String r12 = "NPTH_CATCH"
            com.apm.insight.runtime.j.a(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.o.a(java.util.Map, org.json.JSONArray):void");
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.f7549c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    @Nullable
    public final JSONArray b(long j10) {
        File file;
        String strA;
        Iterator<a> it = c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j10 >= next.f7555a && j10 <= next.f7556b) {
                file = next.f7557c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".allData")) {
                if (aVar == null || Math.abs(aVar.f7556b - j10) > Math.abs(aVar2.f7556b - j10)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f7557c;
        }
        if (file == null) {
            return null;
        }
        try {
            strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
            try {
                return new JSONArray(strA);
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.c.a();
                j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            strA = null;
        }
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.f7550d, str, false);
        } catch (Throwable unused) {
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.f7550d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }
}
