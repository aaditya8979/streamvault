package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityResultCallerKt {
    @NotNull
    public static final <I, O> ActivityResultLauncher<r> registerForActivityResult(@NotNull ActivityResultCaller activityResultCaller, @NotNull ActivityResultContract<I, O> activityResultContract, I i10, @NotNull ActivityResultRegistry activityResultRegistry, @NotNull final l<O, r> lVar) {
        p.k(activityResultCaller, "<this>");
        p.k(activityResultContract, "contract");
        p.k(activityResultRegistry, "registry");
        p.k(lVar, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new ActivityResultCallback() { // from class: androidx.activity.result.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultCallerKt.registerForActivityResult$lambda$0(lVar, obj);
            }
        }), activityResultContract, i10);
    }

    @NotNull
    public static final <I, O> ActivityResultLauncher<r> registerForActivityResult(@NotNull ActivityResultCaller activityResultCaller, @NotNull ActivityResultContract<I, O> activityResultContract, I i10, @NotNull final l<O, r> lVar) {
        p.k(activityResultCaller, "<this>");
        p.k(activityResultContract, "contract");
        p.k(lVar, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, new ActivityResultCallback() { // from class: androidx.activity.result.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultCallerKt.registerForActivityResult$lambda$1(lVar, obj);
            }
        }), activityResultContract, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$0(l lVar, Object obj) {
        p.k(lVar, "$callback");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$1(l lVar, Object obj) {
        p.k(lVar, "$callback");
        lVar.invoke(obj);
    }
}
