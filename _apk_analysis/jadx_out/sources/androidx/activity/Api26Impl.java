package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActivityChooserModel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(26)
public final class Api26Impl {

    @NotNull
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.PictureInPictureParams$Builder] */
    public final void setPipParamsSourceRectHint(@NotNull Activity activity, @NotNull Rect rect) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(rect, "hint");
        activity.setPictureInPictureParams(new Object() { // from class: android.app.PictureInPictureParams$Builder
            static {
                throw new NoClassDefFoundError();
            }

            public native /* synthetic */ PictureInPictureParams build();

            public native /* synthetic */ PictureInPictureParams$Builder setSourceRectHint(Rect rect2);
        }.setSourceRectHint(rect).build());
    }
}
