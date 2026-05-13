package sg.bigo.ads.api.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.f;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f81789a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f.a<c> f81790b = new f.a<c>() { // from class: sg.bigo.ads.api.a.c.1
        @Override // sg.bigo.ads.common.f.a
        public final /* synthetic */ sg.bigo.ads.common.f a() {
            return new c((byte) 0);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81791c;

    private c() {
    }

    public /* synthetic */ c(byte b10) {
        this();
    }

    public c(String str) {
        this.f81791c = str;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f81791c);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f81791c = parcel.readString();
    }

    public final String toString() {
        return q.a(this.f81791c);
    }
}
