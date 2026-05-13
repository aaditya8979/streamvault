package h2;

import java.io.File;

/* JADX INFO: compiled from: FileSizeBackupStrategy.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f62970a;

    public b(long j10) {
        this.f62970a = j10;
    }

    @Override // h2.a
    public boolean a(File file) {
        return file.length() > this.f62970a;
    }
}
