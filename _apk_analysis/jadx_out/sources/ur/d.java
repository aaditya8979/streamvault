package ur;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: BytesRange.java */
/* JADX INFO: loaded from: classes12.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f85798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f85799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f85800c;

    public d(Long l10, Long l11, Long l12) {
        this.f85798a = l10;
        this.f85799b = l11;
        this.f85800c = l12;
    }

    public static d c(String str) throws InvalidValueException {
        return d(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ur.d d(java.lang.String r5, java.lang.String r6) throws org.fourthline.cling.model.types.InvalidValueException {
        /*
            java.lang.String r0 = "bytes="
            if (r6 == 0) goto L6
            r1 = r6
            goto L7
        L6:
            r1 = r0
        L7:
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L7c
            if (r6 == 0) goto L10
            goto L11
        L10:
            r6 = r0
        L11:
            int r6 = r6.length()
            java.lang.String r6 = r5.substring(r6)
            java.lang.String r0 = "[-/]"
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L5d
            r3 = 2
            if (r0 == r3) goto L47
            r4 = 3
            if (r0 != r4) goto L7c
            r0 = r6[r3]
            int r0 = r0.length()
            if (r0 == 0) goto L47
            r0 = r6[r3]
            java.lang.String r4 = "*"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L47
            r0 = r6[r3]
            long r3 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L48
        L47:
            r0 = r2
        L48:
            r3 = r6[r1]
            int r3 = r3.length()
            if (r3 == 0) goto L5b
            r1 = r6[r1]
            long r3 = java.lang.Long.parseLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L5f
        L5b:
            r1 = r2
            goto L5f
        L5d:
            r0 = r2
            r1 = r0
        L5f:
            r3 = 0
            r4 = r6[r3]
            int r4 = r4.length()
            if (r4 == 0) goto L72
            r6 = r6[r3]
            long r2 = java.lang.Long.parseLong(r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L72:
            if (r2 != 0) goto L76
            if (r1 == 0) goto L7c
        L76:
            ur.d r5 = new ur.d
            r5.<init>(r2, r1, r0)
            return r5
        L7c:
            org.fourthline.cling.model.types.InvalidValueException r6 = new org.fourthline.cling.model.types.InvalidValueException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't parse Bytes Range: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.d.d(java.lang.String, java.lang.String):ur.d");
    }

    public String a() {
        return b(false, null);
    }

    public String b(boolean z10, String str) {
        if (str == null) {
            str = "bytes=";
        }
        if (this.f85798a != null) {
            str = str + this.f85798a.toString();
        }
        String str2 = str + "-";
        if (this.f85799b != null) {
            str2 = str2 + this.f85799b.toString();
        }
        if (!z10) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("/");
        Long l10 = this.f85800c;
        sb2.append(l10 != null ? l10.toString() : "*");
        return sb2.toString();
    }
}
