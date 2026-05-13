package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FocusRepository.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface FocusState {

    /* JADX INFO: compiled from: FocusRepository.kt */
    public static final class Focused implements FocusState {

        @NotNull
        private final WeakReference<Activity> activity;

        public Focused(@NotNull WeakReference<Activity> weakReference) {
            p.k(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Focused copy$default(Focused focused, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = focused.getActivity();
            }
            return focused.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @NotNull
        public final Focused copy(@NotNull WeakReference<Activity> weakReference) {
            p.k(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Focused(weakReference);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Focused) && p.f(getActivity(), ((Focused) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @NotNull
        public String toString() {
            return "Focused(activity=" + getActivity() + ')';
        }
    }

    /* JADX INFO: compiled from: FocusRepository.kt */
    public static final class Unfocused implements FocusState {

        @NotNull
        private final WeakReference<Activity> activity;

        public Unfocused(@NotNull WeakReference<Activity> weakReference) {
            p.k(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unfocused copy$default(Unfocused unfocused, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = unfocused.getActivity();
            }
            return unfocused.copy(weakReference);
        }

        @NotNull
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @NotNull
        public final Unfocused copy(@NotNull WeakReference<Activity> weakReference) {
            p.k(weakReference, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Unfocused(weakReference);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unfocused) && p.f(getActivity(), ((Unfocused) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        @NotNull
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @NotNull
        public String toString() {
            return "Unfocused(activity=" + getActivity() + ')';
        }
    }

    @NotNull
    WeakReference<Activity> getActivity();
}
