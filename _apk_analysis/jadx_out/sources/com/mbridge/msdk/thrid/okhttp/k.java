package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Cookie.java */
/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f40678j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f40679k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f40680l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f40681m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f40684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f40685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f40686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f40687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f40688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f40689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f40690i;

    private k(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f40682a = str;
        this.f40683b = str2;
        this.f40684c = j10;
        this.f40685d = str3;
        this.f40686e = str4;
        this.f40687f = z10;
        this.f40688g = z11;
        this.f40690i = z12;
        this.f40689h = z13;
    }

    private static int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long a(java.lang.String r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.k.a(java.lang.String, int, int):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0 A[PHI: r0
      0x00c0: PHI (r0v16 long) = (r0v2 long), (r0v6 long) binds: [B:42:0x00be, B:53:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.mbridge.msdk.thrid.okhttp.k a(long r23, com.mbridge.msdk.thrid.okhttp.s r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.k.a(long, com.mbridge.msdk.thrid.okhttp.s, java.lang.String):com.mbridge.msdk.thrid.okhttp.k");
    }

    public static k a(s sVar, String str) {
        return a(System.currentTimeMillis(), sVar, str);
    }

    private static String a(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String strA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str);
        if (strA != null) {
            return strA;
        }
        throw new IllegalArgumentException();
    }

    public static List<k> a(s sVar, r rVar) {
        List<String> listC = rVar.c("Set-Cookie");
        int size = listC.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            k kVarA = a(sVar, listC.get(i10));
            if (kVarA != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVarA);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.mbridge.msdk.thrid.okhttp.internal.c.d(str);
    }

    private static long b(String str) {
        try {
            long j10 = Long.parseLong(str);
            if (j10 <= 0) {
                return Long.MIN_VALUE;
            }
            return j10;
        } catch (NumberFormatException e10) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e10;
        }
    }

    public String a() {
        return this.f40682a;
    }

    public String a(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f40682a);
        sb2.append(G5.T);
        sb2.append(this.f40683b);
        if (this.f40689h) {
            if (this.f40684c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(com.mbridge.msdk.thrid.okhttp.internal.http.d.a(new Date(this.f40684c)));
            }
        }
        if (!this.f40690i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f40685d);
        }
        sb2.append("; path=");
        sb2.append(this.f40686e);
        if (this.f40687f) {
            sb2.append("; secure");
        }
        if (this.f40688g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }

    public String b() {
        return this.f40683b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f40682a.equals(this.f40682a) && kVar.f40683b.equals(this.f40683b) && kVar.f40685d.equals(this.f40685d) && kVar.f40686e.equals(this.f40686e) && kVar.f40684c == this.f40684c && kVar.f40687f == this.f40687f && kVar.f40688g == this.f40688g && kVar.f40689h == this.f40689h && kVar.f40690i == this.f40690i;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f40682a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f40683b.hashCode()) * 31) + this.f40685d.hashCode()) * 31) + this.f40686e.hashCode()) * 31;
        long j10 = this.f40684c;
        return ((((((((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f40687f ? 1 : 0)) * 31) + (!this.f40688g ? 1 : 0)) * 31) + (!this.f40689h ? 1 : 0)) * 31) + (!this.f40690i ? 1 : 0);
    }

    public String toString() {
        return a(false);
    }
}
