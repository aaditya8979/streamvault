package com.liulishuo.filedownloader.exception;

import android.annotation.TargetApi;
import ia.f;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class FileDownloadOutOfSpaceException extends IOException {
    private long breakpointBytes;
    private long freeSpaceBytes;
    private long requiredSpaceBytes;

    public FileDownloadOutOfSpaceException(long j10, long j11, long j12) {
        super(f.o("The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d", Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j10)));
        a(j10, j11, j12);
    }

    @TargetApi(9)
    public FileDownloadOutOfSpaceException(long j10, long j11, long j12, Throwable th2) {
        super(f.o("The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d", Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j10)), th2);
        a(j10, j11, j12);
    }

    public final void a(long j10, long j11, long j12) {
        this.freeSpaceBytes = j10;
        this.requiredSpaceBytes = j11;
        this.breakpointBytes = j12;
    }

    public long getBreakpointBytes() {
        return this.breakpointBytes;
    }

    public long getFreeSpaceBytes() {
        return this.freeSpaceBytes;
    }

    public long getRequiredSpaceBytes() {
        return this.requiredSpaceBytes;
    }
}
