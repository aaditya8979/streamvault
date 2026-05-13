package androidx.compose.foundation.text;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: StringHelpers.jvm.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"appendCodePointX", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "codePoint", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class StringHelpers_jvmKt {
    @NotNull
    public static final StringBuilder appendCodePointX(@NotNull StringBuilder sb2, int i10) {
        p.k(sb2, "<this>");
        StringBuilder sbAppendCodePoint = sb2.appendCodePoint(i10);
        p.j(sbAppendCodePoint, "appendCodePointX");
        return sbAppendCodePoint;
    }
}
