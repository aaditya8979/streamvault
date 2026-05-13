package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class StreamEncoder implements Encoder<InputStream> {
    private static final String TAG = "StreamEncoder";
    private final ArrayPool byteArrayPool;

    public StreamEncoder(ArrayPool arrayPool) {
        this.byteArrayPool = arrayPool;
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(@NonNull InputStream inputStream, @NonNull File file, @NonNull Options options) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = (byte[]) this.byteArrayPool.get(65536, byte[].class);
        boolean z10 = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException unused) {
                }
            } catch (IOException e10) {
                e = e10;
            }
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream2 = fileOutputStream;
                    if (Log.isLoggable(TAG, 3)) {
                        Log.d(TAG, "Failed to encode data onto the OutputStream", e);
                    }
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    this.byteArrayPool.put(bArr);
                    return z10;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.byteArrayPool.put(bArr);
                    throw th;
                }
                this.byteArrayPool.put(bArr);
                return z10;
            }
            fileOutputStream.close();
            z10 = true;
            fileOutputStream.close();
            this.byteArrayPool.put(bArr);
            return z10;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
