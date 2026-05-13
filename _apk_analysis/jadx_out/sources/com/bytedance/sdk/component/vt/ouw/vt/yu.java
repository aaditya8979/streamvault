package com.bytedance.sdk.component.vt.ouw.vt;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class yu implements Serializable, Comparable<yu> {
    public transient int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public transient String f12835le;
    public final byte[] yu;
    public static final char[] ouw = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset vt = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final yu f12834lh = new yu((byte[]) new byte[0].clone());

    public yu(byte[] bArr) {
        this.yu = bArr;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(yu yuVar) {
        yu yuVar2 = yuVar;
        int iLh = lh();
        int iLh2 = yuVar2.lh();
        int iMin = Math.min(iLh, iLh2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iOuw = ouw(i10) & 255;
            int iOuw2 = yuVar2.ouw(i10) & 255;
            if (iOuw != iOuw2) {
                return iOuw < iOuw2 ? -1 : 1;
            }
        }
        if (iLh == iLh2) {
            return 0;
        }
        return iLh < iLh2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yu) {
            yu yuVar = (yu) obj;
            int iLh = yuVar.lh();
            byte[] bArr = this.yu;
            if (iLh == bArr.length && yuVar.ouw(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.fkw;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.yu);
        this.fkw = iHashCode;
        return iHashCode;
    }

    public int lh() {
        return this.yu.length;
    }

    public byte ouw(int i10) {
        return this.yu[i10];
    }

    public yu ouw(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.yu;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.yu.length + ")");
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i10 == 0 && i11 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i10, bArr2, 0, i12);
        return new yu(bArr2);
    }

    public String ouw() {
        String str = this.f12835le;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.yu, vt);
        this.f12835le = str2;
        return str2;
    }

    public boolean ouw(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.yu;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && bly.ouw(bArr2, i10, bArr, i11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.ouw.vt.yu.toString():java.lang.String");
    }

    public String vt() {
        byte[] bArr = this.yu;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = ouw;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] yu() {
        return (byte[]) this.yu.clone();
    }
}
