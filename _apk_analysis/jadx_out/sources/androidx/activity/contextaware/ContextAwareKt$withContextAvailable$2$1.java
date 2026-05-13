package androidx.activity.contextaware;

import bn.r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ContextAwareKt$withContextAvailable$2$1 extends Lambda implements l<Throwable, r> {
    public final /* synthetic */ ContextAwareKt$withContextAvailable$2$listener$1 $listener;
    public final /* synthetic */ ContextAware $this_withContextAvailable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextAwareKt$withContextAvailable$2$1(ContextAware contextAware, ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1) {
        super(1);
        this.$this_withContextAvailable = contextAware;
        this.$listener = contextAwareKt$withContextAvailable$2$listener$1;
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
        invoke2(th2);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th2) {
        this.$this_withContextAvailable.removeOnContextAvailableListener(this.$listener);
    }
}
