package k0;

import k0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: renamed from: k0.g, reason: from toString */
/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0013"}, d2 = {"Lk0/g;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lk0/c;", "a", "Lk0/c;", "b", "()Lk0/c;", "width", "height", "<init>", "(Lk0/c;Lk0/c;)V", "c", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Size {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Size f72688d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final c width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final c height;

    static {
        c.b bVar = c.b.f72682a;
        f72688d = new Size(bVar, bVar);
    }

    public Size(@NotNull c cVar, @NotNull c cVar2) {
        this.width = cVar;
        this.height = cVar2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getWidth() {
        return this.width;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Size)) {
            return false;
        }
        Size size = (Size) other;
        return p.f(this.width, size.width) && p.f(this.height, size.height);
    }

    public int hashCode() {
        return (this.width.hashCode() * 31) + this.height.hashCode();
    }

    @NotNull
    public String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ')';
    }
}
