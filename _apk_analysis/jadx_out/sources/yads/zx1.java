package yads;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class zx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f97823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f97824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f97825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97826e;

    public zx1(int i10) {
        this.f97822a = i10;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.f97825d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f97823b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f97825d;
            int length = bArr2.length;
            int i13 = this.f97826e + i12;
            if (length < i13) {
                this.f97825d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f97825d, this.f97826e, i12);
            this.f97826e += i12;
        }
    }

    public final boolean a(int i10) {
        if (!this.f97823b) {
            return false;
        }
        this.f97826e -= i10;
        this.f97823b = false;
        this.f97824c = true;
        return true;
    }

    public final void b(int i10) {
        if (!(!this.f97823b)) {
            throw new IllegalStateException();
        }
        boolean z10 = i10 == this.f97822a;
        this.f97823b = z10;
        if (z10) {
            this.f97826e = 3;
            this.f97824c = false;
        }
    }
}
