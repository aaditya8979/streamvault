package sg.bigo.ads.controller.a;

import android.os.Parcel;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes3.dex */
public class k implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f82989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f82990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f82991c;

    public k() {
    }

    public k(String str, String str2, boolean z10) {
        this.f82991c = str;
        this.f82989a = str2;
        this.f82990b = z10;
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f82991c);
        parcel.writeString(this.f82989a);
        n.a(parcel, this.f82990b);
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void b(@NonNull Parcel parcel) {
        this.f82991c = n.a(parcel, "");
        this.f82989a = n.a(parcel, "");
        this.f82990b = n.b(parcel, false);
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
