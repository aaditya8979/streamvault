package qq;

import java.security.SecureRandom;
import java.util.Random;
import mq.s;

/* JADX INFO: compiled from: AbstractSessionIdManager.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends uq.a implements s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final vq.c f78384o = vq.b.a(b.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Random f78385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f78386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f78387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f78388n = 100000;

    @Override // uq.a
    public void d0() throws Exception {
        m0();
    }

    @Override // uq.a
    public void e0() throws Exception {
    }

    public void m0() {
        Random random = this.f78385k;
        if (random != null) {
            random.setSeed(((random.nextLong() ^ System.currentTimeMillis()) ^ ((long) hashCode())) ^ Runtime.getRuntime().freeMemory());
            return;
        }
        try {
            this.f78385k = new SecureRandom();
        } catch (Exception e10) {
            f78384o.d("Could not generate SecureRandom for session-id randomness", e10);
            this.f78385k = new Random();
            this.f78386l = true;
        }
    }

    @Override // mq.s
    public String v(an.a aVar, long j10) {
        synchronized (this) {
            if (aVar != null) {
                try {
                    String strN = aVar.n();
                    if (strN != null) {
                        String strC0 = c0(strN);
                        if (J(strC0)) {
                            return strC0;
                        }
                    }
                    String str = (String) aVar.getAttribute("org.eclipse.jetty.server.newSessionId");
                    if (str != null && J(str)) {
                        return str;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String str2 = null;
            while (true) {
                if (str2 != null && str2.length() != 0 && !J(str2)) {
                    aVar.a("org.eclipse.jetty.server.newSessionId", str2);
                    return str2;
                }
                long jHashCode = this.f78386l ? ((((long) hashCode()) ^ Runtime.getRuntime().freeMemory()) ^ ((long) this.f78385k.nextInt())) ^ (((long) aVar.hashCode()) << 32) : this.f78385k.nextLong();
                if (jHashCode < 0) {
                    jHashCode = -jHashCode;
                }
                long j11 = this.f78388n;
                if (j11 > 0 && jHashCode % j11 == 1) {
                    f78384o.h("Reseeding {}", this);
                    Random random = this.f78385k;
                    if (random instanceof SecureRandom) {
                        SecureRandom secureRandom = (SecureRandom) random;
                        secureRandom.setSeed(secureRandom.generateSeed(8));
                    } else {
                        random.setSeed(((random.nextLong() ^ System.currentTimeMillis()) ^ ((long) aVar.hashCode())) ^ Runtime.getRuntime().freeMemory());
                    }
                }
                long jHashCode2 = this.f78386l ? (((long) aVar.hashCode()) << 32) ^ ((((long) hashCode()) ^ Runtime.getRuntime().freeMemory()) ^ ((long) this.f78385k.nextInt())) : this.f78385k.nextLong();
                if (jHashCode2 < 0) {
                    jHashCode2 = -jHashCode2;
                }
                str2 = Long.toString(jHashCode, 36) + Long.toString(jHashCode2, 36);
                if (this.f78387m != null) {
                    str2 = this.f78387m + str2;
                }
            }
        }
    }
}
