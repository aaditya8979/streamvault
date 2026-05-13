package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class D5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E5 f25298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f25299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H5 f25301d;

    public D5(H5 h52, E5 e52) {
        this.f25301d = h52;
        this.f25298a = e52;
        this.f25299b = e52.f25363c ? null : new boolean[h52.f25575h];
    }

    public final OutputStream a(int i10) {
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        C5 c52;
        synchronized (this.f25301d) {
            E5 e52 = this.f25298a;
            if (e52.f25364d != this) {
                throw new IllegalStateException();
            }
            if (!e52.f25363c) {
                this.f25299b[i10] = true;
            }
            File fileB = e52.b(i10);
            try {
                fileOutputStreamFileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(fileB);
            } catch (FileNotFoundException unused) {
                this.f25301d.f25569b.mkdirs();
                try {
                    fileOutputStreamFileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(fileB);
                } catch (FileNotFoundException unused2) {
                    return H5.f25567q;
                }
            }
            c52 = new C5(this, fileOutputStreamFileOutputStreamCtor);
        }
        return c52;
    }
}
