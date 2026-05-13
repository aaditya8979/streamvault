package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.a.j;
import sg.bigo.ads.common.l;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements sg.bigo.ads.common.f, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82856a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82857b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82858c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82859d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82860e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f82861f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82862g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sg.bigo.ads.api.a.h f82863h;

    public d(sg.bigo.ads.api.a.h hVar) {
        this.f82863h = hVar;
    }

    private boolean a(int i10) {
        sg.bigo.ads.api.a.h hVar = this.f82863h;
        j jVarN = hVar != null ? hVar.n() : null;
        if (jVarN != null) {
            return jVarN.a(i10);
        }
        return false;
    }

    @Override // sg.bigo.ads.common.l
    public final int a() {
        return this.f82856a;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeInt(this.f82856a);
            parcel.writeInt(this.f82857b);
            parcel.writeInt(this.f82858c);
            parcel.writeInt(this.f82859d);
            parcel.writeInt(this.f82860e);
            parcel.writeInt(this.f82861f);
            parcel.writeInt(this.f82862g);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f82856a = n.a(parcel, 3);
        this.f82857b = n.a(parcel, 2);
        this.f82858c = n.a(parcel, 12);
        this.f82859d = n.a(parcel, 3);
        this.f82860e = n.a(parcel, 3);
        this.f82861f = n.a(parcel, 10);
        this.f82862g = n.a(parcel, 5);
    }

    @Override // sg.bigo.ads.common.l
    public final boolean b() {
        return a(13);
    }

    @Override // sg.bigo.ads.common.l
    public final int c() {
        return this.f82857b;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean d() {
        return a(13);
    }

    @Override // sg.bigo.ads.common.l
    public final int e() {
        return this.f82858c;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean f() {
        return a(10);
    }

    @Override // sg.bigo.ads.common.l
    public final int g() {
        return this.f82859d;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean h() {
        return a(11);
    }

    @Override // sg.bigo.ads.common.l
    public final int i() {
        return this.f82860e;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean j() {
        return a(12);
    }

    @Override // sg.bigo.ads.common.l
    public final int k() {
        return this.f82861f;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean l() {
        return a(11);
    }

    @Override // sg.bigo.ads.common.l
    public final int m() {
        return this.f82862g;
    }

    @Override // sg.bigo.ads.common.l
    public final boolean n() {
        return a(12);
    }

    @Override // sg.bigo.ads.common.l
    public final boolean o() {
        return a(18);
    }

    @Override // sg.bigo.ads.common.l
    public final boolean p() {
        return a(13);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
