package yads;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f94683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f94685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f94686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f94687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f94688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f94689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f94690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f94691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f94692k;

    public s23(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.f94682a = j10;
        this.f94683b = z10;
        this.f94684c = z11;
        this.f94685d = z12;
        this.f94687f = Collections.unmodifiableList(arrayList);
        this.f94686e = j11;
        this.f94688g = z13;
        this.f94689h = j12;
        this.f94690i = i10;
        this.f94691j = i11;
        this.f94692k = i12;
    }

    public s23(Parcel parcel) {
        this.f94682a = parcel.readLong();
        this.f94683b = parcel.readByte() == 1;
        this.f94684c = parcel.readByte() == 1;
        this.f94685d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(r23.a(parcel));
        }
        this.f94687f = Collections.unmodifiableList(arrayList);
        this.f94686e = parcel.readLong();
        this.f94688g = parcel.readByte() == 1;
        this.f94689h = parcel.readLong();
        this.f94690i = parcel.readInt();
        this.f94691j = parcel.readInt();
        this.f94692k = parcel.readInt();
    }

    public static s23 a(Parcel parcel) {
        return new s23(parcel);
    }
}
