package com.ironsource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4293v1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4293v1 implements N1 {

    /* JADX INFO: renamed from: com.ironsource.v1$a */
    public static final class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC4145ma f34239a;

        /* JADX INFO: renamed from: com.ironsource.v1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0408a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34240a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f34240a = iArr;
            }
        }

        public a(@NotNull InterfaceC4145ma interfaceC4145ma) {
            tn.p.k(interfaceC4145ma, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f34239a = interfaceC4145ma;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Lifecycle.Event event, a aVar) {
            tn.p.k(event, "$event");
            tn.p.k(aVar, "this$0");
            int i10 = C0408a.f34240a[event.ordinal()];
            if (i10 == 1) {
                aVar.f34239a.b();
                return;
            }
            if (i10 == 2) {
                aVar.f34239a.c();
            } else if (i10 == 3) {
                aVar.f34239a.d();
            } else {
                if (i10 != 4) {
                    return;
                }
                aVar.f34239a.a();
            }
        }

        public boolean equals(@Nullable Object obj) {
            InterfaceC4145ma interfaceC4145ma = this.f34239a;
            a aVar = obj instanceof a ? (a) obj : null;
            return tn.p.f(interfaceC4145ma, aVar != null ? aVar.f34239a : null);
        }

        public int hashCode() {
            return this.f34239a.hashCode();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Lifecycle.Event event) {
            tn.p.k(lifecycleOwner, "source");
            tn.p.k(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.am
                @Override // java.lang.Runnable
                public final void run() {
                    C4293v1.a.a(event, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC4145ma interfaceC4145ma) {
        tn.p.k(interfaceC4145ma, "$observer");
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new a(interfaceC4145ma));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC4145ma interfaceC4145ma) {
        tn.p.k(interfaceC4145ma, "$observer");
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(new a(interfaceC4145ma));
    }

    @Override // com.ironsource.N1
    public void a(@NotNull final InterfaceC4145ma interfaceC4145ma) {
        tn.p.k(interfaceC4145ma, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.yl
            @Override // java.lang.Runnable
            public final void run() {
                C4293v1.c(interfaceC4145ma);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.N1
    public void b(@NotNull final InterfaceC4145ma interfaceC4145ma) {
        tn.p.k(interfaceC4145ma, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.zl
            @Override // java.lang.Runnable
            public final void run() {
                C4293v1.d(interfaceC4145ma);
            }
        }, 0L, 2, null);
    }
}
