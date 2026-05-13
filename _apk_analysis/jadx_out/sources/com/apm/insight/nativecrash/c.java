package com.apm.insight.nativecrash;

import com.apm.insight.l.j;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Tombstone.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f7435i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f7436j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f7437k = Pattern.compile("^Abort message: (.*)$");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f7438l = Pattern.compile("^Crash message: (.*)$");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f7439m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f7443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f7445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f7446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, String> f7447h = new HashMap();

    public c(File file) {
        c(j.b(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0187, code lost:
    
        r12 = r3.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
    
        if (r12 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0193, code lost:
    
        if (r12.contains("BuildId:") == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0195, code lost:
    
        r12 = com.apm.insight.nativecrash.c.f7439m.matcher(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019f, code lost:
    
        if (r12.find() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a1, code lost:
    
        r0 = r12.group(1);
        r1 = r12.group(2);
        r12 = r12.group(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b3, code lost:
    
        if (r0.equals("data") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b5, code lost:
    
        r11.f7447h.put(r1, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.io.File r12) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.c.c(java.io.File):void");
    }

    public final String a() {
        return this.f7446g;
    }

    public final void a(File file) {
        File fileB = j.b(file);
        if (fileB.exists()) {
            fileB.renameTo(new File(fileB.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        c(j.b(file));
    }

    public final Map<String, String> b() {
        return this.f7447h;
    }

    public final void b(File file) {
        c(j.b(file));
    }

    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f7444e;
        if (str != null) {
            sb2.append(str);
        }
        String str2 = this.f7445f;
        if (str2 != null) {
            sb2.append(str2);
        }
        String str3 = this.f7446g;
        if (str3 != null) {
            sb2.append(str3);
        }
        return sb2.toString();
    }
}
