package yads;

import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes8.dex */
public final class io3 implements go3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bn.g f90945a = kotlin.b.b(ho3.f90474b);

    public final boolean a(Context context, SslError sslError) {
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || !nt2VarA.f92984y) {
            return false;
        }
        X509Certificate x509Certificate = Build.VERSION.SDK_INT >= 29 ? sslError.getCertificate().getX509Certificate() : bs2.a(sslError.getCertificate(), (CertificateFactory) this.f90945a.getValue());
        if (x509Certificate == null) {
            return false;
        }
        try {
            cf1.a(new lt2(context)).checkServerTrusted(new X509Certificate[]{x509Certificate}, "RSA");
            return true;
        } catch (Exception unused) {
            boolean z10 = ad1.f87661a;
            return false;
        }
    }
}
