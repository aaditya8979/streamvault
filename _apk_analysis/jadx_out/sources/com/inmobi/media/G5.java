package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class G5 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream[] f25513a;

    public G5(InputStream[] inputStreamArr) {
        this.f25513a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f25513a) {
            AbstractC3314bl.a(inputStream);
        }
    }
}
