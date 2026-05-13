package bo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class y extends x {
    /* JADX WARN: Removed duplicated region for block: B:133:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x008d A[EDGE_INSN: B:182:0x008d->B:52:0x008d BREAK  A[LOOP:2: B:35:0x0064->B:51:0x0088], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00c7 A[EDGE_INSN: B:190:0x00c7->B:76:0x00c7 BREAK  A[LOOP:6: B:60:0x009f->B:75:0x00c2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088 A[LOOP:2: B:35:0x0064->B:51:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c2 A[LOOP:6: B:60:0x009f->B:75:0x00c2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean n(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.y.n(java.lang.String):boolean");
    }

    @Nullable
    public static final Double o(@NotNull String str) {
        tn.p.k(str, "<this>");
        try {
            if (n(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    public static final Float p(@NotNull String str) {
        tn.p.k(str, "<this>");
        try {
            if (n(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
