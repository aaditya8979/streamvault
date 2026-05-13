package p1;

import android.util.Pair;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f76954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f76955c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKey f76953a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlgorithmParameterSpec f76956d = new q1.a().a();

    public final Pair a(String str) {
        if (this.f76954b != null) {
            return d.a(this.f76953a, str);
        }
        return null;
    }

    public final String b(String str, byte[] bArr) {
        if (this.f76955c != null) {
            return a.a(a.b(2, bArr, this.f76953a), str);
        }
        return null;
    }

    public final void c() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        l1.b.a("%s : init", "EncryptionManager");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(this.f76956d);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof SecretKey) {
            this.f76953a = (SecretKey) key;
            this.f76954b = new d();
            this.f76955c = new b();
        }
    }
}
