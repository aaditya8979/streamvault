package com.applovin.shadow.okio;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: PeekSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PeekSource implements Source {

    @NotNull
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;

    @Nullable
    private Segment expectedSegment;
    private long pos;

    @NotNull
    private final BufferedSource upstream;

    public PeekSource(@NotNull BufferedSource bufferedSource) {
        p.k(bufferedSource, "upstream");
        this.upstream = bufferedSource;
        Buffer buffer = bufferedSource.getBuffer();
        this.buffer = buffer;
        Segment segment = buffer.head;
        this.expectedSegment = segment;
        this.expectedPos = segment != null ? segment.pos : -1;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    @Override // com.applovin.shadow.okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            tn.p.k(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L10
            r5 = r4
            goto L11
        L10:
            r5 = r3
        L11:
            if (r5 == 0) goto L88
            boolean r5 = r8.closed
            r5 = r5 ^ r4
            if (r5 == 0) goto L7c
            com.applovin.shadow.okio.Segment r5 = r8.expectedSegment
            if (r5 == 0) goto L2b
            com.applovin.shadow.okio.Buffer r6 = r8.buffer
            com.applovin.shadow.okio.Segment r6 = r6.head
            if (r5 != r6) goto L2c
            int r5 = r8.expectedPos
            tn.p.h(r6)
            int r6 = r6.pos
            if (r5 != r6) goto L2c
        L2b:
            r3 = r4
        L2c:
            if (r3 == 0) goto L70
            if (r2 != 0) goto L31
            return r0
        L31:
            com.applovin.shadow.okio.BufferedSource r0 = r8.upstream
            long r1 = r8.pos
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L41
            r9 = -1
            return r9
        L41:
            com.applovin.shadow.okio.Segment r0 = r8.expectedSegment
            if (r0 != 0) goto L54
            com.applovin.shadow.okio.Buffer r0 = r8.buffer
            com.applovin.shadow.okio.Segment r0 = r0.head
            if (r0 == 0) goto L54
            r8.expectedSegment = r0
            tn.p.h(r0)
            int r0 = r0.pos
            r8.expectedPos = r0
        L54:
            com.applovin.shadow.okio.Buffer r0 = r8.buffer
            long r0 = r0.size()
            long r2 = r8.pos
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            com.applovin.shadow.okio.Buffer r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r6 = r10
            r2.copyTo(r3, r4, r6)
            long r0 = r8.pos
            long r0 = r0 + r10
            r8.pos = r0
            return r10
        L70:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L88:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.PeekSource.read(com.applovin.shadow.okio.Buffer, long):long");
    }

    @Override // com.applovin.shadow.okio.Source
    @NotNull
    public Timeout timeout() {
        return this.upstream.timeout();
    }
}
