package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class vv extends IOException {
    public vv(int i10) {
        super("Illegal clipping: ".concat(a(i10)));
    }

    public static String a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
    }
}
