package yads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f96967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f96969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f96970e;

    public y11(int i10, ArrayList arrayList, int i11, c21 c21Var) {
        this.f96966a = i10;
        this.f96967b = arrayList;
        this.f96968c = i11;
        this.f96969d = c21Var;
        this.f96970e = null;
    }

    public y11(int i10, List list, byte[] bArr) {
        this.f96966a = i10;
        this.f96967b = list;
        this.f96968c = bArr.length;
        this.f96970e = bArr;
        this.f96969d = null;
    }
}
