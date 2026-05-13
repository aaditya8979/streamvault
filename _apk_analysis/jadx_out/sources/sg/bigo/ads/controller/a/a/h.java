package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f82886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f82887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f82888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f82889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f82890e;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f82886a);
            parcel.writeLong(this.f82887b);
            parcel.writeLong(this.f82888c);
            parcel.writeLong(this.f82889d);
            parcel.writeLong(this.f82890e);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f82886a = n.a(parcel, 0L);
            this.f82887b = n.a(parcel, 0L);
            this.f82888c = n.a(parcel, 0L);
            this.f82889d = n.a(parcel, 0L);
            this.f82890e = n.a(parcel, 0L);
        }
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
