package org.eclipse.jetty.security.authentication;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.BitSet;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import kq.a;
import kq.l;
import lq.e;
import mq.d;
import mq.n;
import mq.v;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.security.Constraint;
import org.eclipse.jetty.util.security.Credential;
import sq.m;
import sq.p;
import vq.b;
import vq.c;
import zm.t;

/* JADX INFO: loaded from: classes7.dex */
public class DigestAuthenticator extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f76738i = b.a(DigestAuthenticator.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f76739d = new SecureRandom();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f76740e = 60000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f76741f = 1024;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ConcurrentMap<String, a> f76742g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Queue<a> f76743h = new ConcurrentLinkedQueue();

    public static class Digest extends Credential {
        private static final long serialVersionUID = -2484639019549527724L;
        public final String method;
        public String username = "";
        public String realm = "";
        public String nonce = "";

        /* JADX INFO: renamed from: nc, reason: collision with root package name */
        public String f76744nc = "";
        public String cnonce = "";
        public String qop = "";
        public String uri = "";
        public String response = "";

        public Digest(String str) {
            this.method = str;
        }

        @Override // org.eclipse.jetty.util.security.Credential
        public boolean check(Object obj) {
            byte[] bArrDigest;
            if (obj instanceof char[]) {
                obj = new String((char[]) obj);
            }
            String string = obj instanceof String ? (String) obj : obj.toString();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                if (obj instanceof Credential.MD5) {
                    bArrDigest = ((Credential.MD5) obj).getDigest();
                } else {
                    messageDigest.update(this.username.getBytes("ISO-8859-1"));
                    messageDigest.update((byte) 58);
                    messageDigest.update(this.realm.getBytes("ISO-8859-1"));
                    messageDigest.update((byte) 58);
                    messageDigest.update(string.getBytes("ISO-8859-1"));
                    bArrDigest = messageDigest.digest();
                }
                messageDigest.reset();
                messageDigest.update(this.method.getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(this.uri.getBytes("ISO-8859-1"));
                byte[] bArrDigest2 = messageDigest.digest();
                messageDigest.update(p.j(bArrDigest, 16).getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(this.nonce.getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(this.f76744nc.getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(this.cnonce.getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(this.qop.getBytes("ISO-8859-1"));
                messageDigest.update((byte) 58);
                messageDigest.update(p.j(bArrDigest2, 16).getBytes("ISO-8859-1"));
                return p.j(messageDigest.digest(), 16).equalsIgnoreCase(this.response);
            } catch (Exception e10) {
                DigestAuthenticator.f76738i.e(e10);
                return false;
            }
        }

        public String toString() {
            return this.username + StringUtils.COMMA + this.response;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f76746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BitSet f76747c;

        public a(String str, long j10, int i10) {
            this.f76745a = str;
            this.f76746b = j10;
            this.f76747c = new BitSet(i10);
        }

        public boolean a(int i10) {
            synchronized (this) {
                if (i10 >= this.f76747c.size()) {
                    return true;
                }
                boolean z10 = this.f76747c.get(i10);
                this.f76747c.set(i10);
                return z10;
            }
        }
    }

    @Override // kq.a
    public d a(zm.p pVar, t tVar, boolean z10) throws ServerAuthException {
        if (!z10) {
            return new lq.c(this);
        }
        an.a aVar = (an.a) pVar;
        an.c cVar = (an.c) tVar;
        String strM = aVar.m("Authorization");
        boolean z11 = true;
        if (strM != null) {
            try {
                c cVar2 = f76738i;
                if (cVar2.isDebugEnabled()) {
                    cVar2.h("Credentials: " + strM, new Object[0]);
                }
                m mVar = new m(strM, "=, ", true, false);
                Digest digest = new Digest(aVar.getMethod());
                String str = null;
                String str2 = null;
                while (mVar.hasMoreTokens()) {
                    String strNextToken = mVar.nextToken();
                    char cCharAt = strNextToken.length() == 1 ? strNextToken.charAt(0) : (char) 0;
                    if (cCharAt != ' ') {
                        if (cCharAt != ',') {
                            if (cCharAt == '=') {
                                str2 = str;
                            } else if (str2 != null) {
                                if ("username".equalsIgnoreCase(str2)) {
                                    digest.username = strNextToken;
                                } else if ("realm".equalsIgnoreCase(str2)) {
                                    digest.realm = strNextToken;
                                } else if ("nonce".equalsIgnoreCase(str2)) {
                                    digest.nonce = strNextToken;
                                } else if (ResourceManager.KEY_MD5CHECK.equalsIgnoreCase(str2)) {
                                    digest.f76744nc = strNextToken;
                                } else if ("cnonce".equalsIgnoreCase(str2)) {
                                    digest.cnonce = strNextToken;
                                } else if ("qop".equalsIgnoreCase(str2)) {
                                    digest.qop = strNextToken;
                                } else if (NotificationCompat.MessagingStyle.Message.KEY_DATA_URI.equalsIgnoreCase(str2)) {
                                    digest.uri = strNextToken;
                                } else if ("response".equalsIgnoreCase(str2)) {
                                    digest.response = strNextToken;
                                }
                                str2 = null;
                            }
                            str = strNextToken;
                        } else {
                            str2 = null;
                        }
                    }
                }
                int iH = h(digest, (n) aVar);
                if (iH > 0) {
                    v vVarE = e(digest.username, digest, pVar);
                    if (vVarE != null) {
                        return new l(getAuthMethod(), vVarE);
                    }
                } else if (iH == 0) {
                }
                z11 = false;
            } catch (IOException e10) {
                throw new ServerAuthException(e10);
            }
        } else {
            z11 = false;
        }
        if (lq.c.c(cVar)) {
            return d.I8;
        }
        String strE = aVar.e();
        if (strE == null) {
            strE = "/";
        }
        cVar.j("WWW-Authenticate", "Digest realm=\"" + this.f73912a.getName() + "\", domain=\"" + strE + "\", nonce=\"" + i((n) aVar) + "\", algorithm=MD5, qop=\"auth\", stale=" + z11);
        cVar.o(401);
        return d.K8;
    }

    @Override // lq.e, kq.a
    public void b(a.InterfaceC0866a interfaceC0866a) {
        super.b(interfaceC0866a);
        String initParameter = interfaceC0866a.getInitParameter("maxNonceAge");
        if (initParameter != null) {
            this.f76740e = Long.valueOf(initParameter).longValue();
        }
    }

    @Override // kq.a
    public boolean c(zm.p pVar, t tVar, boolean z10, d.h hVar) throws ServerAuthException {
        return true;
    }

    @Override // kq.a
    public String getAuthMethod() {
        return Constraint.__DIGEST_AUTH;
    }

    public final int h(Digest digest, n nVar) {
        long jT = nVar.T() - this.f76740e;
        a aVarPeek = this.f76743h.peek();
        while (aVarPeek != null && aVarPeek.f76746b < jT) {
            this.f76743h.remove(aVarPeek);
            this.f76742g.remove(aVarPeek.f76745a);
            aVarPeek = this.f76743h.peek();
        }
        try {
            a aVar = this.f76742g.get(digest.nonce);
            if (aVar == null) {
                return 0;
            }
            long j10 = Long.parseLong(digest.f76744nc, 16);
            if (j10 >= this.f76741f) {
                return 0;
            }
            return aVar.a((int) j10) ? -1 : 1;
        } catch (Exception e10) {
            f76738i.g(e10);
            return -1;
        }
    }

    public String i(n nVar) {
        a aVar;
        do {
            byte[] bArr = new byte[24];
            this.f76739d.nextBytes(bArr);
            aVar = new a(new String(sq.d.e(bArr)), nVar.T(), this.f76741f);
        } while (this.f76742g.putIfAbsent(aVar.f76745a, aVar) != null);
        this.f76743h.add(aVar);
        return aVar.f76745a;
    }
}
