package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C15535j {
    public static String[] A05 = {"kbrCq6pMhmUkuvpwyFR35DcipjG4S8CW", "oaW9l9tdb", "0TRcVMdqb51VWoFscAzJe", "b9KyZslhVmWVmt6Bq2rIk", "ASY6aJ5KLIO5E4dZs7qVgEBqztuPzXSE", "", "9Pc37QLTRQIuoUm", "qelQYpgVCE3t9Ri2JAAORJatu68jVLQj"};
    public final int A00;
    public final int A01;
    public final C3206or A02;
    public final C3206or A03;
    public final String A04;

    public C15535j(String str, C3206or c3206or, C3206or c3206or2, int i10, int i11) {
        C3M.A07(i10 == 0 || i11 == 0);
        this.A04 = C3M.A05(str);
        this.A03 = (C3206or) C3M.A01(c3206or);
        this.A02 = (C3206or) C3M.A01(c3206or2);
        this.A01 = i10;
        this.A00 = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15535j c15535j = (C15535j) obj;
        if (this.A01 == c15535j.A01 && this.A00 == c15535j.A00 && this.A04.equals(c15535j.A04)) {
            boolean zEquals = this.A03.equals(c15535j.A03);
            String[] strArr = A05;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A05[6] = "94n8VTHvI2C2zF2";
            if (zEquals && this.A02.equals(c15535j.A02)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((17 * 31) + this.A01) * 31) + this.A00) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode();
    }
}
