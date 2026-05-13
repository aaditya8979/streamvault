package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class PrefetchVastAdTagUri extends VastAdTagUri {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f52055b = "PrefetchVastAdTagUri";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52056c = "\\[[\\s\\S].*?\\]";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f52057d;

    public PrefetchVastAdTagUri(String str) {
        super(str);
        this.f52057d = a(str);
        Logger.d(f52055b, "Prefetch URI, unique parts: " + Arrays.toString(this.f52057d));
    }

    private String[] a(String str) {
        return str != null ? str.split(f52056c) : new String[0];
    }

    private boolean b(String str) {
        int iIndexOf;
        for (String str2 : this.f52057d) {
            if (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(str2)) < 0) {
                return false;
            }
            str = str.substring(str2.length() + iIndexOf);
        }
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri
    public boolean equals(Object obj) {
        return b(obj.toString());
    }
}
