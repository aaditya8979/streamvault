package ws;

/* JADX INFO: compiled from: IntegerArrayAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f implements a<int[]> {
    @Override // ws.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int getArrayLength(int[] iArr) {
        return iArr.length;
    }

    @Override // ws.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i10) {
        return new int[i10];
    }

    @Override // ws.a
    public int getElementSizeInBytes() {
        return 4;
    }

    @Override // ws.a
    public String getTag() {
        return "IntegerArrayPool";
    }
}
