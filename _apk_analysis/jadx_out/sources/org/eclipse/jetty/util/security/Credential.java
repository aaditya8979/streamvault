package org.eclipse.jetty.util.security;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.Serializable;
import java.security.MessageDigest;
import sq.p;
import vq.b;
import vq.c;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Credential implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f76820b = b.a(Credential.class);
    private static final long serialVersionUID = -7760551052768181572L;

    public static class Crypt extends Credential {
        public static final String __TYPE = "CRYPT:";
        private static final long serialVersionUID = -2027792997664744210L;
        private final String _cooked;

        public Crypt(String str) {
            this._cooked = str.startsWith(__TYPE) ? str.substring(6) : str;
        }

        public static String crypt(String str, String str2) {
            return __TYPE + xq.c.a(str2, str);
        }

        @Override // org.eclipse.jetty.util.security.Credential
        public boolean check(Object obj) {
            if (obj instanceof char[]) {
                obj = new String((char[]) obj);
            }
            if (!(obj instanceof String) && !(obj instanceof Password)) {
                Credential.f76820b.f("Can't check " + obj.getClass() + " against CRYPT", new Object[0]);
            }
            String string = obj.toString();
            String str = this._cooked;
            return str.equals(xq.c.a(string, str));
        }
    }

    public static class MD5 extends Credential {
        public static final String __TYPE = "MD5:";
        public static final Object __md5Lock = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static MessageDigest f76821c = null;
        private static final long serialVersionUID = 5533846540822684240L;
        private final byte[] _digest;

        public MD5(String str) {
            this._digest = p.d(str.startsWith(__TYPE) ? str.substring(4) : str, 16);
        }

        public static String digest(String str) {
            byte[] bArrDigest;
            try {
                synchronized (__md5Lock) {
                    if (f76821c == null) {
                        try {
                            f76821c = MessageDigest.getInstance(SameMD5.TAG);
                        } catch (Exception e10) {
                            Credential.f76820b.e(e10);
                            return null;
                        }
                    }
                    f76821c.reset();
                    f76821c.update(str.getBytes("ISO-8859-1"));
                    bArrDigest = f76821c.digest();
                }
                return __TYPE + p.j(bArrDigest, 16);
            } catch (Exception e11) {
                Credential.f76820b.e(e11);
                return null;
            }
        }

        @Override // org.eclipse.jetty.util.security.Credential
        public boolean check(Object obj) {
            byte[] bArrDigest;
            try {
                if (obj instanceof char[]) {
                    obj = new String((char[]) obj);
                }
                if (!(obj instanceof Password) && !(obj instanceof String)) {
                    if (!(obj instanceof MD5)) {
                        if (obj instanceof Credential) {
                            return ((Credential) obj).check(this);
                        }
                        Credential.f76820b.f("Can't check " + obj.getClass() + " against MD5", new Object[0]);
                        return false;
                    }
                    MD5 md5 = (MD5) obj;
                    if (this._digest.length != md5._digest.length) {
                        return false;
                    }
                    int i10 = 0;
                    while (true) {
                        byte[] bArr = this._digest;
                        if (i10 >= bArr.length) {
                            return true;
                        }
                        if (bArr[i10] != md5._digest[i10]) {
                            return false;
                        }
                        i10++;
                    }
                }
                synchronized (__md5Lock) {
                    if (f76821c == null) {
                        f76821c = MessageDigest.getInstance(SameMD5.TAG);
                    }
                    f76821c.reset();
                    f76821c.update(obj.toString().getBytes("ISO-8859-1"));
                    bArrDigest = f76821c.digest();
                }
                if (bArrDigest != null && bArrDigest.length == this._digest.length) {
                    for (int i11 = 0; i11 < bArrDigest.length; i11++) {
                        if (bArrDigest[i11] != this._digest[i11]) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            } catch (Exception e10) {
                Credential.f76820b.e(e10);
                return false;
            }
        }

        public byte[] getDigest() {
            return this._digest;
        }
    }

    public static Credential getCredential(String str) {
        return str.startsWith(Crypt.__TYPE) ? new Crypt(str) : str.startsWith(MD5.__TYPE) ? new MD5(str) : new Password(str);
    }

    public abstract boolean check(Object obj);
}
