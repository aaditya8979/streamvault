package androidx.compose.runtime;

import bn.r;
import com.ironsource.C4157n2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.a;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/RememberManager;", "", "Landroidx/compose/runtime/RememberObserver;", C4157n2.f33007p, "Lbn/r;", "remembering", "forgetting", "Lkotlin/Function0;", "effect", "sideEffect", "runtime_release"}, k = 1, mv = {1, 6, 0})
public interface RememberManager {
    void forgetting(@NotNull RememberObserver rememberObserver);

    void remembering(@NotNull RememberObserver rememberObserver);

    void sideEffect(@NotNull a<r> aVar);
}
