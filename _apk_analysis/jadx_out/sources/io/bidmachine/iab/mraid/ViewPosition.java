package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"RtlHardcoded"})
public enum ViewPosition {
    TopLeft(51),
    TopCenter(49),
    TopRight(53),
    Center(17),
    BottomLeft(83),
    BottomCenter(81),
    BottomRight(85);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69341a;

    ViewPosition(int i10) {
        this.f69341a = i10;
    }

    @NonNull
    public static ViewPosition fromJsString(@Nullable String str) {
        return fromJsString(str, TopRight);
    }

    @NonNull
    public static ViewPosition fromJsString(@Nullable String str, @NonNull ViewPosition viewPosition) {
        if (TextUtils.isEmpty(str)) {
            return viewPosition;
        }
        str.hashCode();
        switch (str) {
        }
        return viewPosition;
    }

    public int getGravity() {
        return this.f69341a;
    }
}
