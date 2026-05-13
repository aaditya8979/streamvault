package n0;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil.drawable.CrossfadeDrawable;
import coil.view.Scale;
import j0.g;
import j0.m;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CrossfadeTransition.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Ln0/a;", "Ln0/c;", "Lbn/r;", "a", "Ln0/d;", "Ln0/d;", TypedValues.AttributesType.S_TARGET, "Lj0/g;", "b", "Lj0/g;", "result", "", "c", "I", "()I", "durationMillis", "", "d", "Z", "()Z", "preferExactIntrinsicSize", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d target;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g result;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int durationMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean preferExactIntrinsicSize;

    @Override // n0.c
    public void a() {
        Drawable drawableC = this.target.c();
        Drawable drawable = this.result.getDrawable();
        Scale scale = this.result.getCom.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String().getScale();
        int i10 = this.durationMillis;
        g gVar = this.result;
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableC, drawable, scale, i10, ((gVar instanceof m) && ((m) gVar).getIsPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        g gVar2 = this.result;
        if (gVar2 instanceof m) {
            this.target.onSuccess(crossfadeDrawable);
        } else if (gVar2 instanceof j0.d) {
            this.target.b(crossfadeDrawable);
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }
}
