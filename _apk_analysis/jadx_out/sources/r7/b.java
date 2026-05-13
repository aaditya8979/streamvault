package r7;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Allocator.java */
/* JADX INFO: loaded from: classes5.dex */
public interface b {

    /* JADX INFO: compiled from: Allocator.java */
    public interface a {
        r7.a getAllocation();

        @Nullable
        a next();
    }

    void a(r7.a aVar);

    r7.a allocate();

    void b(a aVar);

    int getIndividualAllocationLength();

    void trim();
}
