package org.eclipse.jetty.util.security;

import java.util.Arrays;
import org.eclipse.jetty.util.security.Credential;
import vq.b;
import vq.c;

/* JADX INFO: loaded from: classes10.dex */
public class Password extends Credential {
    public static final String __OBFUSCATE = "OBF:";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f76822c = b.a(Password.class);
    private static final long serialVersionUID = 5062906681431569445L;
    private String _pw;

    public Password(String str) {
        this._pw = str;
        while (true) {
            String str2 = this._pw;
            if (str2 == null || !str2.startsWith(__OBFUSCATE)) {
                return;
            } else {
                this._pw = deobfuscate(this._pw);
            }
        }
    }

    public static String deobfuscate(String str) {
        if (str.startsWith(__OBFUSCATE)) {
            str = str.substring(4);
        }
        byte[] bArr = new byte[str.length() / 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int i12 = i10 + 4;
            int i13 = Integer.parseInt(str.substring(i10, i12), 36);
            bArr[i11] = (byte) ((((i13 / 256) + (i13 % 256)) - 254) / 2);
            i10 = i12;
            i11++;
        }
        return new String(bArr, 0, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d A[PHI: r4
      0x000d: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v1 java.lang.String) binds: [B:22:0x0060, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.eclipse.jetty.util.security.Password getPassword(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r4 = java.lang.System.getProperty(r3, r4)
            if (r4 == 0) goto Lf
            int r0 = r4.length()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r5 = r4
            goto L62
        Lf:
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.io.IOException -> L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L52
            r1.<init>()     // Catch: java.io.IOException -> L52
            r1.append(r3)     // Catch: java.io.IOException -> L52
            if (r5 == 0) goto L24
            int r3 = r5.length()     // Catch: java.io.IOException -> L52
            if (r3 <= 0) goto L24
            java.lang.String r3 = " [dft]"
            goto L26
        L24:
            java.lang.String r3 = ""
        L26:
            r1.append(r3)     // Catch: java.io.IOException -> L52
            java.lang.String r3 = " : "
            r1.append(r3)     // Catch: java.io.IOException -> L52
            java.lang.String r3 = r1.toString()     // Catch: java.io.IOException -> L52
            r0.print(r3)     // Catch: java.io.IOException -> L52
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.io.IOException -> L52
            r3.flush()     // Catch: java.io.IOException -> L52
            r3 = 512(0x200, float:7.17E-43)
            byte[] r3 = new byte[r3]     // Catch: java.io.IOException -> L52
            java.io.InputStream r0 = java.lang.System.in     // Catch: java.io.IOException -> L52
            int r0 = r0.read(r3)     // Catch: java.io.IOException -> L52
            if (r0 <= 0) goto L5a
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L52
            r2 = 0
            r1.<init>(r3, r2, r0)     // Catch: java.io.IOException -> L52
            java.lang.String r3 = r1.trim()     // Catch: java.io.IOException -> L52
            r4 = r3
            goto L5a
        L52:
            r3 = move-exception
            vq.c r0 = org.eclipse.jetty.util.security.Password.f76822c
            java.lang.String r1 = "EXCEPTION "
            r0.d(r1, r3)
        L5a:
            if (r4 == 0) goto L62
            int r3 = r4.length()
            if (r3 != 0) goto Ld
        L62:
            org.eclipse.jetty.util.security.Password r3 = new org.eclipse.jetty.util.security.Password
            r3.<init>(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.security.Password.getPassword(java.lang.String, java.lang.String, java.lang.String):org.eclipse.jetty.util.security.Password");
    }

    public static void main(String[] strArr) {
        if (strArr.length != 1 && strArr.length != 2) {
            System.err.println("Usage - java org.eclipse.jetty.security.Password [<user>] <password>");
            System.err.println("If the password is ?, the user will be prompted for the password");
            System.exit(1);
        }
        String str = strArr[strArr.length == 1 ? (char) 0 : (char) 1];
        Password password = new Password(str);
        System.err.println(password.toString());
        System.err.println(obfuscate(password.toString()));
        System.err.println(Credential.MD5.digest(str));
        if (strArr.length == 2) {
            System.err.println(Credential.Crypt.crypt(strArr[0], password.toString()));
        }
    }

    public static String obfuscate(String str) {
        StringBuilder sb2 = new StringBuilder();
        byte[] bytes = str.getBytes();
        sb2.append(__OBFUSCATE);
        int i10 = 0;
        while (i10 < bytes.length) {
            byte b10 = bytes[i10];
            i10++;
            byte b11 = bytes[str.length() - i10];
            int i11 = b10 + 127;
            String string = Integer.toString(((i11 + b11) * 256) + (i11 - b11), 36);
            int length = string.length();
            if (length == 1) {
                sb2.append('0');
                sb2.append('0');
                sb2.append('0');
                sb2.append(string);
            } else if (length == 2) {
                sb2.append('0');
                sb2.append('0');
                sb2.append(string);
            } else if (length != 3) {
                sb2.append(string);
            } else {
                sb2.append('0');
                sb2.append(string);
            }
        }
        return sb2.toString();
    }

    @Override // org.eclipse.jetty.util.security.Credential
    public boolean check(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Password) && !(obj instanceof String)) {
            if (obj instanceof char[]) {
                return Arrays.equals(this._pw.toCharArray(), (char[]) obj);
            }
            if (obj instanceof Credential) {
                return ((Credential) obj).check(this._pw);
            }
            return false;
        }
        return obj.equals(this._pw);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Password)) {
            if (obj instanceof String) {
                return obj.equals(this._pw);
            }
            return false;
        }
        Object obj2 = ((Password) obj)._pw;
        String str = this._pw;
        if (obj2 != str) {
            return str != null && str.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        String str = this._pw;
        return str == null ? super.hashCode() : str.hashCode();
    }

    public String toStarString() {
        return "*****************************************************".substring(0, this._pw.length());
    }

    public String toString() {
        return this._pw;
    }
}
