package j0;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p000do.p0;

/* JADX INFO: compiled from: Disposable.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Lj0/o;", "Lj0/c;", "Landroid/view/View;", "a", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Ldo/p0;", "Lj0/g;", "b", "Ldo/p0;", "getJob", "()Ldo/p0;", "(Ldo/p0;)V", "job", "<init>", "(Landroid/view/View;Ldo/p0;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class o implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile p0<? extends g> job;

    public o(@NotNull View view, @NotNull p0<? extends g> p0Var) {
        this.view = view;
        this.job = p0Var;
    }

    public void a(@NotNull p0<? extends g> p0Var) {
        this.job = p0Var;
    }
}
