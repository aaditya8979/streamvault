package com.unity3d.services.core.di;

import bn.g;
import com.ironsource.C3978d4;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: IServiceComponent.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IServiceComponentKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.services.core.di.IServiceComponentKt$inject$1, reason: invalid class name */
    /* JADX INFO: compiled from: IServiceComponent.kt */
    public static final class AnonymousClass1<T> extends Lambda implements a<T> {
        public final /* synthetic */ String $named;
        public final /* synthetic */ IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IServiceComponent iServiceComponent, String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        @Override // sn.a
        @NotNull
        public final T invoke() {
            IServiceComponent iServiceComponent = this.$this_inject;
            String str = this.$named;
            IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
            p.q(4, "T");
            return (T) registry.getService(str, t.b(Object.class));
        }
    }

    public static final /* synthetic */ <T> T get(IServiceComponent iServiceComponent, String str) {
        p.k(iServiceComponent, "<this>");
        p.k(str, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        p.q(4, "T");
        return (T) registry.getService(str, t.b(Object.class));
    }

    public static /* synthetic */ Object get$default(IServiceComponent iServiceComponent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.k(iServiceComponent, "<this>");
        p.k(str, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        p.q(4, "T");
        return registry.getService(str, t.b(Object.class));
    }

    public static final /* synthetic */ <T> g<T> inject(IServiceComponent iServiceComponent, String str, LazyThreadSafetyMode lazyThreadSafetyMode) {
        p.k(iServiceComponent, "<this>");
        p.k(str, "named");
        p.k(lazyThreadSafetyMode, C3978d4.a.f31224t);
        p.p();
        return b.a(lazyThreadSafetyMode, new AnonymousClass1(iServiceComponent, str));
    }

    public static /* synthetic */ g inject$default(IServiceComponent iServiceComponent, String str, LazyThreadSafetyMode lazyThreadSafetyMode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        }
        p.k(iServiceComponent, "<this>");
        p.k(str, "named");
        p.k(lazyThreadSafetyMode, C3978d4.a.f31224t);
        p.p();
        return b.a(lazyThreadSafetyMode, new AnonymousClass1(iServiceComponent, str));
    }
}
