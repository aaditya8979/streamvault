package com.moloco.sdk.internal;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class B implements a, LifecycleOwner, SavedStateRegistryOwner {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f45907d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45908e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LifecycleRegistry f45909b = new LifecycleRegistry(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SavedStateRegistryController f45910c = SavedStateRegistryController.Companion.create(this);

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f45911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B f45912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f45913d;

        public c(View view, B b10, View view2) {
            this.f45911b = view;
            this.f45912c = b10;
            this.f45913d = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            this.f45911b.removeOnAttachStateChangeListener(this);
            this.f45912c.f(this.f45913d);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        }
    }

    public static final bn.r a(View view, B b10) {
        if (ViewCompat.isAttachedToWindow(view)) {
            b10.f(view);
        } else {
            view.addOnAttachStateChangeListener(new c(view, b10, view));
        }
        return bn.r.f5635a;
    }

    @Override // com.moloco.sdk.internal.a
    public void a(@NotNull final View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        com.moloco.sdk.internal.scheduling.d.a(new sn.a() { // from class: com.moloco.sdk.internal.c
            @Override // sn.a
            public final Object invoke() {
                return B.a(view, this);
            }
        });
    }

    @Override // com.moloco.sdk.internal.a
    public void b(@NotNull View view) {
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        View rootView = view.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (tn.p.f(ViewTreeSavedStateRegistryOwner.get(rootView), this)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "Removing ViewTreeSavedStateRegistryOwner", null, false, 12, null);
            ViewTreeSavedStateRegistryOwner.set(rootView, null);
        }
        if (e(rootView)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "Removing ViewTreeLifecycleOwner", null, false, 12, null);
            ViewTreeLifecycleOwner.set(rootView, null);
        }
    }

    @Override // com.moloco.sdk.internal.a
    public void c(@NotNull View view) {
        Object objM7534constructorimpl;
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        View rootView = view.getRootView();
        tn.p.h(rootView);
        if (e(rootView)) {
            try {
                Result.a aVar = Result.Companion;
                this.f45909b.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle pause success " + Result.m7540isSuccessimpl(objM7534constructorimpl), Result.m7537exceptionOrNullimpl(objM7534constructorimpl), false, 8, null);
        }
    }

    @Override // com.moloco.sdk.internal.a
    public void d(@NotNull View view) {
        Object objM7534constructorimpl;
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        View rootView = view.getRootView();
        tn.p.h(rootView);
        if (e(rootView)) {
            try {
                Result.a aVar = Result.Companion;
                this.f45909b.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m7540isSuccessimpl(objM7534constructorimpl)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle resume success", null, false, 12, null);
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle resume failure", thM7537exceptionOrNullimpl, false, 8, null);
            }
        }
    }

    public final boolean e(View view) {
        return tn.p.f(ViewTreeLifecycleOwner.get(view), this);
    }

    public final void f(View view) {
        View rootView = view.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (ViewTreeSavedStateRegistryOwner.get(rootView) == null) {
            ViewTreeSavedStateRegistryOwner.set(rootView, this);
            try {
                Result.a aVar = Result.Companion;
                this.f45910c.performRestore(null);
                Result.m7534constructorimpl(bn.r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeSavedStateRegistryOwner is absent, setting custom one", null, false, 12, null);
        }
        if (ViewTreeLifecycleOwner.get(rootView) == null) {
            ViewTreeLifecycleOwner.set(rootView, this);
            this.f45909b.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            this.f45909b.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.f45909b.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeLifecycleOwner is absent, setting custom one", null, false, 12, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f45909b;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NotNull
    public SavedStateRegistry getSavedStateRegistry() {
        return this.f45910c.getSavedStateRegistry();
    }
}
