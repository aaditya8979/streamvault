package g4;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: AuxEffectInfo.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f61975b;

    public m(int i10, float f10) {
        this.f61974a = i10;
        this.f61975b = f10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f61974a == mVar.f61974a && Float.compare(mVar.f61975b, this.f61975b) == 0;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f61974a) * 31) + Float.floatToIntBits(this.f61975b);
    }
}
