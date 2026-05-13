package androidx.lifecycle;

import org.jetbrains.annotations.NotNull;
import p000do.j2;
import p000do.l0;
import p000do.w0;
import tn.p;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewModelKt {

    @NotNull
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final l0 getViewModelScope(@NotNull ViewModel viewModel) {
        p.k(viewModel, "<this>");
        l0 l0Var = (l0) viewModel.getTag(JOB_KEY);
        if (l0Var != null) {
            return l0Var;
        }
        Object tagIfAbsent = viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(j2.b(null, 1, null).plus(w0.c().M())));
        p.j(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (l0) tagIfAbsent;
    }
}
