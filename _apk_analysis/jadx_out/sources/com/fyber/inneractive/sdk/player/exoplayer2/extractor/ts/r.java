package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f18246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18247e;

    public r(int i10) {
        this.f18243a = i10;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.f18246d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f18244b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f18246d;
            int length = bArr2.length;
            int i13 = this.f18247e + i12;
            if (length < i13) {
                this.f18246d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f18246d, this.f18247e, i12);
            this.f18247e += i12;
        }
    }

    public final boolean a(int i10) {
        if (!this.f18244b) {
            return false;
        }
        this.f18247e -= i10;
        this.f18244b = false;
        this.f18245c = true;
        return true;
    }

    public final void b(int i10) {
        if (!(!this.f18244b)) {
            throw new IllegalStateException();
        }
        boolean z10 = i10 == this.f18243a;
        this.f18244b = z10;
        if (z10) {
            this.f18247e = 3;
            this.f18245c = false;
        }
    }
}
