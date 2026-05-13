package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public enum EnumC4025ff {
    LoadSuccess(0),
    ShowSuccess(1),
    ShowFailed(2),
    Destroyed(3),
    LoadRequest(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31740a;

    EnumC4025ff(int i10) {
        this.f31740a = i10;
    }

    public final int b() {
        return this.f31740a;
    }
}
