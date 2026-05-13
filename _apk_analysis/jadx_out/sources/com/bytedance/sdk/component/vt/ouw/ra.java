package com.bytedance.sdk.component.vt.ouw;

import com.ironsource.G5;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ra {
    private static final char[] yu = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String bly;
    private final String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final String f12814le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final int f12815lh;
    public final String ouw;
    private final List<String> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final List<String> f12816ra;
    private final String tlj;
    public final String vt;

    public static final class ouw {

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public final List<String> f12817le;
        public String ouw;
        public String pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public List<String> f12819ra;
        public String yu;
        public String vt = "";

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f12818lh = "";
        public int fkw = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.vt.ouw.ra$ouw$ouw, reason: collision with other inner class name */
        public enum EnumC0210ouw {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public ouw() {
            ArrayList arrayList = new ArrayList();
            this.f12817le = arrayList;
            arrayList.add("");
        }

        private static boolean fkw(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private static boolean le(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public static String lh(String str, int i10, int i11) {
            return com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(ra.ouw(str, i10, i11, false));
        }

        private void lh() {
            if (!this.f12817le.remove(r0.size() - 1).isEmpty() || this.f12817le.isEmpty()) {
                this.f12817le.add("");
            } else {
                this.f12817le.set(r0.size() - 1, "");
            }
        }

        private void ouw(String str, int i10, int i11, boolean z10) {
            String strOuw = ra.ouw(str, i10, i11, " \"<>^`{}|/\\?#", true, false, true, null);
            if (fkw(strOuw)) {
                return;
            }
            if (le(strOuw)) {
                lh();
                return;
            }
            if (this.f12817le.get(r10.size() - 1).isEmpty()) {
                this.f12817le.set(r10.size() - 1, strOuw);
            } else {
                this.f12817le.add(strOuw);
            }
            if (z10) {
                this.f12817le.add("");
            }
        }

        public static int vt(String str, int i10, int i11) {
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

        public static int yu(String str, int i10, int i11) {
            int i12;
            try {
                i12 = Integer.parseInt(ra.ouw(str, i10, i11, "", false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i12 <= 0 || i12 > 65535) {
                return -1;
            }
            return i12;
        }

        private ouw yu(String str) {
            int i10 = 0;
            do {
                int iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, i10, str.length(), "/\\");
                ouw(str, i10, iOuw, iOuw < str.length());
                i10 = iOuw + 1;
            } while (i10 <= str.length());
            return this;
        }

        public final ouw lh(String str) {
            if (str != null) {
                return yu(str);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public final int ouw() {
            int i10 = this.fkw;
            return i10 != -1 ? i10 : ra.ouw(this.ouw);
        }

        public final ouw ouw(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.ouw = "http";
            } else {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                this.ouw = "https";
            }
            return this;
        }

        public final ouw ouw(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f12819ra == null) {
                this.f12819ra = new ArrayList();
            }
            this.f12819ra.add(ra.ouw(str, " \"'<>#&="));
            this.f12819ra.add(str2 != null ? ra.ouw(str2, " \"'<>#&=") : null);
            return this;
        }

        public final void ouw(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f12817le.clear();
                this.f12817le.add("");
                i10++;
            } else {
                List<String> list = this.f12817le;
                list.set(list.size() - 1, "");
            }
            while (i10 < i11) {
                int iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, i10, i11, "/\\");
                boolean z10 = iOuw < i11;
                ouw(str, i10, iOuw, z10);
                if (z10) {
                    iOuw++;
                }
                i10 = iOuw;
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.ouw);
            sb2.append("://");
            if (!this.vt.isEmpty() || !this.f12818lh.isEmpty()) {
                sb2.append(this.vt);
                if (!this.f12818lh.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f12818lh);
                }
                sb2.append('@');
            }
            if (this.yu.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.yu);
                sb2.append(']');
            } else {
                sb2.append(this.yu);
            }
            int iOuw = ouw();
            if (iOuw != ra.ouw(this.ouw)) {
                sb2.append(':');
                sb2.append(iOuw);
            }
            ra.ouw(sb2, this.f12817le);
            if (this.f12819ra != null) {
                sb2.append('?');
                ra.vt(sb2, this.f12819ra);
            }
            if (this.pno != null) {
                sb2.append('#');
                sb2.append(this.pno);
            }
            return sb2.toString();
        }

        public final ouw vt(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strLh = lh(str, 0, str.length());
            if (strLh == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.yu = strLh;
            return this;
        }

        public final ra vt() {
            if (this.ouw == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.yu != null) {
                return new ra(this);
            }
            throw new IllegalStateException("host == null");
        }
    }

    public ra(ouw ouwVar) {
        this.ouw = ouwVar.ouw;
        this.fkw = ouw(ouwVar.vt, false);
        this.f12814le = ouw(ouwVar.f12818lh, false);
        this.vt = ouwVar.yu;
        this.f12815lh = ouwVar.ouw();
        this.f12816ra = ouw(ouwVar.f12817le, false);
        List<String> list = ouwVar.f12819ra;
        this.pno = list != null ? ouw(list, true) : null;
        String str = ouwVar.pno;
        this.bly = str != null ? ouw(str, false) : null;
        this.tlj = ouwVar.toString();
    }

    private static List<String> lh(String str) {
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

    public static int ouw(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static String ouw(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || (iCodePointAt >= 128 && z12)) {
                com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar = new com.bytedance.sdk.component.vt.ouw.vt.ouw();
                ouwVar.ouw(str, i10, iCharCount);
                ouw(ouwVar, str, iCharCount, i11, str2, z10, z11, z12, charset);
                return ouwVar.lh();
            }
            if (str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && !z10) || (iCodePointAt == 43 && z11))) {
                com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar2 = new com.bytedance.sdk.component.vt.ouw.vt.ouw();
                ouwVar2.ouw(str, i10, iCharCount);
                ouw(ouwVar2, str, iCharCount, i11, str2, z10, z11, z12, charset);
                return ouwVar2.lh();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i10, i11);
    }

    public static String ouw(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar = new com.bytedance.sdk.component.vt.ouw.vt.ouw();
                ouwVar.ouw(str, i10, i12);
                ouw(ouwVar, str, i12, i11, z10);
                return ouwVar.lh();
            }
        }
        return str.substring(i10, i11);
    }

    public static String ouw(String str, String str2) {
        return ouw(str, 0, str.length(), str2, true, true, true, null);
    }

    private static String ouw(String str, boolean z10) {
        return ouw(str, 0, str.length(), z10);
    }

    private static List<String> ouw(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? ouw(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void ouw(com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, Charset charset) {
        com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z11) {
                    ouwVar.ouw(z10 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z12) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && !z10))) {
                    if (ouwVar2 == null) {
                        ouwVar2 = new com.bytedance.sdk.component.vt.ouw.vt.ouw();
                    }
                    if (charset == null || charset.equals(com.bytedance.sdk.component.vt.ouw.vt.bly.ouw)) {
                        ouwVar2.ouw(iCodePointAt);
                    } else {
                        ouwVar2.ouw(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    }
                    while (!ouwVar2.ouw()) {
                        int iVt = ouwVar2.vt() & 255;
                        ouwVar.vt(37);
                        char[] cArr = yu;
                        ouwVar.vt(cArr[(iVt >> 4) & 15]);
                        ouwVar.vt(cArr[iVt & 15]);
                    }
                } else {
                    ouwVar.ouw(iCodePointAt);
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
    private static void ouw(com.bytedance.sdk.component.vt.ouw.vt.ouw r5, java.lang.String r6, int r7, int r8, boolean r9) {
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
            int r2 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.vt(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.vt(r1)
            goto L3c
        L39:
            r5.ouw(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.ouw.ra.ouw(com.bytedance.sdk.component.vt.ouw.vt.ouw, java.lang.String, int, int, boolean):void");
    }

    public static void ouw(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public static ra vt(String str) {
        int i10;
        ouw.EnumC0210ouw enumC0210ouw;
        int i11;
        char c10;
        char c11;
        int iOuw;
        char c12;
        int i12;
        char cCharAt;
        char cCharAt2;
        ouw ouwVar = new ouw();
        int iOuw2 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, str.length());
        int iOuw3 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, iOuw2, str.length());
        char c13 = ':';
        if (iOuw3 - iOuw2 < 2 || (((cCharAt2 = str.charAt(iOuw2)) < 'a' || cCharAt2 > 'z') && (cCharAt2 < 'A' || cCharAt2 > 'Z'))) {
            i10 = -1;
        } else {
            i10 = iOuw2 + 1;
            while (true) {
                if (i10 >= iOuw3) {
                    break;
                }
                char cCharAt3 = str.charAt(i10);
                if ((cCharAt3 >= 'a' && cCharAt3 <= 'z') || ((cCharAt3 >= 'A' && cCharAt3 <= 'Z') || ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    i10++;
                } else if (cCharAt3 != ':') {
                    break;
                }
            }
            i10 = -1;
        }
        if (i10 != -1) {
            if (str.regionMatches(true, iOuw2, "https:", 0, 6)) {
                ouwVar.ouw = "https";
                i11 = iOuw2 + 6;
            } else if (str.regionMatches(true, iOuw2, "http:", 0, 5)) {
                ouwVar.ouw = "http";
                i11 = iOuw2 + 5;
            } else {
                enumC0210ouw = ouw.EnumC0210ouw.UNSUPPORTED_SCHEME;
            }
            int i13 = 0;
            int i14 = i11;
            while (true) {
                c10 = '/';
                c11 = '\\';
                if (i14 >= iOuw3 || !((cCharAt = str.charAt(i14)) == '\\' || cCharAt == '/')) {
                    break;
                }
                i13++;
                i14++;
            }
            boolean z10 = false;
            boolean z11 = false;
            int i15 = i11 + i13;
            while (true) {
                iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, i15, iOuw3, "@/\\?#");
                byte bCharAt = iOuw != iOuw3 ? str.charAt(iOuw) : (byte) -1;
                if (bCharAt == -1 || bCharAt == 35 || bCharAt == c10 || bCharAt == c11 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z10) {
                        i12 = iOuw;
                        ouwVar.f12818lh += "%40" + ouw(str, i15, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, true, null);
                    } else {
                        int iOuw4 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, i15, iOuw, c13);
                        i12 = iOuw;
                        String strOuw = ouw(str, i15, iOuw4, " \"':;<=>@[]^`{}|/\\?#", true, false, true, null);
                        if (z11) {
                            strOuw = ouwVar.vt + "%40" + strOuw;
                        }
                        ouwVar.vt = strOuw;
                        if (iOuw4 != i12) {
                            ouwVar.f12818lh = ouw(str, iOuw4 + 1, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, true, null);
                            z10 = true;
                        }
                        z11 = true;
                    }
                    i15 = i12 + 1;
                    c13 = ':';
                    c10 = '/';
                    c11 = '\\';
                }
            }
            int iVt = ouw.vt(str, i15, iOuw);
            int i16 = iVt + 1;
            if (i16 < iOuw) {
                ouwVar.yu = ouw.lh(str, i15, iVt);
                int iYu = ouw.yu(str, i16, iOuw);
                ouwVar.fkw = iYu;
                if (iYu == -1) {
                    enumC0210ouw = ouw.EnumC0210ouw.INVALID_PORT;
                }
            } else {
                ouwVar.yu = ouw.lh(str, i15, iVt);
                ouwVar.fkw = ouw(ouwVar.ouw);
            }
            if (ouwVar.yu == null) {
                enumC0210ouw = ouw.EnumC0210ouw.INVALID_HOST;
            } else {
                int iOuw5 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, iOuw, iOuw3, "?#");
                ouwVar.ouw(str, iOuw, iOuw5);
                if (iOuw5 >= iOuw3 || str.charAt(iOuw5) != '?') {
                    c12 = '#';
                } else {
                    int iOuw6 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, iOuw5, iOuw3, '#');
                    c12 = '#';
                    ouwVar.f12819ra = lh(ouw(str, iOuw5 + 1, iOuw6, " \"'<>#", true, true, true, null));
                    iOuw5 = iOuw6;
                }
                if (iOuw5 < iOuw3 && str.charAt(iOuw5) == c12) {
                    ouwVar.pno = ouw(str, iOuw5 + 1, iOuw3, "", true, false, false, null);
                }
                enumC0210ouw = ouw.EnumC0210ouw.SUCCESS;
            }
        } else {
            enumC0210ouw = ouw.EnumC0210ouw.MISSING_SCHEME;
        }
        if (enumC0210ouw == ouw.EnumC0210ouw.SUCCESS) {
            return ouwVar.vt();
        }
        return null;
    }

    public static void vt(StringBuilder sb2, List<String> list) {
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

    public final boolean equals(Object obj) {
        return (obj instanceof ra) && ((ra) obj).tlj.equals(this.tlj);
    }

    public final int hashCode() {
        return this.tlj.hashCode();
    }

    public final URL ouw() {
        try {
            return new URL(this.tlj);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String toString() {
        return this.tlj;
    }

    public final List<String> vt() {
        int iIndexOf = this.tlj.indexOf(47, this.ouw.length() + 3);
        String str = this.tlj;
        int iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iOuw) {
            int i10 = iIndexOf + 1;
            int iOuw2 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(this.tlj, i10, iOuw, '/');
            arrayList.add(this.tlj.substring(i10, iOuw2));
            iIndexOf = iOuw2;
        }
        return arrayList;
    }
}
