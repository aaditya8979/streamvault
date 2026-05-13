package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements k, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f83059a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f83060b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83061c = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        n.a(parcel, this.f83059a);
        n.a(parcel, this.f83060b);
        parcel.writeInt(this.f83061c);
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean a() {
        return this.f83059a;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f83059a = n.b(parcel, true);
        this.f83059a = n.b(parcel, false);
        this.f83061c = n.a(parcel, 0);
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean b() {
        return this.f83060b;
    }

    @Override // sg.bigo.ads.api.a.k
    public final int c() {
        return this.f83061c;
    }

    @NonNull
    public final String toString() {
        return "{isNativeVideoClickable=" + this.f83059a + ", isNativeVideoClickable=" + this.f83059a + ", clickTriggerType=" + this.f83061c + '}';
    }
}
