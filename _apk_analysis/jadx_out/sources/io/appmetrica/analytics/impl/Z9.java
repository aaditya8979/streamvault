package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes9.dex */
public final class Z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f66292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileLock f66293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f66294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f66295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66296e;

    public Z9(Context context, String str) {
        this(a(context, str));
    }

    public Z9(File file) {
        this.f66296e = 0;
        this.f66292a = file;
    }

    public Z9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }

    public final synchronized void a() {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f66292a, "rw");
        this.f66294c = randomAccessFile;
        FileChannel channel = randomAccessFile.getChannel();
        this.f66295d = channel;
        if (this.f66296e == 0) {
            this.f66293b = channel.lock();
        }
        this.f66296e++;
    }

    public final synchronized void b() {
        this.f66292a.getAbsolutePath();
        int i10 = this.f66296e - 1;
        this.f66296e = i10;
        if (i10 == 0) {
            Ka.a(this.f66293b);
        }
        mo.a((Closeable) this.f66294c);
        mo.a((Closeable) this.f66295d);
        this.f66294c = null;
        this.f66293b = null;
        this.f66295d = null;
    }
}
