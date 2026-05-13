package kotlinx.serialization.descriptors;

import cn.w;
import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import uo.k;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface SerialDescriptor {
    default boolean b() {
        return false;
    }

    int c(@NotNull String str);

    @NotNull
    SerialDescriptor d(int i10);

    int e();

    @NotNull
    String f(int i10);

    @NotNull
    List<Annotation> g(int i10);

    @NotNull
    default List<Annotation> getAnnotations() {
        return w.m();
    }

    @NotNull
    k getKind();

    @NotNull
    String h();

    boolean i(int i10);

    default boolean isInline() {
        return false;
    }
}
