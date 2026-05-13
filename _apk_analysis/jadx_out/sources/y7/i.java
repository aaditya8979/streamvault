package y7;

import java.util.Arrays;

/* JADX INFO: compiled from: Objects.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends d {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
