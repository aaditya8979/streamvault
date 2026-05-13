package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: ByteArrayPool.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator<byte[]> f41056e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f41057a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<byte[]> f41058b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41059c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41060d;

    /* JADX INFO: compiled from: ByteArrayPool.java */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f41060d = i10;
    }

    private synchronized void a() {
        while (this.f41059c > this.f41060d) {
            byte[] bArrRemove = this.f41057a.remove(0);
            this.f41058b.remove(bArrRemove);
            this.f41059c -= bArrRemove.length;
        }
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f41060d) {
                this.f41057a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f41058b, bArr, f41056e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f41058b.add(iBinarySearch, bArr);
                this.f41059c += bArr.length;
                a();
            }
        }
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f41058b.size(); i11++) {
            byte[] bArr = this.f41058b.get(i11);
            if (bArr.length >= i10) {
                this.f41059c -= bArr.length;
                this.f41058b.remove(i11);
                this.f41057a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }
}
