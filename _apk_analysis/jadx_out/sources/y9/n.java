package y9;

import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import ga.e;

/* JADX INFO: compiled from: FileDownloadServiceProxy.java */
/* JADX INFO: loaded from: classes8.dex */
public class n implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f87452b;

    /* JADX INFO: compiled from: FileDownloadServiceProxy.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f87453a = new n();
    }

    public n() {
        this.f87452b = ia.e.a().f64037d ? new o() : new p();
    }

    public static e.a a() {
        if (b().f87452b instanceof o) {
            return (e.a) b().f87452b;
        }
        return null;
    }

    public static n b() {
        return b.f87453a;
    }

    @Override // y9.v
    public boolean isConnected() {
        return this.f87452b.isConnected();
    }

    @Override // y9.v
    public boolean m() {
        return this.f87452b.m();
    }

    @Override // y9.v
    public void n(Context context, Runnable runnable) {
        this.f87452b.n(context, runnable);
    }

    @Override // y9.v
    public void o(Context context) {
        this.f87452b.o(context);
    }

    @Override // y9.v
    public boolean q(int i10) {
        return this.f87452b.q(i10);
    }

    @Override // y9.v
    public void r(boolean z10) {
        this.f87452b.r(z10);
    }

    @Override // y9.v
    public byte s(int i10) {
        return this.f87452b.s(i10);
    }

    @Override // y9.v
    public boolean t(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) {
        return this.f87452b.t(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
    }
}
