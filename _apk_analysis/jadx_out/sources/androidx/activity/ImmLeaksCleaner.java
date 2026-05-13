package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImmLeaksCleaner.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final bn.g<Cleaner> cleaner$delegate = kotlin.b.b(new sn.a<Cleaner>() { // from class: androidx.activity.ImmLeaksCleaner$Companion$cleaner$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.a
        @NotNull
        public final ImmLeaksCleaner.Cleaner invoke() {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                declaredField3.setAccessible(true);
                tn.p.j(declaredField3, "hField");
                tn.p.j(declaredField, "servedViewField");
                tn.p.j(declaredField2, "nextServedViewField");
                return new ImmLeaksCleaner.ValidCleaner(declaredField3, declaredField, declaredField2);
            } catch (NoSuchFieldException unused) {
                return ImmLeaksCleaner.FailedInitialization.INSTANCE;
            }
        }
    });

    @NotNull
    private final Activity activity;

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    public static abstract class Cleaner {
        private Cleaner() {
        }

        public /* synthetic */ Cleaner(tn.i iVar) {
            this();
        }

        public abstract boolean clearNextServedView(@NotNull InputMethodManager inputMethodManager);

        @Nullable
        public abstract Object getLock(@NotNull InputMethodManager inputMethodManager);

        @Nullable
        public abstract View getServedView(@NotNull InputMethodManager inputMethodManager);
    }

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @NotNull
        public final Cleaner getCleaner() {
            return (Cleaner) ImmLeaksCleaner.cleaner$delegate.getValue();
        }
    }

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    public static final class FailedInitialization extends Cleaner {

        @NotNull
        public static final FailedInitialization INSTANCE = new FailedInitialization();

        private FailedInitialization() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(@NotNull InputMethodManager inputMethodManager) {
            tn.p.k(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        @Nullable
        public Object getLock(@NotNull InputMethodManager inputMethodManager) {
            tn.p.k(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        @Nullable
        public View getServedView(@NotNull InputMethodManager inputMethodManager) {
            tn.p.k(inputMethodManager, "<this>");
            return null;
        }
    }

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    public static final class ValidCleaner extends Cleaner {

        @NotNull
        private final Field hField;

        @NotNull
        private final Field nextServedViewField;

        @NotNull
        private final Field servedViewField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidCleaner(@NotNull Field field, @NotNull Field field2, @NotNull Field field3) {
            super(null);
            tn.p.k(field, "hField");
            tn.p.k(field2, "servedViewField");
            tn.p.k(field3, "nextServedViewField");
            this.hField = field;
            this.servedViewField = field2;
            this.nextServedViewField = field3;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(@NotNull InputMethodManager inputMethodManager) {
            tn.p.k(inputMethodManager, "<this>");
            try {
                this.nextServedViewField.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        @Nullable
        public Object getLock(@NotNull InputMethodManager inputMethodManager) {
            tn.p.k(inputMethodManager, "<this>");
            try {
                return this.hField.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        @Nullable
        public View getServedView(@NotNull InputMethodManager inputMethodManager) {
            tn.p.k(inputMethodManager, "<this>");
            try {
                return (View) this.servedViewField.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.activity = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        tn.p.k(lifecycleOwner, "source");
        tn.p.k(event, "event");
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        Object systemService = this.activity.getSystemService("input_method");
        tn.p.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        Cleaner cleaner = Companion.getCleaner();
        Object lock = cleaner.getLock(inputMethodManager);
        if (lock == null) {
            return;
        }
        synchronized (lock) {
            View servedView = cleaner.getServedView(inputMethodManager);
            if (servedView == null) {
                return;
            }
            if (servedView.isAttachedToWindow()) {
                return;
            }
            boolean zClearNextServedView = cleaner.clearNextServedView(inputMethodManager);
            if (zClearNextServedView) {
                inputMethodManager.isActive();
            }
        }
    }
}
