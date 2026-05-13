package e7;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: BundledExtractorsAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements com.google.android.exoplayer2.source.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6.p f60835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public i6.k f60836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public i6.l f60837c;

    public a(i6.p pVar) {
        this.f60835a = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    @Override // com.google.android.exoplayer2.source.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(r7.f r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, i6.m r15) throws java.io.IOException {
        /*
            r7 = this;
            i6.e r6 = new i6.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f60837c = r6
            i6.k r8 = r7.f60836b
            if (r8 == 0) goto L10
            return
        L10:
            i6.p r8 = r7.f60835a
            i6.k[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f60836b = r8
            goto L74
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.c(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f60836b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            s7.a.g(r14)
            r6.resetPeekPosition()
            goto L70
        L35:
            i6.k r1 = r7.f60836b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            i6.k r9 = r7.f60836b
            if (r9 != 0) goto L4f
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            s7.a.g(r13)
            r6.resetPeekPosition()
            throw r8
        L57:
            i6.k r1 = r7.f60836b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            s7.a.g(r1)
            r6.resetPeekPosition()
            int r0 = r0 + 1
            goto L22
        L70:
            i6.k r10 = r7.f60836b
            if (r10 == 0) goto L7a
        L74:
            i6.k r8 = r7.f60836b
            r8.a(r15)
            return
        L7a:
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r10 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = s7.m0.G(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = s7.a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a.a(r7.f, android.net.Uri, java.util.Map, long, long, i6.m):void");
    }

    @Override // com.google.android.exoplayer2.source.l
    public int b(i6.y yVar) throws IOException {
        return ((i6.k) s7.a.e(this.f60836b)).b((i6.l) s7.a.e(this.f60837c), yVar);
    }

    @Override // com.google.android.exoplayer2.source.l
    public void disableSeekingOnMp3Streams() {
        i6.k kVar = this.f60836b;
        if (kVar instanceof p6.f) {
            ((p6.f) kVar).i();
        }
    }

    @Override // com.google.android.exoplayer2.source.l
    public long getCurrentInputPosition() {
        i6.l lVar = this.f60837c;
        if (lVar != null) {
            return lVar.getPosition();
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.l
    public void release() {
        i6.k kVar = this.f60836b;
        if (kVar != null) {
            kVar.release();
            this.f60836b = null;
        }
        this.f60837c = null;
    }

    @Override // com.google.android.exoplayer2.source.l
    public void seek(long j10, long j11) {
        ((i6.k) s7.a.e(this.f60836b)).seek(j10, j11);
    }
}
