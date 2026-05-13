package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.t f18707a = new com.fyber.inneractive.sdk.player.exoplayer2.util.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18712f;

    public final synchronized void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar;
        int i10;
        float f10;
        if (this.f18708b <= 0) {
            throw new IllegalStateException();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = (int) (jElapsedRealtime - this.f18709c);
        long j10 = i11;
        this.f18711e += j10;
        long j11 = this.f18712f;
        long j12 = this.f18710d;
        this.f18712f = j11 + j12;
        if (i11 > 0) {
            float f11 = (8000 * j12) / j10;
            com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar = this.f18707a;
            int iSqrt = (int) Math.sqrt(j12);
            if (tVar.f18810d != 1) {
                Collections.sort(tVar.f18808b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f18805h);
                tVar.f18810d = 1;
            }
            int i12 = tVar.f18813g;
            if (i12 > 0) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr = tVar.f18809c;
                int i13 = i12 - 1;
                tVar.f18813g = i13;
                sVar = sVarArr[i13];
            } else {
                sVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.s();
            }
            int i14 = tVar.f18811e;
            tVar.f18811e = i14 + 1;
            sVar.f18802a = i14;
            sVar.f18803b = iSqrt;
            sVar.f18804c = f11;
            tVar.f18808b.add(sVar);
            tVar.f18812f += iSqrt;
            while (true) {
                int i15 = tVar.f18812f;
                int i16 = tVar.f18807a;
                i10 = 0;
                if (i15 <= i16) {
                    break;
                }
                int i17 = i15 - i16;
                com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar.f18808b.get(0);
                int i18 = sVar2.f18803b;
                if (i18 <= i17) {
                    tVar.f18812f -= i18;
                    tVar.f18808b.remove(0);
                    int i19 = tVar.f18813g;
                    if (i19 < 5) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr2 = tVar.f18809c;
                        tVar.f18813g = i19 + 1;
                        sVarArr2[i19] = sVar2;
                    }
                } else {
                    sVar2.f18803b = i18 - i17;
                    tVar.f18812f -= i17;
                }
            }
            if (this.f18711e >= 2000 || this.f18712f >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar2 = this.f18707a;
                if (tVar2.f18810d != 0) {
                    Collections.sort(tVar2.f18808b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f18806i);
                    tVar2.f18810d = 0;
                }
                float f12 = 0.5f * tVar2.f18812f;
                int i20 = 0;
                while (true) {
                    if (i10 < tVar2.f18808b.size()) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar2.f18808b.get(i10);
                        i20 += sVar3.f18803b;
                        if (i20 >= f12) {
                            f10 = sVar3.f18804c;
                            break;
                        }
                        i10++;
                    } else if (tVar2.f18808b.isEmpty()) {
                        f10 = Float.NaN;
                    } else {
                        ArrayList arrayList = tVar2.f18808b;
                        f10 = ((com.fyber.inneractive.sdk.player.exoplayer2.util.s) arrayList.get(arrayList.size() - 1)).f18804c;
                    }
                }
                Float.isNaN(f10);
            }
        }
        int i21 = this.f18708b - 1;
        this.f18708b = i21;
        if (i21 > 0) {
            this.f18709c = jElapsedRealtime;
        }
        this.f18710d = 0L;
    }
}
