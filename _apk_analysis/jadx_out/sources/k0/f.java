package k0;

import android.view.View;
import coil.view.ViewSizeResolver;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: RealViewSizeResolver.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000e\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lk0/f;", "Landroid/view/View;", "T", "Lcoil/size/ViewSizeResolver;", "", "other", "", "equals", "", "hashCode", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "c", "Z", "()Z", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class f<T extends View> implements ViewSizeResolver<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final T view;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean subtractPadding;

    public f(@NotNull T t10, boolean z10) {
        this.view = t10;
        this.subtractPadding = z10;
    }

    @Override // k0.h
    @Nullable
    public Object a(@NotNull hn.c<? super Size> cVar) {
        return ViewSizeResolver.DefaultImpls.h(this, cVar);
    }

    @Override // coil.view.ViewSizeResolver
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getSubtractPadding() {
        return this.subtractPadding;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof f) {
            f fVar = (f) other;
            if (p.f(getView(), fVar.getView()) && getSubtractPadding() == fVar.getSubtractPadding()) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.view.ViewSizeResolver
    @NotNull
    public T getView() {
        return this.view;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(getSubtractPadding());
    }
}
