package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.G5;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HttpUrl.java */
/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f40714j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f40717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f40720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f40721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f40722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f40723i;

    /* JADX INFO: compiled from: HttpUrl.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f40724a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f40727d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<String> f40729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f40730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f40731h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f40725b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f40726c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40728e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f40729f = arrayList;
            arrayList.add("");
        }

        private static String a(String str, int i10, int i11) {
            return com.mbridge.msdk.thrid.okhttp.internal.c.a(s.a(str, i10, i11, false));
        }

        private void a(String str, int i10, int i11, boolean z10, boolean z11) {
            String strA = s.a(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (c(strA)) {
                return;
            }
            if (d(strA)) {
                c();
                return;
            }
            if (this.f40729f.get(r11.size() - 1).isEmpty()) {
                this.f40729f.set(r11.size() - 1, strA);
            } else {
                this.f40729f.add(strA);
            }
            if (z10) {
                this.f40729f.add("");
            }
        }

        private static int b(String str, int i10, int i11) {
            int i12;
            try {
                i12 = Integer.parseInt(s.a(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i12 <= 0 || i12 > 65535) {
                return -1;
            }
            return i12;
        }

        private static int c(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private void c() {
            if (!this.f40729f.remove(r0.size() - 1).isEmpty() || this.f40729f.isEmpty()) {
                this.f40729f.add("");
            } else {
                this.f40729f.set(r0.size() - 1, "");
            }
        }

        private boolean c(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private void d(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f40729f.clear();
                this.f40729f.add("");
                i10++;
            } else {
                List<String> list = this.f40729f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i12, i11, "/\\");
                    boolean z10 = i10 < i11;
                    a(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        private boolean d(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int e(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int f(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public a a(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.f40728e = i10;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i10);
        }

        public a a(s sVar, String str) {
            int iA;
            int i10;
            int iB = com.mbridge.msdk.thrid.okhttp.internal.c.b(str, 0, str.length());
            int iC = com.mbridge.msdk.thrid.okhttp.internal.c.c(str, iB, str.length());
            int iE = e(str, iB, iC);
            if (iE != -1) {
                if (str.regionMatches(true, iB, "https:", 0, 6)) {
                    this.f40724a = "https";
                    iB += 6;
                } else {
                    if (!str.regionMatches(true, iB, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, iE) + "'");
                    }
                    this.f40724a = "http";
                    iB += 5;
                }
            } else {
                if (sVar == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f40724a = sVar.f40715a;
            }
            int iF = f(str, iB, iC);
            char c10 = '?';
            char c11 = '#';
            if (iF >= 2 || sVar == null || !sVar.f40715a.equals(this.f40724a)) {
                boolean z10 = false;
                boolean z11 = false;
                int i11 = iB + iF;
                while (true) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i11, iC, "@/\\?#");
                    byte bCharAt = iA != iC ? str.charAt(iA) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c11 || bCharAt == 47 || bCharAt == 92 || bCharAt == c10) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z10) {
                            i10 = iA;
                            this.f40726c += "%40" + s.a(str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i11, iA, ':');
                            i10 = iA;
                            String strA = s.a(str, i11, iA2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strA = this.f40725b + "%40" + strA;
                            }
                            this.f40725b = strA;
                            if (iA2 != i10) {
                                this.f40726c = s.a(str, iA2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            }
                            z11 = true;
                        }
                        i11 = i10 + 1;
                        c10 = '?';
                        c11 = '#';
                    }
                }
                int iC2 = c(str, i11, iA);
                int i12 = iC2 + 1;
                if (i12 < iA) {
                    this.f40727d = a(str, i11, iC2);
                    int iB2 = b(str, i12, iA);
                    this.f40728e = iB2;
                    if (iB2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i12, iA) + '\"');
                    }
                } else {
                    this.f40727d = a(str, i11, iC2);
                    this.f40728e = s.a(this.f40724a);
                }
                if (this.f40727d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i11, iC2) + '\"');
                }
                iB = iA;
            } else {
                this.f40725b = sVar.f();
                this.f40726c = sVar.b();
                this.f40727d = sVar.f40718d;
                this.f40728e = sVar.f40719e;
                this.f40729f.clear();
                this.f40729f.addAll(sVar.d());
                if (iB == iC || str.charAt(iB) == '#') {
                    a(sVar.e());
                }
            }
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iB, iC, "?#");
            d(str, iB, iA3);
            if (iA3 < iC && str.charAt(iA3) == '?') {
                int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iA3, iC, '#');
                this.f40730g = s.d(s.a(str, iA3 + 1, iA4, " \"'<>#", true, false, true, true, null));
                iA3 = iA4;
            }
            if (iA3 < iC && str.charAt(iA3) == '#') {
                this.f40731h = s.a(str, 1 + iA3, iC, "", true, false, false, false, null);
            }
            return this;
        }

        public a a(String str) {
            this.f40730g = str != null ? s.d(s.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public s a() {
            if (this.f40724a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f40727d != null) {
                return new s(this);
            }
            throw new IllegalStateException("host == null");
        }

        public int b() {
            int i10 = this.f40728e;
            return i10 != -1 ? i10 : s.a(this.f40724a);
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strA = a(str, 0, str.length());
            if (strA != null) {
                this.f40727d = strA;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public a d() {
            int size = this.f40729f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f40729f.set(i10, s.a(this.f40729f.get(i10), "[]", true, true, false, true));
            }
            List<String> list = this.f40730g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f40730g.get(i11);
                    if (str != null) {
                        this.f40730g.set(i11, s.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f40731h;
            if (str2 != null) {
                this.f40731h = s.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f40726c = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a f(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f40724a = "http";
            } else {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.f40724a = "https";
            }
            return this;
        }

        public a g(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f40725b = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f40724a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f40725b.isEmpty() || !this.f40726c.isEmpty()) {
                sb2.append(this.f40725b);
                if (!this.f40726c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f40726c);
                }
                sb2.append('@');
            }
            String str2 = this.f40727d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f40727d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f40727d);
                }
            }
            if (this.f40728e != -1 || this.f40724a != null) {
                int iB = b();
                String str3 = this.f40724a;
                if (str3 == null || iB != s.a(str3)) {
                    sb2.append(':');
                    sb2.append(iB);
                }
            }
            s.b(sb2, this.f40729f);
            if (this.f40730g != null) {
                sb2.append('?');
                s.a(sb2, this.f40730g);
            }
            if (this.f40731h != null) {
                sb2.append('#');
                sb2.append(this.f40731h);
            }
            return sb2.toString();
        }
    }

    public s(a aVar) {
        this.f40715a = aVar.f40724a;
        this.f40716b = a(aVar.f40725b, false);
        this.f40717c = a(aVar.f40726c, false);
        this.f40718d = aVar.f40727d;
        this.f40719e = aVar.b();
        this.f40720f = a(aVar.f40729f, false);
        List<String> list = aVar.f40730g;
        this.f40721g = list != null ? a(list, true) : null;
        String str = aVar.f40731h;
        this.f40722h = str != null ? a(str, false) : null;
        this.f40723i = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || (iCodePointAt >= 128 && z13)) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, iCharCount);
                a(cVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return cVar.p();
            }
            if (str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z10 || (z11 && !a(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12))) {
                com.mbridge.msdk.thrid.okio.c cVar2 = new com.mbridge.msdk.thrid.okio.c();
                cVar2.a(str, i10, iCharCount);
                a(cVar2, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return cVar2.p();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i10, i11);
    }

    public static String a(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, i12);
                a(cVar, str, i12, i11, z10);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, charset);
    }

    public static String a(String str, boolean z10) {
        return a(str, 0, str.length(), z10);
    }

    private List<String> a(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? a(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.mbridge.msdk.thrid.okio.c cVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    cVar.a(z10 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z13) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z10 || (z11 && !a(str, i10, i11)))))) {
                    if (cVar2 == null) {
                        cVar2 = new com.mbridge.msdk.thrid.okio.c();
                    }
                    if (charset == null || charset.equals(com.mbridge.msdk.thrid.okhttp.internal.c.f40315j)) {
                        cVar2.f(iCodePointAt);
                    } else {
                        cVar2.a(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    }
                    while (!cVar2.f()) {
                        int i12 = cVar2.readByte() & 255;
                        cVar.writeByte(37);
                        char[] cArr = f40714j;
                        cVar.writeByte((int) cArr[(i12 >> 4) & 15]);
                        cVar.writeByte((int) cArr[i12 & 15]);
                    }
                } else {
                    cVar.f(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.mbridge.msdk.thrid.okio.c r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.writeByte(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.writeByte(r1)
            goto L3c
        L39:
            r5.f(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.s.a(com.mbridge.msdk.thrid.okio.c, java.lang.String, int, int, boolean):void");
    }

    public static void a(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append(G5.T);
                sb2.append(str2);
            }
        }
    }

    public static boolean a(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1)) != -1 && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12)) != -1;
    }

    public static s b(String str) {
        return new a().a(null, str).a();
    }

    public static void b(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public String a() {
        if (this.f40722h == null) {
            return null;
        }
        return this.f40723i.substring(this.f40723i.indexOf(35) + 1);
    }

    public String b() {
        if (this.f40717c.isEmpty()) {
            return "";
        }
        return this.f40723i.substring(this.f40723i.indexOf(58, this.f40715a.length() + 3) + 1, this.f40723i.indexOf(64));
    }

    public a c(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String c() {
        int iIndexOf = this.f40723i.indexOf(47, this.f40715a.length() + 3);
        String str = this.f40723i;
        return this.f40723i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int iIndexOf = this.f40723i.indexOf(47, this.f40715a.length() + 3);
        String str = this.f40723i;
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iA) {
            int i10 = iIndexOf + 1;
            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40723i, i10, iA, '/');
            arrayList.add(this.f40723i.substring(i10, iA2));
            iIndexOf = iA2;
        }
        return arrayList;
    }

    public s e(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    public String e() {
        if (this.f40721g == null) {
            return null;
        }
        int iIndexOf = this.f40723i.indexOf(63) + 1;
        String str = this.f40723i;
        return this.f40723i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).f40723i.equals(this.f40723i);
    }

    public String f() {
        if (this.f40716b.isEmpty()) {
            return "";
        }
        int length = this.f40715a.length() + 3;
        String str = this.f40723i;
        return this.f40723i.substring(length, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.f40718d;
    }

    public boolean h() {
        return this.f40715a.equals("https");
    }

    public int hashCode() {
        return this.f40723i.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.f40724a = this.f40715a;
        aVar.f40725b = f();
        aVar.f40726c = b();
        aVar.f40727d = this.f40718d;
        aVar.f40728e = this.f40719e != a(this.f40715a) ? this.f40719e : -1;
        aVar.f40729f.clear();
        aVar.f40729f.addAll(d());
        aVar.a(e());
        aVar.f40731h = a();
        return aVar;
    }

    public int j() {
        return this.f40719e;
    }

    public String k() {
        if (this.f40721g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        a(sb2, this.f40721g);
        return sb2.toString();
    }

    public String l() {
        return c("/...").g("").e("").a().toString();
    }

    public String m() {
        return this.f40715a;
    }

    public URI n() {
        String string = i().d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public String toString() {
        return this.f40723i;
    }
}
