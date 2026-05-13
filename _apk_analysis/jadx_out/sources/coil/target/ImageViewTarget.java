package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ImageViewTarget.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcoil/target/ImageViewTarget;", "Lcoil/target/GenericViewTarget;", "Landroid/widget/ImageView;", "", "other", "", "equals", "", "hashCode", "c", "Landroid/widget/ImageView;", "g", "()Landroid/widget/ImageView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/graphics/drawable/Drawable;", "value", "()Landroid/graphics/drawable/Drawable;", "d", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageView view;

    @Override // coil.target.GenericViewTarget, n0.d
    @Nullable
    public Drawable c() {
        return getView().getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public void d(@Nullable Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageViewTarget) && p.f(getView(), ((ImageViewTarget) other).getView());
    }

    @Override // l0.b
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public ImageView getView() {
        return this.view;
    }

    public int hashCode() {
        return getView().hashCode();
    }
}
