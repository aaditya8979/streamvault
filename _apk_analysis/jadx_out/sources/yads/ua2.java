package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class ua2 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95585a;

    public ua2(int i10) {
        this.f95585a = i10;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        return this.f95585a == context.getResources().getConfiguration().orientation;
    }
}
