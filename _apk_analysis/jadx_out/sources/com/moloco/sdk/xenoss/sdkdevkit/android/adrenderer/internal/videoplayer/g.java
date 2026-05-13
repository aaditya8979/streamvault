package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class g implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f50751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LifecycleEventObserver f50752c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50753a;

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
            f50753a = iArr;
        }
    }

    public g(@NotNull Lifecycle lifecycle, @NotNull final sn.a<bn.r> aVar, @NotNull final sn.a<bn.r> aVar2) {
        p.k(lifecycle, "lifecycle");
        p.k(aVar, "onExoResume");
        p.k(aVar2, "onExoPause");
        this.f50751b = lifecycle;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                g.i(aVar, aVar2, lifecycleOwner, event);
            }
        };
        this.f50752c = lifecycleEventObserver;
        lifecycle.addObserver(lifecycleEventObserver);
    }

    public static final void i(sn.a aVar, sn.a aVar2, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        p.k(lifecycleOwner, "<unused var>");
        p.k(event, "event");
        int i10 = a.f50753a[event.ordinal()];
        if (i10 == 1) {
            aVar.invoke();
        } else {
            if (i10 == 2 || i10 == 3 || i10 != 4) {
                return;
            }
            aVar2.invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        this.f50751b.removeObserver(this.f50752c);
    }
}
