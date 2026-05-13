package com.unity3d.services.store.gpbl.bridges.billingclient;

/* JADX INFO: compiled from: FallbackException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FallbackException extends Exception {
    private final int detectedVersion;

    public FallbackException(int i10) {
        this.detectedVersion = i10;
    }

    public final int getDetectedVersion() {
        return this.detectedVersion;
    }
}
