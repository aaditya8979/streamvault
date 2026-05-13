package ec;

import java.util.List;

/* JADX INFO: compiled from: ListUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {
    public static boolean a(List<?> list) {
        return b(list) || c(list);
    }

    public static boolean b(List<?> list) {
        return list == null;
    }

    public static boolean c(List<?> list) {
        return b(list) || list.size() == 0;
    }
}
