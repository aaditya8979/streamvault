package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedUtf8.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DeprecatedUtf8 {

    @NotNull
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    public final long size(@NotNull String str) {
        p.k(str, TypedValues.Custom.S_STRING);
        return Utf8.size$default(str, 0, 0, 3, null);
    }

    public final long size(@NotNull String str, int i10, int i11) {
        p.k(str, TypedValues.Custom.S_STRING);
        return Utf8.size(str, i10, i11);
    }
}
