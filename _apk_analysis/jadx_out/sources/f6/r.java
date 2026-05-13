package f6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: AuxEffectInfo.java */
/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f61536b;

    public r(int i10, float f10) {
        this.f61535a = i10;
        this.f61536b = f10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f61535a == rVar.f61535a && Float.compare(rVar.f61536b, this.f61536b) == 0;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f61535a) * 31) + Float.floatToIntBits(this.f61536b);
    }
}
