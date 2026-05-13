package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import cn.f0;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import k2.t;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PKCEUtil.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0010"}, d2 = {"Lcom/facebook/login/s;", "", "", "codeVerifier", "", "d", "c", "Lcom/facebook/login/CodeChallengeMethod;", "codeChallengeMethod", "b", "authorizationCode", "redirectUri", "Lcom/facebook/GraphRequest;", "a", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f15673a = new s();

    @NotNull
    public static final GraphRequest a(@NotNull String authorizationCode, @NotNull String redirectUri, @NotNull String codeVerifier) {
        tn.p.k(authorizationCode, "authorizationCode");
        tn.p.k(redirectUri, "redirectUri");
        tn.p.k(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        bundle.putString("client_id", t.m());
        bundle.putString("redirect_uri", redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        GraphRequest graphRequestX = GraphRequest.INSTANCE.x(null, "oauth/access_token", null);
        graphRequestX.F(HttpMethod.GET);
        graphRequestX.G(bundle);
        return graphRequestX;
    }

    @NotNull
    public static final String b(@NotNull String codeVerifier, @NotNull CodeChallengeMethod codeChallengeMethod) throws FacebookException {
        tn.p.k(codeVerifier, "codeVerifier");
        tn.p.k(codeChallengeMethod, "codeChallengeMethod");
        if (!d(codeVerifier)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(bo.c.f5643f);
            tn.p.j(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            tn.p.j(strEncodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return strEncodeToString;
        } catch (Exception e10) {
            throw new FacebookException(e10);
        }
    }

    @NotNull
    public static final String c() {
        int iS = zn.n.s(new zn.i(43, 128), Random.Default);
        List listP0 = f0.P0(f0.P0(f0.P0(f0.P0(f0.O0(f0.N0(new zn.c('a', 'z'), new zn.c('A', 'Z')), new zn.c('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iS);
        for (int i10 = 0; i10 < iS; i10++) {
            arrayList.add(Character.valueOf(((Character) f0.Q0(listP0, Random.Default)).charValue()));
        }
        return f0.D0(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public static final boolean d(@Nullable String codeVerifier) {
        if ((codeVerifier == null || codeVerifier.length() == 0) || codeVerifier.length() < 43 || codeVerifier.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").matches(codeVerifier);
    }
}
