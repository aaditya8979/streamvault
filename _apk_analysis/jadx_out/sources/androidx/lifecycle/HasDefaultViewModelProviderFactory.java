package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HasDefaultViewModelProviderFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface HasDefaultViewModelProviderFactory {
    @NotNull
    default CreationExtras getDefaultViewModelCreationExtras() {
        return CreationExtras.Empty.INSTANCE;
    }

    @NotNull
    ViewModelProvider.Factory getDefaultViewModelProviderFactory();
}
