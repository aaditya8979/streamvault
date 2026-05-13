package bo;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f5638a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Charset f5639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Charset f5640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Charset f5641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Charset f5642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Charset f5643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Charset f5644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static volatile Charset f5645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static volatile Charset f5646i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        tn.p.j(charsetForName, "forName(...)");
        f5639b = charsetForName;
        Charset charsetForName2 = Charset.forName(C.UTF16_NAME);
        tn.p.j(charsetForName2, "forName(...)");
        f5640c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        tn.p.j(charsetForName3, "forName(...)");
        f5641d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        tn.p.j(charsetForName4, "forName(...)");
        f5642e = charsetForName4;
        Charset charsetForName5 = Charset.forName(C.ASCII_NAME);
        tn.p.j(charsetForName5, "forName(...)");
        f5643f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        tn.p.j(charsetForName6, "forName(...)");
        f5644g = charsetForName6;
    }

    @NotNull
    public final Charset a() {
        Charset charset = f5646i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        tn.p.j(charsetForName, "forName(...)");
        f5646i = charsetForName;
        return charsetForName;
    }

    @NotNull
    public final Charset b() {
        Charset charset = f5645h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        tn.p.j(charsetForName, "forName(...)");
        f5645h = charsetForName;
        return charsetForName;
    }
}
