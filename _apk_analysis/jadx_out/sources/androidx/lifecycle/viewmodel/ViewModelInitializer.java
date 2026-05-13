package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewModelInitializer<T extends ViewModel> {

    @NotNull
    private final Class<T> clazz;

    @NotNull
    private final l<CreationExtras, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(@NotNull Class<T> cls, @NotNull l<? super CreationExtras, ? extends T> lVar) {
        p.k(cls, "clazz");
        p.k(lVar, "initializer");
        this.clazz = cls;
        this.initializer = lVar;
    }

    @NotNull
    public final Class<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    @NotNull
    public final l<CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }
}
