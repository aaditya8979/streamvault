package i4;

import androidx.annotation.Nullable;
import java.lang.Exception;

/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes11.dex */
public interface c<I, O, E extends Exception> {
    @Nullable
    I dequeueInputBuffer() throws Exception;

    @Nullable
    O dequeueOutputBuffer() throws Exception;

    void flush();

    void queueInputBuffer(I i10) throws Exception;

    void release();
}
