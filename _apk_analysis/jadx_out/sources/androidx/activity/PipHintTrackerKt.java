package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    @Nullable
    public static final Object trackPipAnimationHintView(@NotNull final Activity activity, @NotNull View view, @NotNull hn.c<? super r> cVar) {
        Object objCollect = go.f.f(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new go.e() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            @Nullable
            public final Object emit(@NotNull Rect rect, @NotNull hn.c<? super r> cVar2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return r.f5635a;
            }

            @Override // go.e
            public /* bridge */ /* synthetic */ Object emit(Object obj, hn.c cVar2) {
                return emit((Rect) obj, (hn.c<? super r>) cVar2);
            }
        }, cVar);
        return objCollect == in.a.g() ? objCollect : r.f5635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
