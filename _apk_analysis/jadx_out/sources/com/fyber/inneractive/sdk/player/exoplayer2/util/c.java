package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f18763b;

    public c(File file) {
        this.f18762a = file;
        this.f18763b = new File(file.getPath() + ".bak");
    }

    public final FileInputStream a() {
        if (this.f18763b.exists()) {
            this.f18762a.delete();
            this.f18763b.renameTo(this.f18762a);
        }
        return new FileInputStream(this.f18762a);
    }

    public final b b() throws IOException {
        if (this.f18762a.exists()) {
            if (this.f18763b.exists()) {
                this.f18762a.delete();
            } else if (!this.f18762a.renameTo(this.f18763b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f18762a + " to backup file " + this.f18763b);
            }
        }
        try {
            return new b(this.f18762a);
        } catch (FileNotFoundException unused) {
            if (!this.f18762a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f18762a);
            }
            try {
                return new b(this.f18762a);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.f18762a);
            }
        }
    }
}
