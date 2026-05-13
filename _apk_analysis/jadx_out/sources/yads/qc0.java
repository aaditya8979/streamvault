package yads;

import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class qc0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cursor f94004a;

    public qc0(Cursor cursor) {
        this.f94004a = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f94004a.close();
    }
}
