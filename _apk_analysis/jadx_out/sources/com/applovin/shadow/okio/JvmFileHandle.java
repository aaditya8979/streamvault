package com.applovin.shadow.okio;

import java.io.RandomAccessFile;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: JvmFileHandle.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JvmFileHandle extends FileHandle {

    @NotNull
    private final RandomAccessFile randomAccessFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z10, @NotNull RandomAccessFile randomAccessFile) {
        super(z10);
        p.k(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized int protectedRead(long j10, @NotNull byte[] bArr, int i10, int i11) {
        p.k(bArr, "array");
        this.randomAccessFile.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.randomAccessFile.read(bArr, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedResize(long j10) {
        long size = size();
        long j11 = j10 - size;
        if (j11 > 0) {
            int i10 = (int) j11;
            protectedWrite(size, new byte[i10], 0, i10);
        } else {
            this.randomAccessFile.setLength(j10);
        }
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    @Override // com.applovin.shadow.okio.FileHandle
    public synchronized void protectedWrite(long j10, @NotNull byte[] bArr, int i10, int i11) {
        p.k(bArr, "array");
        this.randomAccessFile.seek(j10);
        this.randomAccessFile.write(bArr, i10, i11);
    }
}
