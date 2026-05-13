package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ViewModelLazy.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewModelLazy<VM extends ViewModel> implements bn.g<VM> {

    @Nullable
    private VM cached;

    @NotNull
    private final sn.a<CreationExtras> extrasProducer;

    @NotNull
    private final sn.a<ViewModelProvider.Factory> factoryProducer;

    @NotNull
    private final sn.a<ViewModelStore> storeProducer;

    @NotNull
    private final KClass<VM> viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(@NotNull KClass<VM> kClass, @NotNull sn.a<? extends ViewModelStore> aVar, @NotNull sn.a<? extends ViewModelProvider.Factory> aVar2) {
        this(kClass, aVar, aVar2, null, 8, null);
        p.k(kClass, "viewModelClass");
        p.k(aVar, "storeProducer");
        p.k(aVar2, "factoryProducer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(@NotNull KClass<VM> kClass, @NotNull sn.a<? extends ViewModelStore> aVar, @NotNull sn.a<? extends ViewModelProvider.Factory> aVar2, @NotNull sn.a<? extends CreationExtras> aVar3) {
        p.k(kClass, "viewModelClass");
        p.k(aVar, "storeProducer");
        p.k(aVar2, "factoryProducer");
        p.k(aVar3, "extrasProducer");
        this.viewModelClass = kClass;
        this.storeProducer = aVar;
        this.factoryProducer = aVar2;
        this.extrasProducer = aVar3;
    }

    public /* synthetic */ ViewModelLazy(KClass kClass, sn.a aVar, sn.a aVar2, sn.a aVar3, int i10, i iVar) {
        this(kClass, aVar, aVar2, (i10 & 8) != 0 ? new sn.a<CreationExtras.Empty>() { // from class: androidx.lifecycle.ViewModelLazy.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final CreationExtras.Empty invoke() {
                return CreationExtras.Empty.INSTANCE;
            }
        } : aVar3);
    }

    @Override // bn.g
    @NotNull
    public VM getValue() {
        VM vm2 = this.cached;
        if (vm2 != null) {
            return vm2;
        }
        VM vm3 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(rn.a.a(this.viewModelClass));
        this.cached = vm3;
        return vm3;
    }

    @Override // bn.g
    public boolean isInitialized() {
        return this.cached != null;
    }
}
