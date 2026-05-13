package ws;

/* JADX INFO: compiled from: ByteArrayAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d implements a<byte[]> {
    @Override // ws.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int getArrayLength(byte[] bArr) {
        return bArr.length;
    }

    @Override // ws.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }

    @Override // ws.a
    public int getElementSizeInBytes() {
        return 1;
    }

    @Override // ws.a
    public String getTag() {
        return "ByteArrayPool";
    }
}
