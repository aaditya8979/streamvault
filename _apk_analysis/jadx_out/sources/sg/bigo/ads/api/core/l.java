package sg.bigo.ads.api.core;

import android.os.Parcel;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements sg.bigo.ads.api.a.j, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f81892a = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeLong(this.f81892a);
    }

    @Override // sg.bigo.ads.api.a.j
    public final boolean a(int i10) {
        return (this.f81892a & (1 << i10)) != 0;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f81892a = parcel.readLong();
    }

    public final String toString() {
        return "{value=" + this.f81892a + '}';
    }
}
