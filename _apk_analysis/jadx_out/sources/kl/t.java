package kl;

import cn.f0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringValues.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface t {

    /* JADX INFO: compiled from: StringValues.kt */
    public static final class a {
        public static void a(@NotNull t tVar, @NotNull sn.p<? super String, ? super List<String>, bn.r> pVar) {
            tn.p.k(pVar, "body");
            Iterator<T> it = tVar.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                pVar.mo2invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        @Nullable
        public static String b(@NotNull t tVar, @NotNull String str) {
            tn.p.k(str, "name");
            List<String> listA = tVar.a(str);
            if (listA != null) {
                return (String) f0.v0(listA);
            }
            return null;
        }
    }

    @Nullable
    List<String> a(@NotNull String str);

    boolean b();

    void c(@NotNull sn.p<? super String, ? super List<String>, bn.r> pVar);

    @NotNull
    Set<Map.Entry<String, List<String>>> entries();

    @Nullable
    String get(@NotNull String str);

    boolean isEmpty();

    @NotNull
    Set<String> names();
}
