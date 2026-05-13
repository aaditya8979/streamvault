package a0;

import a0.k;
import androidx.annotation.DrawableRes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\f¨\u0006\u0012"}, d2 = {"La0/m;", "La0/k$a;", "", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "", "b", "I", "getResId", "()I", "resId", "c", "density", "<init>", "(Ljava/lang/String;II)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class m extends k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String packageName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int resId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int density;

    public m(@NotNull String str, @DrawableRes int i10, int i11) {
        this.packageName = str;
        this.resId = i10;
        this.density = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDensity() {
        return this.density;
    }
}
