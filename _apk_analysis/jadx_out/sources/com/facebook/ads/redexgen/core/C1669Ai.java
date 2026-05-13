package com.facebook.ads.redexgen.core;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1669Ai<T> extends AbstractC3240pg<T> {
    public static String[] A01 = {"Fzf9bGtlgYLIOrAPw9kTEZaT3NBj", "nNz32xSm8VfJXUnPFvOMlwsl", "3M1fcCd7TlcDEm", "k56f22msP7PYqb6b5y873zlegrO4Fy04", "AWl95DwkGptNZ3xbY", "ykYqQOs6JuEGf9dZOwLcZB0OUqMBre0v", "7kom9xCVKDNVBTXZjYyNTlOlPeBN", "7wkC9IZFUiSnbQO"};
    public boolean A00;

    public C1669Ai() {
    }

    public /* synthetic */ C1669Ai(C1671Ak c1671Ak) {
        this();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.A00;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.A00) {
            throw new NoSuchElementException();
        }
        this.A00 = true;
        String[] strArr = A01;
        if (strArr[5].charAt(30) != strArr[3].charAt(30)) {
            throw new RuntimeException();
        }
        A01[7] = "or3VpPW3iSzksP2";
        return null;
    }
}
