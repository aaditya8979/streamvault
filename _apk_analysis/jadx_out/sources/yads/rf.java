package yads;

import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class rf extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rf f94429b = new rf();

    public rf() {
        super(0);
    }

    @Override // sn.a
    public final Object invoke() {
        return new Regex("^\"(.*)\"\\s+(.+?)?\\s*prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)$");
    }
}
