package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, l<? super CreationExtras, ? extends VM> lVar) {
        p.k(initializerViewModelFactoryBuilder, "<this>");
        p.k(lVar, "initializer");
        p.q(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(t.b(ViewModel.class), lVar);
    }

    @NotNull
    public static final ViewModelProvider.Factory viewModelFactory(@NotNull l<? super InitializerViewModelFactoryBuilder, r> lVar) {
        p.k(lVar, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        lVar.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
