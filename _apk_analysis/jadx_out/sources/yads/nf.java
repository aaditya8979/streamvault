package yads;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class nf extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nf f92852b = new nf();

    public nf() {
        super(0);
    }

    @Override // sn.a
    public final Object invoke() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }
}
