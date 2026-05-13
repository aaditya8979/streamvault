package zn;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d implements e<Float> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f98351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f98352c;

    public d(float f10, float f11) {
        this.f98351b = f10;
        this.f98352c = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zn.e
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public boolean b(float f10) {
        return f10 >= this.f98351b && f10 <= this.f98352c;
    }

    @Override // zn.f
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.f98352c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zn.e
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return b(((Number) comparable).floatValue());
    }

    @Override // zn.f
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f98351b);
    }

    public boolean e(float f10, float f11) {
        return f10 <= f11;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof d) {
            if (isEmpty() && ((d) obj).isEmpty()) {
                return true;
            }
            d dVar = (d) obj;
            if (this.f98351b == dVar.f98351b) {
                if (this.f98352c == dVar.f98352c) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f98351b) * 31) + Float.hashCode(this.f98352c);
    }

    @Override // zn.e, zn.f
    public boolean isEmpty() {
        return this.f98351b > this.f98352c;
    }

    @NotNull
    public String toString() {
        return this.f98351b + ".." + this.f98352c;
    }
}
