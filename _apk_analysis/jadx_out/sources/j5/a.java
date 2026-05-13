package j5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import y5.q;

/* JADX INFO: compiled from: Aes128DataSource.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements com.google.android.exoplayer.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f72190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f72191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f72192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public CipherInputStream f72193d;

    public a(com.google.android.exoplayer.upstream.a aVar, byte[] bArr, byte[] bArr2) {
        this.f72190a = aVar;
        this.f72191b = bArr;
        this.f72192c = bArr2;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public final long a(y5.h hVar) throws IOException {
        try {
            Cipher cipherC = c();
            try {
                cipherC.init(2, new SecretKeySpec(this.f72191b, "AES"), new IvParameterSpec(this.f72192c));
                y5.g gVar = new y5.g(this.f72190a, hVar);
                this.f72193d = new CipherInputStream(gVar, cipherC);
                gVar.h();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public final void b(q qVar) {
        this.f72190a.b(qVar);
    }

    public Cipher c() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws IOException {
        if (this.f72193d != null) {
            this.f72193d = null;
            this.f72190a.close();
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f72190a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public final Uri getUri() {
        return this.f72190a.getUri();
    }

    @Override // com.google.android.exoplayer.upstream.a
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        a6.a.e(this.f72193d);
        int i12 = this.f72193d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
