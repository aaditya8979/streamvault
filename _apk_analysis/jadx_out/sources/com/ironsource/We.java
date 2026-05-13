package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public enum We {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f30636b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30641a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final We a(int i10) {
            We we2;
            We[] weArrValues = We.values();
            int length = weArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    we2 = null;
                    break;
                }
                we2 = weArrValues[i11];
                if (we2.f30641a == i10) {
                    break;
                }
                i11++;
            }
            return we2 == null ? We.CurrentlyLoadedAds : we2;
        }
    }

    We(int i10) {
        this.f30641a = i10;
    }

    public final int b() {
        return this.f30641a;
    }
}
