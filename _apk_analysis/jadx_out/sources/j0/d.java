package j0;

import android.graphics.drawable.Drawable;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ImageResult.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019"}, d2 = {"Lj0/d;", "Lj0/g;", "", "other", "", "equals", "", "hashCode", "Landroid/graphics/drawable/Drawable;", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "drawable", "Lj0/f;", "b", "Lj0/f;", "()Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "", "c", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Landroid/graphics/drawable/Drawable;Lj0/f;Ljava/lang/Throwable;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Drawable drawable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Throwable throwable;

    public d(@Nullable Drawable drawable, @NotNull f fVar, @NotNull Throwable th2) {
        super(null);
        this.drawable = drawable;
        this.request = fVar;
        this.throwable = th2;
    }

    @Override // j0.g
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override // j0.g
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public f getRequest() {
        return this.request;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof d) {
            d dVar = (d) other;
            if (p.f(getDrawable(), dVar.getDrawable()) && p.f(getRequest(), dVar.getRequest()) && p.f(this.throwable, dVar.throwable)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Drawable drawable = getDrawable();
        return ((((drawable != null ? drawable.hashCode() : 0) * 31) + getRequest().hashCode()) * 31) + this.throwable.hashCode();
    }
}
