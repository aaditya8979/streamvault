package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KAnnotatedElement.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface KAnnotatedElement {
    @NotNull
    List<Annotation> getAnnotations();
}
