package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4669b3 implements InterfaceC4695c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66415a;

    public C4669b3(int i10) {
        this.f66415a = i10;
    }

    public static InterfaceC4695c3 a(InterfaceC4695c3... interfaceC4695c3Arr) {
        return new C4669b3(b(interfaceC4695c3Arr));
    }

    public static int b(InterfaceC4695c3... interfaceC4695c3Arr) {
        int bytesTruncated = 0;
        for (InterfaceC4695c3 interfaceC4695c3 : interfaceC4695c3Arr) {
            if (interfaceC4695c3 != null) {
                bytesTruncated = interfaceC4695c3.getBytesTruncated() + bytesTruncated;
            }
        }
        return bytesTruncated;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4695c3
    public final int getBytesTruncated() {
        return this.f66415a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f66415a + '}';
    }
}
