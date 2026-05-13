package org.fourthline.cling.model.types;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public abstract class UnsignedVariableInteger {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f76872b = Logger.getLogger(UnsignedVariableInteger.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f76873a;

    public enum Bits {
        EIGHT(255),
        SIXTEEN(65535),
        TWENTYFOUR(16777215),
        THIRTYTWO(4294967295L);

        private long maxValue;

        Bits(long j10) {
            this.maxValue = j10;
        }

        public long getMaxValue() {
            return this.maxValue;
        }
    }

    public UnsignedVariableInteger() {
    }

    public UnsignedVariableInteger(long j10) throws NumberFormatException {
        f(j10);
    }

    public UnsignedVariableInteger(String str) throws NumberFormatException {
        if (str.startsWith("-")) {
            f76872b.warning("Invalid negative integer value '" + str + "', assuming value 0!");
            str = "0";
        }
        f(Long.parseLong(str.trim()));
    }

    public abstract Bits a();

    public int b() {
        return 0;
    }

    public Long c() {
        return Long.valueOf(this.f76873a);
    }

    public UnsignedVariableInteger d(boolean z10) {
        if (this.f76873a + 1 > a().getMaxValue()) {
            this.f76873a = z10 ? 1L : 0L;
        } else {
            this.f76873a++;
        }
        return this;
    }

    public void e(long j10) throws NumberFormatException {
        if (j10 < b() || j10 > a().getMaxValue()) {
            throw new NumberFormatException("Value must be between " + b() + " and " + a().getMaxValue() + ": " + j10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f76873a == ((UnsignedVariableInteger) obj).f76873a;
    }

    public UnsignedVariableInteger f(long j10) {
        e(j10);
        this.f76873a = j10;
        return this;
    }

    public int hashCode() {
        long j10 = this.f76873a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return Long.toString(this.f76873a);
    }
}
