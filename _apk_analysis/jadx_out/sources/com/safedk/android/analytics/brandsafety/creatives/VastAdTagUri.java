package com.safedk.android.analytics.brandsafety.creatives;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class VastAdTagUri implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f52059b = "VastAdTagUri";
    private static final long serialVersionUID = 2423634386629424135L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f52060a;

    public VastAdTagUri(String str) {
        this.f52060a = str;
    }

    public boolean equals(Object obj) {
        return obj instanceof PrefetchVastAdTagUri ? obj.equals(this.f52060a) : (this.f52060a == null || obj == null || !this.f52060a.equals(obj.toString())) ? false : true;
    }

    public int hashCode() {
        int iIndexOf;
        if (this.f52060a == null || (iIndexOf = this.f52060a.indexOf("//")) < 0) {
            return 0;
        }
        int iIndexOf2 = this.f52060a.indexOf("/", iIndexOf + 2);
        if (iIndexOf2 < 0) {
            iIndexOf2 = this.f52060a.length();
        }
        return this.f52060a.substring(iIndexOf + 2, iIndexOf2).hashCode();
    }

    public String toString() {
        return this.f52060a;
    }
}
