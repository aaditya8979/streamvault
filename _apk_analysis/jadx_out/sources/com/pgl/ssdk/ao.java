package com.pgl.ssdk;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public class ao implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f51351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f51353c;

    public ao(Context context, int i10, Object[] objArr) {
        this.f51351a = context;
        this.f51352b = i10;
        this.f51353c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f51352b == 222) {
                ak.a(this.f51351a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f51352b, this.f51351a, this.f51353c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f51351a, this.f51352b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
