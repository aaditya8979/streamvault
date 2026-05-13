package j5;

import com.google.android.exoplayer.upstream.a;

/* JADX INFO: compiled from: DefaultHlsDataSourceFactory.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0296a f72194a;

    public b(a.InterfaceC0296a interfaceC0296a) {
        this.f72194a = interfaceC0296a;
    }

    @Override // j5.e
    public com.google.android.exoplayer.upstream.a createDataSource(int i10) {
        return this.f72194a.createDataSource();
    }
}
