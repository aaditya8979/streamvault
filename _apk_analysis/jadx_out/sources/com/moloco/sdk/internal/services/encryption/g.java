package com.moloco.sdk.internal.services.encryption;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import bo.a0;
import com.moloco.sdk.BuildConfig;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class g implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final bn.g f47376b = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.services.encryption.b
        @Override // sn.a
        public final Object invoke() {
            return g.h();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final bn.g f47377c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.services.encryption.c
        @Override // sn.a
        public final Object invoke() {
            return g.g();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final bn.g f47378d = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.services.encryption.d
        @Override // sn.a
        public final Object invoke() {
            return g.f();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final bn.g f47379e = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.services.encryption.e
        @Override // sn.a
        public final Object invoke() {
            return g.d();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SecretKeySpec f47380f = j();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final bn.g f47381g = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.services.encryption.f
        @Override // sn.a
        public final Object invoke() {
            return g.i();
        }
    });

    public static final String d() {
        byte[] bArrDecode = Base64.decode(new byte[]{81, 85, 86, 84, 76, 48, 100, 68, 84, 83, 57, 79, 98, 49, 66, 104, 90, 71, 82, 112, 98, 109, 99, 61}, 0);
        p.j(bArrDecode, "decode(...)");
        return a0.B(bArrDecode);
    }

    public static final String f() {
        return a0.B(new byte[]{65, 69, 83});
    }

    public static final String g() {
        return a0.B(new byte[]{82, 83, 65, 47, 69, 67, 66, 47, 79, 65, 69, 80, 87, 105, 116, 104, 83, 72, 65, 45, 50, 53, 54, 65, 110, 100, 77, 71, 70, 49, 80, 97, 100, 100, 105, 110, 103});
    }

    public static final String h() {
        byte[] bArrDecode = Base64.decode(new byte[]{85, 108, 78, 66}, 0);
        p.j(bArrDecode, "decode(...)");
        return a0.B(bArrDecode);
    }

    public static final IvParameterSpec i() {
        return new IvParameterSpec(Base64.decode(BuildConfig.MOLOCO_SDK_BIDTOKEN_SALT, 0));
    }

    @NotNull
    public IvParameterSpec a() {
        return (IvParameterSpec) this.f47381g.getValue();
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    @NotNull
    public byte[] a(@NotNull String str) {
        p.k(str, "rsaPublicKey");
        byte[] encoded = b().getEncoded();
        p.j(encoded, "getEncoded(...)");
        return c(encoded, str);
    }

    @Override // com.moloco.sdk.internal.services.encryption.a
    @NotNull
    public byte[] a(@NotNull byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        p.k(bArr, "data");
        Cipher cipher = Cipher.getInstance(l());
        cipher.init(1, b(), a());
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        p.j(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    @NotNull
    public SecretKeySpec b() {
        return this.f47380f;
    }

    @NotNull
    public byte[] c(@NotNull byte[] bArr, @NotNull String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        p.k(bArr, "input");
        p.k(str, "publicKey");
        Cipher cipher = Cipher.getInstance(n());
        cipher.init(1, e(str));
        byte[] bArrDoFinal = cipher.doFinal(b().getEncoded());
        p.j(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public final PublicKey e(String str) throws InvalidKeySpecException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(m()).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        p.j(publicKeyGeneratePublic, "generatePublic(...)");
        return publicKeyGeneratePublic;
    }

    public final SecretKeySpec j() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(k());
        keyGenerator.init(256);
        return new SecretKeySpec(keyGenerator.generateKey().getEncoded(), k());
    }

    public final String k() {
        return (String) this.f47378d.getValue();
    }

    public final String l() {
        return (String) this.f47379e.getValue();
    }

    public final String m() {
        return (String) this.f47376b.getValue();
    }

    public final String n() {
        return (String) this.f47377c.getValue();
    }
}
