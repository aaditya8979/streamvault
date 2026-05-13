package dagger.hilt.android.internal.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class HiltViewModelFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f59737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewModelProvider.Factory f59738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractSavedStateViewModelFactory f59739c;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        return this.f59737a.contains(cls.getName()) ? (T) this.f59739c.create(cls) : (T) this.f59738b.create(cls);
    }
}
