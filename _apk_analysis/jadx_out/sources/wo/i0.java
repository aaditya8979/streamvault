package wo;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 {
    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> a(@NotNull String str, @NotNull T[] tArr, @NotNull String[] strArr, @NotNull Annotation[][] annotationArr, @Nullable Annotation[] annotationArr2) {
        tn.p.k(str, "serialName");
        tn.p.k(tArr, "values");
        tn.p.k(strArr, "names");
        tn.p.k(annotationArr, "entryAnnotations");
        f0 f0Var = new f0(str, tArr.length);
        if (annotationArr2 != null) {
            for (Annotation annotation : annotationArr2) {
                f0Var.v(annotation);
            }
        }
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            String strName = (String) cn.r.d0(strArr, i11);
            if (strName == null) {
                strName = t10.name();
            }
            g2.o(f0Var, strName, false, 2, null);
            Annotation[] annotationArr3 = (Annotation[]) cn.r.d0(annotationArr, i11);
            if (annotationArr3 != null) {
                for (Annotation annotation2 : annotationArr3) {
                    f0Var.u(annotation2);
                }
            }
            i10++;
            i11 = i12;
        }
        return new h0(str, tArr, f0Var);
    }

    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> b(@NotNull String str, @NotNull T[] tArr) {
        tn.p.k(str, "serialName");
        tn.p.k(tArr, "values");
        return new h0(str, tArr);
    }
}
