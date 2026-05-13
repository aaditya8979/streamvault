package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import rn.a;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@ViewModelFactoryDsl
public final class InitializerViewModelFactoryBuilder {

    @NotNull
    private final List<ViewModelInitializer<?>> initializers = new ArrayList();

    public final <T extends ViewModel> void addInitializer(@NotNull KClass<T> kClass, @NotNull l<? super CreationExtras, ? extends T> lVar) {
        p.k(kClass, "clazz");
        p.k(lVar, "initializer");
        this.initializers.add(new ViewModelInitializer<>(a.a(kClass), lVar));
    }

    @NotNull
    public final ViewModelProvider.Factory build() {
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) this.initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
