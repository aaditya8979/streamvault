package sq;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: URIUtil.java */
/* JADX INFO: loaded from: classes9.dex */
public class q implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f84560b = System.getProperty("org.eclipse.jetty.util.URI.charset", "UTF-8");

    public static String a(String str, String str2) {
        if (str == null || str.length() == 0) {
            return (str == null || str2 != null) ? str2 : str;
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(63);
        }
        if (iIndexOf == 0) {
            return str2 + str;
        }
        if (iIndexOf < 0) {
            iIndexOf = str.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 2);
        sb2.append(str);
        int i10 = iIndexOf - 1;
        if (sb2.charAt(i10) == '/') {
            if (str2.startsWith("/")) {
                sb2.deleteCharAt(i10);
                sb2.insert(i10, str2);
            } else {
                sb2.insert(iIndexOf, str2);
            }
        } else if (str2.startsWith("/")) {
            sb2.insert(iIndexOf, str2);
        } else {
            sb2.insert(iIndexOf, '/');
            sb2.insert(iIndexOf + 1, str2);
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072 A[PHI: r8 r10
      0x0072: PHI (r8v5 int) = (r8v2 int), (r8v7 int), (r8v8 int) binds: [B:76:0x00da, B:37:0x0070, B:62:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r10v18 int) = (r10v11 int), (r10v22 int), (r10v25 int) binds: [B:76:0x00da, B:37:0x0070, B:62:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sq.q.b(java.lang.String):java.lang.String");
    }

    public static String c(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/') {
                i11++;
                if (i11 == 2) {
                    break;
                }
            } else {
                if (cCharAt == '?') {
                    return str;
                }
                i11 = 0;
            }
            i10++;
        }
        if (i11 < 2) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length());
        stringBuffer.append((CharSequence) str, 0, i10);
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 == '/') {
                int i12 = i11 + 1;
                if (i11 == 0) {
                    stringBuffer.append(cCharAt2);
                }
                i11 = i12;
            } else {
                if (cCharAt2 == '?') {
                    stringBuffer.append((CharSequence) str, i10, length);
                    break;
                }
                stringBuffer.append(cCharAt2);
                i11 = 0;
            }
            i10++;
        }
        return stringBuffer.toString();
    }

    public static String d(String str) {
        String str2;
        String str3;
        int i10;
        char[] cArr = null;
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = null;
        int length2 = 0;
        int i11 = 0;
        int length3 = 0;
        while (true) {
            if (length2 >= length) {
                break;
            }
            char cCharAt = str.charAt(length2);
            if (cCharAt == '%' && (i10 = length2 + 2) < length) {
                if (cArr == null) {
                    cArr = new char[length];
                    bArr = new byte[length];
                    str.getChars(0, length2, cArr, 0);
                }
                bArr[i11] = (byte) (p.e(str, length2 + 1, 2, 16) & 255);
                i11++;
                length2 = i10;
            } else if (cCharAt == ';') {
                if (cArr == null) {
                    cArr = new char[length];
                    str.getChars(0, length2, cArr, 0);
                }
            } else if (bArr == null) {
                length3++;
            } else {
                if (i11 > 0) {
                    try {
                        str3 = new String(bArr, 0, i11, f84560b);
                    } catch (UnsupportedEncodingException unused) {
                        str3 = new String(bArr, 0, i11);
                    }
                    str3.getChars(0, str3.length(), cArr, length3);
                    length3 += str3.length();
                    i11 = 0;
                }
                cArr[length3] = cCharAt;
                length3++;
            }
            length2++;
        }
        length2 = length3;
        if (cArr == null) {
            return str;
        }
        if (i11 > 0) {
            try {
                str2 = new String(bArr, 0, i11, f84560b);
            } catch (UnsupportedEncodingException unused2) {
                str2 = new String(bArr, 0, i11);
            }
            str2.getChars(0, str2.length(), cArr, length2);
            length2 += str2.length();
        }
        return new String(cArr, 0, length2);
    }

    public static String e(byte[] bArr, int i10, int i11) {
        int i12;
        byte[] bArr2 = null;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i11) {
                break;
            }
            int i15 = i13 + i10;
            byte bF = bArr[i15];
            if (bF == 37 && (i12 = i13 + 2) < i11) {
                bF = (byte) (p.f(bArr, i15 + 1, 2, 16) & 255);
                i13 = i12;
            } else {
                if (bF == 59) {
                    i11 = i13;
                    break;
                }
                if (bArr2 == null) {
                    i14++;
                }
                i13++;
            }
            if (bArr2 == null) {
                bArr2 = new byte[i11];
                for (int i16 = 0; i16 < i14; i16++) {
                    bArr2[i16] = bArr[i16 + i10];
                }
            }
            bArr2[i14] = bF;
            i14++;
            i13++;
        }
        return bArr2 == null ? o.h(bArr, i10, i11, f84560b) : o.h(bArr2, 0, i14, f84560b);
    }

    public static String f(String str) {
        StringBuilder sbG;
        return (str == null || str.length() == 0 || (sbG = g(null, str)) == null) ? str : sbG.toString();
    }

    public static StringBuilder g(StringBuilder sb2, String str) {
        StringBuilder sb3;
        byte[] bytes;
        byte[] bArr = null;
        int i10 = 0;
        if (sb2 == null) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == ' ' || cCharAt == '%' || cCharAt == '\'' || cCharAt == '\"' || cCharAt == '#' || cCharAt == ';' || cCharAt == '<' || cCharAt == '>' || cCharAt == '?') {
                    sb3 = new StringBuilder(str.length() * 2);
                    break;
                }
                if (cCharAt > 127) {
                    try {
                        bytes = str.getBytes(f84560b);
                        sb3 = new StringBuilder(str.length() * 2);
                        break;
                    } catch (UnsupportedEncodingException e10) {
                        throw new IllegalStateException(e10);
                    }
                }
            }
            sb3 = sb2;
            bytes = null;
            if (sb3 == null) {
                return null;
            }
            bArr = bytes;
        } else {
            sb3 = sb2;
        }
        synchronized (sb3) {
            if (bArr != null) {
                while (i10 < bArr.length) {
                    byte b10 = bArr[i10];
                    if (b10 == 32) {
                        sb3.append("%20");
                    } else if (b10 == 37) {
                        sb3.append("%25");
                    } else if (b10 == 39) {
                        sb3.append("%27");
                    } else if (b10 == 34) {
                        sb3.append("%22");
                    } else if (b10 == 35) {
                        sb3.append("%23");
                    } else if (b10 == 59) {
                        sb3.append("%3B");
                    } else if (b10 == 60) {
                        sb3.append("%3C");
                    } else if (b10 == 62) {
                        sb3.append("%3E");
                    } else if (b10 == 63) {
                        sb3.append("%3F");
                    } else if (b10 < 0) {
                        sb3.append('%');
                        p.g(b10, sb3);
                    } else {
                        sb3.append((char) b10);
                    }
                    i10++;
                }
            } else {
                while (i10 < str.length()) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == ' ') {
                        sb3.append("%20");
                    } else if (cCharAt2 == '%') {
                        sb3.append("%25");
                    } else if (cCharAt2 == '\'') {
                        sb3.append("%27");
                    } else if (cCharAt2 == '\"') {
                        sb3.append("%22");
                    } else if (cCharAt2 == '#') {
                        sb3.append("%23");
                    } else if (cCharAt2 == ';') {
                        sb3.append("%3B");
                    } else if (cCharAt2 == '<') {
                        sb3.append("%3C");
                    } else if (cCharAt2 == '>') {
                        sb3.append("%3E");
                    } else if (cCharAt2 != '?') {
                        sb3.append(cCharAt2);
                    } else {
                        sb3.append("%3F");
                    }
                    i10++;
                }
            }
        }
        return sb3;
    }

    public static boolean h(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == ':') {
                return true;
            }
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && (i10 <= 0 || !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '.' || cCharAt == '+' || cCharAt == '-')))) {
                break;
            }
        }
        return false;
    }

    public static String i(String str) {
        int iLastIndexOf;
        if (str == null || "/".equals(str) || (iLastIndexOf = str.lastIndexOf(47, str.length() - 2)) < 0) {
            return null;
        }
        return str.substring(0, iLastIndexOf + 1);
    }
}
