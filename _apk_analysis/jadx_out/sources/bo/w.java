package bo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringBuilderJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class w extends v {
    private static final StringBuilder insert(StringBuilder sb2, int i10, byte b10) {
        tn.p.k(sb2, "<this>");
        StringBuilder sbInsert = sb2.insert(i10, (int) b10);
        tn.p.j(sbInsert, "insert(...)");
        return sbInsert;
    }

    private static final StringBuilder insert(StringBuilder sb2, int i10, short s10) {
        tn.p.k(sb2, "<this>");
        StringBuilder sbInsert = sb2.insert(i10, (int) s10);
        tn.p.j(sbInsert, "insert(...)");
        return sbInsert;
    }

    @NotNull
    public static final StringBuilder m(@NotNull StringBuilder sb2) {
        tn.p.k(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }
}
