package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import cn.f0;
import cn.w;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivTransitionHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTransitionHandler {

    @NotNull
    private final Div2View divView;
    private boolean posted;

    @NotNull
    private List<TransitionData> pendingTransitions = new ArrayList();

    @NotNull
    private List<TransitionData> activeTransitions = new ArrayList();

    /* JADX INFO: compiled from: DivTransitionHandler.kt */
    public static abstract class ChangeType {

        /* JADX INFO: compiled from: DivTransitionHandler.kt */
        public static final class Visibility extends ChangeType {

            /* JADX INFO: renamed from: new, reason: not valid java name */
            private final int f3284new;

            public Visibility(int i10) {
                super(null);
                this.f3284new = i10;
            }

            public void apply(@NotNull View view) {
                view.setVisibility(this.f3284new);
            }

            public final int getNew() {
                return this.f3284new;
            }
        }

        private ChangeType() {
        }

        public /* synthetic */ ChangeType(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DivTransitionHandler.kt */
    public static final class TransitionData {

        @NotNull
        private final List<ChangeType.Visibility> changes;

        @NotNull
        private final List<ChangeType.Visibility> savedChanges;

        @NotNull
        private final View target;

        @NotNull
        private final Transition transition;

        public TransitionData(@NotNull Transition transition, @NotNull View view, @NotNull List<ChangeType.Visibility> list, @NotNull List<ChangeType.Visibility> list2) {
            this.transition = transition;
            this.target = view;
            this.changes = list;
            this.savedChanges = list2;
        }

        @NotNull
        public final List<ChangeType.Visibility> getChanges() {
            return this.changes;
        }

        @NotNull
        public final List<ChangeType.Visibility> getSavedChanges() {
            return this.savedChanges;
        }

        @NotNull
        public final View getTarget() {
            return this.target;
        }

        @NotNull
        public final Transition getTransition() {
            return this.transition;
        }
    }

    public DivTransitionHandler(@NotNull Div2View div2View) {
        this.divView = div2View;
    }

    private final void beginDelayedTransitions(ViewGroup viewGroup, boolean z10) {
        if (!viewGroup.isAttachedToWindow()) {
            this.pendingTransitions.clear();
            return;
        }
        if (z10) {
            TransitionManager.endTransitions(viewGroup);
        }
        final TransitionSet transitionSet = new TransitionSet();
        Iterator<T> it = this.pendingTransitions.iterator();
        while (it.hasNext()) {
            transitionSet.addTransition(((TransitionData) it.next()).getTransition());
        }
        transitionSet.addListener((Transition.TransitionListener) new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.DivTransitionHandler$beginDelayedTransitions$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition) {
                this.activeTransitions.clear();
                transitionSet.removeListener(this);
            }
        });
        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
        for (TransitionData transitionData : this.pendingTransitions) {
            for (ChangeType.Visibility visibility : transitionData.getChanges()) {
                visibility.apply(transitionData.getTarget());
                transitionData.getSavedChanges().add(visibility);
            }
        }
        this.activeTransitions.clear();
        this.activeTransitions.addAll(this.pendingTransitions);
        this.pendingTransitions.clear();
    }

    public static /* synthetic */ void beginDelayedTransitions$default(DivTransitionHandler divTransitionHandler, ViewGroup viewGroup, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            viewGroup = divTransitionHandler.divView;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        divTransitionHandler.beginDelayedTransitions(viewGroup, z10);
    }

    private final List<ChangeType.Visibility> getChange(List<TransitionData> list, View view) {
        ArrayList arrayList = new ArrayList();
        for (TransitionData transitionData : list) {
            ChangeType.Visibility visibility = p.f(transitionData.getTarget(), view) ? (ChangeType.Visibility) f0.G0(transitionData.getSavedChanges()) : null;
            if (visibility != null) {
                arrayList.add(visibility);
            }
        }
        return arrayList;
    }

    private final void postTransitions() {
        if (this.posted) {
            return;
        }
        this.posted = true;
        this.divView.post(new Runnable() { // from class: jg.a
            @Override // java.lang.Runnable
            public final void run() {
                DivTransitionHandler.postTransitions$lambda$0(this.f72428b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postTransitions$lambda$0(DivTransitionHandler divTransitionHandler) {
        if (divTransitionHandler.posted) {
            beginDelayedTransitions$default(divTransitionHandler, null, false, 3, null);
        }
        divTransitionHandler.posted = false;
    }

    @Nullable
    public final ChangeType.Visibility getLastChange(@NotNull View view) {
        ChangeType.Visibility visibility = (ChangeType.Visibility) f0.G0(getChange(this.pendingTransitions, view));
        if (visibility != null) {
            return visibility;
        }
        ChangeType.Visibility visibility2 = (ChangeType.Visibility) f0.G0(getChange(this.activeTransitions, view));
        if (visibility2 != null) {
            return visibility2;
        }
        return null;
    }

    public final void putTransition(@NotNull Transition transition, @NotNull View view, @NotNull ChangeType.Visibility visibility) {
        this.pendingTransitions.add(new TransitionData(transition, view, w.s(visibility), new ArrayList()));
        postTransitions();
    }

    public final void runTransitions(@NotNull ViewGroup viewGroup, boolean z10) {
        this.posted = false;
        beginDelayedTransitions(viewGroup, z10);
    }
}
