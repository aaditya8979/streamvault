package a0;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExifUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, d2 = {"La0/f;", "", "", "a", "Z", "b", "()Z", "isFlipped", "", "I", "()I", "rotationDegrees", "<init>", "(ZI)V", "c", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final f f3449d = new f(false, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isFlipped;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int rotationDegrees;

    public f(boolean z10, int i10) {
        this.isFlipped = z10;
        this.rotationDegrees = i10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsFlipped() {
        return this.isFlipped;
    }
}
