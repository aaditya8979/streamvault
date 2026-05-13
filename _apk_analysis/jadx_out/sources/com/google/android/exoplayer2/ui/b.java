package com.google.android.exoplayer2.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: CaptionStyleCompat.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f22729g = new b(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Typeface f22735f;

    public b(int i10, int i11, int i12, int i13, int i14, @Nullable Typeface typeface) {
        this.f22730a = i10;
        this.f22731b = i11;
        this.f22732c = i12;
        this.f22733d = i13;
        this.f22734e = i14;
        this.f22735f = typeface;
    }

    @RequiresApi(19)
    public static b a(CaptioningManager.CaptionStyle captionStyle) {
        return s7.m0.f79487a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    @RequiresApi(19)
    public static b b(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @RequiresApi(21)
    public static b c(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f22729g.f22730a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f22729g.f22731b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f22729g.f22732c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f22729g.f22733d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f22729g.f22734e, captionStyle.getTypeface());
    }
}
