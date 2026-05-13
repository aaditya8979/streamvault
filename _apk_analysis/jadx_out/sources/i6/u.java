package i6;

import java.io.IOException;

/* JADX INFO: compiled from: ForwardingExtractorInput.java */
/* JADX INFO: loaded from: classes4.dex */
public class u implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f63935a;

    public u(l lVar) {
        this.f63935a = lVar;
    }

    @Override // i6.l
    public void advancePeekPosition(int i10) throws IOException {
        this.f63935a.advancePeekPosition(i10);
    }

    @Override // i6.l
    public boolean advancePeekPosition(int i10, boolean z10) throws IOException {
        return this.f63935a.advancePeekPosition(i10, z10);
    }

    @Override // i6.l
    public long getLength() {
        return this.f63935a.getLength();
    }

    @Override // i6.l
    public long getPeekPosition() {
        return this.f63935a.getPeekPosition();
    }

    @Override // i6.l
    public long getPosition() {
        return this.f63935a.getPosition();
    }

    @Override // i6.l
    public int peek(byte[] bArr, int i10, int i11) throws IOException {
        return this.f63935a.peek(bArr, i10, i11);
    }

    @Override // i6.l
    public void peekFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f63935a.peekFully(bArr, i10, i11);
    }

    @Override // i6.l
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f63935a.peekFully(bArr, i10, i11, z10);
    }

    @Override // i6.l, r7.f
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f63935a.read(bArr, i10, i11);
    }

    @Override // i6.l
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f63935a.readFully(bArr, i10, i11);
    }

    @Override // i6.l
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f63935a.readFully(bArr, i10, i11, z10);
    }

    @Override // i6.l
    public void resetPeekPosition() {
        this.f63935a.resetPeekPosition();
    }

    @Override // i6.l
    public int skip(int i10) throws IOException {
        return this.f63935a.skip(i10);
    }

    @Override // i6.l
    public void skipFully(int i10) throws IOException {
        this.f63935a.skipFully(i10);
    }
}
