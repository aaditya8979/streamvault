package com.yandex.div.core.view2;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import bn.r;
import cn.w0;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.internal.Log;
import java.util.HashMap;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: ReleaseManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public class ReleaseManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final HashMap<LifecycleOwner, Set<Div2View>> divToRelease = new HashMap<>();

    @NotNull
    private final Object monitor = new Object();

    @NotNull
    private final LifecycleEventObserver observer = new LifecycleEventObserver() { // from class: ig.v
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            ReleaseManager.observer$lambda$2(this.f64226b, lifecycleOwner, event);
        }
    };

    @NotNull
    private final RuntimeStoreProvider runtimeStoreProvider;

    /* JADX INFO: compiled from: ReleaseManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ReleaseManager.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReleaseManager(@NotNull RuntimeStoreProvider runtimeStoreProvider) {
        this.runtimeStoreProvider = runtimeStoreProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object addLifecycleListener(LifecycleOwner lifecycleOwner, Div2View div2View) {
        Object objValueOf;
        synchronized (this.monitor) {
            if (this.divToRelease.containsKey(lifecycleOwner)) {
                Set<Div2View> set = this.divToRelease.get(lifecycleOwner);
                objValueOf = set != null ? Boolean.valueOf(set.add(div2View)) : null;
            } else {
                this.divToRelease.put(lifecycleOwner, w0.h(div2View));
                lifecycleOwner.getLifecycle().addObserver(this.observer);
                objValueOf = r.f5635a;
            }
        }
        return objValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$2(ReleaseManager releaseManager, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        synchronized (releaseManager.monitor) {
            if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
                Set<Div2View> set = releaseManager.divToRelease.get(lifecycleOwner);
                if (set != null) {
                    for (Div2View div2View : set) {
                        div2View.cleanup();
                        releaseManager.runtimeStoreProvider.cleanupRuntime$div_release(div2View);
                    }
                }
                releaseManager.divToRelease.remove(lifecycleOwner);
            }
            r rVar = r.f5635a;
        }
    }

    public void observeDivLifecycle(@NotNull final Div2View div2View) {
        LifecycleOwner lifecycleOwner$div_release = div2View.getContext$div_release().getLifecycleOwner$div_release();
        if (lifecycleOwner$div_release != null) {
            addLifecycleListener(lifecycleOwner$div_release, div2View);
            return;
        }
        if (!div2View.isAttachedToWindow()) {
            div2View.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.ReleaseManager$observeDivLifecycle$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                    div2View.removeOnAttachStateChangeListener(this);
                    LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(div2View);
                    if (lifecycleOwner != null) {
                        this.addLifecycleListener(lifecycleOwner, div2View);
                    } else {
                        Log.w("ReleaseManager", "Attempt to bind a Div2View, which has no LifecycleOwner. Release event will not be caught! If you're using some long-lived resources, like a video player, call cleanup explicitly when you don't need Div2View anymore");
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                }
            });
            return;
        }
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(div2View);
        if (lifecycleOwner != null) {
            addLifecycleListener(lifecycleOwner, div2View);
        } else {
            Log.w("ReleaseManager", "Attempt to bind a Div2View, which has no LifecycleOwner. Release event will not be caught! If you're using some long-lived resources, like a video player, call cleanup explicitly when you don't need Div2View anymore");
        }
    }
}
