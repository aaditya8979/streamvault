package yads;

import android.util.Log;
import com.yandex.mobile.ads.R$raw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes10.dex */
public final class jw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u20 f91398a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KeyStore f91400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X509TrustManager f91401d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bn.g f91399b = kotlin.b.b(iw2.f91024b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f91402e = new Object();

    public jw2(u20 u20Var) {
        this.f91398a = u20Var;
    }

    public static void a(KeyStore keyStore, X509Certificate x509Certificate) {
        try {
            keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), x509Certificate);
        } catch (KeyStoreException e10) {
            Log.w("SdkTrustManager", "Failed to store certificate", e10);
        }
    }

    public final void a() {
        KeyStore keyStore;
        X509Certificate x509Certificate;
        b();
        b();
        if (this.f91400c == null) {
            bn.g gVar = b93.f87950a;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("SdkTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                lt2 lt2Var = (lt2) this.f91398a;
                lt2Var.getClass();
                try {
                    InputStream inputStreamOpenRawResource = lt2Var.f92091b.getResources().openRawResource(R$raw.monetization_ads_sdkinternalca);
                    try {
                        byte[] bArrC = on.a.c(inputStreamOpenRawResource);
                        on.b.a(inputStreamOpenRawResource, null);
                        try {
                            inputStreamOpenRawResource = lt2Var.f88113a.getResources().openRawResource(R$raw.monetization_ads_bundled_cert);
                            try {
                                byte[] bArrC2 = on.a.c(inputStreamOpenRawResource);
                                on.b.a(inputStreamOpenRawResource, null);
                                byte[][] bArr = (byte[][]) cn.p.E(new byte[][]{bArrC2}, new byte[][]{bArrC});
                                ArrayList arrayList = new ArrayList();
                                for (byte[] bArr2 : bArr) {
                                    bn.g gVar2 = b93.f87950a;
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        CertificateFactory certificateFactory = (CertificateFactory) b93.f87950a.getValue();
                                        x509Certificate = (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
                                    } catch (CertificateException unused3) {
                                        x509Certificate = null;
                                    }
                                    if (x509Certificate != null) {
                                        arrayList.add(x509Certificate);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a(keyStore, (X509Certificate) it.next());
                                }
                                keyStore2 = keyStore;
                            } finally {
                            }
                        } catch (IOException e10) {
                            throw new IllegalStateException("Failed to create cert", e10);
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (IOException e11) {
                    throw new IllegalStateException("Failed to create cert", e11);
                }
            }
            this.f91400c = keyStore2;
        }
        b();
        if (this.f91401d == null) {
            b();
            if (this.f91400c != null) {
                b();
                this.f91401d = b93.a(this.f91400c);
            }
        }
    }

    public final void a(X509Certificate[] x509CertificateArr, String str) {
        bn.r rVar;
        try {
            ((X509TrustManager) this.f91399b.getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e10) {
            synchronized (this.f91402e) {
                a();
                b();
                X509TrustManager x509TrustManager = this.f91401d;
                if (x509TrustManager != null) {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    rVar = bn.r.f5635a;
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    bn.r rVar2 = bn.r.f5635a;
                } else {
                    Log.w("SdkTrustManager", "Custom TrustManager is null");
                    throw e10;
                }
            }
        }
    }

    public final void b() {
        if (!Thread.holdsLock(this.f91402e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }
}
