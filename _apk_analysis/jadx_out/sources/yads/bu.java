package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f88143a = Charset.forName(C.ASCII_NAME);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f88144b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f88145c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f88146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f88147e;

    static {
        Charset.forName("UTF-16BE");
        f88146d = Charset.forName("UTF-16LE");
        f88147e = Charset.forName(C.UTF16_NAME);
    }
}
