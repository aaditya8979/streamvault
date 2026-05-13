package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public final class Vf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f66041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f66042b;

    public Vf(File file, C4827h6 c4827h6) {
        this.f66041a = file;
        this.f66042b = c4827h6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        if (!this.f66041a.exists() || !this.f66041a.isDirectory() || (fileArrListFiles = this.f66041a.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                this.f66042b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }
}
