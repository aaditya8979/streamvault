package com.applovin.shadow.okhttp3;

import androidx.autofill.HintConstants;
import com.applovin.shadow.okio.ByteString;
import com.ironsource.G5;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Credentials.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Credentials {

    @NotNull
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    @NotNull
    public static final String basic(@NotNull String str, @NotNull String str2) {
        p.k(str, "username");
        p.k(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        return basic$default(str, str2, null, 4, null);
    }

    @NotNull
    public static final String basic(@NotNull String str, @NotNull String str2, @NotNull Charset charset) {
        p.k(str, "username");
        p.k(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        p.k(charset, G5.M);
        return "Basic " + ByteString.Companion.encodeString(str + ':' + str2, charset).base64();
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            p.j(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }
}
