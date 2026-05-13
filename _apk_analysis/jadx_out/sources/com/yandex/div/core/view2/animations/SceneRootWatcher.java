package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Scene;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SceneRootWatcher.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class SceneRootWatcher {

    @NotNull
    public static final SceneRootWatcher INSTANCE = new SceneRootWatcher();

    /* JADX INFO: compiled from: SceneRootWatcher.kt */
    public static final class OnDetachListener implements View.OnAttachStateChangeListener {

        @NotNull
        private final ViewGroup sceneRoot;

        public OnDetachListener(@NotNull ViewGroup viewGroup) {
            this.sceneRoot = viewGroup;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            this.sceneRoot.removeOnAttachStateChangeListener(this);
            TransitionManager.endTransitions(this.sceneRoot);
        }
    }

    private SceneRootWatcher() {
    }

    public final void watchFor(@NotNull final ViewGroup viewGroup, @NotNull final Transition transition) {
        final OnDetachListener onDetachListener = new OnDetachListener(viewGroup);
        viewGroup.addOnAttachStateChangeListener(onDetachListener);
        transition.addListener(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.SceneRootWatcher$watchFor$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition2) {
                viewGroup.removeOnAttachStateChangeListener(onDetachListener);
                transition.removeListener(this);
            }
        });
    }

    public final void watchFor(@NotNull Scene scene, @NotNull Transition transition) {
        watchFor(scene.getSceneRoot(), transition);
    }
}
