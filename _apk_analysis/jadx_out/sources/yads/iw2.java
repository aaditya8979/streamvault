package yads;

import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class iw2 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final iw2 f91024b = new iw2();

    public iw2() {
        super(0);
    }

    @Override // sn.a
    public final Object invoke() {
        X509TrustManager x509TrustManagerA = b93.a(null);
        if (x509TrustManagerA != null) {
            return x509TrustManagerA;
        }
        throw new IllegalArgumentException("Failed to create default TrustManager");
    }
}
